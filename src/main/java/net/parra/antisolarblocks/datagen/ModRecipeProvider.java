package net.parra.antisolarblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BAMBOO_PLANKS, Blocks.BAMBOO_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BIRCH_PLANKS, Blocks.BIRCH_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_JUNGLE_PLANKS, Blocks.JUNGLE_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SPRUCE_PLANKS, Blocks.SPRUCE_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE, Blocks.ANDESITE_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICK_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_BLUESCHIST, ModBlocks.BLUESCHIST_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_JADE, ModBlocks.JADE_BLOCK_SLAB);
        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GREENSCHIST, ModBlocks.GREENSCHIST_SLAB);

        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_CLAY, ModItems.ANCIENT_CLAY_BALL);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_BRICKS, ModItems.COBBLE_BRICK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFFACIOUS_CLAY, ModItems.TUFFACIOUS_CLAY_BALL);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.KAOLINITE_CLAY, ModItems.KAOLINITE_CLAY_CHUNK);
        offer2x2CompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.KAOLINITE_BRICKS, ModItems.KAOLINITE_BRICK);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.COBBLE, RecipeCategory.MISC, Blocks.COBBLESTONE);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.JADE, RecipeCategory.MISC, ModBlocks.JADE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.ROSE_QUARTZ, RecipeCategory.MISC, ModBlocks.RAW_ROSE_QUARTZ);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.CHAROITE, RecipeCategory.MISC, ModBlocks.CHAROITE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.HIMALAYAN_SALT, RecipeCategory.MISC, ModBlocks.KHEWRA_SALT_BLOCK);

        offerBarkBlockRecipe(exporter, ModBlocks.SUGAR_MAPLE_WOOD, ModBlocks.SUGAR_MAPLE_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_SUGAR_MAPLE_WOOD, ModBlocks.STRIPPED_SUGAR_MAPLE_LOG);
        offerPlanksRecipe(exporter, ModBlocks.SUGAR_MAPLE_PLANKS, ModItemTagProvider.ModTags.Items.SUGAR_MAPLE_LOGS, 4);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGAR_MAPLE_SLAB, ModBlocks.SUGAR_MAPLE_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SUGAR_MAPLE_STAIRS, 4)
                .input('T', ModBlocks.SUGAR_MAPLE_PLANKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SUGAR_MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SUGAR_MAPLE_PLANKS))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.SUGAR_MAPLE_FENCE, Ingredient.ofItems(ModBlocks.SUGAR_MAPLE_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SUGAR_MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SUGAR_MAPLE_PLANKS))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.SUGAR_MAPLE_FENCE_GATE, Ingredient.ofItems(ModBlocks.SUGAR_MAPLE_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SUGAR_MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SUGAR_MAPLE_PLANKS))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.SUGAR_MAPLE_DOOR, Ingredient.ofItems(ModBlocks.SUGAR_MAPLE_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SUGAR_MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SUGAR_MAPLE_PLANKS))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.SUGAR_MAPLE_TRAPDOOR, Ingredient.ofItems(ModBlocks.SUGAR_MAPLE_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SUGAR_MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SUGAR_MAPLE_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.SUGAR_MAPLE_PRESSURE_PLATE, ModBlocks.SUGAR_MAPLE_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.SUGAR_MAPLE_BUTTON)
                .input(ModBlocks.SUGAR_MAPLE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SUGAR_MAPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SUGAR_MAPLE_PLANKS))
                .offerTo(exporter);

        offerBarkBlockRecipe(exporter, ModBlocks.WHITE_PINE_WOOD, ModBlocks.WHITE_PINE_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_WHITE_PINE_WOOD, ModBlocks.STRIPPED_WHITE_PINE_LOG);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_PINE_SLAB, ModBlocks.WHITE_PINE_PLANKS);
        offerPlanksRecipe(exporter, ModBlocks.WHITE_PINE_PLANKS, ModItemTagProvider.ModTags.Items.WHITE_PINE_LOGS, 4);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.WHITE_PINE_STAIRS, 4)
                .input('T', ModBlocks.WHITE_PINE_PLANKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_PINE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_PINE_PLANKS))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.WHITE_PINE_FENCE, Ingredient.ofItems(ModBlocks.WHITE_PINE_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_PINE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_PINE_PLANKS))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.WHITE_PINE_FENCE_GATE, Ingredient.ofItems(ModBlocks.WHITE_PINE_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_PINE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_PINE_PLANKS))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.WHITE_PINE_DOOR, Ingredient.ofItems(ModBlocks.WHITE_PINE_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_PINE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_PINE_PLANKS))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.WHITE_PINE_TRAPDOOR, Ingredient.ofItems(ModBlocks.WHITE_PINE_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_PINE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_PINE_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.WHITE_PINE_PRESSURE_PLATE, ModBlocks.WHITE_PINE_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.WHITE_PINE_BUTTON)
                .input(ModBlocks.WHITE_PINE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.WHITE_PINE_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.WHITE_PINE_PLANKS))
                .offerTo(exporter);

        offerBarkBlockRecipe(exporter, ModBlocks.YEW_WOOD, ModBlocks.YEW_LOG);
        offerBarkBlockRecipe(exporter, ModBlocks.STRIPPED_YEW_WOOD, ModBlocks.STRIPPED_YEW_LOG);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YEW_SLAB, ModBlocks.YEW_PLANKS);
        offerPlanksRecipe(exporter, ModBlocks.YEW_PLANKS, ModItemTagProvider.ModTags.Items.YEW_LOGS, 4);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.YEW_STAIRS, 4)
                .input('T', ModBlocks.YEW_PLANKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.YEW_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.YEW_FENCE, Ingredient.ofItems(ModBlocks.YEW_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.YEW_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.YEW_FENCE_GATE, Ingredient.ofItems(ModBlocks.YEW_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.YEW_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.YEW_DOOR, Ingredient.ofItems(ModBlocks.YEW_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.YEW_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter);
        createTrapdoorRecipe(ModBlocks.YEW_TRAPDOOR, Ingredient.ofItems(ModBlocks.YEW_PLANKS.asItem()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.YEW_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.YEW_PRESSURE_PLATE, ModBlocks.YEW_PLANKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.YEW_BUTTON)
                .input(ModBlocks.YEW_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.YEW_PLANKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.YEW_PLANKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRAVERTINE_SLAB, ModBlocks.TRAVERTINE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TRAVERTINE_SLAB, ModBlocks.POLISHED_TRAVERTINE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TRACHYANDESITE_SLAB, ModBlocks.TRACHYANDESITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TRACHYANDESITE_SLAB, ModBlocks.POLISHED_TRACHYANDESITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PICRITE_BASALT_SLAB, ModBlocks.PICRITE_BASALT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PICRITE_BASALT_SLAB, ModBlocks.POLISHED_PICRITE_BASALT);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHLORAPATITE_SLAB, ModBlocks.CHLORAPATITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CHLORAPATITE_SLAB, ModBlocks.POLISHED_CHLORAPATITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EXTRA_POLISHED_CHLORAPATITE_SLAB, ModBlocks.EXTRA_POLISHED_CHLORAPATITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FULLY_POLISHED_CHLORAPATITE_SLAB, ModBlocks.FULLY_POLISHED_CHLORAPATITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DACITE_SLAB, ModBlocks.DACITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DACITE, ModBlocks.POLISHED_DACITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DACITE_TILE_SLAB, ModBlocks.DACITE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HYDROXYLAPATITE_SLAB, ModBlocks.HYDROXYLAPATITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_HYDROXYLAPATITE_SLAB, ModBlocks.POLISHED_HYDROXYLAPATITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HYDROXYLAPATITE_TILE_SLAB, ModBlocks.HYDROXYLAPATITE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOYAITE_SLAB, ModBlocks.FOYAITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_FOYAITE_SLAB, ModBlocks.POLISHED_FOYAITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FOYAITE_TILE_SLAB, ModBlocks.FOYAITE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_SLAB, ModBlocks.GABBRO_SLAB);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GABBRO_SLAB, ModBlocks.POLISHED_GABBRO);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GABBRO_BRICK_SLAB, ModBlocks.GABBRO_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FLOWSTONE_SLAB, ModBlocks.FLOWSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MICROCLINE_SLAB, ModBlocks.POLISHED_MICROCLINE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_MICROCLINE_SLAB, ModBlocks.SMOOTH_MICROCLINE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORTHOCLASE_FELDSPAR_SLAB, ModBlocks.ORTHOCLASE_FELDSPAR);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR_SLAB, ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORTHOCLASE_FELDSPAR_TILE_SLAB, ModBlocks.ORTHOCLASE_FELDSPAR_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.KHEWRA_SALT_SLAB, ModBlocks.KHEWRA_SALT_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_KAOLINITE_CLAY_SLAB, ModBlocks.PACKED_KAOLINITE_CLAY);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.KAOLINITE_BRICK_SLAB, ModBlocks.KAOLINITE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HARDENED_KAOLINITE_CLAY_SLAB, ModBlocks.HARDENED_KAOLINITE_CLAY);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_SUNSTONE_SLAB, ModBlocks.RAW_SUNSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUNSTONE_SLAB, ModBlocks.SUNSTONE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMBURGITE_SLAB, ModBlocks.LIMBURGITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LIMBURGITE_SLAB, ModBlocks.POLISHED_LIMBURGITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIMBURGITE_TILE_SLAB, ModBlocks.LIMBURGITE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAWAIITE_SLAB, ModBlocks.HAWAIITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_HAWAIITE_SLAB, ModBlocks.POLISHED_HAWAIITE);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCORIA_SLAB, ModBlocks.SCORIA);

        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.TRAVERTINE_WALL, ModBlocks.TRAVERTINE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.TRACHYANDESITE_WALL, ModBlocks.TRACHYANDESITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.PICRITE_BASALT_WALL, ModBlocks.PICRITE_BASALT);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PICRITE_BASALT_WALL, ModBlocks.POLISHED_PICRITE_BASALT);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHLORAPATITE_WALL, ModBlocks.POLISHED_CHLORAPATITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.EXTRA_POLISHED_CHLORAPATITE_WALL, ModBlocks.EXTRA_POLISHED_CHLORAPATITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.FULLY_POLISHED_CHLORAPATITE_WALL, ModBlocks.FULLY_POLISHED_CHLORAPATITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DACITE_WALL, ModBlocks.DACITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_HYDROXYLAPATITE_WALL, ModBlocks.POLISHED_HYDROXYLAPATITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.FOYAITE_WALL, ModBlocks.FOYAITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.GABBRO_WALL, ModBlocks.GABBRO);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.FLOWSTONE_WALL, ModBlocks.FLOWSTONE_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_MICROCLINE_WALL, ModBlocks.SMOOTH_MICROCLINE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOCLASE_FELDSPAR_WALL, ModBlocks.ORTHOCLASE_FELDSPAR);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.KHEWRA_SALT_WALL, ModBlocks.KHEWRA_SALT_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.PACKED_KAOLINITE_CLAY_WALL, ModBlocks.PACKED_KAOLINITE_CLAY);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.KAOLINITE_BRICK_WALL, ModBlocks.KAOLINITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAW_SUNSTONE_WALL, ModBlocks.RAW_SUNSTONE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SUNSTONE_WALL, ModBlocks.SUNSTONE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIMBURGITE_WALL, ModBlocks.LIMBURGITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.HAWAIITE_WALL, ModBlocks.HAWAIITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SCORIA_WALL, ModBlocks.SCORIA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PUMICE_SLAB, ModBlocks.PUMICE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.PUMICE_WALL, ModBlocks.PUMICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PUMICE_STAIRS, ModBlocks.PUMICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PUMICE_SLAB, ModBlocks.PUMICE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PUMICE_WALL, ModBlocks.PUMICE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUMICE_STAIRS, 4)
                .input('T', ModBlocks.PUMICE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PUMICE), FabricRecipeProvider.conditionsFromItem(ModBlocks.PUMICE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROUGH_COBBLESTONE_BRICK_SLAB, ModBlocks.ROUGH_COBBLESTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ROUGH_COBBLESTONE_BRICK_STAIRS, ModBlocks.ROUGH_COBBLESTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ROUGH_COBBLESTONE_BRICK_SLAB, ModBlocks.ROUGH_COBBLESTONE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ROUGH_COBBLESTONE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.ROUGH_COBBLESTONE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ROUGH_COBBLESTONE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.PUMICE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_BRICK_SLAB, ModBlocks.COBBLESTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_WALL, ModBlocks.COBBLESTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_STAIRS, ModBlocks.COBBLESTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_SLAB, ModBlocks.COBBLESTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_WALL, ModBlocks.COBBLESTONE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COBBLESTONE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.COBBLESTONE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COBBLESTONE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.COBBLESTONE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CLAY_ROOF_TILE_SLAB, ModBlocks.PINK_CLAY_ROOF_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_CLAY_ROOF_TILE_STAIRS, ModBlocks.PINK_CLAY_ROOF_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_CLAY_ROOF_TILE_SLAB, ModBlocks.PINK_CLAY_ROOF_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_CLAY_ROOF_TILE_STAIRS, 4)
                .input('T', ModBlocks.PINK_CLAY_ROOF_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PINK_CLAY_ROOF_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.PINK_CLAY_ROOF_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PERIDOTITE_SLAB, ModBlocks.PERIDOTITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_WALL, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_STAIRS, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_SLAB, ModBlocks.PERIDOTITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_WALL, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_BRICKS, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_BRICK_STAIRS, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_BRICK_SLAB, ModBlocks.PERIDOTITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PERIDOTITE, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PERIDOTITE_STAIRS, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PERIDOTITE_SLAB, ModBlocks.PERIDOTITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_TILES, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_TILE_STAIRS, ModBlocks.PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_TILE_SLAB, ModBlocks.PERIDOTITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PERIDOTITE_STAIRS, 4)
                .input('T', ModBlocks.PERIDOTITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PERIDOTITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.PERIDOTITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PERIDOTITE_BRICK_SLAB, ModBlocks.PERIDOTITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_BRICK_STAIRS, ModBlocks.PERIDOTITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_BRICK_SLAB, ModBlocks.PERIDOTITE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PERIDOTITE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.PERIDOTITE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PERIDOTITE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.PERIDOTITE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PERIDOTITE_SLAB, ModBlocks.POLISHED_PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PERIDOTITE_STAIRS, ModBlocks.POLISHED_PERIDOTITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PERIDOTITE_SLAB, ModBlocks.POLISHED_PERIDOTITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_PERIDOTITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_PERIDOTITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_PERIDOTITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_PERIDOTITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PERIDOTITE_TILE_SLAB, ModBlocks.PERIDOTITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_TILE_STAIRS, ModBlocks.PERIDOTITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_TILE_SLAB, ModBlocks.PERIDOTITE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PERIDOTITE_TILE_STAIRS, 4)
                .input('T', ModBlocks.PERIDOTITE_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PERIDOTITE_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.PERIDOTITE_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERT_SLAB, ModBlocks.CHERT);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHERT_WALL, ModBlocks.CHERT);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHERT_STAIRS, ModBlocks.CHERT);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHERT_SLAB, ModBlocks.CHERT, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHERT_WALL, ModBlocks.CHERT);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHERT, ModBlocks.CHERT);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHERT_STAIRS, ModBlocks.CHERT);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHERT_SLAB, ModBlocks.CHERT, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHERT_WALL, ModBlocks.CHERT);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHERT_STAIRS, 4)
                .input('T', ModBlocks.CHERT)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CHERT), FabricRecipeProvider.conditionsFromItem(ModBlocks.CHERT))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CHERT_SLAB, ModBlocks.POLISHED_CHERT);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHERT_WALL, ModBlocks.POLISHED_CHERT);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHERT_STAIRS, ModBlocks.POLISHED_CHERT);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHERT_SLAB, ModBlocks.POLISHED_CHERT, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHERT_WALL, ModBlocks.POLISHED_CHERT);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_CHERT_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_CHERT)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_CHERT), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_CHERT))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICKS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICK_STAIRS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICK_SLAB, ModBlocks.GNEISS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICK_WALL, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_POLISHED_GNEISS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_POLISHED_GNEISS_STAIRS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_POLISHED_GNEISS_SLAB, ModBlocks.GNEISS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICKS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICK_STAIRS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICK_SLAB, ModBlocks.GNEISS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICK_WALL, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_POLISHED_GNEISS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_POLISHED_GNEISS_STAIRS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_POLISHED_GNEISS_SLAB, ModBlocks.GNEISS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICKS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICK_STAIRS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICK_SLAB, ModBlocks.GNEISS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICK_WALL, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_POLISHED_GNEISS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_POLISHED_GNEISS_STAIRS, ModBlocks.GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_POLISHED_GNEISS_SLAB, ModBlocks.GNEISS, 2);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_GNEISS_BRICK_SLAB, ModBlocks.DARK_GNEISS_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICK_WALL, ModBlocks.DARK_GNEISS_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICK_STAIRS, ModBlocks.DARK_GNEISS_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICK_SLAB, ModBlocks.DARK_GNEISS_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICK_WALL, ModBlocks.DARK_GNEISS_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DARK_GNEISS_BRICK_STAIRS, 4)
                .input('T', ModBlocks.DARK_GNEISS_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARK_GNEISS_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARK_GNEISS_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GNEISS_BRICK_SLAB, ModBlocks.LIGHT_GNEISS_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICK_WALL, ModBlocks.LIGHT_GNEISS_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICK_STAIRS, ModBlocks.LIGHT_GNEISS_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICK_SLAB, ModBlocks.LIGHT_GNEISS_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICK_WALL, ModBlocks.LIGHT_GNEISS_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIGHT_GNEISS_BRICK_STAIRS, 4)
                .input('T', ModBlocks.LIGHT_GNEISS_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LIGHT_GNEISS_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.LIGHT_GNEISS_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_GNEISS_BRICK_SLAB, ModBlocks.PINK_GNEISS_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICK_WALL, ModBlocks.PINK_GNEISS_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICK_STAIRS, ModBlocks.PINK_GNEISS_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICK_SLAB, ModBlocks.PINK_GNEISS_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICK_WALL, ModBlocks.PINK_GNEISS_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_GNEISS_BRICK_STAIRS, 4)
                .input('T', ModBlocks.PINK_GNEISS_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PINK_GNEISS_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.PINK_GNEISS_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_POLISHED_GNEISS_SLAB, ModBlocks.DARK_POLISHED_GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_POLISHED_GNEISS_STAIRS, ModBlocks.DARK_POLISHED_GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_POLISHED_GNEISS_SLAB, ModBlocks.DARK_POLISHED_GNEISS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DARK_POLISHED_GNEISS_STAIRS, 4)
                .input('T', ModBlocks.DARK_POLISHED_GNEISS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARK_POLISHED_GNEISS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARK_POLISHED_GNEISS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_POLISHED_GNEISS_SLAB, ModBlocks.LIGHT_POLISHED_GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_POLISHED_GNEISS_STAIRS, ModBlocks.LIGHT_POLISHED_GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LIGHT_POLISHED_GNEISS_SLAB, ModBlocks.LIGHT_POLISHED_GNEISS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIGHT_POLISHED_GNEISS_STAIRS, 4)
                .input('T', ModBlocks.LIGHT_POLISHED_GNEISS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LIGHT_POLISHED_GNEISS), FabricRecipeProvider.conditionsFromItem(ModBlocks.LIGHT_POLISHED_GNEISS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_POLISHED_GNEISS_SLAB, ModBlocks.PINK_POLISHED_GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_POLISHED_GNEISS_STAIRS, ModBlocks.PINK_POLISHED_GNEISS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PINK_POLISHED_GNEISS_SLAB, ModBlocks.PINK_POLISHED_GNEISS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PINK_POLISHED_GNEISS_STAIRS, 4)
                .input('T', ModBlocks.PINK_POLISHED_GNEISS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PINK_POLISHED_GNEISS), FabricRecipeProvider.conditionsFromItem(ModBlocks.PINK_POLISHED_GNEISS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GYPSUM_ALABASTER_SLAB, ModBlocks.GYPSUM_ALABASTER);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.GYPSUM_ALABASTER_WALL, ModBlocks.GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GYPSUM_ALABASTER_STAIRS, ModBlocks.GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GYPSUM_ALABASTER_SLAB, ModBlocks.GYPSUM_ALABASTER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GYPSUM_ALABASTER_WALL, ModBlocks.GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GYPSUM_ALABASTER, ModBlocks.GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GYPSUM_ALABASTER_STAIRS, ModBlocks.GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GYPSUM_ALABASTER_SLAB, ModBlocks.GYPSUM_ALABASTER, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_GYPSUM_ALABASTER, ModBlocks.GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_GYPSUM_ALABASTER_STAIRS, ModBlocks.GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_GYPSUM_ALABASTER_SLAB, ModBlocks.GYPSUM_ALABASTER, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GYPSUM_ALABASTER_STAIRS, 4)
                .input('T', ModBlocks.GYPSUM_ALABASTER)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GYPSUM_ALABASTER), FabricRecipeProvider.conditionsFromItem(ModBlocks.GYPSUM_ALABASTER))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GYPSUM_ALABASTER_SLAB, ModBlocks.POLISHED_GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GYPSUM_ALABASTER_STAIRS, ModBlocks.POLISHED_GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GYPSUM_ALABASTER_SLAB, ModBlocks.POLISHED_GYPSUM_ALABASTER, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_GYPSUM_ALABASTER_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_GYPSUM_ALABASTER)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_GYPSUM_ALABASTER), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_GYPSUM_ALABASTER))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_GYPSUM_ALABASTER_SLAB, ModBlocks.SMOOTH_GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_GYPSUM_ALABASTER_STAIRS, ModBlocks.SMOOTH_GYPSUM_ALABASTER);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_GYPSUM_ALABASTER_SLAB, ModBlocks.SMOOTH_GYPSUM_ALABASTER, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SMOOTH_GYPSUM_ALABASTER_STAIRS, 4)
                .input('T', ModBlocks.SMOOTH_GYPSUM_ALABASTER)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SMOOTH_GYPSUM_ALABASTER), FabricRecipeProvider.conditionsFromItem(ModBlocks.SMOOTH_GYPSUM_ALABASTER))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_STAIRS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_SLAB, Blocks.ANDESITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_ANDESITE, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_ANDESITE_BRICKS, Blocks.ANDESITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_ANDESITE_BRICKS, ModBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_STAIRS, ModBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_SLAB, ModBlocks.ANDESITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_WALL, ModBlocks.ANDESITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANDESITE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.ANDESITE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANDESITE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.ANDESITE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUESCHIST_SLAB, ModBlocks.BLUESCHIST);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLUESCHIST_WALL, ModBlocks.BLUESCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLUESCHIST_STAIRS, ModBlocks.BLUESCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLUESCHIST_SLAB, ModBlocks.BLUESCHIST, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BLUESCHIST_WALL, ModBlocks.BLUESCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BLUESCHIST, ModBlocks.BLUESCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BLUESCHIST_STAIRS, ModBlocks.BLUESCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BLUESCHIST_SLAB, ModBlocks.BLUESCHIST, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_BLUESCHIST, ModBlocks.BLUESCHIST);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLUESCHIST_STAIRS, 4)
                .input('T', ModBlocks.BLUESCHIST)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BLUESCHIST), FabricRecipeProvider.conditionsFromItem(ModBlocks.BLUESCHIST))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BLUESCHIST_SLAB, ModBlocks.POLISHED_BLUESCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BLUESCHIST_STAIRS, ModBlocks.POLISHED_BLUESCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BLUESCHIST_SLAB, ModBlocks.POLISHED_BLUESCHIST, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_BLUESCHIST_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_BLUESCHIST)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_BLUESCHIST), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_BLUESCHIST))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVINE_SLAB, ModBlocks.OLIVINE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_WALL, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_STAIRS, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_SLAB, ModBlocks.OLIVINE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_WALL, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OLIVINE, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OLIVINE_STAIRS, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OLIVINE_SLAB, ModBlocks.OLIVINE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_TILES, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_TILE_STAIRS, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_TILE_SLAB, ModBlocks.OLIVINE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILES, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILE_STAIRS, ModBlocks.OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILE_SLAB, ModBlocks.OLIVINE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OLIVINE_STAIRS, 4)
                .input('T', ModBlocks.OLIVINE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.OLIVINE), FabricRecipeProvider.conditionsFromItem(ModBlocks.OLIVINE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_OLIVINE_SLAB, ModBlocks.POLISHED_OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OLIVINE_STAIRS, ModBlocks.POLISHED_OLIVINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OLIVINE_SLAB, ModBlocks.POLISHED_OLIVINE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_OLIVINE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_OLIVINE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_OLIVINE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_OLIVINE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OLIVINE_TILE_SLAB, ModBlocks.OLIVINE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_TILE_STAIRS, ModBlocks.OLIVINE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OLIVINE_TILE_SLAB, ModBlocks.OLIVINE_TILES, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILES, ModBlocks.OLIVINE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILE_STAIRS, ModBlocks.OLIVINE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILE_SLAB, ModBlocks.OLIVINE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OLIVINE_TILE_STAIRS, 4)
                .input('T', ModBlocks.OLIVINE_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.OLIVINE_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.OLIVINE_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_OLIVINE_TILE_SLAB, ModBlocks.SMALL_OLIVINE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILE_STAIRS, ModBlocks.SMALL_OLIVINE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILE_SLAB, ModBlocks.SMALL_OLIVINE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SMALL_OLIVINE_TILE_STAIRS, 4)
                .input('T', ModBlocks.SMALL_OLIVINE_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SMALL_OLIVINE_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.SMALL_OLIVINE_TILES))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_POTASSIUM_FELDSPAR, ModBlocks.POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_POTASSIUM_FELDSPAR_STAIRS, ModBlocks.POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_POTASSIUM_FELDSPAR_SLAB, ModBlocks.POTASSIUM_FELDSPAR, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICKS, ModBlocks.POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICK_STAIRS, ModBlocks.POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICK_SLAB, ModBlocks.POTASSIUM_FELDSPAR, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICK_WALL, ModBlocks.POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_TILES, ModBlocks.POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_TILE_STAIRS, ModBlocks.POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_TILE_SLAB, ModBlocks.POTASSIUM_FELDSPAR, 2);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_POTASSIUM_FELDSPAR_SLAB, ModBlocks.POLISHED_POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_POTASSIUM_FELDSPAR_STAIRS, ModBlocks.POLISHED_POTASSIUM_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_POTASSIUM_FELDSPAR_SLAB, ModBlocks.POLISHED_POTASSIUM_FELDSPAR, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_POTASSIUM_FELDSPAR_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_POTASSIUM_FELDSPAR)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_POTASSIUM_FELDSPAR), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_POTASSIUM_FELDSPAR))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTASSIUM_FELDSPAR_BRICK_SLAB, ModBlocks.POTASSIUM_FELDSPAR_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICK_WALL, ModBlocks.POTASSIUM_FELDSPAR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICK_STAIRS, ModBlocks.POTASSIUM_FELDSPAR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICK_SLAB, ModBlocks.POTASSIUM_FELDSPAR_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICK_WALL, ModBlocks.POTASSIUM_FELDSPAR_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_BRICK_STAIRS, 4)
                .input('T', ModBlocks.POTASSIUM_FELDSPAR_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POTASSIUM_FELDSPAR_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.POTASSIUM_FELDSPAR_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTASSIUM_FELDSPAR_TILE_SLAB, ModBlocks.POTASSIUM_FELDSPAR_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_TILE_STAIRS, ModBlocks.POTASSIUM_FELDSPAR_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_TILE_SLAB, ModBlocks.POTASSIUM_FELDSPAR_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POTASSIUM_FELDSPAR_TILE_STAIRS, 4)
                .input('T', ModBlocks.POTASSIUM_FELDSPAR_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POTASSIUM_FELDSPAR_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.POTASSIUM_FELDSPAR_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HARZBURGITE_SLAB, ModBlocks.HARZBURGITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_STAIRS, ModBlocks.HARZBURGITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_SLAB, ModBlocks.HARZBURGITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_HARZBURGITE, ModBlocks.HARZBURGITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_HARZBURGITE_STAIRS, ModBlocks.HARZBURGITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_HARZBURGITE_SLAB, ModBlocks.HARZBURGITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICKS, ModBlocks.HARZBURGITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICK_STAIRS, ModBlocks.HARZBURGITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICK_SLAB, ModBlocks.HARZBURGITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICK_WALL, ModBlocks.HARZBURGITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HARZBURGITE_STAIRS, 4)
                .input('T', ModBlocks.HARZBURGITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.HARZBURGITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.HARZBURGITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_HARZBURGITE_SLAB, ModBlocks.POLISHED_HARZBURGITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_HARZBURGITE_STAIRS, ModBlocks.POLISHED_HARZBURGITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_HARZBURGITE_SLAB, ModBlocks.POLISHED_HARZBURGITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_HARZBURGITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_HARZBURGITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_HARZBURGITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_HARZBURGITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HARZBURGITE_BRICK_SLAB, ModBlocks.HARZBURGITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICK_WALL, ModBlocks.HARZBURGITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICK_STAIRS, ModBlocks.HARZBURGITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICK_SLAB, ModBlocks.HARZBURGITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICK_WALL, ModBlocks.HARZBURGITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HARZBURGITE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.HARZBURGITE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.HARZBURGITE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.HARZBURGITE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORTHOPYROXENE_SLAB, ModBlocks.ORTHOPYROXENE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_WALL, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_STAIRS, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_SLAB, ModBlocks.ORTHOPYROXENE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_WALL, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ORTHOPYROXENE, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ORTHOPYROXENE_STAIRS, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ORTHOPYROXENE_SLAB, ModBlocks.ORTHOPYROXENE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_ORTHOPYROXENE, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_ORTHOPYROXENE_STAIRS, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_ORTHOPYROXENE_SLAB, ModBlocks.ORTHOPYROXENE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICKS, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICK_STAIRS, ModBlocks.ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICK_SLAB, ModBlocks.ORTHOPYROXENE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICK_WALL, ModBlocks.ORTHOPYROXENE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_STAIRS, 4)
                .input('T', ModBlocks.ORTHOPYROXENE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORTHOPYROXENE), FabricRecipeProvider.conditionsFromItem(ModBlocks.ORTHOPYROXENE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ORTHOPYROXENE_SLAB, ModBlocks.POLISHED_ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ORTHOPYROXENE_STAIRS, ModBlocks.POLISHED_ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ORTHOPYROXENE_SLAB, ModBlocks.POLISHED_ORTHOPYROXENE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_ORTHOPYROXENE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_ORTHOPYROXENE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ORTHOPYROXENE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ORTHOPYROXENE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_ORTHOPYROXENE_SLAB, ModBlocks.SMOOTH_ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_ORTHOPYROXENE_STAIRS, ModBlocks.SMOOTH_ORTHOPYROXENE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_ORTHOPYROXENE_SLAB, ModBlocks.SMOOTH_ORTHOPYROXENE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SMOOTH_ORTHOPYROXENE_STAIRS, 4)
                .input('T', ModBlocks.SMOOTH_ORTHOPYROXENE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SMOOTH_ORTHOPYROXENE), FabricRecipeProvider.conditionsFromItem(ModBlocks.SMOOTH_ORTHOPYROXENE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORTHOPYROXENE_BRICK_SLAB, ModBlocks.ORTHOPYROXENE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICK_WALL, ModBlocks.ORTHOPYROXENE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICK_STAIRS, ModBlocks.ORTHOPYROXENE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICK_SLAB, ModBlocks.ORTHOPYROXENE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICK_WALL, ModBlocks.ORTHOPYROXENE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORTHOPYROXENE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.ORTHOPYROXENE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORTHOPYROXENE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.ORTHOPYROXENE_BRICKS))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DRIPSTONE, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_TILES, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_TILE_STAIRS, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_TILE_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICKS, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICK_STAIRS, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICK_SLAB, Blocks.DRIPSTONE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICK_WALL, Blocks.DRIPSTONE_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DRIPSTONE_STAIRS, ModBlocks.POLISHED_DRIPSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DRIPSTONE_SLAB, ModBlocks.POLISHED_DRIPSTONE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_DRIPSTONE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_DRIPSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_DRIPSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_DRIPSTONE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_TILE_SLAB, ModBlocks.DRIPSTONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_TILE_STAIRS, ModBlocks.DRIPSTONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_TILE_SLAB, ModBlocks.DRIPSTONE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRIPSTONE_TILE_STAIRS, 4)
                .input('T', ModBlocks.DRIPSTONE_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DRIPSTONE_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.DRIPSTONE_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICK_STAIRS, ModBlocks.DRIPSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICK_SLAB, ModBlocks.DRIPSTONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICK_WALL, ModBlocks.DRIPSTONE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DRIPSTONE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.DRIPSTONE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DRIPSTONE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DRIPSTONE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALBITE_FELDSPAR_SLAB, ModBlocks.ALBITE_FELDSPAR);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_WALL, ModBlocks.ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_STAIRS, ModBlocks.ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_SLAB, ModBlocks.ALBITE_FELDSPAR, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_WALL, ModBlocks.ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ALBITE_FELDSPAR, ModBlocks.ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ALBITE_FELDSPAR_STAIRS, ModBlocks.ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ALBITE_FELDSPAR_SLAB, ModBlocks.ALBITE_FELDSPAR, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_TILES, ModBlocks.ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_TILE_STAIRS, ModBlocks.ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_TILE_SLAB, ModBlocks.ALBITE_FELDSPAR, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_STAIRS, 4)
                .input('T', ModBlocks.ALBITE_FELDSPAR)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ALBITE_FELDSPAR), FabricRecipeProvider.conditionsFromItem(ModBlocks.ALBITE_FELDSPAR))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ALBITE_FELDSPAR_SLAB, ModBlocks.POLISHED_ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ALBITE_FELDSPAR_STAIRS, ModBlocks.POLISHED_ALBITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ALBITE_FELDSPAR_SLAB, ModBlocks.POLISHED_ALBITE_FELDSPAR, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_ALBITE_FELDSPAR_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_ALBITE_FELDSPAR)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ALBITE_FELDSPAR), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ALBITE_FELDSPAR))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ALBITE_FELDSPAR_TILE_SLAB, ModBlocks.ALBITE_FELDSPAR_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_TILE_STAIRS, ModBlocks.ALBITE_FELDSPAR_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_TILE_SLAB, ModBlocks.ALBITE_FELDSPAR_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ALBITE_FELDSPAR_TILE_STAIRS, 4)
                .input('T', ModBlocks.ALBITE_FELDSPAR_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ALBITE_FELDSPAR_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.ALBITE_FELDSPAR_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADE_BLOCK_SLAB, ModBlocks.JADE_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_BLOCK_WALL, ModBlocks.JADE_BLOCK);
        offerSmelting(exporter, List.of(ModBlocks.JADE_TILES), RecipeCategory.MISC, ModBlocks.CRACKED_JADE_TILES, 5f,200, "cracked_jade_tiles");
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_BLOCK_STAIRS, ModBlocks.JADE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_BLOCK_SLAB, ModBlocks.JADE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_BLOCK_WALL, ModBlocks.JADE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_JADE, ModBlocks.JADE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_JADE_STAIRS, ModBlocks.JADE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_JADE_SLAB, ModBlocks.JADE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_TILES, ModBlocks.JADE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_TILE_STAIRS, ModBlocks.JADE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_TILE_SLAB, ModBlocks.JADE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_JADE, ModBlocks.JADE_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.JADE_BLOCK_STAIRS, 4)
                .input('T', ModBlocks.JADE_BLOCK)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JADE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.JADE_BLOCK))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_JADE_SLAB, ModBlocks.POLISHED_JADE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_JADE_STAIRS, ModBlocks.POLISHED_JADE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_JADE_SLAB, ModBlocks.POLISHED_JADE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_JADE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_JADE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_JADE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_JADE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JADE_TILE_SLAB, ModBlocks.JADE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_TILE_STAIRS, ModBlocks.JADE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.JADE_TILE_SLAB, ModBlocks.JADE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.JADE_TILE_STAIRS, 4)
                .input('T', ModBlocks.JADE_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.JADE_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.JADE_TILES))
                .offerTo(exporter);


        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANORTHITE_FELDSPAR, ModBlocks.ANORTHITE_FELDSPAR,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANORTHITE_FELDSPAR_STAIRS, ModBlocks.ANORTHITE_FELDSPAR,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANORTHITE_FELDSPAR_SLAB, ModBlocks.ANORTHITE_FELDSPAR, 16);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICKS, ModBlocks.ANORTHITE_FELDSPAR,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICK_STAIRS, ModBlocks.ANORTHITE_FELDSPAR,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICK_SLAB, ModBlocks.ANORTHITE_FELDSPAR, 16);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICK_WALL, ModBlocks.ANORTHITE_FELDSPAR,8);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ANORTHITE_FELDSPAR_SLAB, ModBlocks.POLISHED_ANORTHITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANORTHITE_FELDSPAR_STAIRS, ModBlocks.POLISHED_ANORTHITE_FELDSPAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ANORTHITE_FELDSPAR_SLAB, ModBlocks.POLISHED_ANORTHITE_FELDSPAR, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_ANORTHITE_FELDSPAR_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_ANORTHITE_FELDSPAR)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ANORTHITE_FELDSPAR), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ANORTHITE_FELDSPAR))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANORTHITE_FELDSPAR_BRICK_SLAB, ModBlocks.ANORTHITE_FELDSPAR_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICK_WALL, ModBlocks.ANORTHITE_FELDSPAR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICK_STAIRS, ModBlocks.ANORTHITE_FELDSPAR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICK_SLAB, ModBlocks.ANORTHITE_FELDSPAR_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICK_WALL, ModBlocks.ANORTHITE_FELDSPAR_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_BRICK_STAIRS, 4)
                .input('T', ModBlocks.ANORTHITE_FELDSPAR_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANORTHITE_FELDSPAR_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.ANORTHITE_FELDSPAR_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_SLAB, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_WALL, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_STAIRS, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_SLAB, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_WALL, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_STAIRS, 4)
                .input('T', ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEPHRITE_SLAB, ModBlocks.TEPHRITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TEPHRITE_STAIRS, ModBlocks.TEPHRITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TEPHRITE_SLAB, ModBlocks.TEPHRITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE, ModBlocks.TEPHRITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE_STAIRS, ModBlocks.TEPHRITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE_SLAB, ModBlocks.TEPHRITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE_WALL, ModBlocks.TEPHRITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TEPHRITE_STAIRS, 4)
                .input('T', ModBlocks.TEPHRITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TEPHRITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.TEPHRITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_TEPHRITE_SLAB, ModBlocks.POLISHED_TEPHRITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE_WALL, ModBlocks.POLISHED_TEPHRITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE_STAIRS, ModBlocks.POLISHED_TEPHRITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE_SLAB, ModBlocks.POLISHED_TEPHRITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE_WALL, ModBlocks.POLISHED_TEPHRITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_TEPHRITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_TEPHRITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_TEPHRITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_TEPHRITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARKOSE_SLAB, ModBlocks.ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_STAIRS, ModBlocks.ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_SLAB, ModBlocks.ARKOSE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_BRICKS, ModBlocks.ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_BRICK_STAIRS, ModBlocks.ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_BRICK_SLAB, ModBlocks.ARKOSE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_BRICK_WALL, ModBlocks.ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ARKOSE, ModBlocks.ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ARKOSE_STAIRS, ModBlocks.ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ARKOSE_SLAB, ModBlocks.ARKOSE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ARKOSE_STAIRS, 4)
                .input('T', ModBlocks.ARKOSE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ARKOSE), FabricRecipeProvider.conditionsFromItem(ModBlocks.ARKOSE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ARKOSE_BRICK_SLAB, ModBlocks.ARKOSE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_BRICK_WALL, ModBlocks.ARKOSE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_BRICK_STAIRS, ModBlocks.ARKOSE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_BRICK_SLAB, ModBlocks.ARKOSE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.ARKOSE_BRICK_WALL, ModBlocks.ARKOSE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ARKOSE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.ARKOSE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ARKOSE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.ARKOSE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ARKOSE_SLAB, ModBlocks.POLISHED_ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ARKOSE_STAIRS, ModBlocks.POLISHED_ARKOSE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ARKOSE_SLAB, ModBlocks.POLISHED_ARKOSE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_ARKOSE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_ARKOSE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ARKOSE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ARKOSE))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_SODALITE, ModBlocks.SODALITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_SODALITE_STAIRS, ModBlocks.SODALITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_SODALITE_SLAB, ModBlocks.SODALITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SODALITE_BRICKS, ModBlocks.SODALITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SODALITE_BRICK_STAIRS, ModBlocks.SODALITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SODALITE_BRICK_SLAB, ModBlocks.SODALITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SODALITE_BRICK_WALL, ModBlocks.SODALITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_SODALITE_SLAB, ModBlocks.POLISHED_SODALITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_SODALITE_STAIRS, ModBlocks.POLISHED_SODALITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_SODALITE_SLAB, ModBlocks.POLISHED_SODALITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_SODALITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_SODALITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_SODALITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_SODALITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SODALITE_BRICK_SLAB, ModBlocks.SODALITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SODALITE_BRICK_WALL, ModBlocks.SODALITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SODALITE_BRICK_STAIRS, ModBlocks.SODALITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SODALITE_BRICK_SLAB, ModBlocks.SODALITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SODALITE_BRICK_WALL, ModBlocks.SODALITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SODALITE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.SODALITE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SODALITE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SODALITE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEGMATITE_SLAB, ModBlocks.PEGMATITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_WALL, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_STAIRS, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_SLAB, ModBlocks.PEGMATITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_WALL, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PEGMATITE, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PEGMATITE_STAIRS, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PEGMATITE_SLAB, ModBlocks.PEGMATITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_BRICKS, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_BRICK_STAIRS, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_BRICK_SLAB, ModBlocks.PEGMATITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_TILES, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_TILE_STAIRS, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_TILE_SLAB, ModBlocks.PEGMATITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICKS, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_STAIRS, ModBlocks.PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_SLAB, ModBlocks.PEGMATITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_WALL, ModBlocks.PEGMATITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PEGMATITE_STAIRS, 4)
                .input('T', ModBlocks.PEGMATITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PEGMATITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.PEGMATITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PEGMATITE_SLAB, ModBlocks.POLISHED_PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PEGMATITE_STAIRS, ModBlocks.POLISHED_PEGMATITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PEGMATITE_SLAB, ModBlocks.POLISHED_PEGMATITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_PEGMATITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_PEGMATITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_PEGMATITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_PEGMATITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEGMATITE_BRICK_SLAB, ModBlocks.PEGMATITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_BRICK_STAIRS, ModBlocks.PEGMATITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_BRICK_SLAB, ModBlocks.PEGMATITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICKS, ModBlocks.PEGMATITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_STAIRS, ModBlocks.PEGMATITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_SLAB, ModBlocks.PEGMATITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_WALL, ModBlocks.PEGMATITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PEGMATITE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.PEGMATITE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PEGMATITE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.PEGMATITE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEGMATITE_TILE_SLAB, ModBlocks.PEGMATITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_TILE_STAIRS, ModBlocks.PEGMATITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PEGMATITE_TILE_SLAB, ModBlocks.PEGMATITE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PEGMATITE_TILE_STAIRS, 4)
                .input('T', ModBlocks.PEGMATITE_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PEGMATITE_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.PEGMATITE_TILES))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMALL_PEGMATITE_BRICK_SLAB, ModBlocks.SMALL_PEGMATITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_WALL, ModBlocks.SMALL_PEGMATITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_STAIRS, ModBlocks.SMALL_PEGMATITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_SLAB, ModBlocks.SMALL_PEGMATITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_WALL, ModBlocks.SMALL_PEGMATITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SMALL_PEGMATITE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.SMALL_PEGMATITE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SMALL_PEGMATITE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.SMALL_PEGMATITE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.THULITE_SLAB, ModBlocks.THULITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_WALL, ModBlocks.THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_STAIRS, ModBlocks.THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_SLAB, ModBlocks.THULITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_WALL, ModBlocks.THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_THULITE, ModBlocks.THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_THULITE_STAIRS, ModBlocks.THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_THULITE_SLAB, ModBlocks.THULITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_BRICKS, ModBlocks.THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_BRICK_STAIRS, ModBlocks.THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_BRICK_SLAB, ModBlocks.THULITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THULITE_STAIRS, 4)
                .input('T', ModBlocks.THULITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.THULITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.THULITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_THULITE_SLAB, ModBlocks.POLISHED_THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_THULITE_STAIRS, ModBlocks.POLISHED_THULITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_THULITE_SLAB, ModBlocks.POLISHED_THULITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_THULITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_THULITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_THULITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_THULITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.THULITE_BRICK_SLAB, ModBlocks.THULITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_BRICK_STAIRS, ModBlocks.THULITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.THULITE_BRICK_SLAB, ModBlocks.THULITE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THULITE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.THULITE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.THULITE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.THULITE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAPAKIVI_SLAB, ModBlocks.RAPAKIVI);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_WALL, ModBlocks.RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_STAIRS, ModBlocks.RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_SLAB, ModBlocks.RAPAKIVI, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_WALL, ModBlocks.RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RAPAKIVI, ModBlocks.RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RAPAKIVI_STAIRS, ModBlocks.RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RAPAKIVI_SLAB, ModBlocks.RAPAKIVI, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_BRICKS, ModBlocks.RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_BRICK_STAIRS, ModBlocks.RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_BRICK_SLAB, ModBlocks.RAPAKIVI, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAPAKIVI_STAIRS, 4)
                .input('T', ModBlocks.RAPAKIVI)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RAPAKIVI), FabricRecipeProvider.conditionsFromItem(ModBlocks.RAPAKIVI))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RAPAKIVI_SLAB, ModBlocks.POLISHED_RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RAPAKIVI_STAIRS, ModBlocks.POLISHED_RAPAKIVI);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RAPAKIVI_SLAB, ModBlocks.POLISHED_RAPAKIVI, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_RAPAKIVI_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_RAPAKIVI)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_RAPAKIVI), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_RAPAKIVI))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAPAKIVI_BRICK_SLAB, ModBlocks.RAPAKIVI_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_BRICK_STAIRS, ModBlocks.RAPAKIVI_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAPAKIVI_BRICK_SLAB, ModBlocks.RAPAKIVI_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAPAKIVI_BRICK_STAIRS, 4)
                .input('T', ModBlocks.RAPAKIVI_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RAPAKIVI_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.RAPAKIVI_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ROSE_QUARTZ_SLAB, ModBlocks.RAW_ROSE_QUARTZ);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAW_ROSE_QUARTZ_WALL, ModBlocks.RAW_ROSE_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAW_ROSE_QUARTZ_STAIRS, ModBlocks.RAW_ROSE_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAW_ROSE_QUARTZ_SLAB, ModBlocks.RAW_ROSE_QUARTZ, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RAW_ROSE_QUARTZ_WALL, ModBlocks.RAW_ROSE_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ROSE_QUARTZ, ModBlocks.RAW_ROSE_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ROSE_QUARTZ_STAIRS, ModBlocks.RAW_ROSE_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ROSE_QUARTZ_SLAB, ModBlocks.RAW_ROSE_QUARTZ, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RAW_ROSE_QUARTZ_STAIRS, 4)
                .input('T', ModBlocks.RAW_ROSE_QUARTZ)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RAW_ROSE_QUARTZ), FabricRecipeProvider.conditionsFromItem(ModBlocks.RAW_ROSE_QUARTZ))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_ROSE_QUARTZ_SLAB, ModBlocks.POLISHED_ROSE_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ROSE_QUARTZ_STAIRS, ModBlocks.POLISHED_ROSE_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_ROSE_QUARTZ_SLAB, ModBlocks.POLISHED_ROSE_QUARTZ, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_ROSE_QUARTZ_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_ROSE_QUARTZ)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_ROSE_QUARTZ), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_ROSE_QUARTZ))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LATERITE_ROCK_SLAB, ModBlocks.LATERITE_ROCK);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LATERITE_ROCK_WALL, ModBlocks.LATERITE_ROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LATERITE_ROCK_STAIRS, ModBlocks.LATERITE_ROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LATERITE_ROCK_SLAB, ModBlocks.LATERITE_ROCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LATERITE_ROCK_WALL, ModBlocks.LATERITE_ROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_LATERITE_ROCK, ModBlocks.LATERITE_ROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_LATERITE_ROCK_STAIRS, ModBlocks.LATERITE_ROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_LATERITE_ROCK_SLAB, ModBlocks.LATERITE_ROCK, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LATERITE_ROCK_STAIRS, 4)
                .input('T', ModBlocks.LATERITE_ROCK)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LATERITE_ROCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.LATERITE_ROCK))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_LATERITE_ROCK_SLAB, ModBlocks.POLISHED_LATERITE_ROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_LATERITE_ROCK_STAIRS, ModBlocks.POLISHED_LATERITE_ROCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_LATERITE_ROCK_SLAB, ModBlocks.POLISHED_LATERITE_ROCK, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_LATERITE_ROCK_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_LATERITE_ROCK)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_LATERITE_ROCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_LATERITE_ROCK))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE, ModBlocks.DUMORTIERITE, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE_STAIRS, ModBlocks.DUMORTIERITE, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE_SLAB, ModBlocks.DUMORTIERITE, 16);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE_WALL, ModBlocks.DUMORTIERITE, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_DUMORTIERITE, ModBlocks.DUMORTIERITE, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_DUMORTIERITE_STAIRS, ModBlocks.DUMORTIERITE, 8);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_DUMORTIERITE_SLAB, ModBlocks.DUMORTIERITE, 16);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DUMORTIERITE_SLAB, ModBlocks.POLISHED_DUMORTIERITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE_WALL, ModBlocks.POLISHED_DUMORTIERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE_STAIRS, ModBlocks.POLISHED_DUMORTIERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE_SLAB, ModBlocks.POLISHED_DUMORTIERITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE_WALL, ModBlocks.POLISHED_DUMORTIERITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_DUMORTIERITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_DUMORTIERITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_DUMORTIERITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_DUMORTIERITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_DUMORTIERITE_SLAB, ModBlocks.SMOOTH_DUMORTIERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_DUMORTIERITE_STAIRS, ModBlocks.SMOOTH_DUMORTIERITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.SMOOTH_DUMORTIERITE_SLAB, ModBlocks.SMOOTH_DUMORTIERITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SMOOTH_DUMORTIERITE_STAIRS, 4)
                .input('T', ModBlocks.SMOOTH_DUMORTIERITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SMOOTH_DUMORTIERITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.SMOOTH_DUMORTIERITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREENSCHIST_SLAB, ModBlocks.GREENSCHIST);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.GREENSCHIST_WALL, ModBlocks.GREENSCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GREENSCHIST_STAIRS, ModBlocks.GREENSCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GREENSCHIST_SLAB, ModBlocks.GREENSCHIST, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GREENSCHIST_WALL, ModBlocks.GREENSCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GREENSCHIST, ModBlocks.GREENSCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GREENSCHIST_STAIRS, ModBlocks.GREENSCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GREENSCHIST_SLAB, ModBlocks.GREENSCHIST, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHISELED_GREENSCHIST, ModBlocks.GREENSCHIST);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GREENSCHIST_STAIRS, 4)
                .input('T', ModBlocks.GREENSCHIST)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GREENSCHIST), FabricRecipeProvider.conditionsFromItem(ModBlocks.GREENSCHIST))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GREENSCHIST_SLAB, ModBlocks.POLISHED_GREENSCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GREENSCHIST_STAIRS, ModBlocks.POLISHED_GREENSCHIST);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GREENSCHIST_SLAB, ModBlocks.POLISHED_GREENSCHIST, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_GREENSCHIST_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_GREENSCHIST)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_GREENSCHIST), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_GREENSCHIST))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHAROITE_SLAB, ModBlocks.CHAROITE_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHAROITE_WALL, ModBlocks.CHAROITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHAROITE_STAIRS, ModBlocks.CHAROITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHAROITE_SLAB, ModBlocks.CHAROITE_BLOCK, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHAROITE_WALL, ModBlocks.CHAROITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHAROITE, ModBlocks.CHAROITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHAROITE_STAIRS, ModBlocks.CHAROITE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHAROITE_SLAB, ModBlocks.CHAROITE_BLOCK, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHAROITE_STAIRS, 4)
                .input('T', ModBlocks.CHAROITE_BLOCK)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CHAROITE_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.CHAROITE_BLOCK))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CHAROITE_SLAB, ModBlocks.POLISHED_CHAROITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHAROITE_STAIRS, ModBlocks.POLISHED_CHAROITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_CHAROITE_SLAB, ModBlocks.POLISHED_CHAROITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_CHAROITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_CHAROITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_CHAROITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_CHAROITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RHYOLITE_SLAB, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_STAIRS, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_SLAB, ModBlocks.RHYOLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICKS, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICK_STAIRS, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICK_SLAB, ModBlocks.RHYOLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICK_WALL, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RHYOLITE, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RHYOLITE_STAIRS, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RHYOLITE_SLAB, ModBlocks.RHYOLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_TILES, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_TILE_STAIRS, ModBlocks.RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_TILE_SLAB, ModBlocks.RHYOLITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RHYOLITE_STAIRS, 4)
                .input('T', ModBlocks.RHYOLITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RHYOLITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.RHYOLITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RHYOLITE_BRICK_SLAB, ModBlocks.RHYOLITE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICK_WALL, ModBlocks.RHYOLITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICK_STAIRS, ModBlocks.RHYOLITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICK_SLAB, ModBlocks.RHYOLITE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICK_WALL, ModBlocks.RHYOLITE_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RHYOLITE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.RHYOLITE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RHYOLITE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.RHYOLITE_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RHYOLITE_SLAB, ModBlocks.POLISHED_RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RHYOLITE_STAIRS, ModBlocks.POLISHED_RHYOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RHYOLITE_SLAB, ModBlocks.POLISHED_RHYOLITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_RHYOLITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_RHYOLITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_RHYOLITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_RHYOLITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RHYOLITE_TILE_SLAB, ModBlocks.RHYOLITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_TILE_STAIRS, ModBlocks.RHYOLITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RHYOLITE_TILE_SLAB, ModBlocks.RHYOLITE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RHYOLITE_TILE_STAIRS, 4)
                .input('T', ModBlocks.RHYOLITE_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RHYOLITE_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.RHYOLITE_TILES))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICKS, ModBlocks.TUFFACIOUS_CLAY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICK_STAIRS, ModBlocks.TUFFACIOUS_CLAY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICK_SLAB, ModBlocks.TUFFACIOUS_CLAY, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICK_WALL, ModBlocks.TUFFACIOUS_CLAY);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFFACIOUS_CLAY_BRICK_SLAB, ModBlocks.TUFFACIOUS_CLAY_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICK_WALL, ModBlocks.TUFFACIOUS_CLAY_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICK_STAIRS, ModBlocks.TUFFACIOUS_CLAY_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICK_SLAB, ModBlocks.TUFFACIOUS_CLAY_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICK_WALL, ModBlocks.TUFFACIOUS_CLAY_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TUFFACIOUS_CLAY_BRICK_STAIRS, 4)
                .input('T', ModBlocks.TUFFACIOUS_CLAY_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TUFFACIOUS_CLAY_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.TUFFACIOUS_CLAY_BRICKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIXED_SHALE, 3)
                .input(ModBlocks.DARK_SHALE)
                .input(ModBlocks.LIGHT_SHALE)
                .input(ModBlocks.OIL_SHALE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MIXED_SHALE), FabricRecipeProvider.conditionsFromItem(ModBlocks.MIXED_SHALE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DARK_SHALE, 3)
                .input(ModBlocks.MIXED_SHALE, 3)
                .input(Items.GRAY_DYE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARK_SHALE), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARK_SHALE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIGHT_SHALE, 3)
                .input(ModBlocks.MIXED_SHALE, 3)
                .input(Items.WHITE_DYE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LIGHT_SHALE), FabricRecipeProvider.conditionsFromItem(ModBlocks.LIGHT_SHALE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OIL_SHALE, 3)
                .input(ModBlocks.MIXED_SHALE, 3)
                .input(Items.BLACK_DYE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.OIL_SHALE), FabricRecipeProvider.conditionsFromItem(ModBlocks.OIL_SHALE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SMALL_BUSH, 8)
                .input('L',Blocks.OAK_LEAVES)
                .input('T',ModItems.TWIG)
                .pattern("LLL")
                .pattern("LTL")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SMALL_BUSH), FabricRecipeProvider.conditionsFromItem(ModBlocks.SMALL_BUSH))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LARGE_BUSH, 8)
                .input('L',Blocks.OAK_LEAVES)
                .input('T',ModItems.TWIG)
                .pattern("LLL")
                .pattern("LLL")
                .pattern("LTL")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LARGE_BUSH), FabricRecipeProvider.conditionsFromItem(ModBlocks.LARGE_BUSH))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TWIG, 8)
                .input(Blocks.OAK_LEAVES)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TWIG), FabricRecipeProvider.conditionsFromItem(ModItems.TWIG))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BRAMBLES)
                .input('T',ModItems.TWIG)
                .pattern("TT")
                .pattern("TT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BRAMBLES), FabricRecipeProvider.conditionsFromItem(ModBlocks.BRAMBLES))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PARRADIO)
                .input(Blocks.JUKEBOX)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PARRADIO), FabricRecipeProvider.conditionsFromItem(ModBlocks.PARRADIO))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRUMBLING_STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CRUMBLING_STONE_BRICKS)
                .input(Blocks.CRACKED_STONE_BRICKS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CRUMBLING_STONE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.CRUMBLING_STONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ROUGH_COBBLESTONE_BRICKS,2)
                .input('C',ModItems.COBBLE)
                .input('L',Items.CLAY_BALL)
                .pattern("CL")
                .pattern("LC")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ROUGH_COBBLESTONE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.ROUGH_COBBLESTONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIXED_STONE_BRICKS,4)
                .input('S',Blocks.STONE_BRICKS)
                .input('C',ModBlocks.COBBLESTONE_BRICKS)
                .pattern("SC")
                .pattern("CS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MIXED_STONE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.MIXED_STONE_BRICKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.COBBLESTONE_PATH,2)
                .input('G',Blocks.GRASS_BLOCK)
                .input('C',ModItems.COBBLE)
                .pattern("C")
                .pattern("G")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.COBBLESTONE_PATH), FabricRecipeProvider.conditionsFromItem(ModBlocks.COBBLESTONE_PATH))
                .offerTo(exporter);

        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.OAK_FENCING, Blocks.OAK_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SPRUCE_FENCING, Blocks.SPRUCE_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.BIRCH_FENCING, Blocks.BIRCH_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.JUNGLE_FENCING, Blocks.JUNGLE_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.ACACIA_FENCING, Blocks.ACACIA_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.DARK_OAK_FENCING, Blocks.DARK_OAK_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.MANGROVE_FENCING, Blocks.MANGROVE_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHERRY_FENCING, Blocks.CHERRY_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.BAMBOO_FENCING, Blocks.BAMBOO_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.CRIMSON_FENCING, Blocks.CRIMSON_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.WARPED_FENCING, Blocks.WARPED_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.WROUGHT_IRON_FENCE, Blocks.IRON_BARS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SUGAR_MAPLE_FENCING, ModBlocks.SUGAR_MAPLE_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.WHITE_PINE_FENCING, ModBlocks.WHITE_PINE_FENCE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.YEW_FENCING, ModBlocks.YEW_FENCE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANCIENT_CLAY)
                .input(ModBlocks.ANCIENT_CLAY)
                .input(Blocks.VINE)
                .group("mossy_cobblestone")
                .criterion("has_vine", conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, convertBetween(ModBlocks.MOSSY_ANCIENT_CLAY, Blocks.VINE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANCIENT_CLAY)
                .input(ModBlocks.ANCIENT_CLAY)
                .input(Blocks.MOSS_BLOCK)
                .group("mossy_cobblestone")
                .criterion("has_moss_block", conditionsFromItem(Blocks.MOSS_BLOCK))
                .offerTo(exporter, convertBetween(ModBlocks.MOSSY_ANCIENT_CLAY, Blocks.MOSS_BLOCK));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERY_MOSSY_ANCIENT_CLAY)
                .input(ModBlocks.MOSSY_ANCIENT_CLAY)
                .input(Blocks.VINE)
                .group("mossy_cobblestone")
                .criterion("has_vine", conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, convertBetween(ModBlocks.VERY_MOSSY_ANCIENT_CLAY, Blocks.VINE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERY_MOSSY_ANCIENT_CLAY)
                .input(ModBlocks.MOSSY_ANCIENT_CLAY)
                .input(Blocks.MOSS_BLOCK)
                .group("mossy_cobblestone")
                .criterion("has_moss_block", conditionsFromItem(Blocks.MOSS_BLOCK))
                .offerTo(exporter, convertBetween(ModBlocks.VERY_MOSSY_ANCIENT_CLAY, Blocks.MOSS_BLOCK));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STRAW_BLOCK, 4)
                .input('W',Items.WHEAT)
                .pattern("WW")
                .pattern("WW")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRAW_BLOCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRAW_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.DARK_SHALE_ROCKS, 8)
                .input('S',ModBlocks.DARK_SHALE)
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DARK_SHALE_ROCKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.DARK_SHALE_ROCKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LIGHT_SHALE_ROCKS, 8)
                .input('S',ModBlocks.LIGHT_SHALE)
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LIGHT_SHALE_ROCKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.LIGHT_SHALE_ROCKS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OIL_SHALE_ROCKS, 8)
                .input('S',ModBlocks.OIL_SHALE)
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.OIL_SHALE_ROCKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.OIL_SHALE_ROCKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GIANT_PINECONE_STAIRS, 4)
                .input('T', ModBlocks.GIANT_PINECONE_BLOCK)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GIANT_PINECONE_STAIRS), FabricRecipeProvider.conditionsFromItem(ModBlocks.GIANT_PINECONE_STAIRS))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GIANT_PINECONE_PEDUNCLE, 2)
                .input('T', ModBlocks.GIANT_PINECONE_BLOCK)
                .pattern("T")
                .pattern("T")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GIANT_PINECONE_PEDUNCLE), FabricRecipeProvider.conditionsFromItem(ModBlocks.GIANT_PINECONE_PEDUNCLE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PILE_OF_WOOD,9)
                .input('T', Blocks.OAK_LOG)
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PILE_OF_WOOD), FabricRecipeProvider.conditionsFromItem(ModBlocks.PILE_OF_WOOD))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STRIPPED_PILE_OF_WOOD,9)
                .input('T', Blocks.STRIPPED_OAK_LOG)
                .pattern("TTT")
                .pattern("TTT")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STRIPPED_PILE_OF_WOOD), FabricRecipeProvider.conditionsFromItem(ModBlocks.STRIPPED_PILE_OF_WOOD))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS)
                .input(ModBlocks.ANORTHITE_FELDSPAR_BRICKS)
                .input(Blocks.VINE)
                .group("mossy_cobblestone")
                .criterion("has_vine", conditionsFromItem(Blocks.VINE))
                .offerTo(exporter, convertBetween(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS, Blocks.VINE));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS)
                .input(ModBlocks.ANORTHITE_FELDSPAR_BRICKS)
                .input(Blocks.MOSS_BLOCK)
                .group("mossy_cobblestone")
                .criterion("has_moss_block", conditionsFromItem(Blocks.MOSS_BLOCK))
                .offerTo(exporter, convertBetween(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS, Blocks.MOSS_BLOCK));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ANORTHITE_FELDSPAR_ROCKS, 8)
                .input('S',ModBlocks.ANORTHITE_FELDSPAR)
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ANORTHITE_FELDSPAR_ROCKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.ANORTHITE_FELDSPAR_ROCKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LATERITE_ROCK, 4)
                .input('L',ModBlocks.LATERITE_SOIL)
                .pattern("LL")
                .pattern("LL")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LATERITE_ROCK), FabricRecipeProvider.conditionsFromItem(ModBlocks.LATERITE_ROCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLUE_CANDY_CANE)
                .input('S', Items.SUGAR)
                .input('D', Items.LIGHT_BLUE_DYE)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BLUE_CANDY_CANE), FabricRecipeProvider.conditionsFromItem(ModBlocks.BLUE_CANDY_CANE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_CANDY_CANE)
                .input('S', Items.SUGAR)
                .input('D', Items.RED_DYE)
                .pattern("SSS")
                .pattern("SDS")
                .pattern("SSS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RED_CANDY_CANE), FabricRecipeProvider.conditionsFromItem(ModBlocks.RED_CANDY_CANE))
                .offerTo(exporter);

        offerSmelting(exporter, List.of(ModBlocks.JADE_ORE), RecipeCategory.MISC, ModItems.JADE, 5f,200, "jade_ore");
        offerSmelting(exporter, List.of(ModBlocks.ROSE_QUARTZ_ORE), RecipeCategory.MISC, ModItems.ROSE_QUARTZ, 5f,200, "rose_quartz_ore");
        offerSmelting(exporter, List.of(ModBlocks.CHAROITE_ORE), RecipeCategory.MISC, ModItems.CHAROITE, 5f,200, "charoite_ore");
        offerBlasting(exporter, List.of(ModBlocks.JADE_ORE), RecipeCategory.MISC, ModItems.JADE, 5f,100, "jade_ore");
        offerBlasting(exporter, List.of(ModBlocks.ROSE_QUARTZ_ORE), RecipeCategory.MISC, ModItems.ROSE_QUARTZ, 5f,100, "rose_quartz_ore");
        offerBlasting(exporter, List.of(ModBlocks.CHAROITE_ORE), RecipeCategory.MISC, ModItems.CHAROITE, 5f,100, "charoite_ore");

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MIXED_STONE_BRICK_SLAB, ModBlocks.MIXED_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MIXED_STONE_BRICK_STAIRS, ModBlocks.MIXED_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.MIXED_STONE_BRICK_SLAB, ModBlocks.MIXED_STONE_BRICKS, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIXED_STONE_BRICK_STAIRS, 4)
                .input('T', ModBlocks.MIXED_STONE_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.MIXED_STONE_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.MIXED_STONE_BRICKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE, 2)
                .input(ModBlocks.WEAVERS_BROOM)
                .group("weavers_broom")
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter,"weavers_broom");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE, 2)
                .input(ModBlocks.LAVENDER_BALL)
                .group("lavender_ball")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter,"lavender_ball");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE, 2)
                .input(ModBlocks.DOG_ROSE_BUSH)
                .group("dog_rose_bush")
                .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter,"dog_rose_bush");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE, 2)
                .input(ModBlocks.GIANT_PASSIFLORA_INCARNATA)
                .group("giant_passiflora_incarnata")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter,"giant_passiflora_incarnata");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE, 2)
                .input(ModBlocks.GIANT_PASSIFLORA_CAERULA)
                .group("giant_passiflora_caerula")
                .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter,"giant_passiflora_caerula");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE, 2)
                .input(ModBlocks.CATTAILS)
                .group("cattails")
                .criterion(FabricRecipeProvider.hasItem(Items.BROWN_DYE), FabricRecipeProvider.conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter,"cattails");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.PINK_VIOLA_TRICOLOR)
                .group("pink_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"pink_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.INDIGO_WHITE_VIOLA_TRICOLOR)
                .group("indigo_white_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter,"indigo_white_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.WHITE_VIOLA_TRICOLOR)
                .group("white_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter,"white_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.HONEY_VIOLA_TRICOLOR)
                .group("honey_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter,"honey_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.YELLOW_VIOLA_TRICOLOR)
                .group("yellow_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter,"yellow_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.PURPLE_VIOLA_TRICOLOR)
                .group("purple_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter,"purple_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.PURPLE_CROWN_VIOLA_TRICOLOR)
                .group("purple_crown_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter,"purple_crown_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_GRAY_DYE)
                .input(ModBlocks.VIOLA_TRICOLOR)
                .group("viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_GRAY_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter,"viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.PEARL_VIOLET_VIOLA_TRICOLOR)
                .group("pearl_violet_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter,"pearl_violet_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.HONEY_VIOLET_VIOLA_TRICOLOR)
                .group("honey_violet_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter,"honey_violet_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.LIGHT_PINK_VIOLA_TRICOLOR)
                .group("light_pink_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"light_pink_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.LIGHT_BLUE_VIOLA_TRICOLOR)
                .group("light_blue_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter,"light_blue_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE)
                .input(ModBlocks.BLUE_VIOLA_TRICOLOR)
                .group("blue_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter,"blue_viola_tricolor");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CYAN_DYE)
                .input(ModBlocks.COBALT_VIOLA_TRICOLOR)
                .group("cobalt_viola_tricolor")
                .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter,"cobalt_viola_tricolor");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.HOT_PINK_HYACINTH)
                .group("hot_pink_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"hot_pink_hyacinth");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(ModBlocks.CORAL_HYACINTH)
                .group("coral_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.ORANGE_DYE), FabricRecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter,"coral_hyacinth");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.YELLOW_HYACINTH)
                .group("yellow_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter,"yellow_hyacinth");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.BLUE_HYACINTH)
                .group("blue_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter,"blue_hyacinth");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.PURPLE_HYACINTH)
                .group("purple_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter,"purple_hyacinth");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE)
                .input(ModBlocks.INDIGO_HYACINTH)
                .group("indigo_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter,"indigo_hyacinth");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.PINK_HYACINTH)
                .group("pink_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"pink_hyacinth");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.LIGHT_PINK_HYACINTH)
                .group("light_pink_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"light_pink_hyacinth");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.WHITE_HYACINTH)
                .group("white_hyacinth")
                .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter,"white_hyacinth");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.BLUE_STARS)
                .group("blue_stars")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, "blue_stars");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.LAVENDER_BLUE_WALL_IRIS)
                .group("lavender_blue_wall_iris")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter,"lavender_blue_wall_iris");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.WHITE_WALL_IRIS)
                .group("white_wall_iris")
                .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter,"white_wall_iris");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.BLUE_LILAC_WALL_IRIS)
                .group("blue_lilac_wall_iris")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter,"blue_lilac_wall_iris");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.PURPLE_BLUE_WALL_IRIS)
                .group("purple_blue_wall_iris")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter,"purple_blue_wall_iris");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(ModBlocks.SKY_BLUE_WALL_IRIS)
                .group("sky_blue_wall_iris")
                .criterion(FabricRecipeProvider.hasItem(Items.LIGHT_BLUE_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter,"sky_blue_wall_iris");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.BLUISH_VIOLET_WALL_IRIS)
                .group("bluish_violet_wall_iris")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter,"bluish_violet_wall_iris");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.BLANKET_FLOWER)
                .group("blanket_flower")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"blanket_flower");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.RED_BLANKET_FLOWER)
                .group("red_blanket_flower")
                .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter,"red_blanket_flower");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.RED_NEMESIA)
                .group("red_nemesia")
                .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter,"red_nemesia");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.STAR_JASMINE)
                .group("star_jasmine")
                .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter,"star_jasmine");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.BASKET_OF_GOLD)
                .group("basket_of_gold")
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter,"basket_of_gold");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.JAPANESE_QUINCE)
                .group("japanese_quince")
                .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter,"japanese_quince");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.RED_DYE)
                .input(ModBlocks.FLOWERING_OXYRIA)
                .group("flowering_oxyria")
                .criterion(FabricRecipeProvider.hasItem(Items.RED_DYE), FabricRecipeProvider.conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter,"flowering_oxyria");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIME_DYE)
                .input(ModBlocks.EUPHORBIA_X_MARTINI)
                .group("euphorbia_x_martini")
                .criterion(FabricRecipeProvider.hasItem(Items.LIME_DYE), FabricRecipeProvider.conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter,"euphorbia_x_martini");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.SILVER_VASE)
                .group("silver_vase")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"silver_vase");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(ModBlocks.WILDFLOWERS)
                .group("wildflowers")
                .criterion(FabricRecipeProvider.hasItem(Items.YELLOW_DYE), FabricRecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter,"wildflowers");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(ModBlocks.WILD_COSMOS_AND_BACHELOR_BUTTONS)
                .group("wild_cosmos_and_bachelor_buttons")
                .criterion(FabricRecipeProvider.hasItem(Items.PURPLE_DYE), FabricRecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter,"wild_cosmos_and_bachelor_buttons");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CYAN_DYE)
                .input(ModBlocks.LUMINESCENT_BRIAR)
                .group("luminescent_briar")
                .criterion(FabricRecipeProvider.hasItem(Items.CYAN_DYE), FabricRecipeProvider.conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter,"luminescent_briar");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(ModBlocks.WHITE_LOTUS_FLOWER)
                .group("white_lotus_flower")
                .criterion(FabricRecipeProvider.hasItem(Items.WHITE_DYE), FabricRecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter,"white_lotus_flower");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.PINK_LOTUS_FLOWER)
                .group("pink_lotus_flower")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"pink_lotus_flower");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE)
                .input(ModBlocks.HUMMINGBIRD_FUCHSIA)
                .group("hummingbird_fuchsia")
                .criterion(FabricRecipeProvider.hasItem(Items.MAGENTA_DYE), FabricRecipeProvider.conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter,"hummingbird_fuchsia");
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PINK_DYE)
                .input(ModBlocks.ASIAN_BLEEDING_HEART)
                .group("asian_bleeding_heart")
                .criterion(FabricRecipeProvider.hasItem(Items.PINK_DYE), FabricRecipeProvider.conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter,"asian_bleeding_heart");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FEATHER, RecipeCategory.MISC, ModBlocks.FEATHER_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.COBBLE_BRICK)
                .input('C',ModItems.COBBLE)
                .pattern("CC")
                .criterion(FabricRecipeProvider.hasItem(ModItems.COBBLE), FabricRecipeProvider.conditionsFromItem(ModItems.COBBLE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OOLITE_SLAB, ModBlocks.OOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OOLITE_STAIRS, ModBlocks.OOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.OOLITE_SLAB, ModBlocks.OOLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE, ModBlocks.OOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE_STAIRS, ModBlocks.OOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE_SLAB, ModBlocks.OOLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE_WALL, ModBlocks.OOLITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OOLITE_STAIRS, 4)
                .input('T', ModBlocks.OOLITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.OOLITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.OOLITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_OOLITE_SLAB, ModBlocks.POLISHED_OOLITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE_WALL, ModBlocks.POLISHED_OOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE_STAIRS, ModBlocks.POLISHED_OOLITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE_SLAB, ModBlocks.POLISHED_OOLITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE_WALL, ModBlocks.POLISHED_OOLITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_OOLITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_OOLITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_OOLITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_OOLITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORPHYRY_SLAB, ModBlocks.PORPHYRY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_STAIRS, ModBlocks.PORPHYRY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_SLAB, ModBlocks.PORPHYRY, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PORPHYRY, ModBlocks.PORPHYRY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PORPHYRY_STAIRS, ModBlocks.PORPHYRY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PORPHYRY_SLAB, ModBlocks.PORPHYRY, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICKS, ModBlocks.PORPHYRY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICK_STAIRS, ModBlocks.PORPHYRY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICK_SLAB, ModBlocks.PORPHYRY, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICK_WALL, ModBlocks.PORPHYRY);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PORPHYRY_STAIRS, 4)
                .input('T', ModBlocks.PORPHYRY)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PORPHYRY), FabricRecipeProvider.conditionsFromItem(ModBlocks.PORPHYRY))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PORPHYRY_SLAB, ModBlocks.POLISHED_PORPHYRY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PORPHYRY_STAIRS, ModBlocks.POLISHED_PORPHYRY);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PORPHYRY_SLAB, ModBlocks.POLISHED_PORPHYRY, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_PORPHYRY_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_PORPHYRY)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_PORPHYRY), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_PORPHYRY))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PORPHYRY_BRICK_SLAB, ModBlocks.PORPHYRY_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICK_WALL, ModBlocks.PORPHYRY_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICK_STAIRS, ModBlocks.PORPHYRY_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICK_SLAB, ModBlocks.PORPHYRY_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICK_WALL, ModBlocks.PORPHYRY_BRICKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PORPHYRY_BRICK_STAIRS, 4)
                .input('T', ModBlocks.PORPHYRY_BRICKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PORPHYRY_BRICKS), FabricRecipeProvider.conditionsFromItem(ModBlocks.PORPHYRY_BRICKS))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LARIMAR_SLAB, ModBlocks.LARIMAR);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.LARIMAR_WALL, ModBlocks.LARIMAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LARIMAR_STAIRS, ModBlocks.LARIMAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LARIMAR_SLAB, ModBlocks.LARIMAR, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.LARIMAR_WALL, ModBlocks.LARIMAR);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LARIMAR_STAIRS, 4)
                .input('T', ModBlocks.LARIMAR)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LARIMAR), FabricRecipeProvider.conditionsFromItem(ModBlocks.LARIMAR))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIGEONITE_SLAB, ModBlocks.PIGEONITE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_WALL, ModBlocks.PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_STAIRS, ModBlocks.PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_SLAB, ModBlocks.PIGEONITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_WALL, ModBlocks.PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PIGEONITE, ModBlocks.PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PIGEONITE_STAIRS, ModBlocks.PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PIGEONITE_SLAB, ModBlocks.PIGEONITE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_TILES, ModBlocks.PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_TILE_STAIRS, ModBlocks.PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_TILE_SLAB, ModBlocks.PIGEONITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PIGEONITE_STAIRS, 4)
                .input('T', ModBlocks.PIGEONITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PIGEONITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.PIGEONITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_PIGEONITE_SLAB, ModBlocks.POLISHED_PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PIGEONITE_STAIRS, ModBlocks.POLISHED_PIGEONITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_PIGEONITE_SLAB, ModBlocks.POLISHED_PIGEONITE, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_PIGEONITE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_PIGEONITE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_PIGEONITE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_PIGEONITE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PIGEONITE_TILE_SLAB, ModBlocks.PIGEONITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_TILE_STAIRS, ModBlocks.PIGEONITE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PIGEONITE_TILE_SLAB, ModBlocks.PIGEONITE_TILES, 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PIGEONITE_TILE_STAIRS, 4)
                .input('T', ModBlocks.PIGEONITE_TILES)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PIGEONITE_TILES), FabricRecipeProvider.conditionsFromItem(ModBlocks.PIGEONITE_TILES))
                .offerTo(exporter);

        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.PERIDOTITE_SHELL_PAVEMENT, ModBlocks.PERIDOTITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PERIDOTITE_SHELL_PAVEMENT, 2)
                .input('S',ModBlocks.PERIDOTITE_SLAB)
                .pattern("SS")
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PERIDOTITE_SHELL_PAVEMENT), FabricRecipeProvider.conditionsFromItem(ModBlocks.PERIDOTITE_SHELL_PAVEMENT))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.TRACHYANDESITE_SHELL_PAVEMENT, ModBlocks.TRACHYANDESITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.TRACHYANDESITE_SHELL_PAVEMENT, 2)
                .input('S',ModBlocks.TRACHYANDESITE_SLAB)
                .pattern("SS")
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TRACHYANDESITE_SHELL_PAVEMENT), FabricRecipeProvider.conditionsFromItem(ModBlocks.TRACHYANDESITE_SHELL_PAVEMENT))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.CHLORAPATITE_SHELL_PAVEMENT, ModBlocks.CHLORAPATITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CHLORAPATITE_SHELL_PAVEMENT, 2)
                .input('S',ModBlocks.CHLORAPATITE_SLAB)
                .pattern("SS")
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CHLORAPATITE_SHELL_PAVEMENT), FabricRecipeProvider.conditionsFromItem(ModBlocks.CHLORAPATITE_SHELL_PAVEMENT))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.HYDROXYLAPATITE_SHELL_PAVEMENT, ModBlocks.HYDROXYLAPATITE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.HYDROXYLAPATITE_SHELL_PAVEMENT, 2)
                .input('S',ModBlocks.HYDROXYLAPATITE_SLAB)
                .pattern("SS")
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.HYDROXYLAPATITE_SHELL_PAVEMENT), FabricRecipeProvider.conditionsFromItem(ModBlocks.HYDROXYLAPATITE_SHELL_PAVEMENT))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.STONE_SHELL_PAVEMENT, Blocks.STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STONE_SHELL_PAVEMENT, 2)
                .input('S',Blocks.STONE_SLAB)
                .pattern("SS")
                .pattern("SS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.STONE_SHELL_PAVEMENT), FabricRecipeProvider.conditionsFromItem(ModBlocks.STONE_SHELL_PAVEMENT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ROPE, 2)
                .input('S', Items.STRING)
                .pattern("S")
                .pattern("S")
                .pattern("S")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ROPE), FabricRecipeProvider.conditionsFromItem(ModBlocks.ROPE))
                .offerTo(exporter);

        offerSmelting(exporter, List.of(ModItems.ANCIENT_CLAY_BALL), RecipeCategory.MISC, ModItems.ANCIENT_BRICK, 0.3f,200, "ancient_brick");
        offerSmelting(exporter, List.of(ModItems.KAOLINITE_CLAY_CHUNK), RecipeCategory.MISC, ModItems.KAOLINITE_BRICK, 0.3f,200, "kaolinite_brick");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PACKED_KAOLINITE_CLAY, 4)
                .input('K',ModBlocks.KAOLINITE_CLAY)
                .pattern("KK")
                .pattern("KK")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.PACKED_KAOLINITE_CLAY), FabricRecipeProvider.conditionsFromItem(ModBlocks.PACKED_KAOLINITE_CLAY))
                .offerTo(exporter);
        offerSmelting(exporter, List.of(ModBlocks.KAOLINITE_CLAY), RecipeCategory.MISC, ModBlocks.HARDENED_KAOLINITE_CLAY, 0.3f,200, "hardened_kaolinite_clay");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SALT_LAMP)
                .input('S',ModItems.HIMALAYAN_SALT)
                .input('T',Items.TORCH)
                .pattern("SSS")
                .pattern("STS")
                .pattern("SSS")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.SALT_LAMP), FabricRecipeProvider.conditionsFromItem(ModBlocks.SALT_LAMP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ORNATE_PICTURE_WINDOW,8)
                .input('G',Blocks.GLASS)
                .input('I',Items.IRON_NUGGET)
                .pattern("GGG")
                .pattern("GIG")
                .pattern("GGG")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.ORNATE_PICTURE_WINDOW), FabricRecipeProvider.conditionsFromItem(ModBlocks.ORNATE_PICTURE_WINDOW))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LARGE_PICTURE_WINDOW_MIDDLE,7)
                .input('G',Blocks.GLASS)
                .input('I',Items.IRON_NUGGET)
                .pattern("GGG")
                .pattern("IGI")
                .pattern("GGG")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LARGE_PICTURE_WINDOW_MIDDLE), FabricRecipeProvider.conditionsFromItem(ModBlocks.LARGE_PICTURE_WINDOW_MIDDLE))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LARGE_PICTURE_WINDOW_BOTTOM,6)
                .input('G',Blocks.GLASS)
                .input('I',Items.IRON_NUGGET)
                .pattern("GGG")
                .pattern("IGI")
                .pattern("GIG")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LARGE_PICTURE_WINDOW_BOTTOM), FabricRecipeProvider.conditionsFromItem(ModBlocks.LARGE_PICTURE_WINDOW_BOTTOM))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LARGE_PICTURE_WINDOW_TOP,6)
                .input('G',Blocks.GLASS)
                .input('I',Items.IRON_NUGGET)
                .pattern("GIG")
                .pattern("IGI")
                .pattern("GGG")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.LARGE_PICTURE_WINDOW_TOP), FabricRecipeProvider.conditionsFromItem(ModBlocks.LARGE_PICTURE_WINDOW_TOP))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BLOCK_OF_RUBBLE)
                .input(ModItems.TWIG,3)
                .input(ModItems.COBBLE,3)
                .input(ItemTags.LEAVES)
                .input(ItemTags.LEAVES)
                .input(ItemTags.LEAVES)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TWIG), FabricRecipeProvider.conditionsFromItem(ModItems.TWIG))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_SILTSTONE_SLAB, ModBlocks.GRAY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GRAY_SILTSTONE_STAIRS, ModBlocks.GRAY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.GRAY_SILTSTONE_SLAB, ModBlocks.GRAY_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE, ModBlocks.GRAY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE_STAIRS, ModBlocks.GRAY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE_SLAB, ModBlocks.GRAY_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE_WALL, ModBlocks.GRAY_SILTSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GRAY_SILTSTONE_STAIRS, 4)
                .input('T', ModBlocks.GRAY_SILTSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.GRAY_SILTSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.GRAY_SILTSTONE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRAY_SILTSTONE_SLAB, ModBlocks.POLISHED_GRAY_SILTSTONE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE_WALL, ModBlocks.POLISHED_GRAY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE_STAIRS, ModBlocks.POLISHED_GRAY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE_SLAB, ModBlocks.POLISHED_GRAY_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE_WALL, ModBlocks.POLISHED_GRAY_SILTSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_GRAY_SILTSTONE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_GRAY_SILTSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_GRAY_SILTSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_GRAY_SILTSTONE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BUFF_SILTSTONE_SLAB, ModBlocks.BUFF_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BUFF_SILTSTONE_STAIRS, ModBlocks.BUFF_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BUFF_SILTSTONE_SLAB, ModBlocks.BUFF_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE, ModBlocks.BUFF_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE_STAIRS, ModBlocks.BUFF_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE_SLAB, ModBlocks.BUFF_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE_WALL, ModBlocks.BUFF_SILTSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BUFF_SILTSTONE_STAIRS, 4)
                .input('T', ModBlocks.BUFF_SILTSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BUFF_SILTSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.BUFF_SILTSTONE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BUFF_SILTSTONE_SLAB, ModBlocks.POLISHED_BUFF_SILTSTONE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE_WALL, ModBlocks.POLISHED_BUFF_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE_STAIRS, ModBlocks.POLISHED_BUFF_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE_SLAB, ModBlocks.POLISHED_BUFF_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE_WALL, ModBlocks.POLISHED_BUFF_SILTSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_BUFF_SILTSTONE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_BUFF_SILTSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_BUFF_SILTSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_BUFF_SILTSTONE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_SILTSTONE_SLAB, ModBlocks.RED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RED_SILTSTONE_STAIRS, ModBlocks.RED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.RED_SILTSTONE_SLAB, ModBlocks.RED_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE, ModBlocks.RED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE_STAIRS, ModBlocks.RED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE_SLAB, ModBlocks.RED_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE_WALL, ModBlocks.RED_SILTSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_SILTSTONE_STAIRS, 4)
                .input('T', ModBlocks.RED_SILTSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.RED_SILTSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.RED_SILTSTONE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RED_SILTSTONE_SLAB, ModBlocks.POLISHED_RED_SILTSTONE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE_WALL, ModBlocks.POLISHED_RED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE_STAIRS, ModBlocks.POLISHED_RED_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE_SLAB, ModBlocks.POLISHED_RED_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE_WALL, ModBlocks.POLISHED_RED_SILTSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_RED_SILTSTONE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_RED_SILTSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_RED_SILTSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_RED_SILTSTONE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BURGUNDY_SILTSTONE_SLAB, ModBlocks.BURGUNDY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BURGUNDY_SILTSTONE_STAIRS, ModBlocks.BURGUNDY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.BURGUNDY_SILTSTONE_SLAB, ModBlocks.BURGUNDY_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE, ModBlocks.BURGUNDY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_STAIRS, ModBlocks.BURGUNDY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_SLAB, ModBlocks.BURGUNDY_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_WALL, ModBlocks.BURGUNDY_SILTSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.BURGUNDY_SILTSTONE_STAIRS, 4)
                .input('T', ModBlocks.BURGUNDY_SILTSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.BURGUNDY_SILTSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.BURGUNDY_SILTSTONE))
                .offerTo(exporter);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_SLAB, ModBlocks.POLISHED_BURGUNDY_SILTSTONE);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_WALL, ModBlocks.POLISHED_BURGUNDY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_STAIRS, ModBlocks.POLISHED_BURGUNDY_SILTSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_SLAB, ModBlocks.POLISHED_BURGUNDY_SILTSTONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_WALL, ModBlocks.POLISHED_BURGUNDY_SILTSTONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.POLISHED_BURGUNDY_SILTSTONE_STAIRS, 4)
                .input('T', ModBlocks.POLISHED_BURGUNDY_SILTSTONE)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.POLISHED_BURGUNDY_SILTSTONE), FabricRecipeProvider.conditionsFromItem(ModBlocks.POLISHED_BURGUNDY_SILTSTONE))
                .offerTo(exporter);
    }
}
