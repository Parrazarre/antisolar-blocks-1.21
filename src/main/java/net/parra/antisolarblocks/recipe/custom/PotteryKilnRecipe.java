package net.parra.antisolarblocks.recipe.custom;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;
import net.parra.antisolarblocks.entity.custom.PotteryKilnInput;
import net.parra.antisolarblocks.recipe.ModRecipeSerializers;
import net.parra.antisolarblocks.recipe.ModRecipeTypes;

import java.util.List;

public class PotteryKilnRecipe implements Recipe<PotteryKilnInput> {

    private final List<Ingredient> ingredients;
    private final ItemStack result;
    private final int cookingTime;

    public PotteryKilnRecipe(
            List<Ingredient> ingredients,
            ItemStack result,
            int cookingTime
    ) {
        if (ingredients.size() != 6) {
            throw new IllegalArgumentException(
                    "A pottery kiln recipe must have exactly 6 ingredients"
            );
        }

        this.ingredients = ingredients;
        this.result = result;
        this.cookingTime = cookingTime;
    }


    public List<Ingredient> getIngredientsList() {
        return ingredients;
    }

    public ItemStack getResultStack() {
        return result;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    @Override
    public boolean matches(PotteryKilnInput input, World world) {
        if (input.getSize() != 6) {
            return false;
        }

        // Normal
        if (matchesPattern(input, new int[]{
                0, 1,
                2, 3,
                4, 5
        })) {
            return true;
        }

        // Horizontal mirror
        if (matchesPattern(input, new int[]{
                1, 0,
                3, 2,
                5, 4
        })) {
            return true;
        }

        // 180 degree rotation
        if (matchesPattern(input, new int[]{
                5, 4,
                3, 2,
                1, 0
        })) {
            return true;
        }

        // 180 degree rotation + horizontal mirror
        return matchesPattern(input, new int[]{
                4, 5,
                2, 3,
                0, 1
        });
    }

    private boolean matchesPattern(
            PotteryKilnInput input,
            int[] mapping
    ) {
        for (int recipeSlot = 0; recipeSlot < 6; recipeSlot++) {
            ItemStack stack = input.getStackInSlot(mapping[recipeSlot]);

            if (!ingredients.get(recipeSlot).test(stack)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public ItemStack craft(
            PotteryKilnInput input,
            RegistryWrapper.WrapperLookup registries
    ) {
        return result.copy();
    }

    @Override
    public DefaultedList<Ingredient> getIngredients() {
        return DefaultedList.copyOf(Ingredient.EMPTY, ingredients.toArray(new Ingredient[0]));
    }

    @Override
    public boolean fits(int width, int height) {
        return width == 2 && height == 3;
    }

    @Override
    public ItemStack getResult(RegistryWrapper.WrapperLookup registries) {
        return result.copy();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipeSerializers.POTTERY_KILN;
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipeTypes.POTTERY_KILN;
    }


    public RecipeBookCategory getRecipeBookCategory() {
        return RecipeBookCategory.CRAFTING;
    }

    public static final MapCodec<PotteryKilnRecipe> CODEC =
            RecordCodecBuilder.mapCodec(instance ->
                    instance.group(
                            Ingredient.DISALLOW_EMPTY_CODEC
                                    .listOf()
                                    .fieldOf("ingredients")
                                    .forGetter(PotteryKilnRecipe::getIngredients),

                            ItemStack.CODEC
                                    .fieldOf("result")
                                    .forGetter(recipe -> recipe.result),

                            com.mojang.serialization.Codec.INT
                                    .optionalFieldOf("cooking_time", 200)
                                    .forGetter(PotteryKilnRecipe::getCookingTime)

                    ).apply(instance, PotteryKilnRecipe::new)
            );

}