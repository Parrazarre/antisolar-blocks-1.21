package net.parra.antisolarblocks.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.PlaceableOnWaterItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.item.custom.CobbleItem;
import net.parra.antisolarblocks.item.custom.FeatherEmittingItem;

public class ModItems {

    public static final Item COBBLE = registerItem("cobble", new CobbleItem(new Item.Settings().maxCount(64)));
    public static final Item COBBLE_BRICK = registerItem("cobble_brick", new Item(new Item.Settings()));
    public static final Item TWIG = registerItem("twig", new Item(new Item.Settings()));
    public static final Item ANCIENT_CLAY_BALL = registerItem("ancient_clay_ball", new Item(new Item.Settings()));
    public static final Item ANCIENT_BRICK = registerItem("ancient_brick", new Item(new Item.Settings()));
    public static final Item JADE = registerItem("jade", new Item(new Item.Settings()));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz", new Item(new Item.Settings()));
    public static final Item CHAROITE = registerItem("charoite", new Item(new Item.Settings()));
    public static final Item KAOLINITE_BRICK = registerItem("kaolinite_brick", new Item(new Item.Settings()));
    public static final Item TUFFACIOUS_CLAY_BALL = registerItem("tuffacious_clay_ball", new Item(new Item.Settings()));

    public static final Item HIMALAYAN_SALT = registerItem("himalayan_salt", new Item(new Item.Settings().food(ModFoodComponents.HIMALAYAN_SALT)));
    public static final Item KAOLINITE_CLAY_CHUNK = registerItem("kaolinite_clay_chunk", new Item(new Item.Settings().food(ModFoodComponents.KAOLINITE_CLAY_CHUNK)));

    public static final Item WHITE_LOTUS_FLOWER = registerItem("white_lotus_flower", new PlaceableOnWaterItem(ModBlocks.WHITE_LOTUS_FLOWER, new Item.Settings()));
    public static final Item PINK_LOTUS_FLOWER = registerItem("pink_lotus_flower", new PlaceableOnWaterItem(ModBlocks.PINK_LOTUS_FLOWER, new Item.Settings()));
    public static final Item DUCKWEEDS = registerItem("duckweeds", new PlaceableOnWaterItem(ModBlocks.DUCKWEEDS, new Item.Settings()));

    public static final Item FEATHER_BLOCK = registerItem("feather_block", new FeatherEmittingItem(ModBlocks.FEATHER_BLOCK, new Item.Settings()));

    public static final Item BLAHAJ = registerItem("blahaj", new FeatherEmittingItem(ModBlocks.BLAHAJ, new Item.Settings()));
    public static final Item TETO_PLUSHIE = registerItem("teto_plushie", new FeatherEmittingItem(ModBlocks.TETO_PLUSHIE, new Item.Settings()));
    public static final Item MIKU_PLUSHIE = registerItem("miku_plushie", new FeatherEmittingItem(ModBlocks.MIKU_PLUSHIE, new Item.Settings()));
    public static final Item AKITA_NERU_PLUSHIE = registerItem("akita_neru_plushie", new FeatherEmittingItem(ModBlocks.AKITA_NERU_PLUSHIE, new Item.Settings()));
    public static final Item GUMI_PLUSHIE = registerItem("gumi_plushie", new FeatherEmittingItem(ModBlocks.GUMI_PLUSHIE, new Item.Settings()));
    public static final Item OSAGE_CHAN_PLUSHIE = registerItem("osage_chan_plushie", new FeatherEmittingItem(ModBlocks.OSAGE_CHAN_PLUSHIE, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AntisolarBlocks.MOD_ID, name), item);
    }

    public static class ModFoodComponents {
        public static final FoodComponent HIMALAYAN_SALT = new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build();
        public static final FoodComponent KAOLINITE_CLAY_CHUNK = new FoodComponent.Builder().nutrition(2).saturationModifier(2.0F).build();

    }

        public static void registerModItems() {
        AntisolarBlocks.LOGGER.info("Registering Mod Items for " + AntisolarBlocks.MOD_ID);
    }
}
