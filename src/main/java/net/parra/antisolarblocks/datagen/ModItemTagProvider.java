package net.parra.antisolarblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.SUGAR_MAPLE_LOG.asItem())
                .add(ModBlocks.SUGAR_MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SUGAR_MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_SUGAR_MAPLE_WOOD.asItem())
                .add(ModBlocks.WHITE_PINE_LOG.asItem())
                .add(ModBlocks.WHITE_PINE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WHITE_PINE_LOG.asItem())
                .add(ModBlocks.STRIPPED_WHITE_PINE_WOOD.asItem())
                .add(ModBlocks.YEW_LOG.asItem())
                .add(ModBlocks.YEW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_YEW_LOG.asItem())
                .add(ModBlocks.STRIPPED_YEW_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.SUGAR_MAPLE_PLANKS.asItem())
                .add(ModBlocks.WHITE_PINE_PLANKS.asItem())
                .add(ModBlocks.YEW_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.SUGAR_MAPLE_SLAB.asItem())
                .add(ModBlocks.WHITE_PINE_SLAB.asItem())
                .add(ModBlocks.YEW_SLAB.asItem());

        getOrCreateTagBuilder(ConventionalItemTags.WOODEN_RODS)
                .add(ModItems.TWIG);

        getOrCreateTagBuilder(ConventionalItemTags.BRICKS)
                .add(ModItems.ANCIENT_BRICK)
                .add(ModItems.KAOLINITE_BRICK)
                .add(ModItems.COBBLE_BRICK);

        getOrCreateTagBuilder(ConventionalItemTags.ORES)
                .add(ModBlocks.CHAROITE_ORE.asItem())
                .add(ModBlocks.JADE_ORE.asItem())
                .add(ModBlocks.ROSE_QUARTZ_ORE.asItem());

        getOrCreateTagBuilder(ConventionalItemTags.GEMS)
                .add(ModItems.CHAROITE)
                .add(ModItems.JADE)
                .add(ModItems.ROSE_QUARTZ);

        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.JAPANESE_MAPLE_LEAVES.asItem())
                .add(ModBlocks.FORSYTHIA_FLOWERS.asItem())
                .add(ModBlocks.SUGAR_MAPLE_LEAVES.asItem())
                .add(ModBlocks.WHITE_PINE_LEAVES.asItem())
                .add(ModBlocks.YEW_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModBlocks.GIANT_PASSIFLORA_INCARNATA.asItem())
                .add(ModBlocks.GIANT_PASSIFLORA_CAERULA.asItem())
                .add(ModBlocks.BLAHAJ.asItem())
                .add(ModBlocks.TETO_PLUSHIE.asItem())
                .add(ModBlocks.MIKU_PLUSHIE.asItem())
                .add(ModBlocks.AKITA_NERU_PLUSHIE.asItem())
                .add(ModBlocks.GUMI_PLUSHIE.asItem())
                .add(ModBlocks.OSAGE_CHAN_PLUSHIE.asItem());

        getOrCreateTagBuilder(ConventionalItemTags.FOODS)
                .add(ModItems.HIMALAYAN_SALT)
                .add(ModItems.KAOLINITE_CLAY_CHUNK);

        getOrCreateTagBuilder(ItemTags.BEE_FOOD)
                .add(ModBlocks.PINK_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.INDIGO_WHITE_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.WHITE_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.HONEY_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.YELLOW_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.PURPLE_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.PURPLE_CROWN_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.PEARL_VIOLET_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.HONEY_VIOLET_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.LIGHT_PINK_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.LIGHT_BLUE_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.BLUE_VIOLA_TRICOLOR.asItem())
                .add(ModBlocks.COBALT_VIOLA_TRICOLOR.asItem())

                .add(ModBlocks.HOT_PINK_HYACINTH.asItem())
                .add(ModBlocks.CORAL_HYACINTH.asItem())
                .add(ModBlocks.YELLOW_HYACINTH.asItem())
                .add(ModBlocks.BLUE_HYACINTH.asItem())
                .add(ModBlocks.PURPLE_HYACINTH.asItem())
                .add(ModBlocks.INDIGO_HYACINTH.asItem())
                .add(ModBlocks.PINK_HYACINTH.asItem())
                .add(ModBlocks.LIGHT_PINK_HYACINTH.asItem())
                .add(ModBlocks.WHITE_HYACINTH.asItem())

                .add(ModBlocks.BLUE_STARS.asItem())
                .add(ModBlocks.LAVENDER_BLUE_WALL_IRIS.asItem())
                .add(ModBlocks.WHITE_WALL_IRIS.asItem())
                .add(ModBlocks.BLUE_LILAC_WALL_IRIS.asItem())
                .add(ModBlocks.PURPLE_BLUE_WALL_IRIS.asItem())
                .add(ModBlocks.SKY_BLUE_WALL_IRIS.asItem())
                .add(ModBlocks.BLUISH_VIOLET_WALL_IRIS.asItem())
                .add(ModBlocks.STAR_JASMINE.asItem())
                .add(ModBlocks.BASKET_OF_GOLD.asItem())
                .add(ModBlocks.JAPANESE_QUINCE.asItem())
                .add(ModBlocks.VIRGINIA_CREEPER.asItem())
                .add(ModBlocks.FLOWERING_OXYRIA.asItem())
                .add(ModBlocks.LUMINESCENT_BRIAR.asItem())
                .add(ModBlocks.BLANKET_FLOWER.asItem())
                .add(ModBlocks.RED_BLANKET_FLOWER.asItem())
                .add(ModBlocks.RED_NEMESIA.asItem())
                .add(ModBlocks.EUPHORBIA_X_MARTINI.asItem())
                .add(ModBlocks.SILVER_VASE.asItem())
                .add(ModBlocks.HUMMINGBIRD_FUCHSIA.asItem())
                .add(ModBlocks.ASIAN_BLEEDING_HEART.asItem())
                .add(ModBlocks.WEAVERS_BROOM.asItem())
                .add(ModBlocks.LAVENDER_BALL.asItem())
                .add(ModBlocks.DOG_ROSE_BUSH.asItem())
                .add(ModBlocks.GIANT_PASSIFLORA_INCARNATA.asItem())
                .add(ModBlocks.GIANT_PASSIFLORA_CAERULA.asItem())

                .add(ModBlocks.WILD_COSMOS_AND_BACHELOR_BUTTONS.asItem());

        getOrCreateTagBuilder(ConventionalItemTags.STONES)
                .add(ModBlocks.PERIDOTITE.asItem())
                .add(ModBlocks.CHERT.asItem())
                .add(ModBlocks.GNEISS.asItem())
                .add(ModBlocks.GYPSUM_ALABASTER.asItem())
                .add(ModBlocks.BLUESCHIST.asItem())
                .add(ModBlocks.OLIVINE.asItem())
                .add(ModBlocks.HARZBURGITE.asItem())
                .add(ModBlocks.ORTHOPYROXENE.asItem())
                .add(ModBlocks.LIGHT_SHALE.asItem())
                .add(ModBlocks.DARK_SHALE.asItem())
                .add(ModBlocks.OIL_SHALE.asItem())
                .add(ModBlocks.MIXED_SHALE.asItem())
                .add(ModBlocks.TEPHRITE.asItem())
                .add(ModBlocks.ARKOSE.asItem())
                .add(ModBlocks.SODALITE.asItem())
                .add(ModBlocks.PEGMATITE.asItem())
                .add(ModBlocks.RAPAKIVI.asItem())
                .add(ModBlocks.LATERITE_ROCK.asItem())
                .add(ModBlocks.GREENSCHIST.asItem())
                .add(ModBlocks.RHYOLITE.asItem())
                .add(ModBlocks.OOLITE.asItem())
                .add(ModBlocks.PORPHYRY.asItem())
                .add(ModBlocks.PIGEONITE.asItem())
                .add(ModBlocks.GRAY_SILTSTONE.asItem())
                .add(ModBlocks.BUFF_SILTSTONE.asItem())
                .add(ModBlocks.RED_SILTSTONE.asItem())
                .add(ModBlocks.BURGUNDY_SILTSTONE.asItem())
                .add(ModBlocks.TRAVERTINE.asItem())
                .add(ModBlocks.TRACHYANDESITE.asItem())
                .add(ModBlocks.PICRITE_BASALT.asItem())
                .add(ModBlocks.DACITE.asItem())
                .add(ModBlocks.FOYAITE.asItem())
                .add(ModBlocks.GABBRO.asItem())
                .add(ModBlocks.FLOWSTONE.asItem())
                .add(ModBlocks.LIMBURGITE.asItem())
                .add(ModBlocks.HAWAIITE.asItem())
                .add(ModBlocks.SCORIA.asItem())
                .add(ModBlocks.PUMICE.asItem());

        getOrCreateTagBuilder(ModTags.Items.SUGAR_MAPLE_LOGS)
                .add(ModBlocks.SUGAR_MAPLE_LOG.asItem())
                .add(ModBlocks.SUGAR_MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SUGAR_MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_SUGAR_MAPLE_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.WHITE_PINE_LOGS)
                .add(ModBlocks.WHITE_PINE_LOG.asItem())
                .add(ModBlocks.WHITE_PINE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WHITE_PINE_LOG.asItem())
                .add(ModBlocks.STRIPPED_WHITE_PINE_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.YEW_LOGS)
                .add(ModBlocks.YEW_LOG.asItem())
                .add(ModBlocks.YEW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_YEW_LOG.asItem())
                .add(ModBlocks.STRIPPED_YEW_WOOD.asItem());

        getOrCreateTagBuilder(ConventionalItemTags.WHITE_DYED)
                .add(ModBlocks.WHITE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.WHITE_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.WHITE_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.LIGHT_GRAY_DYED)
                .add(ModBlocks.LIGHT_GRAY_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.LIGHT_GRAY_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.GRAY_DYED)
                .add(ModBlocks.GRAY_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.GRAY_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.GRAY_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.BLACK_DYED)
                .add(ModBlocks.BLACK_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.BLACK_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.BLACK_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.BROWN_DYED)
                .add(ModBlocks.BROWN_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.BROWN_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.BROWN_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.RED_DYED)
                .add(ModBlocks.RED_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.RED_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.RED_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.ORANGE_DYED)
                .add(ModBlocks.ORANGE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.ORANGE_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.ORANGE_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.YELLOW_DYED)
                .add(ModBlocks.YELLOW_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.YELLOW_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.YELLOW_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.LIME_DYED)
                .add(ModBlocks.LIME_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.LIME_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.LIME_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.GREEN_DYED)
                .add(ModBlocks.GREEN_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.GREEN_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.GREEN_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.CYAN_DYED)
                .add(ModBlocks.CYAN_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.CYAN_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.CYAN_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.LIGHT_BLUE_DYED)
                .add(ModBlocks.LIGHT_BLUE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.LIGHT_BLUE_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.BLUE_DYED)
                .add(ModBlocks.BLUE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.BLUE_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.BLUE_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.PURPLE_DYED)
                .add(ModBlocks.PURPLE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.PURPLE_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.PURPLE_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.MAGENTA_DYED)
                .add(ModBlocks.MAGENTA_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.MAGENTA_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.MAGENTA_ANCIENT_BRICK_SLAB.asItem());
        getOrCreateTagBuilder(ConventionalItemTags.PINK_DYED)
                .add(ModBlocks.PINK_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.PINK_ANCIENT_BRICK_STAIRS.asItem())
                .add(ModBlocks.PINK_ANCIENT_BRICK_SLAB.asItem());

        getOrCreateTagBuilder(ModTags.Items.ANCIENT_BRICKS)
                .add(ModBlocks.ANCIENT_BRICKS.asItem())
                .add(ModBlocks.WHITE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.GRAY_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.BLACK_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.BROWN_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.RED_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.ORANGE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.YELLOW_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.LIME_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.GREEN_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.CYAN_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.BLUE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.PURPLE_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.MAGENTA_ANCIENT_BRICKS.asItem())
                .add(ModBlocks.PINK_ANCIENT_BRICKS.asItem());

    }
    public class ModTags {
        public static class Items {
            public static final TagKey<Item> SUGAR_MAPLE_LOGS = createTag("sugar_maple_logs");
            public static final TagKey<Item> WHITE_PINE_LOGS = createTag("white_pine_logs");
            public static final TagKey<Item> YEW_LOGS = createTag("yew_logs");
            public static final TagKey<Item> ANCIENT_BRICKS = createTag("ancient_bricks");

            private static TagKey<Item> createTag(String name) {
                return TagKey.of(RegistryKeys.ITEM, Identifier.of(AntisolarBlocks.MOD_ID, name));
            }
        }
    }
}
