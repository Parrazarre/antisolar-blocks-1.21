package net.parra.antisolarblocks.recipe;

import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.recipe.custom.PotteryKilnRecipe;

public class ModRecipeTypes {

    public static final RecipeType<PotteryKilnRecipe> POTTERY_KILN =
            Registry.register(
                    Registries.RECIPE_TYPE,
                    Identifier.of(
                            AntisolarBlocks.MOD_ID,
                            "pottery_kiln"
                    ),
                    new RecipeType<PotteryKilnRecipe>() {
                        @Override
                        public String toString() {
                            return AntisolarBlocks.MOD_ID + ":pottery_kiln";
                        }
                    }
            );

    public static void register() {
        AntisolarBlocks.LOGGER.info(
                "Registering recipe types for "
                        + AntisolarBlocks.MOD_ID
        );
    }
}