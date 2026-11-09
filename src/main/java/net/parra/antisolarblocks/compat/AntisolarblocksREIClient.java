package net.parra.antisolarblocks.compat;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.recipe.ModRecipeTypes;
import net.parra.antisolarblocks.recipe.custom.PotteryKilnRecipe;
import net.parra.antisolarblocks.screen.custom.PotteryKilnScreen;

public class AntisolarblocksREIClient implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new PotteryKilnCategory());

        registry.addWorkstations(PotteryKilnCategory.POTTERY_KILN, EntryStacks.of(ModBlocks.POTTERY_KILN));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(PotteryKilnRecipe.class, ModRecipeTypes.POTTERY_KILN,
                PotteryKilnDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(((screen.width - 176) / 2) + 78,
                ((screen.height - 166) / 2) + 30, 20, 25), PotteryKilnScreen.class,
        PotteryKilnCategory.POTTERY_KILN);
    }
}
