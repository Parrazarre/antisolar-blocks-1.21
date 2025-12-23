package net.parra.antisolarblocks.screen.custom;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.RecipeInputProvider;
import net.minecraft.recipe.RecipeMatcher;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.screen.AbstractRecipeScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;
import net.parra.antisolarblocks.screen.ModScreenHandlers;
import net.parra.antisolarblocks.screen.slot.custom.KilnFuelSlot;
import net.parra.antisolarblocks.screen.slot.custom.KilnOutputSlot;

public class PotteryKilnScreenHandler extends AbstractRecipeScreenHandler {
    private final Inventory inventory;

    public PotteryKilnScreenHandler(int syncId, PlayerInventory playerInventory, BlockPos pos) {
        this(syncId, playerInventory, playerInventory.player.getWorld().getBlockEntity(pos));
    }

    public PotteryKilnScreenHandler(int syncId, PlayerInventory playerInventory, BlockEntity blockEntity) {
        super(ModScreenHandlers.POTTERY_KILN_SCREEN_HANDLER, syncId);
        this.inventory = ((Inventory) blockEntity);

        this.addSlot(new Slot(inventory, 0, 32, 17));
        this.addSlot(new Slot(inventory, 1, 50, 17));
        this.addSlot(new Slot(inventory, 2, 32, 35));
        this.addSlot(new Slot(inventory, 3, 50, 35));
        this.addSlot(new Slot(inventory, 4, 32, 53));
        this.addSlot(new Slot(inventory, 5, 50, 53));
        this.addSlot(new KilnFuelSlot(this, inventory, 6, 80, 53));
        this.addSlot(new KilnOutputSlot(playerInventory.player, inventory, 7, 118, 21));

        for (int p = 0; p < 3; p++) {
            for (int j = 0; j < 9; j++) {
                this.addSlot(new Slot(playerInventory, j + p * 9 + 9, 8 + j * 18, 84 + p * 18));
            }
        }

        for (int p = 0; p < 9; p++) {
            this.addSlot(new Slot(playerInventory, p, 8 + p * 18, 142));
        }
    }

    @Override
    public void populateRecipeFinder(RecipeMatcher finder) {
        if (this.inventory instanceof RecipeInputProvider) {
            ((RecipeInputProvider)this.inventory).provideRecipeInputs(finder);
        }

    }

    @Override
    public void clearCraftingSlots() {

    }

    @Override
    public boolean matches(RecipeEntry recipe) {
        return false;
    }

    @Override
    public int getCraftingResultSlotIndex() {
        return 0;
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
        return 8;
    }

    @Override
    public RecipeBookCategory getCategory() {
        return null;
    }

    @Override
    public boolean canInsertIntoSlot(int index) {
        return index != 7;
    }

    @Override
    public ItemStack quickMove(PlayerEntity player, int slot) {
        return null;
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return this.inventory.canPlayerUse(player);
    }

    public boolean isFuel(ItemStack itemStack) {
        return AbstractFurnaceBlockEntity.canUseAsFuel(itemStack);
    }
}
