package net.parra.antisolarblocks.entity.custom;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.input.RecipeInput;

public record PotteryKilnInput(ItemStack[] stacks) implements RecipeInput {

    public PotteryKilnInput {
        if (stacks.length != 6) {
            throw new IllegalArgumentException(
                    "Pottery kiln requires exactly 6 input slots"
            );
        }
    }

    @Override
    public ItemStack getStackInSlot(int slot) {
        return stacks[slot];
    }

    @Override
    public int getSize() {
        return 6;
    }
}