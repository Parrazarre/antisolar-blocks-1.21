package net.parra.antisolarblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.GrassBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SMALL_BUSH);
        addDrop(ModBlocks.LARGE_BUSH);
        addDrop(ModBlocks.WEAVERS_BROOM);
        addDrop(ModBlocks.DARK_WILD_GRASS);
        addDrop(ModBlocks.LIGHT_WILD_GRASS);

        addDrop(ModBlocks.PINK_VIOLA_TRICOLOR);
        addDrop(ModBlocks.INDIGO_WHITE_VIOLA_TRICOLOR);
        addDrop(ModBlocks.WHITE_VIOLA_TRICOLOR);
        addDrop(ModBlocks.HONEY_VIOLA_TRICOLOR);
        addDrop(ModBlocks.YELLOW_VIOLA_TRICOLOR);
        addDrop(ModBlocks.PURPLE_VIOLA_TRICOLOR);
        addDrop(ModBlocks.PURPLE_CROWN_VIOLA_TRICOLOR);
        addDrop(ModBlocks.VIOLA_TRICOLOR);
        addDrop(ModBlocks.PEARL_VIOLET_VIOLA_TRICOLOR);
        addDrop(ModBlocks.HONEY_VIOLET_VIOLA_TRICOLOR);
        addDrop(ModBlocks.LIGHT_PINK_VIOLA_TRICOLOR);
        addDrop(ModBlocks.LIGHT_BLUE_VIOLA_TRICOLOR);
        addDrop(ModBlocks.BLUE_VIOLA_TRICOLOR);
        addDrop(ModBlocks.COBALT_VIOLA_TRICOLOR);
        addDrop(ModBlocks.BLUE_STARS);
        addDrop(ModBlocks.LAVENDER_BLUE_WALL_IRIS);
        addDrop(ModBlocks.WHITE_WALL_IRIS);
        addDrop(ModBlocks.BLUE_LILAC_WALL_IRIS);
        addDrop(ModBlocks.PURPLE_BLUE_WALL_IRIS);
        addDrop(ModBlocks.SKY_BLUE_WALL_IRIS);
        addDrop(ModBlocks.BLUISH_VIOLET_WALL_IRIS);
        addDrop(ModBlocks.STAR_JASMINE);
        addDrop(ModBlocks.BASKET_OF_GOLD);
        addDrop(ModBlocks.HUMMINGBIRD_FUCHSIA);
        addDrop(ModBlocks.ASIAN_BLEEDING_HEART);

        addDrop(ModBlocks.ROUGH_COBBLESTONE_BRICKS);
        addDrop(ModBlocks.ROUGH_COBBLESTONE_BRICK_STAIRS);
        addDrop(ModBlocks.ROUGH_COBBLESTONE_BRICK_SLAB, slabDrops(ModBlocks.ROUGH_COBBLESTONE_BRICK_SLAB));
        addDrop(ModBlocks.COBBLESTONE_BRICKS);
        addDrop(ModBlocks.COBBLESTONE_BRICK_STAIRS);
        addDrop(ModBlocks.COBBLESTONE_BRICK_SLAB, slabDrops(ModBlocks.COBBLESTONE_BRICK_SLAB));
        addDrop(ModBlocks.COBBLESTONE_BRICK_WALL);
        addDrop(ModBlocks.COBBLESTONE_PATH);

        addDrop(ModBlocks.CHISELED_BAMBOO_PLANKS);
        addDrop(ModBlocks.CHISELED_BIRCH_PLANKS);
        addDrop(ModBlocks.CHISELED_JUNGLE_PLANKS);
        addDrop(ModBlocks.CHISELED_DARK_OAK_PLANKS);
        addDrop(ModBlocks.CHISELED_SPRUCE_PLANKS);

        addDrop(ModBlocks.SUGAR_MAPLE_LOG);
        addDrop(ModBlocks.SUGAR_MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_SUGAR_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_SUGAR_MAPLE_WOOD);
        addDrop(ModBlocks.SUGAR_MAPLE_PLANKS);
        addDrop(ModBlocks.SUGAR_MAPLE_STAIRS);
        addDrop(ModBlocks.SUGAR_MAPLE_SLAB, slabDrops(ModBlocks.SUGAR_MAPLE_SLAB));
        addDrop(ModBlocks.SUGAR_MAPLE_FENCE);
        addDrop(ModBlocks.SUGAR_MAPLE_FENCE_GATE);
        addDrop(ModBlocks.SUGAR_MAPLE_DOOR, doorDrops(ModBlocks.SUGAR_MAPLE_DOOR));
        addDrop(ModBlocks.SUGAR_MAPLE_TRAPDOOR);
        addDrop(ModBlocks.SUGAR_MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.SUGAR_MAPLE_BUTTON);
        addDrop(ModBlocks.SUGAR_MAPLE_LEAVES,leavesDrops(ModBlocks.SUGAR_MAPLE_LEAVES, ModBlocks.SUGAR_MAPLE_SAPLING, 0.0625f));
        addDrop(ModBlocks.SUGAR_MAPLE_SAPLING);

        addDrop(ModBlocks.PERIDOTITE);
        addDrop(ModBlocks.PERIDOTITE_STAIRS);
        addDrop(ModBlocks.PERIDOTITE_SLAB, slabDrops(ModBlocks.PERIDOTITE_SLAB));
        addDrop(ModBlocks.PERIDOTITE_WALL);
        addDrop(ModBlocks.PERIDOTITE_BRICKS);
        addDrop(ModBlocks.PERIDOTITE_BRICK_STAIRS);
        addDrop(ModBlocks.PERIDOTITE_BRICK_SLAB, slabDrops(ModBlocks.PERIDOTITE_BRICK_SLAB));
        addDrop(ModBlocks.POLISHED_PERIDOTITE);
        addDrop(ModBlocks.POLISHED_PERIDOTITE_STAIRS);
        addDrop(ModBlocks.POLISHED_PERIDOTITE_SLAB, slabDrops(ModBlocks.POLISHED_PERIDOTITE_SLAB));
        addDrop(ModBlocks.PERIDOTITE_TILES);
        addDrop(ModBlocks.PERIDOTITE_TILE_STAIRS);
        addDrop(ModBlocks.PERIDOTITE_TILE_SLAB, slabDrops(ModBlocks.PERIDOTITE_TILE_SLAB));

        addDrop(ModBlocks.CHERT);
        addDrop(ModBlocks.CHERT_STAIRS);
        addDrop(ModBlocks.CHERT_SLAB, slabDrops(ModBlocks.CHERT_SLAB));
        addDrop(ModBlocks.CHERT_WALL);
        addDrop(ModBlocks.POLISHED_CHERT);
        addDrop(ModBlocks.POLISHED_CHERT_STAIRS);
        addDrop(ModBlocks.POLISHED_CHERT_SLAB, slabDrops(ModBlocks.POLISHED_CHERT_SLAB));
        addDrop(ModBlocks.POLISHED_CHERT_WALL);

        addDrop(ModBlocks.GNEISS);
        addDrop(ModBlocks.DARK_GNEISS_BRICKS);
        addDrop(ModBlocks.DARK_GNEISS_BRICK_STAIRS);
        addDrop(ModBlocks.DARK_GNEISS_BRICK_SLAB, slabDrops(ModBlocks.DARK_GNEISS_BRICK_SLAB));
        addDrop(ModBlocks.DARK_GNEISS_BRICK_WALL);
        addDrop(ModBlocks.DARK_POLISHED_GNEISS);
        addDrop(ModBlocks.DARK_POLISHED_GNEISS_STAIRS);
        addDrop(ModBlocks.DARK_POLISHED_GNEISS_SLAB, slabDrops(ModBlocks.DARK_POLISHED_GNEISS_SLAB));
        addDrop(ModBlocks.LIGHT_GNEISS_BRICKS);
        addDrop(ModBlocks.LIGHT_GNEISS_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_GNEISS_BRICK_SLAB, slabDrops(ModBlocks.LIGHT_GNEISS_BRICK_SLAB));
        addDrop(ModBlocks.LIGHT_GNEISS_BRICK_WALL);
        addDrop(ModBlocks.LIGHT_POLISHED_GNEISS);
        addDrop(ModBlocks.LIGHT_POLISHED_GNEISS_STAIRS);
        addDrop(ModBlocks.LIGHT_POLISHED_GNEISS_SLAB, slabDrops(ModBlocks.LIGHT_POLISHED_GNEISS_SLAB));
        addDrop(ModBlocks.PINK_GNEISS_BRICKS);
        addDrop(ModBlocks.PINK_GNEISS_BRICK_STAIRS);
        addDrop(ModBlocks.PINK_GNEISS_BRICK_SLAB, slabDrops(ModBlocks.PINK_GNEISS_BRICK_SLAB));
        addDrop(ModBlocks.PINK_GNEISS_BRICK_WALL);
        addDrop(ModBlocks.PINK_POLISHED_GNEISS);
        addDrop(ModBlocks.PINK_POLISHED_GNEISS_STAIRS);
        addDrop(ModBlocks.PINK_POLISHED_GNEISS_SLAB, slabDrops(ModBlocks.PINK_POLISHED_GNEISS_SLAB));

        addDrop(ModBlocks.GYPSUM_ALABASTER);
        addDrop(ModBlocks.GYPSUM_ALABASTER_STAIRS);
        addDrop(ModBlocks.GYPSUM_ALABASTER_SLAB, slabDrops(ModBlocks.GYPSUM_ALABASTER_SLAB));
        addDrop(ModBlocks.GYPSUM_ALABASTER_WALL);
        addDrop(ModBlocks.POLISHED_GYPSUM_ALABASTER);
        addDrop(ModBlocks.POLISHED_GYPSUM_ALABASTER_STAIRS);
        addDrop(ModBlocks.POLISHED_GYPSUM_ALABASTER_SLAB, slabDrops(ModBlocks.POLISHED_GYPSUM_ALABASTER_SLAB));
        addDrop(ModBlocks.SMOOTH_GYPSUM_ALABASTER);
        addDrop(ModBlocks.SMOOTH_GYPSUM_ALABASTER_STAIRS);
        addDrop(ModBlocks.SMOOTH_GYPSUM_ALABASTER_SLAB, slabDrops(ModBlocks.SMOOTH_GYPSUM_ALABASTER_SLAB));
        addDrop(ModBlocks.SATIN_SPAR_GYPSUM);
        addDrop(ModBlocks.SATIN_SPAR_GYPSUM_CRYSTAL);

        addDrop(ModBlocks.ANCIENT_CLAY, multipleOreDrops(ModBlocks.ANCIENT_CLAY, ModItems.ANCIENT_CLAY_BALL, 4,4));
        addDrop(ModBlocks.MOSSY_ANCIENT_CLAY);
        addDrop(ModBlocks.VERY_MOSSY_ANCIENT_CLAY);

        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.ANDESITE_BRICK_STAIRS);
        addDrop(ModBlocks.ANDESITE_BRICK_SLAB, slabDrops(ModBlocks.ANDESITE_BRICK_SLAB));
        addDrop(ModBlocks.ANDESITE_BRICK_WALL);
        addDrop(ModBlocks.CHISELED_ANDESITE_BRICKS);
        addDrop(ModBlocks.CHISELED_ANDESITE);

        addDrop(ModBlocks.BLUESCHIST);
        addDrop(ModBlocks.BLUESCHIST_STAIRS);
        addDrop(ModBlocks.BLUESCHIST_SLAB, slabDrops(ModBlocks.BLUESCHIST_SLAB));
        addDrop(ModBlocks.BLUESCHIST_WALL);
        addDrop(ModBlocks.POLISHED_BLUESCHIST);
        addDrop(ModBlocks.POLISHED_BLUESCHIST_STAIRS);
        addDrop(ModBlocks.POLISHED_BLUESCHIST_SLAB, slabDrops(ModBlocks.POLISHED_BLUESCHIST_SLAB));
        addDrop(ModBlocks.CHISELED_BLUESCHIST);

        addDrop(ModBlocks.OLIVINE);
        addDrop(ModBlocks.OLIVINE_STAIRS);
        addDrop(ModBlocks.OLIVINE_SLAB, slabDrops(ModBlocks.OLIVINE_SLAB));
        addDrop(ModBlocks.OLIVINE_WALL);
        addDrop(ModBlocks.POLISHED_OLIVINE);
        addDrop(ModBlocks.POLISHED_OLIVINE_STAIRS);
        addDrop(ModBlocks.POLISHED_OLIVINE_SLAB, slabDrops(ModBlocks.POLISHED_OLIVINE_SLAB));
        addDrop(ModBlocks.OLIVINE_TILES);
        addDrop(ModBlocks.OLIVINE_TILE_STAIRS);
        addDrop(ModBlocks.OLIVINE_TILE_SLAB, slabDrops(ModBlocks.OLIVINE_TILE_SLAB));
        addDrop(ModBlocks.SMALL_OLIVINE_TILES);
        addDrop(ModBlocks.SMALL_OLIVINE_TILE_STAIRS);
        addDrop(ModBlocks.SMALL_OLIVINE_TILE_SLAB, slabDrops(ModBlocks.SMALL_OLIVINE_TILE_SLAB));

        addDrop(ModBlocks.POTASSIUM_FELDSPAR);
        addDrop(ModBlocks.POLISHED_POTASSIUM_FELDSPAR);
        addDrop(ModBlocks.POLISHED_POTASSIUM_FELDSPAR_STAIRS);
        addDrop(ModBlocks.POLISHED_POTASSIUM_FELDSPAR_SLAB, slabDrops(ModBlocks.POLISHED_POTASSIUM_FELDSPAR_SLAB));
        addDrop(ModBlocks.POTASSIUM_FELDSPAR_BRICKS);
        addDrop(ModBlocks.POTASSIUM_FELDSPAR_BRICK_STAIRS);
        addDrop(ModBlocks.POTASSIUM_FELDSPAR_BRICK_SLAB, slabDrops(ModBlocks.POTASSIUM_FELDSPAR_BRICK_SLAB));
        addDrop(ModBlocks.POTASSIUM_FELDSPAR_BRICK_WALL);
        addDrop(ModBlocks.POTASSIUM_FELDSPAR_TILES);
        addDrop(ModBlocks.POTASSIUM_FELDSPAR_TILE_STAIRS);
        addDrop(ModBlocks.POTASSIUM_FELDSPAR_TILE_SLAB, slabDrops(ModBlocks.POTASSIUM_FELDSPAR_TILE_SLAB));

        addDrop(ModBlocks.STRAW_BLOCK);

        addDrop(ModBlocks.HARZBURGITE);
        addDrop(ModBlocks.HARZBURGITE_STAIRS);
        addDrop(ModBlocks.HARZBURGITE_SLAB, slabDrops(ModBlocks.HARZBURGITE_SLAB));
        addDrop(ModBlocks.POLISHED_HARZBURGITE);
        addDrop(ModBlocks.POLISHED_HARZBURGITE_STAIRS);
        addDrop(ModBlocks.POLISHED_HARZBURGITE_SLAB, slabDrops(ModBlocks.POLISHED_HARZBURGITE_SLAB));
        addDrop(ModBlocks.HARZBURGITE_BRICKS);
        addDrop(ModBlocks.HARZBURGITE_BRICK_STAIRS);
        addDrop(ModBlocks.HARZBURGITE_BRICK_SLAB, slabDrops(ModBlocks.HARZBURGITE_BRICK_SLAB));
        addDrop(ModBlocks.HARZBURGITE_BRICK_WALL);

        addDrop(ModBlocks.ORTHOPYROXENE);
        addDrop(ModBlocks.ORTHOPYROXENE_STAIRS);
        addDrop(ModBlocks.ORTHOPYROXENE_SLAB, slabDrops(ModBlocks.ORTHOPYROXENE_SLAB));
        addDrop(ModBlocks.ORTHOPYROXENE_WALL);
        addDrop(ModBlocks.POLISHED_ORTHOPYROXENE);
        addDrop(ModBlocks.POLISHED_ORTHOPYROXENE_STAIRS);
        addDrop(ModBlocks.POLISHED_ORTHOPYROXENE_SLAB, slabDrops(ModBlocks.POLISHED_ORTHOPYROXENE_SLAB));
        addDrop(ModBlocks.SMOOTH_ORTHOPYROXENE);
        addDrop(ModBlocks.SMOOTH_ORTHOPYROXENE_STAIRS);
        addDrop(ModBlocks.SMOOTH_ORTHOPYROXENE_SLAB, slabDrops(ModBlocks.SMOOTH_ORTHOPYROXENE_SLAB));
        addDrop(ModBlocks.ORTHOPYROXENE_BRICKS);
        addDrop(ModBlocks.ORTHOPYROXENE_BRICK_STAIRS);
        addDrop(ModBlocks.ORTHOPYROXENE_BRICK_SLAB, slabDrops(ModBlocks.ORTHOPYROXENE_BRICK_SLAB));
        addDrop(ModBlocks.ORTHOPYROXENE_BRICK_WALL);

        addDrop(ModBlocks.POLISHED_DRIPSTONE);
        addDrop(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_DRIPSTONE_SLAB, slabDrops(ModBlocks.POLISHED_DRIPSTONE_SLAB));
        addDrop(ModBlocks.DRIPSTONE_TILES);
        addDrop(ModBlocks.DRIPSTONE_TILE_STAIRS);
        addDrop(ModBlocks.DRIPSTONE_TILE_SLAB, slabDrops(ModBlocks.DRIPSTONE_TILE_SLAB));
        addDrop(ModBlocks.DRIPSTONE_BRICKS);
        addDrop(ModBlocks.DRIPSTONE_BRICK_STAIRS);
        addDrop(ModBlocks.DRIPSTONE_BRICK_SLAB, slabDrops(ModBlocks.DRIPSTONE_BRICK_SLAB));
        addDrop(ModBlocks.DRIPSTONE_BRICK_WALL);

        addDrop(ModBlocks.LIGHT_SHALE);
        addDrop(ModBlocks.LIGHT_SHALE_ROCKS);
        addDrop(ModBlocks.DARK_SHALE);
        addDrop(ModBlocks.DARK_SHALE_ROCKS);
        addDrop(ModBlocks.OIL_SHALE);
        addDrop(ModBlocks.OIL_SHALE_ROCKS);
        addDrop(ModBlocks.MIXED_SHALE);

        addDrop(ModBlocks.ALBITE_FELDSPAR);
        addDrop(ModBlocks.ALBITE_FELDSPAR_STAIRS);
        addDrop(ModBlocks.ALBITE_FELDSPAR_SLAB, slabDrops(ModBlocks.PERIDOTITE_SLAB));
        addDrop(ModBlocks.ALBITE_FELDSPAR_WALL);
        addDrop(ModBlocks.POLISHED_ALBITE_FELDSPAR);
        addDrop(ModBlocks.POLISHED_ALBITE_FELDSPAR_STAIRS);
        addDrop(ModBlocks.POLISHED_ALBITE_FELDSPAR_SLAB, slabDrops(ModBlocks.POLISHED_ALBITE_FELDSPAR_SLAB));
        addDrop(ModBlocks.ALBITE_FELDSPAR_TILES);
        addDrop(ModBlocks.ALBITE_FELDSPAR_TILE_STAIRS);
        addDrop(ModBlocks.ALBITE_FELDSPAR_TILE_SLAB, slabDrops(ModBlocks.ALBITE_FELDSPAR_TILE_SLAB));

        addDrop(ModBlocks.GIANT_PINECONE_BLOCK);
        addDrop(ModBlocks.GIANT_PINECONE_STAIRS);
        addDrop(ModBlocks.GIANT_PINECONE_PEDUNCLE);

        addDrop(ModBlocks.PILE_OF_WOOD);
        addDrop(ModBlocks.STRIPPED_PILE_OF_WOOD);

        addDrop(ModBlocks.JADE_ORE, multipleOreDrops(ModBlocks.JADE_ORE, ModItems.JADE, 3, 7));
        addDrop(ModBlocks.JADE_BLOCK);
        addDrop(ModBlocks.JADE_BLOCK_STAIRS);
        addDrop(ModBlocks.JADE_BLOCK_SLAB, slabDrops(ModBlocks.JADE_BLOCK_SLAB));
        addDrop(ModBlocks.JADE_BLOCK_WALL);
        addDrop(ModBlocks.POLISHED_JADE);
        addDrop(ModBlocks.POLISHED_JADE_STAIRS);
        addDrop(ModBlocks.POLISHED_JADE_SLAB, slabDrops(ModBlocks.POLISHED_JADE_SLAB));
        addDrop(ModBlocks.JADE_TILES);
        addDrop(ModBlocks.JADE_TILE_STAIRS);
        addDrop(ModBlocks.JADE_TILE_SLAB, slabDrops(ModBlocks.JADE_TILE_SLAB));
        addDrop(ModBlocks.CRACKED_JADE_TILES);
        addDrop(ModBlocks.CHISELED_JADE);

        addDrop(ModBlocks.ANORTHITE_FELDSPAR);
        addDrop(ModBlocks.POLISHED_ANORTHITE_FELDSPAR);
        addDrop(ModBlocks.POLISHED_ANORTHITE_FELDSPAR_STAIRS);
        addDrop(ModBlocks.POLISHED_ANORTHITE_FELDSPAR_SLAB, slabDrops(ModBlocks.POLISHED_ANORTHITE_FELDSPAR_SLAB));
        addDrop(ModBlocks.ANORTHITE_FELDSPAR_BRICKS);
        addDrop(ModBlocks.ANORTHITE_FELDSPAR_BRICK_STAIRS);
        addDrop(ModBlocks.ANORTHITE_FELDSPAR_BRICK_SLAB, slabDrops(ModBlocks.ANORTHITE_FELDSPAR_BRICK_SLAB));
        addDrop(ModBlocks.ANORTHITE_FELDSPAR_BRICK_WALL);
        addDrop(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS);
        addDrop(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_STAIRS);
        addDrop(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_SLAB, slabDrops(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_SLAB));
        addDrop(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_WALL);
        addDrop(ModBlocks.ANORTHITE_FELDSPAR_ROCKS);

        addDrop(ModBlocks.TEPHRITE);
        addDrop(ModBlocks.TEPHRITE_STAIRS);
        addDrop(ModBlocks.TEPHRITE_SLAB, slabDrops(ModBlocks.TEPHRITE_SLAB));
        addDrop(ModBlocks.POLISHED_TEPHRITE);
        addDrop(ModBlocks.POLISHED_TEPHRITE_STAIRS);
        addDrop(ModBlocks.POLISHED_TEPHRITE_SLAB, slabDrops(ModBlocks.POLISHED_TEPHRITE_SLAB));
        addDrop(ModBlocks.POLISHED_TEPHRITE_WALL);

        addDrop(ModBlocks.ARKOSE);
        addDrop(ModBlocks.ARKOSE_STAIRS);
        addDrop(ModBlocks.ARKOSE_SLAB, slabDrops(ModBlocks.ARKOSE_SLAB));
        addDrop(ModBlocks.ARKOSE_BRICKS);
        addDrop(ModBlocks.ARKOSE_BRICK_STAIRS);
        addDrop(ModBlocks.ARKOSE_BRICK_SLAB, slabDrops(ModBlocks.ARKOSE_BRICK_SLAB));
        addDrop(ModBlocks.ARKOSE_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_ARKOSE);
        addDrop(ModBlocks.POLISHED_ARKOSE_STAIRS);
        addDrop(ModBlocks.POLISHED_ARKOSE_SLAB, slabDrops(ModBlocks.POLISHED_ARKOSE_SLAB));

        addDrop(ModBlocks.SODALITE);
        addDrop(ModBlocks.POLISHED_SODALITE);
        addDrop(ModBlocks.POLISHED_SODALITE_STAIRS);
        addDrop(ModBlocks.POLISHED_SODALITE_SLAB, slabDrops(ModBlocks.POLISHED_SODALITE_SLAB));
        addDrop(ModBlocks.SODALITE_BRICKS);
        addDrop(ModBlocks.SODALITE_BRICK_STAIRS);
        addDrop(ModBlocks.SODALITE_BRICK_SLAB, slabDrops(ModBlocks.SODALITE_BRICK_SLAB));
        addDrop(ModBlocks.SODALITE_BRICK_WALL);

        addDrop(ModBlocks.PEGMATITE);
        addDrop(ModBlocks.PEGMATITE_STAIRS);
        addDrop(ModBlocks.PEGMATITE_SLAB, slabDrops(ModBlocks.PEGMATITE_SLAB));
        addDrop(ModBlocks.PEGMATITE_WALL);
        addDrop(ModBlocks.POLISHED_PEGMATITE);
        addDrop(ModBlocks.POLISHED_PEGMATITE_STAIRS);
        addDrop(ModBlocks.POLISHED_PEGMATITE_SLAB, slabDrops(ModBlocks.POLISHED_PEGMATITE_SLAB));
        addDrop(ModBlocks.PEGMATITE_BRICKS);
        addDrop(ModBlocks.PEGMATITE_BRICK_STAIRS);
        addDrop(ModBlocks.PEGMATITE_BRICK_SLAB, slabDrops(ModBlocks.PEGMATITE_BRICK_SLAB));
        addDrop(ModBlocks.PEGMATITE_TILES);
        addDrop(ModBlocks.PEGMATITE_TILE_STAIRS);
        addDrop(ModBlocks.PEGMATITE_TILE_SLAB, slabDrops(ModBlocks.PEGMATITE_TILE_SLAB));
        addDrop(ModBlocks.SMALL_PEGMATITE_BRICKS);
        addDrop(ModBlocks.SMALL_PEGMATITE_BRICK_STAIRS);
        addDrop(ModBlocks.SMALL_PEGMATITE_BRICK_SLAB, slabDrops(ModBlocks.SMALL_PEGMATITE_BRICK_SLAB));
        addDrop(ModBlocks.SMALL_PEGMATITE_BRICK_WALL);

        addDrop(ModBlocks.THULITE);
        addDrop(ModBlocks.THULITE_STAIRS);
        addDrop(ModBlocks.THULITE_SLAB, slabDrops(ModBlocks.THULITE_SLAB));
        addDrop(ModBlocks.THULITE_WALL);
        addDrop(ModBlocks.POLISHED_THULITE);
        addDrop(ModBlocks.POLISHED_THULITE_STAIRS);
        addDrop(ModBlocks.POLISHED_THULITE_SLAB, slabDrops(ModBlocks.POLISHED_THULITE_SLAB));
        addDrop(ModBlocks.THULITE_BRICKS);
        addDrop(ModBlocks.THULITE_BRICK_STAIRS);
        addDrop(ModBlocks.THULITE_BRICK_SLAB, slabDrops(ModBlocks.THULITE_BRICK_SLAB));

        addDrop(ModBlocks.RAPAKIVI);
        addDrop(ModBlocks.RAPAKIVI_STAIRS);
        addDrop(ModBlocks.RAPAKIVI_SLAB, slabDrops(ModBlocks.RAPAKIVI_SLAB));
        addDrop(ModBlocks.RAPAKIVI_WALL);
        addDrop(ModBlocks.POLISHED_RAPAKIVI);
        addDrop(ModBlocks.POLISHED_RAPAKIVI_STAIRS);
        addDrop(ModBlocks.POLISHED_RAPAKIVI_SLAB, slabDrops(ModBlocks.POLISHED_RAPAKIVI_SLAB));
        addDrop(ModBlocks.RAPAKIVI_BRICKS);
        addDrop(ModBlocks.RAPAKIVI_BRICK_STAIRS);
        addDrop(ModBlocks.RAPAKIVI_BRICK_SLAB, slabDrops(ModBlocks.RAPAKIVI_BRICK_SLAB));

        addDrop(ModBlocks.ROSE_QUARTZ_ORE, multipleOreDrops(ModBlocks.ROSE_QUARTZ_ORE, ModItems.ROSE_QUARTZ, 3, 7));
        addDrop(ModBlocks.RAW_ROSE_QUARTZ);
        addDrop(ModBlocks.RAW_ROSE_QUARTZ_STAIRS);
        addDrop(ModBlocks.RAW_ROSE_QUARTZ_SLAB, slabDrops(ModBlocks.RAW_ROSE_QUARTZ_SLAB));
        addDrop(ModBlocks.RAW_ROSE_QUARTZ_WALL);
        addDrop(ModBlocks.POLISHED_ROSE_QUARTZ);
        addDrop(ModBlocks.POLISHED_ROSE_QUARTZ_STAIRS);
        addDrop(ModBlocks.POLISHED_ROSE_QUARTZ_SLAB, slabDrops(ModBlocks.POLISHED_ROSE_QUARTZ_SLAB));

        addDrop(ModBlocks.LATERITE_SOIL);
        addDrop(ModBlocks.LATERITE_ROCK);
        addDrop(ModBlocks.LATERITE_ROCK_STAIRS);
        addDrop(ModBlocks.LATERITE_ROCK_SLAB, slabDrops(ModBlocks.LATERITE_ROCK_SLAB));
        addDrop(ModBlocks.LATERITE_ROCK_WALL);
        addDrop(ModBlocks.POLISHED_LATERITE_ROCK);
        addDrop(ModBlocks.POLISHED_LATERITE_ROCK_STAIRS);
        addDrop(ModBlocks.POLISHED_LATERITE_ROCK_SLAB, slabDrops(ModBlocks.POLISHED_LATERITE_ROCK_SLAB));

        addDrop(ModBlocks.BLUE_CANDY_CANE);
        addDrop(ModBlocks.RED_CANDY_CANE);

        addDrop(ModBlocks.DUMORTIERITE);
        addDrop(ModBlocks.POLISHED_DUMORTIERITE);
        addDrop(ModBlocks.POLISHED_DUMORTIERITE_STAIRS);
        addDrop(ModBlocks.POLISHED_DUMORTIERITE_SLAB, slabDrops(ModBlocks.POLISHED_DUMORTIERITE_SLAB));
        addDrop(ModBlocks.POLISHED_DUMORTIERITE_WALL);
        addDrop(ModBlocks.SMOOTH_DUMORTIERITE);
        addDrop(ModBlocks.SMOOTH_DUMORTIERITE_STAIRS);
        addDrop(ModBlocks.SMOOTH_DUMORTIERITE_SLAB, slabDrops(ModBlocks.SMOOTH_DUMORTIERITE_SLAB));
        addDrop(ModBlocks.DUMORTIERITE_QUARTZ);

        addDrop(ModBlocks.GREENSCHIST);
        addDrop(ModBlocks.GREENSCHIST_STAIRS);
        addDrop(ModBlocks.GREENSCHIST_SLAB, slabDrops(ModBlocks.GREENSCHIST_SLAB));
        addDrop(ModBlocks.GREENSCHIST_WALL);
        addDrop(ModBlocks.POLISHED_GREENSCHIST);
        addDrop(ModBlocks.POLISHED_GREENSCHIST_STAIRS);
        addDrop(ModBlocks.POLISHED_GREENSCHIST_SLAB, slabDrops(ModBlocks.POLISHED_GREENSCHIST_SLAB));
        addDrop(ModBlocks.CHISELED_GREENSCHIST);

        addDrop(ModBlocks.CHAROITE_ORE, multipleOreDrops(ModBlocks.CHAROITE_ORE, ModItems.CHAROITE, 3, 7));
        addDrop(ModBlocks.CHAROITE_BLOCK);
        addDrop(ModBlocks.CHAROITE_STAIRS);
        addDrop(ModBlocks.CHAROITE_SLAB, slabDrops(ModBlocks.CHAROITE_SLAB));
        addDrop(ModBlocks.CHAROITE_WALL);
        addDrop(ModBlocks.POLISHED_CHAROITE);
        addDrop(ModBlocks.POLISHED_CHAROITE_STAIRS);
        addDrop(ModBlocks.POLISHED_CHAROITE_SLAB, slabDrops(ModBlocks.POLISHED_CHAROITE_SLAB));

        addDrop(ModBlocks.TALLER_GRASS, shortPlantDrops(ModBlocks.TALLER_GRASS));

        addDrop(ModBlocks.RHYOLITE);
        addDrop(ModBlocks.RHYOLITE_STAIRS);
        addDrop(ModBlocks.RHYOLITE_SLAB, slabDrops(ModBlocks.RHYOLITE_SLAB));
        addDrop(ModBlocks.RHYOLITE_BRICKS);
        addDrop(ModBlocks.RHYOLITE_BRICK_STAIRS);
        addDrop(ModBlocks.RHYOLITE_BRICK_SLAB, slabDrops(ModBlocks.RHYOLITE_BRICK_SLAB));
        addDrop(ModBlocks.RHYOLITE_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_RHYOLITE);
        addDrop(ModBlocks.POLISHED_RHYOLITE_STAIRS);
        addDrop(ModBlocks.POLISHED_RHYOLITE_SLAB, slabDrops(ModBlocks.POLISHED_RHYOLITE_SLAB));
        addDrop(ModBlocks.RHYOLITE_TILES);
        addDrop(ModBlocks.RHYOLITE_TILE_STAIRS);
        addDrop(ModBlocks.RHYOLITE_TILE_SLAB, slabDrops(ModBlocks.RHYOLITE_TILE_SLAB));

        addDrop(ModBlocks.WHITE_PINE_LOG);
        addDrop(ModBlocks.WHITE_PINE_WOOD);
        addDrop(ModBlocks.STRIPPED_WHITE_PINE_LOG);
        addDrop(ModBlocks.STRIPPED_WHITE_PINE_WOOD);
        addDrop(ModBlocks.WHITE_PINE_PLANKS);
        addDrop(ModBlocks.WHITE_PINE_STAIRS);
        addDrop(ModBlocks.WHITE_PINE_SLAB, slabDrops(ModBlocks.WHITE_PINE_SLAB));
        addDrop(ModBlocks.WHITE_PINE_FENCE);
        addDrop(ModBlocks.WHITE_PINE_FENCE_GATE);
        addDrop(ModBlocks.WHITE_PINE_DOOR, doorDrops(ModBlocks.WHITE_PINE_DOOR));
        addDrop(ModBlocks.WHITE_PINE_TRAPDOOR);
        addDrop(ModBlocks.WHITE_PINE_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_PINE_BUTTON);
        addDrop(ModBlocks.WHITE_PINE_LEAVES, leavesDrops(ModBlocks.WHITE_PINE_LEAVES, ModBlocks.WHITE_PINE_SAPLING, 0.0625f));
        addDrop(ModBlocks.WHITE_PINE_SAPLING);

        addDropWithSilkTouch(ModBlocks.ORNATE_PICTURE_WINDOW);
        addDropWithSilkTouch(ModBlocks.LARGE_PICTURE_WINDOW_BOTTOM);
        addDropWithSilkTouch(ModBlocks.LARGE_PICTURE_WINDOW_MIDDLE);
        addDropWithSilkTouch(ModBlocks.LARGE_PICTURE_WINDOW_TOP);

        addDrop(ModBlocks.FLOWERING_OXYRIA);
        addDrop(ModBlocks.OXYRIA);

        addDrop(ModBlocks.GLACIAL_TILL);

        addDrop(ModBlocks.LUMINESCENT_BRIAR);

        addDrop(ModBlocks.JAPANESE_QUINCE);

        addDrop(ModBlocks.VIRGINIA_CREEPER, shortPlantDrops(ModBlocks.VIRGINIA_CREEPER));

        addDrop(ModBlocks.WILDFLOWERS, flowerbedDrops(ModBlocks.WILDFLOWERS));
        addDrop(ModBlocks.WILD_COSMOS_AND_BACHELOR_BUTTONS, flowerbedDrops(ModBlocks.WILD_COSMOS_AND_BACHELOR_BUTTONS));

        addDrop(ModBlocks.TUFFACIOUS_CLAY, multipleOreDrops(ModBlocks.TUFFACIOUS_CLAY, ModItems.TUFFACIOUS_CLAY_BALL, 4,4));
        addDrop(ModBlocks.TUFFACIOUS_CLAY_BRICKS);
        addDrop(ModBlocks.TUFFACIOUS_CLAY_BRICK_STAIRS);
        addDrop(ModBlocks.TUFFACIOUS_CLAY_BRICK_SLAB, slabDrops(ModBlocks.TUFFACIOUS_CLAY_BRICK_SLAB));
        addDrop(ModBlocks.TUFFACIOUS_CLAY_BRICK_WALL);

        addDrop(ModBlocks.OOLITE);
        addDrop(ModBlocks.OOLITE_STAIRS);
        addDrop(ModBlocks.OOLITE_SLAB, slabDrops(ModBlocks.OOLITE_SLAB));
        addDrop(ModBlocks.POLISHED_OOLITE);
        addDrop(ModBlocks.POLISHED_OOLITE_STAIRS);
        addDrop(ModBlocks.POLISHED_OOLITE_SLAB, slabDrops(ModBlocks.POLISHED_OOLITE_SLAB));
        addDrop(ModBlocks.POLISHED_OOLITE_WALL);

        addDrop(ModBlocks.PORPHYRY);
        addDrop(ModBlocks.PORPHYRY_STAIRS);
        addDrop(ModBlocks.PORPHYRY_SLAB, slabDrops(ModBlocks.PORPHYRY_SLAB));
        addDrop(ModBlocks.PORPHYRY_BRICKS);
        addDrop(ModBlocks.PORPHYRY_BRICK_STAIRS);
        addDrop(ModBlocks.PORPHYRY_BRICK_SLAB, slabDrops(ModBlocks.PORPHYRY_BRICK_SLAB));
        addDrop(ModBlocks.PORPHYRY_BRICK_WALL);
        addDrop(ModBlocks.POLISHED_PORPHYRY);
        addDrop(ModBlocks.POLISHED_PORPHYRY_STAIRS);
        addDrop(ModBlocks.POLISHED_PORPHYRY_SLAB, slabDrops(ModBlocks.POLISHED_PORPHYRY_SLAB));

        addDrop(ModBlocks.LARIMAR);
        addDrop(ModBlocks.LARIMAR_STAIRS);
        addDrop(ModBlocks.LARIMAR_SLAB, slabDrops(ModBlocks.LARIMAR_SLAB));
        addDrop(ModBlocks.LARIMAR_WALL);

        addDrop(ModBlocks.BLANKET_FLOWER);
        addDrop(ModBlocks.RED_BLANKET_FLOWER);
        addDrop(ModBlocks.RED_NEMESIA);
        addDrop(ModBlocks.EUPHORBIA_X_MARTINI);

        addDrop(ModBlocks.PIGEONITE);
        addDrop(ModBlocks.PIGEONITE_STAIRS);
        addDrop(ModBlocks.PIGEONITE_SLAB, slabDrops(ModBlocks.PIGEONITE_SLAB));
        addDrop(ModBlocks.PIGEONITE_WALL);
        addDrop(ModBlocks.POLISHED_PIGEONITE);
        addDrop(ModBlocks.POLISHED_PIGEONITE_STAIRS);
        addDrop(ModBlocks.POLISHED_PIGEONITE_SLAB, slabDrops(ModBlocks.POLISHED_PIGEONITE_SLAB));
        addDrop(ModBlocks.PIGEONITE_TILES);
        addDrop(ModBlocks.PIGEONITE_TILE_STAIRS);
        addDrop(ModBlocks.PIGEONITE_TILE_SLAB, slabDrops(ModBlocks.PIGEONITE_TILE_SLAB));

        addDrop(ModBlocks.YEW_LOG);
        addDrop(ModBlocks.YEW_WOOD);
        addDrop(ModBlocks.STRIPPED_YEW_LOG);
        addDrop(ModBlocks.STRIPPED_YEW_WOOD);
        addDrop(ModBlocks.YEW_PLANKS);
        addDrop(ModBlocks.YEW_STAIRS);
        addDrop(ModBlocks.YEW_SLAB, slabDrops(ModBlocks.YEW_SLAB));
        addDrop(ModBlocks.YEW_FENCE);
        addDrop(ModBlocks.YEW_FENCE_GATE);
        addDrop(ModBlocks.YEW_DOOR, doorDrops(ModBlocks.YEW_DOOR));
        addDrop(ModBlocks.YEW_TRAPDOOR);
        addDrop(ModBlocks.YEW_PRESSURE_PLATE);
        addDrop(ModBlocks.YEW_BUTTON);
        addDrop(ModBlocks.YEW_LEAVES, leavesDrops(ModBlocks.YEW_LEAVES, ModBlocks.YEW_SAPLING, 0.0625f));
        addDrop(ModBlocks.YEW_SAPLING);

        addDrop(ModBlocks.GRAY_SILTSTONE);
        addDrop(ModBlocks.GRAY_SILTSTONE_STAIRS);
        addDrop(ModBlocks.GRAY_SILTSTONE_SLAB, slabDrops(ModBlocks.GRAY_SILTSTONE_SLAB));
        addDrop(ModBlocks.BUFF_SILTSTONE);
        addDrop(ModBlocks.BUFF_SILTSTONE_STAIRS);
        addDrop(ModBlocks.BUFF_SILTSTONE_SLAB, slabDrops(ModBlocks.BUFF_SILTSTONE_SLAB));
        addDrop(ModBlocks.RED_SILTSTONE);
        addDrop(ModBlocks.RED_SILTSTONE_STAIRS);
        addDrop(ModBlocks.RED_SILTSTONE_SLAB, slabDrops(ModBlocks.RED_SILTSTONE_SLAB));
        addDrop(ModBlocks.BURGUNDY_SILTSTONE);
        addDrop(ModBlocks.BURGUNDY_SILTSTONE_STAIRS);
        addDrop(ModBlocks.BURGUNDY_SILTSTONE_SLAB, slabDrops(ModBlocks.BURGUNDY_SILTSTONE_SLAB));

        addDrop(ModBlocks.POLISHED_GRAY_SILTSTONE);
        addDrop(ModBlocks.POLISHED_GRAY_SILTSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_GRAY_SILTSTONE_SLAB, slabDrops(ModBlocks.POLISHED_GRAY_SILTSTONE_SLAB));
        addDrop(ModBlocks.POLISHED_GRAY_SILTSTONE_WALL);
        addDrop(ModBlocks.POLISHED_BUFF_SILTSTONE);
        addDrop(ModBlocks.POLISHED_BUFF_SILTSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_BUFF_SILTSTONE_SLAB, slabDrops(ModBlocks.POLISHED_BUFF_SILTSTONE_SLAB));
        addDrop(ModBlocks.POLISHED_BUFF_SILTSTONE_WALL);
        addDrop(ModBlocks.POLISHED_RED_SILTSTONE);
        addDrop(ModBlocks.POLISHED_RED_SILTSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_RED_SILTSTONE_SLAB, slabDrops(ModBlocks.POLISHED_RED_SILTSTONE_SLAB));
        addDrop(ModBlocks.POLISHED_RED_SILTSTONE_WALL);
        addDrop(ModBlocks.POLISHED_BURGUNDY_SILTSTONE);
        addDrop(ModBlocks.POLISHED_BURGUNDY_SILTSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_BURGUNDY_SILTSTONE_SLAB, slabDrops(ModBlocks.POLISHED_BURGUNDY_SILTSTONE_SLAB));
        addDrop(ModBlocks.POLISHED_BURGUNDY_SILTSTONE_WALL);

        addDrop(ModBlocks.PARRADIO);

        addDrop(ModBlocks.BLOCK_OF_RUBBLE, multipleOreDrops(ModBlocks.BLOCK_OF_RUBBLE, ModItems.TWIG, 1, 2));


        addDrop(ModBlocks.BRAMBLES, dropsWithShears(ModBlocks.BRAMBLES));
        addDrop(ModBlocks.BRAMBLES, dropsWithSilkTouch(ModBlocks.BRAMBLES));

        addDrop(ModBlocks.DUCKWEEDS, dropsWithShears(ModBlocks.DUCKWEEDS));
        addDrop(ModBlocks.DUCKWEEDS, dropsWithSilkTouch(ModBlocks.DUCKWEEDS));

        addDrop(ModBlocks.TRAVERTINE);
        addDrop(ModBlocks.TRAVERTINE_STAIRS);
        addDrop(ModBlocks.TRAVERTINE_SLAB, slabDrops(ModBlocks.TRAVERTINE_SLAB));
        addDrop(ModBlocks.TRAVERTINE_WALL);
        addDrop(ModBlocks.POLISHED_TRAVERTINE);
        addDrop(ModBlocks.POLISHED_TRAVERTINE_STAIRS);
        addDrop(ModBlocks.POLISHED_TRAVERTINE_SLAB, slabDrops(ModBlocks.POLISHED_TRAVERTINE_SLAB));

        addDrop(ModBlocks.SMALL_FORSYTHIA_LOG);
        addDrop(ModBlocks.FORSYTHIA_FLOWERS, leavesDrops(ModBlocks.FORSYTHIA_FLOWERS, ModBlocks.FORSYTHIA_SAPLING, 0.125f));
        addDrop(ModBlocks.FORSYTHIA_SAPLING);

        addDrop(ModBlocks.SMALL_JAPANESE_MAPLE_LOG);
        addDrop(ModBlocks.JAPANESE_MAPLE_LEAVES, leavesDrops(ModBlocks.JAPANESE_MAPLE_LEAVES, ModBlocks.JAPANESE_MAPLE_SAPLING, 0.0625f));
        addDrop(ModBlocks.JAPANESE_MAPLE_SAPLING);

        addDrop(ModBlocks.LAVENDER_BALL);
        addDrop(ModBlocks.DOG_ROSE_BUSH);

        addDrop(ModBlocks.PINK_CLAY_ROOF_TILES);
        addDrop(ModBlocks.PINK_CLAY_ROOF_TILE_STAIRS);
        addDrop(ModBlocks.PINK_CLAY_ROOF_TILE_SLAB, slabDrops(ModBlocks.PINK_CLAY_ROOF_TILE_SLAB));

        addDrop(ModBlocks.TRACHYANDESITE);
        addDrop(ModBlocks.TRACHYANDESITE_STAIRS);
        addDrop(ModBlocks.TRACHYANDESITE_SLAB, slabDrops(ModBlocks.TRACHYANDESITE_SLAB));
        addDrop(ModBlocks.TRACHYANDESITE_WALL);
        addDrop(ModBlocks.POLISHED_TRACHYANDESITE);
        addDrop(ModBlocks.POLISHED_TRACHYANDESITE_STAIRS);
        addDrop(ModBlocks.POLISHED_TRACHYANDESITE_SLAB, slabDrops(ModBlocks.POLISHED_TRACHYANDESITE_SLAB));

        addDrop(ModBlocks.GIANT_PASSIFLORA_INCARNATA);
        addDrop(ModBlocks.GIANT_PASSIFLORA_CAERULA);

        addDrop(ModBlocks.WHITE_LOTUS_FLOWER);
        addDrop(ModBlocks.PINK_LOTUS_FLOWER);

        addDrop(ModBlocks.PICRITE_BASALT);
        addDrop(ModBlocks.PICRITE_BASALT_STAIRS);
        addDrop(ModBlocks.PICRITE_BASALT_SLAB, slabDrops(ModBlocks.PICRITE_BASALT_SLAB));
        addDrop(ModBlocks.PICRITE_BASALT_WALL);
        addDrop(ModBlocks.POLISHED_PICRITE_BASALT);
        addDrop(ModBlocks.POLISHED_PICRITE_BASALT_STAIRS);
        addDrop(ModBlocks.POLISHED_PICRITE_BASALT_SLAB, slabDrops(ModBlocks.POLISHED_PICRITE_BASALT_SLAB));
        addDrop(ModBlocks.POLISHED_PICRITE_BASALT_WALL);

        addDrop(ModBlocks.CATTAILS, doorDrops(ModBlocks.CATTAILS));

        addDrop(ModBlocks.BLAHAJ);
        addDrop(ModBlocks.TETO_PLUSHIE);
        addDrop(ModBlocks.GUMI_PLUSHIE);
        addDrop(ModBlocks.OSAGE_CHAN_PLUSHIE);

        addDrop(ModBlocks.CHLORAPATITE);
        addDrop(ModBlocks.CHLORAPATITE_STAIRS);
        addDrop(ModBlocks.CHLORAPATITE_SLAB, slabDrops(ModBlocks.CHLORAPATITE_SLAB));
        addDrop(ModBlocks.POLISHED_CHLORAPATITE);
        addDrop(ModBlocks.POLISHED_CHLORAPATITE_STAIRS);
        addDrop(ModBlocks.POLISHED_CHLORAPATITE_SLAB, slabDrops(ModBlocks.POLISHED_CHLORAPATITE_SLAB));
        addDrop(ModBlocks.POLISHED_CHLORAPATITE_WALL);
        addDrop(ModBlocks.EXTRA_POLISHED_CHLORAPATITE);
        addDrop(ModBlocks.EXTRA_POLISHED_CHLORAPATITE_STAIRS);
        addDrop(ModBlocks.EXTRA_POLISHED_CHLORAPATITE_SLAB, slabDrops(ModBlocks.EXTRA_POLISHED_CHLORAPATITE_SLAB));
        addDrop(ModBlocks.EXTRA_POLISHED_CHLORAPATITE_WALL);
        addDrop(ModBlocks.FULLY_POLISHED_CHLORAPATITE);
        addDrop(ModBlocks.FULLY_POLISHED_CHLORAPATITE_STAIRS);
        addDrop(ModBlocks.FULLY_POLISHED_CHLORAPATITE_SLAB, slabDrops(ModBlocks.FULLY_POLISHED_CHLORAPATITE_SLAB));
        addDrop(ModBlocks.FULLY_POLISHED_CHLORAPATITE_WALL);

        addDrop(ModBlocks.SHORT_STINGING_NETTLE, shortPlantDrops(ModBlocks.SHORT_STINGING_NETTLE));
        addDrop(ModBlocks.TALL_STINGING_NETTLE, tallPlantDrops(ModBlocks.TALL_STINGING_NETTLE, ModBlocks.SHORT_STINGING_NETTLE));

        addDrop(ModBlocks.FEATHER_BLOCK);

        addDrop(ModBlocks.PERIDOTITE_SHELL_PAVEMENT);
        addDrop(ModBlocks.TRACHYANDESITE_SHELL_PAVEMENT);
        addDrop(ModBlocks.STONE_SHELL_PAVEMENT);
        addDrop(ModBlocks.CHLORAPATITE_SHELL_PAVEMENT);

        addDrop(ModBlocks.DACITE);
        addDrop(ModBlocks.DACITE_STAIRS);
        addDrop(ModBlocks.DACITE_SLAB, slabDrops(ModBlocks.DACITE_SLAB));
        addDrop(ModBlocks.DACITE_WALL);
        addDrop(ModBlocks.POLISHED_DACITE);
        addDrop(ModBlocks.POLISHED_DACITE_STAIRS);
        addDrop(ModBlocks.POLISHED_DACITE_SLAB, slabDrops(ModBlocks.POLISHED_DACITE_SLAB));
        addDrop(ModBlocks.DACITE_TILES);
        addDrop(ModBlocks.DACITE_TILE_STAIRS);
        addDrop(ModBlocks.DACITE_TILE_SLAB, slabDrops(ModBlocks.DACITE_TILE_SLAB));

        addDrop(ModBlocks.HYDROXYLAPATITE);
        addDrop(ModBlocks.HYDROXYLAPATITE_STAIRS);
        addDrop(ModBlocks.HYDROXYLAPATITE_SLAB, slabDrops(ModBlocks.HYDROXYLAPATITE_SLAB));
        addDrop(ModBlocks.POLISHED_HYDROXYLAPATITE);
        addDrop(ModBlocks.POLISHED_HYDROXYLAPATITE_STAIRS);
        addDrop(ModBlocks.POLISHED_HYDROXYLAPATITE_SLAB, slabDrops(ModBlocks.POLISHED_HYDROXYLAPATITE_SLAB));
        addDrop(ModBlocks.POLISHED_HYDROXYLAPATITE_WALL);
        addDrop(ModBlocks.HYDROXYLAPATITE_TILES);
        addDrop(ModBlocks.HYDROXYLAPATITE_TILE_STAIRS);
        addDrop(ModBlocks.HYDROXYLAPATITE_TILE_SLAB, slabDrops(ModBlocks.HYDROXYLAPATITE_TILE_SLAB));
        addDrop(ModBlocks.HYDROXYLAPATITE_SHELL_PAVEMENT);

        addDrop(ModBlocks.WROUGHT_IRON_FENCE);

        addDrop(ModBlocks.FOYAITE);
        addDrop(ModBlocks.FOYAITE_STAIRS);
        addDrop(ModBlocks.FOYAITE_SLAB, slabDrops(ModBlocks.FOYAITE_SLAB));
        addDrop(ModBlocks.FOYAITE_WALL);
        addDrop(ModBlocks.POLISHED_FOYAITE);
        addDrop(ModBlocks.POLISHED_FOYAITE_STAIRS);
        addDrop(ModBlocks.POLISHED_FOYAITE_SLAB, slabDrops(ModBlocks.POLISHED_FOYAITE_SLAB));
        addDrop(ModBlocks.FOYAITE_TILES);
        addDrop(ModBlocks.FOYAITE_TILE_STAIRS);
        addDrop(ModBlocks.FOYAITE_TILE_SLAB, slabDrops(ModBlocks.FOYAITE_TILE_SLAB));

        addDrop(ModBlocks.ACACIA_FENCING);
        addDrop(ModBlocks.BAMBOO_FENCING);
        addDrop(ModBlocks.BIRCH_FENCING);
        addDrop(ModBlocks.CHERRY_FENCING);
        addDrop(ModBlocks.CRIMSON_FENCING);
        addDrop(ModBlocks.DARK_OAK_FENCING);
        addDrop(ModBlocks.JUNGLE_FENCING);
        addDrop(ModBlocks.MANGROVE_FENCING);
        addDrop(ModBlocks.OAK_FENCING);
        addDrop(ModBlocks.SPRUCE_FENCING);
        addDrop(ModBlocks.WARPED_FENCING);
        addDrop(ModBlocks.SUGAR_MAPLE_FENCING);
        addDrop(ModBlocks.WHITE_PINE_FENCING);
        addDrop(ModBlocks.YEW_FENCING);

        addDrop(ModBlocks.GABBRO);
        addDrop(ModBlocks.GABBRO_STAIRS);
        addDrop(ModBlocks.GABBRO_SLAB, slabDrops(ModBlocks.GABBRO_SLAB));
        addDrop(ModBlocks.GABBRO_WALL);
        addDrop(ModBlocks.POLISHED_GABBRO);
        addDrop(ModBlocks.POLISHED_GABBRO_STAIRS);
        addDrop(ModBlocks.POLISHED_GABBRO_SLAB, slabDrops(ModBlocks.POLISHED_GABBRO_SLAB));
        addDrop(ModBlocks.GABBRO_BRICKS);
        addDrop(ModBlocks.GABBRO_BRICK_STAIRS);
        addDrop(ModBlocks.GABBRO_BRICK_SLAB, slabDrops(ModBlocks.GABBRO_BRICK_SLAB));

        addDrop(ModBlocks.FLOWSTONE);
        addDrop(ModBlocks.FLOWSTONE_BLOCK);
        addDrop(ModBlocks.FLOWSTONE_STAIRS);
        addDrop(ModBlocks.FLOWSTONE_SLAB, slabDrops(ModBlocks.FLOWSTONE_SLAB));
        addDrop(ModBlocks.FLOWSTONE_WALL);

        addDrop(ModBlocks.HYDROTHERMAL_VENT);

        addDrop(ModBlocks.MICROCLINE);
        addDrop(ModBlocks.POLISHED_MICROCLINE);
        addDrop(ModBlocks.POLISHED_MICROCLINE_STAIRS);
        addDrop(ModBlocks.POLISHED_MICROCLINE_SLAB, slabDrops(ModBlocks.POLISHED_MICROCLINE_SLAB));
        addDrop(ModBlocks.SMOOTH_MICROCLINE);
        addDrop(ModBlocks.SMOOTH_MICROCLINE_STAIRS);
        addDrop(ModBlocks.SMOOTH_MICROCLINE_SLAB, slabDrops(ModBlocks.SMOOTH_MICROCLINE_SLAB));
        addDrop(ModBlocks.SMOOTH_MICROCLINE_WALL);

        addDrop(ModBlocks.ORTHOCLASE_FELDSPAR);
        addDrop(ModBlocks.ORTHOCLASE_FELDSPAR_STAIRS);
        addDrop(ModBlocks.ORTHOCLASE_FELDSPAR_SLAB, slabDrops(ModBlocks.ORTHOCLASE_FELDSPAR_SLAB));
        addDrop(ModBlocks.ORTHOCLASE_FELDSPAR_WALL);
        addDrop(ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR);
        addDrop(ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR_STAIRS);
        addDrop(ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR_SLAB, slabDrops(ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR_SLAB));
        addDrop(ModBlocks.ORTHOCLASE_FELDSPAR_TILES);
        addDrop(ModBlocks.ORTHOCLASE_FELDSPAR_TILE_STAIRS);
        addDrop(ModBlocks.ORTHOCLASE_FELDSPAR_TILE_SLAB, slabDrops(ModBlocks.ORTHOCLASE_FELDSPAR_TILE_SLAB));

        addDrop(ModBlocks.KHEWRA_SALT_BLOCK);
        addDrop(ModBlocks.KHEWRA_SALT_STAIRS);
        addDrop(ModBlocks.KHEWRA_SALT_SLAB, slabDrops(ModBlocks.KHEWRA_SALT_SLAB));
        addDrop(ModBlocks.KHEWRA_SALT_WALL);
        addDrop(ModBlocks.SALT_LAMP);

        addDrop(ModBlocks.KAOLINITE_CLAY, multipleOreDrops(ModBlocks.KAOLINITE_CLAY, ModItems.KAOLINITE_CLAY_CHUNK, 4,4));
        addDrop(ModBlocks.PACKED_KAOLINITE_CLAY);
        addDrop(ModBlocks.PACKED_KAOLINITE_CLAY_STAIRS);
        addDrop(ModBlocks.PACKED_KAOLINITE_CLAY_SLAB, slabDrops(ModBlocks.PACKED_KAOLINITE_CLAY_SLAB));
        addDrop(ModBlocks.PACKED_KAOLINITE_CLAY_WALL);
        addDrop(ModBlocks.KAOLINITE_BRICKS);
        addDrop(ModBlocks.KAOLINITE_BRICK_STAIRS);
        addDrop(ModBlocks.KAOLINITE_BRICK_SLAB, slabDrops(ModBlocks.KAOLINITE_BRICK_SLAB));
        addDrop(ModBlocks.KAOLINITE_BRICK_WALL);
        addDrop(ModBlocks.HARDENED_KAOLINITE_CLAY);
        addDrop(ModBlocks.HARDENED_KAOLINITE_CLAY_STAIRS);
        addDrop(ModBlocks.HARDENED_KAOLINITE_CLAY_SLAB, slabDrops(ModBlocks.HARDENED_KAOLINITE_CLAY_SLAB));

        addDrop(ModBlocks.ROPE);

        addDropWithSilkTouch(ModBlocks.CRUMBLING_STONE_BRICKS);

        addDrop(ModBlocks.RAW_SUNSTONE);
        addDrop(ModBlocks.RAW_SUNSTONE_STAIRS);
        addDrop(ModBlocks.RAW_SUNSTONE_SLAB, slabDrops(ModBlocks.RAW_SUNSTONE_SLAB));
        addDrop(ModBlocks.RAW_SUNSTONE_WALL);
        addDrop(ModBlocks.SUNSTONE);
        addDrop(ModBlocks.SUNSTONE_STAIRS);
        addDrop(ModBlocks.SUNSTONE_SLAB, slabDrops(ModBlocks.SUNSTONE_SLAB));
        addDrop(ModBlocks.SUNSTONE_WALL);

        addDrop(ModBlocks.MOONSTONE);

        addDrop(ModBlocks.HOT_PINK_HYACINTH);
        addDrop(ModBlocks.CORAL_HYACINTH);
        addDrop(ModBlocks.YELLOW_HYACINTH);
        addDrop(ModBlocks.BLUE_HYACINTH);
        addDrop(ModBlocks.PURPLE_HYACINTH);
        addDrop(ModBlocks.INDIGO_HYACINTH);
        addDrop(ModBlocks.PINK_HYACINTH);
        addDrop(ModBlocks.LIGHT_PINK_HYACINTH);
        addDrop(ModBlocks.WHITE_HYACINTH);

        addDrop(ModBlocks.SILVER_VASE);

        addDrop(ModBlocks.LIMBURGITE);
        addDrop(ModBlocks.LIMBURGITE_STAIRS);
        addDrop(ModBlocks.LIMBURGITE_SLAB, slabDrops(ModBlocks.LIMBURGITE_SLAB));
        addDrop(ModBlocks.LIMBURGITE_WALL);
        addDrop(ModBlocks.POLISHED_LIMBURGITE);
        addDrop(ModBlocks.POLISHED_LIMBURGITE_STAIRS);
        addDrop(ModBlocks.POLISHED_LIMBURGITE_SLAB, slabDrops(ModBlocks.POLISHED_LIMBURGITE_SLAB));
        addDrop(ModBlocks.LIMBURGITE_TILES);
        addDrop(ModBlocks.LIMBURGITE_TILE_STAIRS);
        addDrop(ModBlocks.LIMBURGITE_TILE_SLAB, slabDrops(ModBlocks.LIMBURGITE_TILE_SLAB));

        addDrop(ModBlocks.MIXED_STONE_BRICKS);
        addDrop(ModBlocks.MIXED_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.MIXED_STONE_BRICK_SLAB, slabDrops(ModBlocks.MIXED_STONE_BRICK_SLAB));

        addDrop(ModBlocks.HAWAIITE);
        addDrop(ModBlocks.HAWAIITE_STAIRS);
        addDrop(ModBlocks.HAWAIITE_SLAB, slabDrops(ModBlocks.HAWAIITE_SLAB));
        addDrop(ModBlocks.HAWAIITE_WALL);
        addDrop(ModBlocks.POLISHED_HAWAIITE);
        addDrop(ModBlocks.POLISHED_HAWAIITE_STAIRS);
        addDrop(ModBlocks.POLISHED_HAWAIITE_SLAB, slabDrops(ModBlocks.POLISHED_HAWAIITE_SLAB));

        addDrop(ModBlocks.SCORIACEOUS_LAPILLI);
        addDrop(ModBlocks.SCORIA);
        addDrop(ModBlocks.SCORIA_STAIRS);
        addDrop(ModBlocks.SCORIA_SLAB, slabDrops(ModBlocks.SCORIA_SLAB));
        addDrop(ModBlocks.SCORIA_WALL);

        addDrop(ModBlocks.PUMICE);
        addDrop(ModBlocks.PUMICE_STAIRS);
        addDrop(ModBlocks.PUMICE_SLAB, slabDrops(ModBlocks.PUMICE_SLAB));
        addDrop(ModBlocks.PUMICE_WALL);
    }



    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
