package net.parra.antisolarblocks.screen.custom;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.RecipeMatcher;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractRecipeScreenHandler;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;
import net.parra.antisolarblocks.entity.custom.PotteryKilnBlockEntity;
import net.parra.antisolarblocks.screen.ModScreenHandlers;
import net.parra.antisolarblocks.screen.slot.custom.KilnFuelSlot;
import net.parra.antisolarblocks.screen.slot.custom.KilnOutputSlot;

public class PotteryKilnScreenHandler extends AbstractRecipeScreenHandler {

    private final PotteryKilnBlockEntity kiln;
    private final PropertyDelegate propertyDelegate;

    public PotteryKilnScreenHandler(
            int syncId,
            PlayerInventory playerInventory,
            BlockPos pos
    ) {
        super(ModScreenHandlers.POTTERY_KILN_SCREEN_HANDLER, syncId);

        BlockEntity blockEntity =
                playerInventory.player.getWorld().getBlockEntity(pos);

        if (!(blockEntity instanceof PotteryKilnBlockEntity)) {
            throw new IllegalStateException(
                    "Expected PotteryKilnBlockEntity at " + pos
            );
        }

        this.kiln = (PotteryKilnBlockEntity) blockEntity;

        this.propertyDelegate = kiln.getPropertyDelegate();

        this.addProperties(propertyDelegate);

        this.addSlot(new Slot(kiln, 0, 32, 17));
        this.addSlot(new Slot(kiln, 1, 50, 17));

        this.addSlot(new Slot(kiln, 2, 32, 35));
        this.addSlot(new Slot(kiln, 3, 50, 35));

        this.addSlot(new Slot(kiln, 4, 32, 53));
        this.addSlot(new Slot(kiln, 5, 50, 53));


        this.addSlot(
                new KilnFuelSlot(
                        this,
                        kiln,
                        6,
                        80,
                        53
                )
        );


        this.addSlot(
                new KilnOutputSlot(
                        playerInventory.player,
                        kiln,
                        7,
                        118,
                        21
                )
        );


        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 9; column++) {

                this.addSlot(
                        new Slot(
                                playerInventory,
                                column + row * 9 + 9,
                                8 + column * 18,
                                84 + row * 18
                        )
                );
            }
        }


        for (int column = 0; column < 9; column++) {

            this.addSlot(
                    new Slot(
                            playerInventory,
                            column,
                            8 + column * 18,
                            142
                    )
            );
        }
    }

    @Override
    public void populateRecipeFinder(RecipeMatcher finder) {
    }

    @Override
    public void clearCraftingSlots() {
        for (int i = 0; i < 6; i++) {
            this.getSlot(i).setStackNoCallbacks(ItemStack.EMPTY);
        }
    }

    @Override
    public boolean matches(RecipeEntry recipe) {
        return false;
    }

    @Override
    public int getCraftingResultSlotIndex() {
        return 7;
    }

    @Override
    public int getCraftingWidth() {
        return 2;
    }

    @Override
    public int getCraftingHeight() {
        return 3;
    }

    @Override
    public int getCraftingSlotCount() {
        return 6;
    }

    @Override
    public RecipeBookCategory getCategory() {
        return RecipeBookCategory.CRAFTING;
    }

    @Override
    public boolean canInsertIntoSlot(int index) {
        return index != 7;
    }

    @Override
    public ItemStack quickMove(
            PlayerEntity player,
            int slot
    ) {
        if (slot < 0 || slot >= this.slots.size()) {
            return ItemStack.EMPTY;
        }

        Slot sourceSlot = this.slots.get(slot);

        if (!sourceSlot.hasStack()) {
            return ItemStack.EMPTY;
        }

        ItemStack sourceStack = sourceSlot.getStack();
        ItemStack originalStack = sourceStack.copy();

        if (slot < 8) {

            // Kiln → player inventory
            if (!this.insertItem(
                    sourceStack,
                    8,
                    this.slots.size(),
                    true
            )) {
                return ItemStack.EMPTY;
            }

        } else {

            // Player inventory → kiln
            if (!this.insertItem(
                    sourceStack,
                    0,
                    7,
                    false
            )) {
                return ItemStack.EMPTY;
            }
        }

        if (sourceStack.isEmpty()) {
            sourceSlot.setStack(ItemStack.EMPTY);
        } else {
            sourceSlot.markDirty();
        }

        return originalStack;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return kiln.canPlayerUse(player);
    }

    public boolean isFuel(ItemStack stack) {
        return net.minecraft.block.entity.AbstractFurnaceBlockEntity
                .canUseAsFuel(stack);
    }

    public int getCookProgress() {
        return propertyDelegate.get(0);
    }

    public int getMaxProgress() {
        return propertyDelegate.get(1);
    }

    public int getFuelTime() {
        return propertyDelegate.get(2);
    }

    public int getFuelTimeTotal() {
        return propertyDelegate.get(3);
    }

    public int getScaledProgress(int pixels) {
        int progress = getCookProgress();
        int maxProgress = getMaxProgress();

        if (maxProgress <= 0) {
            return 0;
        }

        return progress * pixels / maxProgress;
    }

    public int getScaledFuel(int pixels) {
        int fuel = getFuelTime();
        int maxFuel = getFuelTimeTotal();

        if (maxFuel <= 0) {
            return 0;
        }

        return fuel * pixels / maxFuel;
    }

    public PropertyDelegate getPropertyDelegate() {
        return propertyDelegate;
    }
}