package net.parra.antisolarblocks.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.*;
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

    public static final Item SALT = registerItem("salt", new Item(new Item.Settings().food(ModFoodComponents.SALT)));
    public static final Item HIMALAYAN_SALT = registerItem("himalayan_salt", new Item(new Item.Settings().food(ModFoodComponents.HIMALAYAN_SALT)));
    public static final Item KAOLINITE_CLAY_CHUNK = registerItem("kaolinite_clay_chunk", new Item(new Item.Settings().food(ModFoodComponents.KAOLINITE_CLAY_CHUNK)));

    public static final Item RED_RADISH = registerItem("red_radish", new Item(new Item.Settings().food(ModFoodComponents.RADISH)));
    public static final Item BLACK_RADISH = registerItem("black_radish", new Item(new Item.Settings().food(ModFoodComponents.RADISH)));
    public static final Item WHITE_RADISH = registerItem("white_radish", new Item(new Item.Settings().food(ModFoodComponents.RADISH)));
    public static final Item MIXED_RADISH_SEEDS = registerItem("mixed_radish_seeds", new AliasedBlockItem(ModBlocks.RADISH_CROP, new Item.Settings()));
    public static final Item RADISH_TOAST = registerItem("radish_toast", new Item(new Item.Settings().food(ModFoodComponents.RADISH_TOAST)));

    public static final Item PEAR = registerItem("pear", new Item(new Item.Settings().food(ModFoodComponents.PEAR)));
    public static final Item BANANA = registerItem("banana", new Item(new Item.Settings().food(ModFoodComponents.BANANA)));
    public static final Item ORANGE = registerItem("orange", new Item(new Item.Settings().food(ModFoodComponents.ORANGE)));
    public static final Item RED_ROWAN_BERRIES = registerItem("red_rowan_berries", new Item(new Item.Settings().food(ModFoodComponents.RED_ROWAN_BERRIES)));
    public static final Item YELLOW_ROWAN_BERRIES = registerItem("yellow_rowan_berries", new Item(new Item.Settings().food(ModFoodComponents.YELLOW_ROWAN_BERRIES)));
    public static final Item LEEK = registerItem("leek", new AliasedBlockItem(ModBlocks.LEEK, new Item.Settings().food(ModFoodComponents.LEEK)));
    public static final Item LEEK_SOUP = registerItem("leek_soup", new Item(new Item.Settings().food(ModFoodComponents.LEEK_SOUP).maxCount(1)));
    public static final Item MANGO = registerItem("mango", new Item(new Item.Settings().food(ModFoodComponents.MANGO)));

    public static final Item WHITE_LOTUS_FLOWER = registerItem("white_lotus_flower", new PlaceableOnWaterItem(ModBlocks.WHITE_LOTUS_FLOWER, new Item.Settings()));
    public static final Item PINK_LOTUS_FLOWER = registerItem("pink_lotus_flower", new PlaceableOnWaterItem(ModBlocks.PINK_LOTUS_FLOWER, new Item.Settings()));
    public static final Item DUCKWEEDS = registerItem("duckweeds", new PlaceableOnWaterItem(ModBlocks.DUCKWEEDS, new Item.Settings()));

    public static final Item FEATHER_BLOCK = registerItem("feather_block", new FeatherEmittingItem(ModBlocks.FEATHER_BLOCK, new Item.Settings()));

    public static final Item BLAHAJ = registerItem("blahaj", new FeatherEmittingItem(ModBlocks.BLAHAJ, new Item.Settings()));

    public static final Item AXOLOTL_PLUSHIE_BLUE = registerItem("axolotl_plushie_blue", new FeatherEmittingItem(ModBlocks.AXOLOTL_PLUSHIE_BLUE, new Item.Settings()));
    public static final Item AXOLOTL_PLUSHIE_BROWN = registerItem("axolotl_plushie_brown", new FeatherEmittingItem(ModBlocks.AXOLOTL_PLUSHIE_BROWN, new Item.Settings()));
    public static final Item AXOLOTL_PLUSHIE_CYAN = registerItem("axolotl_plushie_cyan", new FeatherEmittingItem(ModBlocks.AXOLOTL_PLUSHIE_CYAN, new Item.Settings()));
    public static final Item AXOLOTL_PLUSHIE_GOLD = registerItem("axolotl_plushie_gold", new FeatherEmittingItem(ModBlocks.AXOLOTL_PLUSHIE_GOLD, new Item.Settings()));
    public static final Item AXOLOTL_PLUSHIE_PINK = registerItem("axolotl_plushie_pink", new FeatherEmittingItem(ModBlocks.AXOLOTL_PLUSHIE_PINK, new Item.Settings()));


    public static final Item TETO_PLUSHIE = registerItem("teto_plushie", new FeatherEmittingItem(ModBlocks.TETO_PLUSHIE, new Item.Settings()));
    public static final Item MIKU_PLUSHIE = registerItem("miku_plushie", new FeatherEmittingItem(ModBlocks.MIKU_PLUSHIE, new Item.Settings()));
    public static final Item FIREWORK_MIKU_PLUSHIE = registerItem("firework_miku_plushie", new FeatherEmittingItem(ModBlocks.FIREWORK_MIKU_PLUSHIE, new Item.Settings()));
    public static final Item CHERRY_MIKU_PLUSHIE = registerItem("cherry_miku_plushie", new FeatherEmittingItem(ModBlocks.CHERRY_MIKU_PLUSHIE, new Item.Settings()));
    public static final Item AKITA_NERU_PLUSHIE = registerItem("akita_neru_plushie", new FeatherEmittingItem(ModBlocks.AKITA_NERU_PLUSHIE, new Item.Settings()));
    public static final Item LUKA_PLUSHIE = registerItem("luka_plushie", new FeatherEmittingItem(ModBlocks.LUKA_PLUSHIE, new Item.Settings()));
    public static final Item MEIKO_PLUSHIE = registerItem("meiko_plushie", new FeatherEmittingItem(ModBlocks.MEIKO_PLUSHIE, new Item.Settings()));
    public static final Item KAITO_PLUSHIE = registerItem("kaito_plushie", new FeatherEmittingItem(ModBlocks.KAITO_PLUSHIE, new Item.Settings()));
    public static final Item RIN_PLUSHIE = registerItem("rin_plushie", new FeatherEmittingItem(ModBlocks.RIN_PLUSHIE, new Item.Settings()));
    public static final Item LEN_PLUSHIE = registerItem("len_plushie", new FeatherEmittingItem(ModBlocks.LEN_PLUSHIE, new Item.Settings()));
    public static final Item LEN_FILIPINO_PLUSHIE = registerItem("len_filipino_plushie", new FeatherEmittingItem(ModBlocks.LEN_FILIPINO_PLUSHIE, new Item.Settings()));
    public static final Item GUMI_PLUSHIE = registerItem("gumi_plushie", new FeatherEmittingItem(ModBlocks.GUMI_PLUSHIE, new Item.Settings()));
    public static final Item OSAGE_CHAN_PLUSHIE = registerItem("osage_chan_plushie", new FeatherEmittingItem(ModBlocks.OSAGE_CHAN_PLUSHIE, new Item.Settings()));
    public static final Item FAUST_PLUSHIE = registerItem("faust_plushie", new FeatherEmittingItem(ModBlocks.FAUST_PLUSHIE, new Item.Settings()));
    public static final Item PEARTO_PLUSHIE = registerItem("pearto_plushie", new FeatherEmittingItem(ModBlocks.PEARTO_PLUSHIE, new Item.Settings()));
    public static final Item LOPUNNY_PLUSHIE = registerItem("lopunny_plushie", new FeatherEmittingItem(ModBlocks.LOPUNNY_PLUSHIE, new Item.Settings()));
    public static final Item OWL_PLUSHIE = registerItem("owl_plushie", new FeatherEmittingItem(ModBlocks.OWL_PLUSHIE, new Item.Settings()));
    public static final Item FLYNN_PLUSHIE = registerItem("flynn_plushie", new FeatherEmittingItem(ModBlocks.FLYNN_PLUSHIE, new Item.Settings()));
    public static final Item HEATHCLIFF_PLUSHIE = registerItem("heathcliff_plushie", new FeatherEmittingItem(ModBlocks.HEATHCLIFF_PLUSHIE, new Item.Settings()));
    public static final Item PARRA_PLUSHIE = registerItem("parra_plushie", new FeatherEmittingItem(ModBlocks.PARRA_PLUSHIE, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AntisolarBlocks.MOD_ID, name), item);
    }
    private static FoodComponent.Builder createStew(int hunger) {
        return (new FoodComponent.Builder()).nutrition(hunger).saturationModifier(0.6F).usingConvertsTo(Items.BOWL);
    }

    public static class ModFoodComponents {
        public static final FoodComponent SALT = new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build();
        public static final FoodComponent HIMALAYAN_SALT = new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build();
        public static final FoodComponent KAOLINITE_CLAY_CHUNK = new FoodComponent.Builder().nutrition(2).saturationModifier(2.0F).build();
        public static final FoodComponent RADISH = new FoodComponent.Builder().nutrition(3).saturationModifier(3.6F).build();
        public static final FoodComponent RADISH_TOAST = new FoodComponent.Builder().nutrition(6).saturationModifier(10.0F).build();
        public static final FoodComponent PEAR = new FoodComponent.Builder().nutrition(4).saturationModifier(2.4F).build();
        public static final FoodComponent BANANA = new FoodComponent.Builder().nutrition(4).saturationModifier(4.8F).build();
        public static final FoodComponent ORANGE = new FoodComponent.Builder().nutrition(4).saturationModifier(2.4F).build();
        public static final FoodComponent RED_ROWAN_BERRIES = new FoodComponent.Builder().nutrition(1).saturationModifier(1F).build();
        public static final FoodComponent YELLOW_ROWAN_BERRIES = new FoodComponent.Builder().nutrition(1).saturationModifier(1F).build();
        public static final FoodComponent LEEK = new FoodComponent.Builder().nutrition(4).saturationModifier(2.4F).build();
        public static final FoodComponent MANGO = new FoodComponent.Builder().nutrition(4).saturationModifier(2.4F).build();
        public static final FoodComponent LEEK_SOUP = createStew(10).saturationModifier(12.0F).build();

    }





    public static void registerModItems() {
        AntisolarBlocks.LOGGER.info("Registering Mod Items for " + AntisolarBlocks.MOD_ID);
    }
}
