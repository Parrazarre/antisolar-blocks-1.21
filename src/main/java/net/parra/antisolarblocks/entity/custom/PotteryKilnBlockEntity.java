package net.parra.antisolarblocks.entity.custom;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.custom.PotteryKilnBlock;
import net.parra.antisolarblocks.recipe.ModRecipeTypes;
import net.parra.antisolarblocks.recipe.custom.PotteryKilnRecipe;
import net.parra.antisolarblocks.screen.custom.PotteryKilnScreenHandler;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

import static net.parra.antisolarblocks.entity.ModBlockEntities.POTTERY_KILN_BE;

public class PotteryKilnBlockEntity extends BlockEntity
        implements ExtendedScreenHandlerFactory<BlockPos>, Inventory {


    public static final int INPUT_START = 0;
    public static final int INPUT_END = 5;
    public static final int FUEL_SLOT = 6;
    public static final int OUTPUT_SLOT = 7;

    private final DefaultedList<ItemStack> items =
            DefaultedList.ofSize(8, ItemStack.EMPTY);

    private int progress = 0;
    private int maxProgress = 200;

    private int fuelTime = 0;
    private int fuelTimeTotal = 0;

    public static final Text TITLE =
            Text.translatable(
                    "container." + AntisolarBlocks.MOD_ID + ".pottery_kiln"
            );

    private final PropertyDelegate propertyDelegate =
            new PropertyDelegate() {

                @Override
                public int get(int index) {
                    return switch (index) {
                        case 0 -> progress;
                        case 1 -> maxProgress;
                        case 2 -> fuelTime;
                        case 3 -> fuelTimeTotal;
                        default -> 0;
                    };
                }

                @Override
                public void set(int index, int value) {
                    switch (index) {
                        case 0 -> progress = value;
                        case 1 -> maxProgress = value;
                        case 2 -> fuelTime = value;
                        case 3 -> fuelTimeTotal = value;
                    }
                }

                @Override
                public int size() {
                    return 4;
                }
            };

    public PotteryKilnBlockEntity(
            BlockPos pos,
            BlockState state
    ) {
        super(POTTERY_KILN_BE, pos, state);
    }

    public PropertyDelegate getPropertyDelegate() {
        return propertyDelegate;
    }

    public static void tick(
            World world,
            BlockPos pos,
            BlockState state,
            PotteryKilnBlockEntity kiln
    ) {
        if (world.isClient) {
            return;
        }

        kiln.tickKiln();
    }

    private void tickKiln() {
        Optional<RecipeEntry<PotteryKilnRecipe>> recipe =
                getCurrentRecipe();

        if (fuelTime > 0) {
            fuelTime--;

            setLit(true);

            if (recipe.isPresent()) {
                PotteryKilnRecipe kilnRecipe =
                        recipe.get().value();

                maxProgress =
                        kilnRecipe.getCookingTime();

                ItemStack result =
                        kilnRecipe.getResult(null);

                if (canAcceptOutput(result)) {
                    progress++;

                    if (progress >= maxProgress) {
                        craftRecipe(kilnRecipe);
                        progress = 0;
                    }
                }
            } else {
                progress = 0;
                maxProgress = 200;
            }

            if (fuelTime <= 0) {
                setLit(false);
            }

            markDirty();
            return;
        }

        if (recipe.isEmpty()) {
            progress = 0;
            maxProgress = 200;

            setLit(false);

            markDirty();
            return;
        }

        PotteryKilnRecipe kilnRecipe =
                recipe.get().value();

        maxProgress =
                kilnRecipe.getCookingTime();

        ItemStack result =
                kilnRecipe.getResult(null);

        if (!canAcceptOutput(result)) {
            setLit(false);

            markDirty();
            return;
        }

        ItemStack fuelStack =
                items.get(FUEL_SLOT);

        if (!isFuel(fuelStack)) {
            progress = 0;

            setLit(false);

            markDirty();
            return;
        }

        fuelTimeTotal =
                AbstractFurnaceBlockEntity
                        .createFuelTimeMap()
                        .getOrDefault(
                                fuelStack.getItem(),
                                0
                        );

        fuelTime = fuelTimeTotal;

        fuelStack.decrement(1);

        fuelTime--;

        progress++;

        setLit(fuelTime > 0);

        if (progress >= maxProgress) {
            craftRecipe(kilnRecipe);
            progress = 0;
        }

        markDirty();
    }


    private Optional<RecipeEntry<PotteryKilnRecipe>> getCurrentRecipe() {
        if (world == null) {
            return Optional.empty();
        }

        ItemStack[] inputStacks = new ItemStack[6];

        for (int i = 0; i < 6; i++) {
            inputStacks[i] = items.get(i);
        }

        PotteryKilnInput input = new PotteryKilnInput(inputStacks);

        int recipeCount = 0;

        for (RecipeEntry<?> entry :
                world.getRecipeManager().values()) {

            if (entry.value() instanceof PotteryKilnRecipe) {
                recipeCount++;
            }
        }

        Optional<RecipeEntry<PotteryKilnRecipe>> result =
                world.getRecipeManager().getFirstMatch(
                        ModRecipeTypes.POTTERY_KILN,
                        input,
                        world
                );

        return result;
    }

    private void craftRecipe(
            PotteryKilnRecipe recipe
    ) {

        ItemStack result =
                recipe.getResult(null);

        if (!canAcceptOutput(result)) {
            return;
        }

        for (int i = 0; i < 6; i++) {

            items.get(i).decrement(1);
        }

        ItemStack output =
                items.get(OUTPUT_SLOT);

        if (output.isEmpty()) {

            items.set(
                    OUTPUT_SLOT,
                    result.copy()
            );

        } else {

            output.increment(
                    result.getCount()
            );
        }

        markDirty();
    }

    private boolean canAcceptOutput(
            ItemStack result
    ) {

        ItemStack output =
                items.get(OUTPUT_SLOT);


        if (output.isEmpty()) {
            return true;
        }


        if (!ItemStack.areItemsAndComponentsEqual(
                output,
                result
        )) {
            return false;
        }


        return output.getCount()
                + result.getCount()
                <= output.getMaxCount();
    }

    private boolean isFuel(
            ItemStack stack
    ) {

        return !stack.isEmpty()
                && AbstractFurnaceBlockEntity
                .canUseAsFuel(stack);
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isEmpty() {

        for (ItemStack stack : items) {

            if (!stack.isEmpty()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public ItemStack getStack(int slot) {
        return items.get(slot);
    }

    @Override
    public ItemStack removeStack(
            int slot,
            int amount
    ) {

        ItemStack result =
                Inventories.splitStack(
                        items,
                        slot,
                        amount
                );

        if (!result.isEmpty()) {
            markDirty();
        }

        return result;
    }

    @Override
    public ItemStack removeStack(
            int slot
    ) {

        ItemStack result =
                Inventories.removeStack(
                        items,
                        slot
                );

        if (!result.isEmpty()) {
            markDirty();
        }

        return result;
    }

    @Override
    public void setStack(
            int slot,
            ItemStack stack
    ) {

        items.set(
                slot,
                stack
        );

        if (stack.getCount()
                > stack.getMaxCount()) {

            stack.setCount(
                    stack.getMaxCount()
            );
        }

        markDirty();
    }

    @Override
    public void markDirty() {
        super.markDirty();
    }

    @Override
    public boolean canPlayerUse(
            PlayerEntity player
    ) {

        if (world == null) {
            return false;
        }

        if (world.getBlockEntity(pos) != this) {
            return false;
        }

        return player.squaredDistanceTo(
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5
        ) <= 64.0;
    }

    @Override
    public void clear() {

        items.clear();

        markDirty();
    }

    @Override
    protected void writeNbt(
            NbtCompound nbt,
            net.minecraft.registry.RegistryWrapper.WrapperLookup registries
    ) {

        super.writeNbt(
                nbt,
                registries
        );


        for (int i = 0; i < items.size(); i++) {

            if (!items.get(i).isEmpty()) {

                nbt.put(
                        "Item" + i,
                        items.get(i).encode(registries)
                );
            }
        }


        nbt.putInt(
                "Progress",
                progress
        );

        nbt.putInt(
                "MaxProgress",
                maxProgress
        );


        nbt.putInt(
                "FuelTime",
                fuelTime
        );

        nbt.putInt(
                "FuelTimeTotal",
                fuelTimeTotal
        );
    }


    @Override
    protected void readNbt(
            NbtCompound nbt,
            net.minecraft.registry.RegistryWrapper.WrapperLookup registries
    ) {
        super.readNbt(
                nbt,
                registries
        );

        for (int i = 0; i < items.size(); i++) {

            String key = "Item" + i;

            if (nbt.contains(key)) {

                items.set(
                        i,
                        ItemStack.fromNbt(
                                registries,
                                nbt.getCompound(key)
                        ).orElse(ItemStack.EMPTY)
                );

            } else {

                items.set(
                        i,
                        ItemStack.EMPTY
                );
            }
        }

        progress = nbt.getInt("Progress");

        maxProgress = nbt.getInt("MaxProgress");

        fuelTime = nbt.getInt("FuelTime");

        fuelTimeTotal = nbt.getInt("FuelTimeTotal");
    }


    @Override
    public BlockPos getScreenOpeningData(
            ServerPlayerEntity player
    ) {

        return this.pos;
    }

    @Override
    public Text getDisplayName() {
        return TITLE;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(
            int syncId,
            PlayerInventory playerInventory,
            PlayerEntity player
    ) {

        return new PotteryKilnScreenHandler(
                syncId,
                playerInventory,
                this.pos
        );
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener>
    toUpdatePacket() {

        return BlockEntityUpdateS2CPacket.create(this);
    }

    public int getProgress() {
        return progress;
    }

    public int getMaxProgress() {
        return maxProgress;
    }

    public int getFuelTime() {
        return fuelTime;
    }

    public int getFuelTimeTotal() {
        return fuelTimeTotal;
    }

    private void setLit(boolean lit) {
        if (world == null || world.isClient) {
            return;
        }

        BlockState state = world.getBlockState(pos);

        if (state.getBlock() instanceof PotteryKilnBlock
                && state.contains(PotteryKilnBlock.LIT)
                && state.get(PotteryKilnBlock.LIT) != lit) {

            world.setBlockState(
                    pos,
                    state.with(PotteryKilnBlock.LIT, lit),
                    Block.NOTIFY_ALL
            );
        }
    }
}