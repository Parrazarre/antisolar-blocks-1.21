package net.parra.antisolarblocks.compat;

import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.entry.EntryIngredient;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeEntry;
import net.parra.antisolarblocks.recipe.custom.PotteryKilnRecipe;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PotteryKilnDisplay extends BasicDisplay {
    public PotteryKilnDisplay(RecipeEntry<PotteryKilnRecipe> recipe) {
        super(buildInputs(recipe),
                List.of(EntryIngredient.of(EntryStacks.of(recipe.value().getResult(null)))));
    }

    private static final List<ItemStack> FUEL_STACKS =
            AbstractFurnaceBlockEntity.createFuelTimeMap()
                    .keySet()
                    .stream()
                    .map(ItemStack::new)
                    .collect(Collectors.toList());

    private static List<EntryIngredient> buildInputs(RecipeEntry<PotteryKilnRecipe> recipe) {
        return recipe.value().getIngredients().stream()
                .map(EntryIngredients::ofIngredient)
                .collect(Collectors.toList());
    }


    @Override
    public CategoryIdentifier<?> getCategoryIdentifier() {
        return PotteryKilnCategory.POTTERY_KILN;
    }
}
