package net.parra.antisolarblocks;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.entity.ModBlockEntities;
import net.parra.antisolarblocks.entity.ModEntities;
import net.parra.antisolarblocks.item.ModItemGroups;
import net.parra.antisolarblocks.item.ModItems;
import net.parra.antisolarblocks.particle.ModParticles;
import net.parra.antisolarblocks.screen.ModScreenHandlers;
import net.parra.antisolarblocks.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.parra.antisolarblocks.block.entity.ModBlockEntityType;

public class AntisolarBlocks implements ModInitializer {
	public static final String MOD_ID = "antisolarblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		ModEntities.registerModEntities();
		ModBlockEntities.registerModBlockEntities();
		ModBlockEntityType.registerModBlockEntityType();
		ModParticles.registerModParticles();
		ModScreenHandlers.registerModScreenHandlers();

		ModWorldGeneration.generateModWorldGen();

		StrippableBlockRegistry.register(ModBlocks.SUGAR_MAPLE_LOG, ModBlocks.STRIPPED_SUGAR_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.SUGAR_MAPLE_WOOD, ModBlocks.STRIPPED_SUGAR_MAPLE_WOOD);

		StrippableBlockRegistry.register(ModBlocks.WHITE_PINE_LOG, ModBlocks.STRIPPED_WHITE_PINE_LOG);
		StrippableBlockRegistry.register(ModBlocks.WHITE_PINE_WOOD, ModBlocks.STRIPPED_WHITE_PINE_WOOD);

		StrippableBlockRegistry.register(ModBlocks.YEW_LOG, ModBlocks.STRIPPED_YEW_LOG);
		StrippableBlockRegistry.register(ModBlocks.YEW_WOOD, ModBlocks.STRIPPED_YEW_WOOD);

		StrippableBlockRegistry.register(ModBlocks.PILE_OF_WOOD, ModBlocks.STRIPPED_PILE_OF_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SMALL_BUSH, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LARGE_BUSH, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_WILD_GRASS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_WILD_GRASS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TALLER_GRASS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LAVENDER_BLUE_WALL_IRIS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_WALL_IRIS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_LILAC_WALL_IRIS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_BLUE_WALL_IRIS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SKY_BLUE_WALL_IRIS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUISH_VIOLET_WALL_IRIS, 60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STAR_JASMINE, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BASKET_OF_GOLD, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.JAPANESE_QUINCE, 60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_STARS, 60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FLOWERING_OXYRIA, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OXYRIA, 60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LUMINESCENT_BRIAR, 60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHISELED_SPRUCE_PLANKS, 5, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GIANT_PINECONE_BLOCK, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GIANT_PINECONE_STAIRS, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GIANT_PINECONE_PEDUNCLE, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PILE_OF_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRAW_BLOCK, 60, 20);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SUGAR_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SUGAR_MAPLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SUGAR_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SUGAR_MAPLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SUGAR_MAPLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SUGAR_MAPLE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SUGAR_MAPLE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SUGAR_MAPLE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SUGAR_MAPLE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SUGAR_MAPLE_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PINE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PINE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WHITE_PINE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_WHITE_PINE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PINE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PINE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PINE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PINE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PINE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PINE_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_YEW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_YEW_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YEW_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SMALL_FORSYTHIA_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FORSYTHIA_FLOWERS, 30, 60);
	}
}