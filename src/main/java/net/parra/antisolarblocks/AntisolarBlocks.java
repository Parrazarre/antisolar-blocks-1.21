package net.parra.antisolarblocks;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.entity.ModBlockEntities;
import net.parra.antisolarblocks.entity.ModEntities;
import net.parra.antisolarblocks.item.ModItemGroups;
import net.parra.antisolarblocks.item.ModItems;
import net.parra.antisolarblocks.particle.ModParticles;
import net.parra.antisolarblocks.recipe.ModRecipeSerializers;
import net.parra.antisolarblocks.recipe.ModRecipeTypes;
import net.parra.antisolarblocks.screen.ModScreenHandlers;
import net.parra.antisolarblocks.util.ModLootTableModifiers;
import net.parra.antisolarblocks.villager.ModVillagers;
import net.parra.antisolarblocks.world.VillageHouses;
import net.parra.antisolarblocks.world.gen.ModWorldGeneration;
import net.parra.antisolarblocks.world.tree.ModTreeDecorators;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		ModParticles.registerModParticles();
		ModScreenHandlers.registerModScreenHandlers();
		ModRecipeSerializers.register();
		ModRecipeTypes.register();
		ModWorldGeneration.generateModWorldGen();
		ModVillagers.registerVillagers();
		ModLootTableModifiers.modifyLootTables();
		ModTreeDecorators.register();

		ServerLifecycleEvents.SERVER_STARTING.register(server -> {
			Identifier house = Identifier.of(AntisolarBlocks.MOD_ID, "village/plains/houses/antisolar_house_plains");
			Identifier empty = Identifier.ofVanilla("empty");

			VillageHouses.addToPool(server, Identifier.ofVanilla("village/plains/houses"), house, empty, 3);

		});
		ServerLifecycleEvents.SERVER_STARTING.register(server -> {
			Identifier house = Identifier.of(AntisolarBlocks.MOD_ID, "village/taiga/houses/antisolar_house_taiga");
			Identifier empty = Identifier.ofVanilla("empty");

			VillageHouses.addToPool(server, Identifier.ofVanilla("village/taiga/houses"), house, empty, 3);

		});
		ServerLifecycleEvents.SERVER_STARTING.register(server -> {
			Identifier house = Identifier.of(AntisolarBlocks.MOD_ID, "village/savanna/houses/antisolar_house_savanna");
			Identifier empty = Identifier.ofVanilla("empty");

			VillageHouses.addToPool(server, Identifier.ofVanilla("village/savanna/houses"), house, empty, 3);

		});
		ServerLifecycleEvents.SERVER_STARTING.register(server -> {
			Identifier house = Identifier.of(AntisolarBlocks.MOD_ID, "village/snowy/houses/antisolar_house_snowy");
			Identifier empty = Identifier.ofVanilla("empty");

			VillageHouses.addToPool(server, Identifier.ofVanilla("village/snowy/houses"), house, empty, 3);

		});
		ServerLifecycleEvents.SERVER_STARTING.register(server -> {
			Identifier house = Identifier.of(AntisolarBlocks.MOD_ID, "village/desert/houses/antisolar_house_desert");
			Identifier empty = Identifier.ofVanilla("empty");

			VillageHouses.addToPool(server, Identifier.ofVanilla("village/desert/houses"), house, empty, 3);

		});

		CompostingChanceRegistry.INSTANCE.add(ModItems.RED_RADISH, 0.2F);
		CompostingChanceRegistry.INSTANCE.add(ModItems.BLACK_RADISH, 0.2F);
		CompostingChanceRegistry.INSTANCE.add(ModItems.WHITE_RADISH, 0.2F);
		CompostingChanceRegistry.INSTANCE.add(ModItems.MIXED_RADISH_SEEDS, 0.1F);

		CompostingChanceRegistry.INSTANCE.add(ModItems.LEEK, 0.2F);

		StrippableBlockRegistry.register(ModBlocks.SUGAR_MAPLE_LOG, ModBlocks.STRIPPED_SUGAR_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.SUGAR_MAPLE_WOOD, ModBlocks.STRIPPED_SUGAR_MAPLE_WOOD);

		StrippableBlockRegistry.register(ModBlocks.WHITE_PINE_LOG, ModBlocks.STRIPPED_WHITE_PINE_LOG);
		StrippableBlockRegistry.register(ModBlocks.WHITE_PINE_WOOD, ModBlocks.STRIPPED_WHITE_PINE_WOOD);

		StrippableBlockRegistry.register(ModBlocks.YEW_LOG, ModBlocks.STRIPPED_YEW_LOG);
		StrippableBlockRegistry.register(ModBlocks.YEW_WOOD, ModBlocks.STRIPPED_YEW_WOOD);

		StrippableBlockRegistry.register(ModBlocks.PEAR_LOG, ModBlocks.STRIPPED_PEAR_LOG);
		StrippableBlockRegistry.register(ModBlocks.PEAR_WOOD, ModBlocks.STRIPPED_PEAR_WOOD);

		StrippableBlockRegistry.register(ModBlocks.MUSA_LOG, ModBlocks.STRIPPED_MUSA_LOG);
		StrippableBlockRegistry.register(ModBlocks.MUSA_WOOD, ModBlocks.STRIPPED_MUSA_WOOD);

		StrippableBlockRegistry.register(ModBlocks.ORANGE_LOG, ModBlocks.STRIPPED_ORANGE_LOG);
		StrippableBlockRegistry.register(ModBlocks.ORANGE_WOOD, ModBlocks.STRIPPED_ORANGE_WOOD);

		StrippableBlockRegistry.register(ModBlocks.ROWAN_LOG, ModBlocks.STRIPPED_ROWAN_LOG);
		StrippableBlockRegistry.register(ModBlocks.ROWAN_WOOD, ModBlocks.STRIPPED_ROWAN_WOOD);

		StrippableBlockRegistry.register(ModBlocks.BLUE_MAHOE_LOG, ModBlocks.STRIPPED_BLUE_MAHOE_LOG);
		StrippableBlockRegistry.register(ModBlocks.BLUE_MAHOE_WOOD, ModBlocks.STRIPPED_BLUE_MAHOE_WOOD);

		StrippableBlockRegistry.register(ModBlocks.MANGO_LOG, ModBlocks.STRIPPED_MANGO_LOG);
		StrippableBlockRegistry.register(ModBlocks.MANGO_WOOD, ModBlocks.STRIPPED_MANGO_WOOD);

		StrippableBlockRegistry.register(ModBlocks.PILE_OF_WOOD, ModBlocks.STRIPPED_PILE_OF_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SMALL_BUSH, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LARGE_BUSH, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DARK_WILD_GRASS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_WILD_GRASS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TALLER_GRASS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.TALL_WHITE_PAMPAS_GRASS, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_PAMPAS_GRASS, 60, 100);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FLOWERING_OXYRIA, 60, 100);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OXYRIA, 60, 100);

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

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PEAR_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PEAR_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PEAR_BEARING_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MUSA_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MUSA_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MUSA_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MUSA_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MUSA_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MUSA_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MUSA_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MUSA_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MUSA_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MUSA_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ORANGE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ORANGE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_BEARING_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ROWAN_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_ROWAN_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ROWAN_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_ROWAN_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_ROWAN_BEARING_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_ROWAN_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_ROWAN_BEARING_LEAVES, 30, 60);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SMALL_FORSYTHIA_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FORSYTHIA_FLOWERS, 30, 60);


		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEOLOGIST, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PERIDOTITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHERT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.GNEISS, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GYPSUM_ALABASTER, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM_CRYSTAL, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.CHAROITE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.ROSE_QUARTZ, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.JADE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.ANCIENT_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.TUFFACIOUS_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.KAOLINITE_CLAY_CHUNK, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BLUESCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OLIVINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.POTASSIUM_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HARZBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOPYROXENE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.MIXED_SHALE, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ALBITE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JADE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ROSE_QUARTZ_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.CHAROITE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.JADE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.RAW_ROSE_QUARTZ, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.CHAROITE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LATERITE_SOIL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DUMORTIERITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.DUMORTIERITE_QUARTZ, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GREENSCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RHYOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GLACIAL_TILL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PORPHYRY, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LARIMAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PIGEONITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GRAY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BUFF_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RED_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BURGUNDY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KIMBERLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRAVERTINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRACHYANDESITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PICRITE_BASALT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHLORAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DACITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HYDROXYLAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FOYAITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GABBRO, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FLOWSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.HYDROTHERMAL_VENT, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.MICROCLINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOCLASE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KHEWRA_SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_SUNSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_MOONSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LIMBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HAWAIITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PUMICEOUS_LAPILLI, 32), 8, 2, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEOLOGIST, 2, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PERIDOTITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHERT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.GNEISS, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GYPSUM_ALABASTER, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM_CRYSTAL, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.CHAROITE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.ROSE_QUARTZ, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.JADE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.ANCIENT_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.TUFFACIOUS_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.KAOLINITE_CLAY_CHUNK, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BLUESCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OLIVINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.POTASSIUM_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HARZBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOPYROXENE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.MIXED_SHALE, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ALBITE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JADE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ROSE_QUARTZ_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.CHAROITE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.JADE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.RAW_ROSE_QUARTZ, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.CHAROITE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LATERITE_SOIL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DUMORTIERITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.DUMORTIERITE_QUARTZ, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GREENSCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RHYOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GLACIAL_TILL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PORPHYRY, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LARIMAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PIGEONITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GRAY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BUFF_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RED_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BURGUNDY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KIMBERLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRAVERTINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRACHYANDESITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PICRITE_BASALT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHLORAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DACITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HYDROXYLAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FOYAITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GABBRO, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FLOWSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.HYDROTHERMAL_VENT, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.MICROCLINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOCLASE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KHEWRA_SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_SUNSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_MOONSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LIMBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HAWAIITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PUMICEOUS_LAPILLI, 32), 8, 2, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEOLOGIST, 3, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PERIDOTITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHERT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.GNEISS, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GYPSUM_ALABASTER, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM_CRYSTAL, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.CHAROITE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.ROSE_QUARTZ, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.JADE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.ANCIENT_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.TUFFACIOUS_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.KAOLINITE_CLAY_CHUNK, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BLUESCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OLIVINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.POTASSIUM_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HARZBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOPYROXENE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.MIXED_SHALE, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ALBITE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JADE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ROSE_QUARTZ_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.CHAROITE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.JADE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.RAW_ROSE_QUARTZ, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.CHAROITE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LATERITE_SOIL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DUMORTIERITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.DUMORTIERITE_QUARTZ, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GREENSCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RHYOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GLACIAL_TILL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PORPHYRY, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LARIMAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PIGEONITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GRAY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BUFF_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RED_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BURGUNDY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KIMBERLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRAVERTINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRACHYANDESITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PICRITE_BASALT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHLORAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DACITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HYDROXYLAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FOYAITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GABBRO, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FLOWSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.HYDROTHERMAL_VENT, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.MICROCLINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOCLASE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KHEWRA_SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_SUNSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_MOONSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LIMBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HAWAIITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PUMICEOUS_LAPILLI, 32), 8, 2, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEOLOGIST, 4, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PERIDOTITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHERT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.GNEISS, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GYPSUM_ALABASTER, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM_CRYSTAL, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.CHAROITE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.ROSE_QUARTZ, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.JADE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.ANCIENT_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.TUFFACIOUS_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.KAOLINITE_CLAY_CHUNK, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BLUESCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OLIVINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.POTASSIUM_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HARZBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOPYROXENE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.MIXED_SHALE, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ALBITE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JADE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ROSE_QUARTZ_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.CHAROITE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.JADE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.RAW_ROSE_QUARTZ, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.CHAROITE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LATERITE_SOIL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DUMORTIERITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.DUMORTIERITE_QUARTZ, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GREENSCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RHYOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GLACIAL_TILL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PORPHYRY, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LARIMAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PIGEONITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GRAY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BUFF_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RED_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BURGUNDY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KIMBERLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRAVERTINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRACHYANDESITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PICRITE_BASALT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHLORAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DACITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HYDROXYLAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FOYAITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GABBRO, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FLOWSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.HYDROTHERMAL_VENT, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.MICROCLINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOCLASE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KHEWRA_SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_SUNSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_MOONSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LIMBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HAWAIITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PUMICEOUS_LAPILLI, 32), 8, 2, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.GEOLOGIST, 5, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PERIDOTITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHERT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.GNEISS, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GYPSUM_ALABASTER, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SATIN_SPAR_GYPSUM_CRYSTAL, 16), 16, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.CHAROITE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.ROSE_QUARTZ, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.JADE, 8), 8, 8, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.ANCIENT_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.TUFFACIOUS_CLAY_BALL, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModItems.KAOLINITE_CLAY_CHUNK, 64), 16, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BLUESCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OLIVINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.POTASSIUM_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HARZBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOPYROXENE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,3),
					new ItemStack(ModBlocks.MIXED_SHALE, 48), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ALBITE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JADE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ROSE_QUARTZ_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.CHAROITE_ORE, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.JADE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.RAW_ROSE_QUARTZ, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,12),
					new ItemStack(ModBlocks.CHAROITE_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LATERITE_SOIL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DUMORTIERITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.DUMORTIERITE_QUARTZ, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GREENSCHIST, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RHYOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GLACIAL_TILL, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.OOLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PORPHYRY, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LARIMAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PIGEONITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GRAY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BUFF_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RED_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.BURGUNDY_SILTSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KIMBERLITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRAVERTINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.TRACHYANDESITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PICRITE_BASALT, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.CHLORAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.DACITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HYDROXYLAPATITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FOYAITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.GABBRO, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.FLOWSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.HYDROTHERMAL_VENT, 8), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.MICROCLINE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.ORTHOCLASE_FELDSPAR, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.KHEWRA_SALT_BLOCK, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_SUNSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.RAW_MOONSTONE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.LIMBURGITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.HAWAIITE, 32), 8, 2, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,2),
					new ItemStack(ModBlocks.PUMICEOUS_LAPILLI, 32), 8, 2, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BOTANIST, 1, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.MIXED_RADISH_SEEDS, 1), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.LEEK, 1), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SMALL_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LARGE_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_PAMPAS_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALL_WHITE_PAMPAS_GRASS, 8), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WEAVERS_BROOM, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LAVENDER_BALL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LARGE_DRY_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DOG_ROSE_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.GIANT_PASSIFLORA_INCARNATA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.GIANT_PASSIFLORA_CAERULA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DARK_WILD_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_WILD_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALLER_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.CATTAILS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SHORT_STINGING_NETTLE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALL_STINGING_NETTLE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BOXWOOD, 16), 12, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LAVENDER_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_LILAC_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SKY_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUISH_VIOLET_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.STAR_JASMINE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BASKET_OF_GOLD, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.JAPANESE_QUINCE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIRGINIA_CREEPER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIRGINIA_CREEPER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.INDIGO_WHITE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HONEY_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_CROWN_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PEARL_VIOLET_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HONEY_VIOLET_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_PINK_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_BLUE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.COBALT_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HOT_PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.CORAL_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.INDIGO_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_STARS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLANKET_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.RED_BLANKET_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.RED_NEMESIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.FLOWERING_OXYRIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.OXYRIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.EUPHORBIA_X_MARTINI, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.EMPETRUM, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SILVER_VASE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WILD_COSMOS_AND_BACHELOR_BUTTONS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LUMINESCENT_BRIAR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_LOTUS_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_LOTUS_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DUCKWEEDS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BRAMBLES, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HUMMINGBIRD_FUCHSIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.ASIAN_BLEEDING_HEART, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.ASIAN_BLEEDING_HEART, 16), 8, 4, 0.04f
			));
//--------------------------------------------------------------------
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.FORSYTHIA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JAPANESE_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.SUGAR_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.WHITE_PINE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YEW_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.PEAR_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MUSA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ORANGE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.RED_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YELLOW_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.BLUE_MAHOE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MANGO_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(Blocks.WITHER_ROSE, 4), 8, 4, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BOTANIST, 2, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.MIXED_RADISH_SEEDS, 1), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.LEEK, 1), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SMALL_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LARGE_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_PAMPAS_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALL_WHITE_PAMPAS_GRASS, 8), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WEAVERS_BROOM, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LAVENDER_BALL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LARGE_DRY_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DOG_ROSE_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.GIANT_PASSIFLORA_INCARNATA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.GIANT_PASSIFLORA_CAERULA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DARK_WILD_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_WILD_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALLER_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.CATTAILS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SHORT_STINGING_NETTLE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALL_STINGING_NETTLE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BOXWOOD, 16), 12, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LAVENDER_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_LILAC_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SKY_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUISH_VIOLET_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.STAR_JASMINE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BASKET_OF_GOLD, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.JAPANESE_QUINCE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIRGINIA_CREEPER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIRGINIA_CREEPER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.INDIGO_WHITE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HONEY_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_CROWN_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PEARL_VIOLET_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HONEY_VIOLET_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_PINK_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_BLUE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.COBALT_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HOT_PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.CORAL_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.INDIGO_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_STARS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLANKET_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.RED_BLANKET_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.RED_NEMESIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.FLOWERING_OXYRIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.OXYRIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.EUPHORBIA_X_MARTINI, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.EMPETRUM, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SILVER_VASE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WILD_COSMOS_AND_BACHELOR_BUTTONS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LUMINESCENT_BRIAR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_LOTUS_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_LOTUS_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DUCKWEEDS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BRAMBLES, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HUMMINGBIRD_FUCHSIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.ASIAN_BLEEDING_HEART, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.ASIAN_BLEEDING_HEART, 16), 8, 4, 0.04f
			));
//--------------------------------------------------------------------
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.FORSYTHIA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JAPANESE_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.SUGAR_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.WHITE_PINE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YEW_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.PEAR_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MUSA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ORANGE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.RED_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YELLOW_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.BLUE_MAHOE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MANGO_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(Blocks.WITHER_ROSE, 4), 8, 4, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BOTANIST, 3, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.MIXED_RADISH_SEEDS, 1), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.LEEK, 1), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SMALL_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LARGE_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_PAMPAS_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALL_WHITE_PAMPAS_GRASS, 8), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WEAVERS_BROOM, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LAVENDER_BALL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LARGE_DRY_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DOG_ROSE_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.GIANT_PASSIFLORA_INCARNATA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.GIANT_PASSIFLORA_CAERULA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DARK_WILD_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_WILD_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALLER_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.CATTAILS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SHORT_STINGING_NETTLE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALL_STINGING_NETTLE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BOXWOOD, 16), 12, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LAVENDER_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_LILAC_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SKY_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUISH_VIOLET_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.STAR_JASMINE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BASKET_OF_GOLD, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.JAPANESE_QUINCE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIRGINIA_CREEPER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIRGINIA_CREEPER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.INDIGO_WHITE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HONEY_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_CROWN_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PEARL_VIOLET_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HONEY_VIOLET_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_PINK_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_BLUE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.COBALT_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HOT_PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.CORAL_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.INDIGO_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_STARS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLANKET_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.RED_BLANKET_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.RED_NEMESIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.FLOWERING_OXYRIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.OXYRIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.EUPHORBIA_X_MARTINI, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.EMPETRUM, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SILVER_VASE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WILD_COSMOS_AND_BACHELOR_BUTTONS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LUMINESCENT_BRIAR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_LOTUS_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_LOTUS_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DUCKWEEDS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BRAMBLES, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HUMMINGBIRD_FUCHSIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.ASIAN_BLEEDING_HEART, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.ASIAN_BLEEDING_HEART, 16), 8, 4, 0.04f
			));
//--------------------------------------------------------------------
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.FORSYTHIA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JAPANESE_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.SUGAR_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.WHITE_PINE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YEW_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.PEAR_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MUSA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ORANGE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.RED_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YELLOW_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.BLUE_MAHOE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MANGO_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(Blocks.WITHER_ROSE, 4), 8, 4, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BOTANIST, 4, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.MIXED_RADISH_SEEDS, 1), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModItems.LEEK, 1), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SMALL_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LARGE_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_PAMPAS_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALL_WHITE_PAMPAS_GRASS, 8), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WEAVERS_BROOM, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LAVENDER_BALL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LARGE_DRY_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DOG_ROSE_BUSH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.GIANT_PASSIFLORA_INCARNATA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.GIANT_PASSIFLORA_CAERULA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DARK_WILD_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_WILD_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALLER_GRASS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.CATTAILS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SHORT_STINGING_NETTLE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.TALL_STINGING_NETTLE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BOXWOOD, 16), 12, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LAVENDER_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_LILAC_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SKY_BLUE_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUISH_VIOLET_WALL_IRIS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.STAR_JASMINE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BASKET_OF_GOLD, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.JAPANESE_QUINCE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIRGINIA_CREEPER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIRGINIA_CREEPER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.INDIGO_WHITE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HONEY_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_CROWN_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PEARL_VIOLET_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HONEY_VIOLET_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_PINK_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_BLUE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.COBALT_VIOLA_TRICOLOR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HOT_PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.CORAL_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PURPLE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.INDIGO_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LIGHT_PINK_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_HYACINTH, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLUE_STARS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BLANKET_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.RED_BLANKET_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.RED_NEMESIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.YELLOW_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_DAFFODIL, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.FLOWERING_OXYRIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.OXYRIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.EUPHORBIA_X_MARTINI, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.EMPETRUM, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.SILVER_VASE, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WILD_COSMOS_AND_BACHELOR_BUTTONS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.LUMINESCENT_BRIAR, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.WHITE_LOTUS_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.PINK_LOTUS_FLOWER, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.DUCKWEEDS, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.BRAMBLES, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.HUMMINGBIRD_FUCHSIA, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.ASIAN_BLEEDING_HEART, 16), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,1),
					new ItemStack(ModBlocks.ASIAN_BLEEDING_HEART, 16), 8, 4, 0.04f
			));
//--------------------------------------------------------------------
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.FORSYTHIA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JAPANESE_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.SUGAR_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.WHITE_PINE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YEW_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.PEAR_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MUSA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ORANGE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.RED_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YELLOW_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.BLUE_MAHOE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MANGO_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(Blocks.WITHER_ROSE, 4), 8, 4, 0.04f
			));
		});
		TradeOfferHelper.registerVillagerOffers(ModVillagers.BOTANIST, 5, factories -> {
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.FORSYTHIA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.JAPANESE_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.SUGAR_MAPLE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.WHITE_PINE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YEW_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.PEAR_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MUSA_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.ORANGE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.RED_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.YELLOW_ROWAN_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.BLUE_MAHOE_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(ModBlocks.MANGO_SAPLING, 4), 8, 4, 0.04f
			));
			factories.add((entity, random) -> new TradeOffer(
					new TradedItem(Items.EMERALD,4),
					new ItemStack(Blocks.WITHER_ROSE, 4), 8, 4, 0.04f
			));
		});
	}


}