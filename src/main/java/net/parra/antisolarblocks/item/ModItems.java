package net.parra.antisolarblocks.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.PlaceableOnWaterItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.item.custom.CobbleItem;

public class ModItems {

    public static final Item COBBLE = registerItem("cobble", new CobbleItem(new Item.Settings().maxCount(64)));
    public static final Item COBBLE_BRICK = registerItem("cobble_brick", new Item(new Item.Settings()));
    public static final Item TWIG = registerItem("twig", new Item(new Item.Settings()));
    public static final Item ANCIENT_CLAY_BALL = registerItem("ancient_clay_ball", new Item(new Item.Settings()));
    public static final Item ANCIENT_BRICK = registerItem("ancient_brick", new Item(new Item.Settings()));
    public static final Item JADE = registerItem("jade", new Item(new Item.Settings()));
    public static final Item ROSE_QUARTZ = registerItem("rose_quartz", new Item(new Item.Settings()));
    public static final Item CHAROITE = registerItem("charoite", new Item(new Item.Settings()));

    public static final Item HIMALAYAN_SALT = registerItem("himalayan_salt", new Item(new Item.Settings().food(ModFoodComponents.HIMALAYAN_SALT)));

    public static final Item WHITE_LOTUS_FLOWER = registerItem("white_lotus_flower", new PlaceableOnWaterItem(ModBlocks.WHITE_LOTUS_FLOWER, new Item.Settings()));
    public static final Item PINK_LOTUS_FLOWER = registerItem("pink_lotus_flower", new PlaceableOnWaterItem(ModBlocks.PINK_LOTUS_FLOWER, new Item.Settings()));
    public static final Item DUCKWEEDS = registerItem("duckweeds", new PlaceableOnWaterItem(ModBlocks.DUCKWEEDS, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AntisolarBlocks.MOD_ID, name), item);
    }

    public static class ModFoodComponents {
        public static final FoodComponent HIMALAYAN_SALT = new FoodComponent.Builder().nutrition(1).saturationModifier(0.3F).build();
    }

        public static void registerModItems() {
        AntisolarBlocks.LOGGER.info("Registering Mod Items for " + AntisolarBlocks.MOD_ID);
    }
}
