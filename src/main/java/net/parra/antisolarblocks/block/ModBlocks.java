package net.parra.antisolarblocks.block;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.custom.*;
import net.parra.antisolarblocks.world.tree.ModSaplingGenerators;

public class ModBlocks {

    public static final Block SMALL_BUSH = registerBlock("small_bush",
            new FlowerBlock(
                    StatusEffects.WEAVING,
                    0.35F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block LARGE_BUSH = registerBlock("large_bush",
            new FlowerBlock(
                    StatusEffects.WEAVING,
                    0.35F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block WEAVERS_BROOM = registerBlock("weavers_broom",
            new FlowerBlock(
                    StatusEffects.WEAVING,
                    0.35F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block LAVENDER_BALL = registerBlock("lavender_ball",
            new FlowerBlock(
                    StatusEffects.SPEED,
                    3.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block DOG_ROSE_BUSH = registerBlock("dog_rose_bush",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.30F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block GIANT_PASSIFLORA_INCARNATA = registerBlock("giant_passiflora_incarnata",
            new WearableFlowerBlock(
                    StatusEffects.NIGHT_VISION,
                    3.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block GIANT_PASSIFLORA_CAERULA = registerBlock("giant_passiflora_caerulea",
            new WearableFlowerBlock(
                    StatusEffects.NIGHT_VISION,
                    3.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block DARK_WILD_GRASS = registerBlock("dark_wild_grass",
            new FlowerBlock(
                    StatusEffects.WEAVING,
                    0.35F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block LIGHT_WILD_GRASS = registerBlock("light_wild_grass",
            new FlowerBlock(
                    StatusEffects.WEAVING,
                    0.35F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block TALLER_GRASS = registerBlock("taller_grass",
            new TallPlantBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block PINK_VIOLA_TRICOLOR = registerBlock("pink_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block INDIGO_WHITE_VIOLA_TRICOLOR = registerBlock("indigo_white_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block WHITE_VIOLA_TRICOLOR = registerBlock("white_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block HONEY_VIOLA_TRICOLOR = registerBlock("honey_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block YELLOW_VIOLA_TRICOLOR = registerBlock("yellow_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block PURPLE_VIOLA_TRICOLOR = registerBlock("purple_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block PURPLE_CROWN_VIOLA_TRICOLOR = registerBlock("purple_crown_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block VIOLA_TRICOLOR = registerBlock("viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block PEARL_VIOLET_VIOLA_TRICOLOR = registerBlock("pearl_violet_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block HONEY_VIOLET_VIOLA_TRICOLOR = registerBlock("honey_violet_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block LIGHT_PINK_VIOLA_TRICOLOR = registerBlock("light_pink_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block LIGHT_BLUE_VIOLA_TRICOLOR = registerBlock("light_blue_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block BLUE_VIOLA_TRICOLOR = registerBlock("blue_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block COBALT_VIOLA_TRICOLOR = registerBlock("cobalt_viola_tricolor",
            new FlowerBlock(
                    StatusEffects.REGENERATION,
                    0.10F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block BLUE_STARS = registerBlock("blue_stars",
            new FlowerBlock(
                    StatusEffects.WATER_BREATHING,
                    2.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block LAVENDER_BLUE_WALL_IRIS = registerBlock("lavender_blue_wall_iris",
            new FlowerBlock(
                    StatusEffects.LEVITATION,
                    8.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block WHITE_WALL_IRIS = registerBlock("white_wall_iris",
            new FlowerBlock(
                    StatusEffects.LEVITATION,
                    8.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block BLUE_LILAC_WALL_IRIS = registerBlock("blue_lilac_wall_iris",
            new FlowerBlock(
                    StatusEffects.LEVITATION,
                    8.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block PURPLE_BLUE_WALL_IRIS = registerBlock("purple_blue_wall_iris",
            new FlowerBlock(
                    StatusEffects.LEVITATION,
                    8.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block SKY_BLUE_WALL_IRIS = registerBlock("sky_blue_wall_iris",
            new FlowerBlock(
                    StatusEffects.LEVITATION,
                    8.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block BLUISH_VIOLET_WALL_IRIS = registerBlock("bluish_violet_wall_iris",
            new FlowerBlock(
                    StatusEffects.LEVITATION,
                    8.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block BLANKET_FLOWER = registerBlock("blanket_flower",
            new FlowerBlock(
                    StatusEffects.FIRE_RESISTANCE,
                    2.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block RED_BLANKET_FLOWER = registerBlock("red_blanket_flower",
            new FlowerBlock(
                    StatusEffects.FIRE_RESISTANCE,
                    2.00F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block RED_NEMESIA = registerBlock("red_nemesia",
            new FlowerBlock(
                    StatusEffects.INSTANT_HEALTH,
                    0.30F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block STAR_JASMINE = registerBlock("star_jasmine",
            new GlowLichenBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block BASKET_OF_GOLD = registerBlock("basket_of_gold",
            new GlowLichenBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block JAPANESE_QUINCE = registerBlock("japanese_quince",
            new GlowLichenBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block VIRGINIA_CREEPER = registerBlock("virginia_creeper",
            new VineBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .replaceable()
                            .noCollision()
                            .ticksRandomly()
                            .strength(0.2F)
                            .sounds(BlockSoundGroup.VINE)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block FLOWERING_OXYRIA = registerBlock("flowering_oxyria",
            new DeadBushBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block OXYRIA = registerBlock("oxyria",
            new DeadBushBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block EUPHORBIA_X_MARTINI = registerBlock("euphorbia_x_martini",
            new DeadBushBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block WILDFLOWERS = registerBlock("wildflowers",
            new FlowerbedBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .sounds(BlockSoundGroup.PINK_PETALS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block WILD_COSMOS_AND_BACHELOR_BUTTONS = registerBlock("wild_cosmos_and_bachelor_buttons",
            new FlowerbedBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .sounds(BlockSoundGroup.PINK_PETALS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    public static final Block LUMINESCENT_BRIAR = registerBlock("luminescent_briar",
            new SeagrassBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .luminance(state -> 8)
            )
    );
    public static final Block WHITE_LOTUS_FLOWER = registerBlock("white_lotus_flower",
        new LilyPadBlock(
                AbstractBlock.Settings.create()
                        .mapColor(MapColor.DARK_GREEN)
                        .breakInstantly()
                        .sounds(BlockSoundGroup.LILY_PAD)
                        .nonOpaque()
                        .pistonBehavior(PistonBehavior.DESTROY)
        )
    );
    public static final Block PINK_LOTUS_FLOWER = registerBlock("pink_lotus_flower",
            new LilyPadBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .breakInstantly()
                            .sounds(BlockSoundGroup.LILY_PAD)
                            .nonOpaque()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block DUCKWEEDS = registerBlock("duckweeds",
            new LilyPadBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .breakInstantly()
                            .sounds(BlockSoundGroup.MUD)
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .noCollision()
            )
    );
    public static final Block HUMMINGBIRD_FUCHSIA = registerBlock("hummingbird_fuchsia",
            new HangingRootsBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .replaceable()
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.HANGING_ROOTS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block ROUGH_COBBLESTONE_BRICKS = registerBlock("rough_cobblestone_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.PACKED_MUD)
            )
    );
    public static final Block ROUGH_COBBLESTONE_BRICK_STAIRS = registerBlock("rough_cobblestone_brick_stairs",
            new StairsBlock(
                    ModBlocks.ROUGH_COBBLESTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.PACKED_MUD)
            )
    );
    public static final Block ROUGH_COBBLESTONE_BRICK_SLAB = registerBlock("rough_cobblestone_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.PACKED_MUD)
            )
    );
    public static final Block COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block COBBLESTONE_BRICK_STAIRS = registerBlock("cobblestone_brick_stairs",
            new StairsBlock(
                    ModBlocks.COBBLESTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block COBBLESTONE_BRICK_SLAB = registerBlock("cobblestone_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block COBBLESTONE_BRICK_WALL = registerBlock("cobblestone_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE = registerBlock("peridotite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_STAIRS = registerBlock("peridotite_stairs",
            new StairsBlock(
                    ModBlocks.PERIDOTITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_SLAB = registerBlock("peridotite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_WALL = registerBlock("peridotite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_BRICKS = registerBlock("peridotite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_BRICK_STAIRS = registerBlock("peridotite_brick_stairs",
            new StairsBlock(
                    ModBlocks.PERIDOTITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_BRICK_SLAB = registerBlock("peridotite_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PERIDOTITE = registerBlock("polished_peridotite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PERIDOTITE_STAIRS = registerBlock("polished_peridotite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_PERIDOTITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PERIDOTITE_SLAB = registerBlock("polished_peridotite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_TILES = registerBlock("peridotite_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_TILE_STAIRS = registerBlock("peridotite_tile_stairs",
            new StairsBlock(
                    ModBlocks.PERIDOTITE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );    public static final Block PERIDOTITE_TILE_SLAB = registerBlock("peridotite_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block COBBLESTONE_PATH = registerBlock("cobblestone_path",
            new GrassBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(0.6F)
                    .sounds(BlockSoundGroup.GRAVEL)
            )
    );
    public static final Block CHISELED_SPRUCE_PLANKS = registerBlock("chiseled_spruce_planks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block OAK_FENCING = registerBlock("oak_fencing",
            new FenceWithSpikesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .nonOpaque()
            )
    );
    public static final Block CHERT = registerBlock("chert",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHERT_STAIRS = registerBlock("chert_stairs",
            new StairsBlock(
                ModBlocks.CHERT.getDefaultState(),
                AbstractBlock.Settings.create()
                    .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHERT_SLAB = registerBlock("chert_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHERT_WALL = registerBlock("chert_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHERT = registerBlock("polished_chert",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHERT_STAIRS = registerBlock("polished_chert_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_CHERT.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHERT_SLAB = registerBlock("polished_chert_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHERT_WALL = registerBlock("polished_chert_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GNEISS = registerBlock("gneiss",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DARK_GNEISS_BRICKS = registerBlock("dark_gneiss_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DARK_GNEISS_BRICK_STAIRS = registerBlock("dark_gneiss_brick_stairs",
            new StairsBlock(
                    ModBlocks.DARK_GNEISS_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DARK_GNEISS_BRICK_SLAB = registerBlock("dark_gneiss_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DARK_GNEISS_BRICK_WALL = registerBlock("dark_gneiss_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DARK_POLISHED_GNEISS = registerBlock("dark_polished_gneiss",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DARK_POLISHED_GNEISS_STAIRS = registerBlock("dark_polished_gneiss_stairs",
            new StairsBlock(
                    ModBlocks.DARK_POLISHED_GNEISS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DARK_POLISHED_GNEISS_SLAB = registerBlock("dark_polished_gneiss_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LIGHT_GNEISS_BRICKS = registerBlock("light_gneiss_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LIGHT_GNEISS_BRICK_STAIRS = registerBlock("light_gneiss_brick_stairs",
            new StairsBlock(
                    ModBlocks.LIGHT_GNEISS_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LIGHT_GNEISS_BRICK_SLAB = registerBlock("light_gneiss_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LIGHT_GNEISS_BRICK_WALL = registerBlock("light_gneiss_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LIGHT_POLISHED_GNEISS = registerBlock("light_polished_gneiss",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LIGHT_POLISHED_GNEISS_STAIRS = registerBlock("light_polished_gneiss_stairs",
            new StairsBlock(
                    ModBlocks.LIGHT_POLISHED_GNEISS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LIGHT_POLISHED_GNEISS_SLAB = registerBlock("light_polished_gneiss_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_GNEISS_BRICKS = registerBlock("pink_gneiss_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_GNEISS_BRICK_STAIRS = registerBlock("pink_gneiss_brick_stairs",
            new StairsBlock(
                    ModBlocks.PINK_GNEISS_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_GNEISS_BRICK_SLAB = registerBlock("pink_gneiss_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_GNEISS_BRICK_WALL = registerBlock("pink_gneiss_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_POLISHED_GNEISS = registerBlock("pink_polished_gneiss",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_POLISHED_GNEISS_STAIRS = registerBlock("pink_polished_gneiss_stairs",
            new StairsBlock(
                    ModBlocks.PINK_POLISHED_GNEISS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_POLISHED_GNEISS_SLAB = registerBlock("pink_polished_gneiss_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GYPSUM_ALABASTER = registerBlock("gypsum_alabaster",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GYPSUM_ALABASTER_STAIRS = registerBlock("gypsum_alabaster_stairs",
            new StairsBlock(
                    ModBlocks.GYPSUM_ALABASTER.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GYPSUM_ALABASTER_SLAB = registerBlock("gypsum_alabaster_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GYPSUM_ALABASTER_WALL = registerBlock("gypsum_alabaster_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GYPSUM_ALABASTER = registerBlock("polished_gypsum_alabaster",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GYPSUM_ALABASTER_STAIRS = registerBlock("polished_gypsum_alabaster_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_GYPSUM_ALABASTER.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GYPSUM_ALABASTER_SLAB = registerBlock("polished_gypsum_alabaster_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_GYPSUM_ALABASTER = registerBlock("smooth_gypsum_alabaster",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_GYPSUM_ALABASTER_STAIRS = registerBlock("smooth_gypsum_alabaster_stairs",
            new StairsBlock(
                    ModBlocks.SMOOTH_GYPSUM_ALABASTER.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_GYPSUM_ALABASTER_SLAB = registerBlock("smooth_gypsum_alabaster_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SATIN_SPAR_GYPSUM = registerBlock("satin_spar_gypsum",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .requiresTool()
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SATIN_SPAR_GYPSUM_CRYSTAL = registerBlock("satin_spar_gypsum_crystal",
            new AmethystClusterBlock(5.0F,3.0F,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .requiresTool()
                            .nonOpaque()
                            .sounds(BlockSoundGroup.POINTED_DRIPSTONE)
                            .strength(1.0F, 6.0F)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block ANCIENT_CLAY = registerBlock("ancient_clay",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.FLUTE)
                            .sounds(BlockSoundGroup.PACKED_MUD)
                            .strength(0.6F)
            )
    );
    public static final Block MOSSY_ANCIENT_CLAY = registerBlock("mossy_ancient_clay",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.FLUTE)
                            .sounds(BlockSoundGroup.PACKED_MUD)
                            .strength(0.6F)
            )
    );
    public static final Block VERY_MOSSY_ANCIENT_CLAY = registerBlock("very_mossy_ancient_clay",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.FLUTE)
                            .sounds(BlockSoundGroup.PACKED_MUD)
                            .strength(0.6F)
            )
    );
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs",
            new StairsBlock(
                    ModBlocks.ANDESITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHISELED_ANDESITE_BRICKS = registerBlock("chiseled_andesite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BLUESCHIST = registerBlock("blueschist",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BLUESCHIST_STAIRS = registerBlock("blueschist_stairs",
            new StairsBlock(
                    ModBlocks.BLUESCHIST.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BLUESCHIST_SLAB = registerBlock("blueschist_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BLUESCHIST_WALL = registerBlock("blueschist_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BLUESCHIST = registerBlock("polished_blueschist",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BLUESCHIST_STAIRS = registerBlock("polished_blueschist_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_BLUESCHIST.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BLUESCHIST_SLAB = registerBlock("polished_blueschist_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHISELED_BLUESCHIST = registerBlock("chiseled_blueschist",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LIGHT_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OLIVINE = registerBlock("olivine",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OLIVINE_STAIRS = registerBlock("olivine_stairs",
            new StairsBlock(
                    ModBlocks.OLIVINE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OLIVINE_SLAB = registerBlock("olivine_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OLIVINE_WALL = registerBlock("olivine_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_OLIVINE = registerBlock("polished_olivine",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_OLIVINE_STAIRS = registerBlock("polished_olivine_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_OLIVINE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_OLIVINE_SLAB = registerBlock("polished_olivine_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OLIVINE_TILES = registerBlock("olivine_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OLIVINE_TILE_STAIRS = registerBlock("olivine_tile_stairs",
            new StairsBlock(
                    ModBlocks.OLIVINE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OLIVINE_TILE_SLAB = registerBlock("olivine_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMALL_OLIVINE_TILES = registerBlock("small_olivine_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMALL_OLIVINE_TILE_STAIRS = registerBlock("small_olivine_tile_stairs",
            new StairsBlock(
                    ModBlocks.SMALL_OLIVINE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMALL_OLIVINE_TILE_SLAB = registerBlock("small_olivine_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POTASSIUM_FELDSPAR = registerBlock("potassium_feldspar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_POTASSIUM_FELDSPAR = registerBlock("polished_potassium_feldspar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_POTASSIUM_FELDSPAR_STAIRS = registerBlock("polished_potassium_feldspar_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_POTASSIUM_FELDSPAR.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_POTASSIUM_FELDSPAR_SLAB = registerBlock("polished_potassium_feldspar_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POTASSIUM_FELDSPAR_BRICKS = registerBlock("potassium_feldspar_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POTASSIUM_FELDSPAR_BRICK_STAIRS = registerBlock("potassium_feldspar_brick_stairs",
            new StairsBlock(
                    ModBlocks.POTASSIUM_FELDSPAR_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POTASSIUM_FELDSPAR_BRICK_SLAB = registerBlock("potassium_feldspar_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POTASSIUM_FELDSPAR_BRICK_WALL = registerBlock("potassium_feldspar_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POTASSIUM_FELDSPAR_TILES = registerBlock("potassium_feldspar_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POTASSIUM_FELDSPAR_TILE_STAIRS = registerBlock("potassium_feldspar_tile_stairs",
            new StairsBlock(
                    ModBlocks.POTASSIUM_FELDSPAR_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POTASSIUM_FELDSPAR_TILE_SLAB = registerBlock("potassium_feldspar_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block STRAW_BLOCK = registerBlock("straw_block",
            new TranslucentBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BANJO)
                            .sounds(BlockSoundGroup.GRASS)
                            .strength(0.5F)
            )
    );
    public static final Block HARZBURGITE = registerBlock("harzburgite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HARZBURGITE_STAIRS = registerBlock("harzburgite_stairs",
            new StairsBlock(
                    ModBlocks.HARZBURGITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HARZBURGITE_SLAB = registerBlock("harzburgite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_HARZBURGITE = registerBlock("polished_harzburgite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_HARZBURGITE_STAIRS = registerBlock("polished_harzburgite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_HARZBURGITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_HARZBURGITE_SLAB = registerBlock("polished_harzburgite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HARZBURGITE_BRICKS = registerBlock("harzburgite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HARZBURGITE_BRICK_STAIRS = registerBlock("harzburgite_brick_stairs",
            new StairsBlock(
                    ModBlocks.HARZBURGITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HARZBURGITE_BRICK_SLAB = registerBlock("harzburgite_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HARZBURGITE_BRICK_WALL = registerBlock("harzburgite_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOPYROXENE = registerBlock("orthopyroxene",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOPYROXENE_STAIRS = registerBlock("orthopyroxene_stairs",
            new StairsBlock(
                    ModBlocks.ORTHOPYROXENE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOPYROXENE_SLAB = registerBlock("orthopyroxene_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOPYROXENE_WALL = registerBlock("orthopyroxene_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ORTHOPYROXENE = registerBlock("polished_orthopyroxene",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ORTHOPYROXENE_STAIRS = registerBlock("polished_orthopyroxene_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_ORTHOPYROXENE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ORTHOPYROXENE_SLAB = registerBlock("polished_orthopyroxene_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_ORTHOPYROXENE = registerBlock("smooth_orthopyroxene",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_ORTHOPYROXENE_STAIRS = registerBlock("smooth_orthopyroxene_stairs",
            new StairsBlock(
                    ModBlocks.SMOOTH_ORTHOPYROXENE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_ORTHOPYROXENE_SLAB = registerBlock("smooth_orthopyroxene_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOPYROXENE_BRICKS = registerBlock("orthopyroxene_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOPYROXENE_BRICK_STAIRS = registerBlock("orthopyroxene_brick_stairs",
            new StairsBlock(
                    ModBlocks.ORTHOPYROXENE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOPYROXENE_BRICK_SLAB = registerBlock("orthopyroxene_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOPYROXENE_BRICK_WALL = registerBlock("orthopyroxene_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_DRIPSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DRIPSTONE_TILES = registerBlock("dripstone_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DRIPSTONE_TILE_STAIRS = registerBlock("dripstone_tile_stairs",
            new StairsBlock(
                    ModBlocks.DRIPSTONE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DRIPSTONE_TILE_SLAB = registerBlock("dripstone_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DRIPSTONE_BRICK_STAIRS = registerBlock("dripstone_brick_stairs",
            new StairsBlock(
                    ModBlocks.DRIPSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DRIPSTONE_BRICK_SLAB = registerBlock("dripstone_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DRIPSTONE_BRICK_WALL = registerBlock("dripstone_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DRIPSTONE_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block LIGHT_SHALE = registerBlock("light_shale",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block LIGHT_SHALE_ROCKS = registerBlock("light_shale_rocks",
            new CarpetBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.5F)
                            .nonOpaque()
            )
    );
    public static final Block DARK_SHALE = registerBlock("dark_shale",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DARK_SHALE_ROCKS = registerBlock("dark_shale_rocks",
            new CarpetBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.5F)
                            .nonOpaque()
            )
    );
    public static final Block OIL_SHALE = registerBlock("oil_shale",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block OIL_SHALE_ROCKS = registerBlock("oil_shale_rocks",
            new CarpetBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BLACK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.5F)
                            .nonOpaque()
            )
    );
    public static final Block MIXED_SHALE = registerBlock("mixed_shale",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ALBITE_FELDSPAR = registerBlock("albite_feldspar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ALBITE_FELDSPAR_STAIRS = registerBlock("albite_feldspar_stairs",
            new StairsBlock(
                    ModBlocks.ALBITE_FELDSPAR.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ALBITE_FELDSPAR_SLAB = registerBlock("albite_feldspar_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ALBITE_FELDSPAR_WALL = registerBlock("albite_feldspar_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ALBITE_FELDSPAR = registerBlock("polished_albite_feldspar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ALBITE_FELDSPAR_STAIRS = registerBlock("polished_albite_feldspar_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_ALBITE_FELDSPAR.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ALBITE_FELDSPAR_SLAB = registerBlock("polished_albite_feldspar_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ALBITE_FELDSPAR_TILES = registerBlock("albite_feldspar_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ALBITE_FELDSPAR_TILE_STAIRS = registerBlock("albite_feldspar_tile_stairs",
            new StairsBlock(
                    ModBlocks.ALBITE_FELDSPAR_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ALBITE_FELDSPAR_TILE_SLAB = registerBlock("albite_feldspar_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GIANT_PINECONE_BLOCK = registerBlock("giant_pinecone_block",
            new GlazedTerracottaBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BROWN)
                            .instrument(NoteBlockInstrument.BASS)
                            .sounds(BlockSoundGroup.WOOD)
                            .strength(2.0F, 3.0F)
                            .burnable()
            )
    );
    public static final Block GIANT_PINECONE_STAIRS = registerBlock("giant_pinecone_stairs",
            new StairsBlock(
                    ModBlocks.GIANT_PINECONE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BROWN)
                            .instrument(NoteBlockInstrument.BASS)
                            .sounds(BlockSoundGroup.WOOD)
                            .strength(2.0F, 3.0F)
                            .burnable()
            )
    );
    public static final Block GIANT_PINECONE_PEDUNCLE = registerBlock("giant_pinecone_peduncle",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BROWN)
                            .instrument(NoteBlockInstrument.BASS)
                            .sounds(BlockSoundGroup.WOOD)
                            .strength(2.0F, 3.0F)
                            .burnable()
            )
    );
    public static final Block PILE_OF_WOOD = registerBlock("pile_of_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BROWN)
                            .instrument(NoteBlockInstrument.BASS)
                            .sounds(BlockSoundGroup.WOOD)
                            .strength(2.0F, 3.0F)
                            .burnable()
            )
    );
    public static final Block JADE_ORE = registerBlock("jade_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block JADE_BLOCK = registerBlock("jade_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block JADE_BLOCK_STAIRS = registerBlock("jade_block_stairs",
            new StairsBlock(
                    ModBlocks.JADE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block JADE_BLOCK_SLAB = registerBlock("jade_block_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block JADE_BLOCK_WALL = registerBlock("jade_block_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_JADE = registerBlock("polished_jade",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_JADE_STAIRS = registerBlock("polished_jade_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_JADE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_JADE_SLAB = registerBlock("polished_jade_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block JADE_TILES = registerBlock("jade_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block JADE_TILE_STAIRS = registerBlock("jade_tile_stairs",
            new StairsBlock(
                    ModBlocks.JADE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block JADE_TILE_SLAB = registerBlock("jade_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block CRACKED_JADE_TILES = registerBlock("cracked_jade_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block CHISELED_JADE = registerBlock("chiseled_jade",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TEAL)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ANORTHITE_FELDSPAR = registerBlock("anorthite_feldspar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ANORTHITE_FELDSPAR = registerBlock("polished_anorthite_feldspar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ANORTHITE_FELDSPAR_STAIRS = registerBlock("polished_anorthite_feldspar_stairs",
            new StairsBlock(
                    ModBlocks.ANORTHITE_FELDSPAR.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ANORTHITE_FELDSPAR_SLAB = registerBlock("polished_anorthite_feldspar_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ANORTHITE_FELDSPAR_BRICKS = registerBlock("anorthite_feldspar_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ANORTHITE_FELDSPAR_BRICK_STAIRS = registerBlock("anorthite_feldspar_brick_stairs",
            new StairsBlock(
                    ModBlocks.ANORTHITE_FELDSPAR_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ANORTHITE_FELDSPAR_BRICK_SLAB = registerBlock("anorthite_feldspar_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ANORTHITE_FELDSPAR_BRICK_WALL = registerBlock("anorthite_feldspar_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block MOSSY_ANORTHITE_FELDSPAR_BRICKS = registerBlock("mossy_anorthite_feldspar_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block MOSSY_ANORTHITE_FELDSPAR_BRICK_STAIRS = registerBlock("mossy_anorthite_feldspar_brick_stairs",
            new StairsBlock(
                    ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block MOSSY_ANORTHITE_FELDSPAR_BRICK_SLAB = registerBlock("mossy_anorthite_feldspar_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block MOSSY_ANORTHITE_FELDSPAR_BRICK_WALL = registerBlock("mossy_anorthite_feldspar_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ANORTHITE_FELDSPAR_ROCKS = registerBlock("anorthite_feldspar_rocks",
            new CarpetBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.5F)
                            .nonOpaque()
            )
    );
    public static final Block TEPHRITE = registerBlock("tephrite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TEPHRITE_STAIRS = registerBlock("tephrite_stairs",
            new StairsBlock(
                    ModBlocks.TEPHRITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TEPHRITE_SLAB = registerBlock("tephrite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TEPHRITE = registerBlock("polished_tephrite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TEPHRITE_STAIRS = registerBlock("polished_tephrite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_TEPHRITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TEPHRITE_SLAB = registerBlock("polished_tephrite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TEPHRITE_WALL = registerBlock("polished_tephrite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ARKOSE = registerBlock("arkose",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ARKOSE_STAIRS = registerBlock("arkose_stairs",
            new StairsBlock(
                    ModBlocks.ARKOSE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ARKOSE_SLAB = registerBlock("arkose_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ARKOSE_BRICKS = registerBlock("arkose_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ARKOSE_BRICK_STAIRS = registerBlock("arkose_brick_stairs",
            new StairsBlock(
                    ModBlocks.ARKOSE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ARKOSE_BRICK_SLAB = registerBlock("arkose_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ARKOSE_BRICK_WALL = registerBlock("arkose_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_ARKOSE = registerBlock("polished_arkose",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ARKOSE_STAIRS = registerBlock("polished_arkose_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_ARKOSE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ARKOSE_SLAB = registerBlock("polished_arkose_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SODALITE = registerBlock("sodalite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_SODALITE = registerBlock("polished_sodalite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_SODALITE_STAIRS = registerBlock("polished_sodalite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_SODALITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_SODALITE_SLAB = registerBlock("polished_sodalite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SODALITE_BRICKS = registerBlock("sodalite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block SODALITE_BRICK_STAIRS = registerBlock("sodalite_brick_stairs",
            new StairsBlock(
                    ModBlocks.SODALITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block SODALITE_BRICK_SLAB = registerBlock("sodalite_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block SODALITE_BRICK_WALL = registerBlock("sodalite_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PEGMATITE = registerBlock("pegmatite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PEGMATITE_STAIRS = registerBlock("pegmatite_stairs",
            new StairsBlock(
                    ModBlocks.PEGMATITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PEGMATITE_SLAB = registerBlock("pegmatite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PEGMATITE_WALL = registerBlock("pegmatite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PEGMATITE = registerBlock("polished_pegmatite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_PEGMATITE_STAIRS = registerBlock("polished_pegmatite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_PEGMATITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PEGMATITE_SLAB = registerBlock("polished_pegmatite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PEGMATITE_BRICKS = registerBlock("pegmatite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PEGMATITE_BRICK_STAIRS = registerBlock("pegmatite_brick_stairs",
            new StairsBlock(
                    ModBlocks.PEGMATITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PEGMATITE_BRICK_SLAB = registerBlock("pegmatite_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PEGMATITE_TILES = registerBlock("pegmatite_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PEGMATITE_TILE_STAIRS = registerBlock("pegmatite_tile_stairs",
            new StairsBlock(
                    ModBlocks.PEGMATITE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PEGMATITE_TILE_SLAB = registerBlock("pegmatite_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMALL_PEGMATITE_BRICKS = registerBlock("small_pegmatite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block SMALL_PEGMATITE_BRICK_STAIRS = registerBlock("small_pegmatite_brick_stairs",
            new StairsBlock(
                    ModBlocks.SMALL_PEGMATITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMALL_PEGMATITE_BRICK_SLAB = registerBlock("small_pegmatite_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMALL_PEGMATITE_BRICK_WALL = registerBlock("small_pegmatite_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.SPRUCE_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block THULITE = registerBlock("thulite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block THULITE_STAIRS = registerBlock("thulite_stairs",
            new StairsBlock(
                    ModBlocks.THULITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block THULITE_SLAB = registerBlock("thulite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block THULITE_WALL = registerBlock("thulite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_THULITE = registerBlock("polished_thulite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_THULITE_STAIRS = registerBlock("polished_thulite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_THULITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_THULITE_SLAB = registerBlock("polished_thulite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block THULITE_BRICKS = registerBlock("thulite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block THULITE_BRICK_STAIRS = registerBlock("thulite_brick_stairs",
            new StairsBlock(
                    ModBlocks.THULITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block THULITE_BRICK_SLAB = registerBlock("thulite_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RAPAKIVI = registerBlock("rapakivi",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block RAPAKIVI_STAIRS = registerBlock("rapakivi_stairs",
            new StairsBlock(
                    ModBlocks.RAPAKIVI.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RAPAKIVI_SLAB = registerBlock("rapakivi_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RAPAKIVI_WALL = registerBlock("rapakivi_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RAPAKIVI = registerBlock("polished_rapakivi",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_RAPAKIVI_STAIRS = registerBlock("polished_rapakivi_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_RAPAKIVI.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RAPAKIVI_SLAB = registerBlock("polished_rapakivi_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RAPAKIVI_BRICKS = registerBlock("rapakivi_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block RAPAKIVI_BRICK_STAIRS = registerBlock("rapakivi_brick_stairs",
            new StairsBlock(
                    ModBlocks.RAPAKIVI_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RAPAKIVI_BRICK_SLAB = registerBlock("rapakivi_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ROSE_QUARTZ_ORE = registerBlock("rose_quartz_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block RAW_ROSE_QUARTZ = registerBlock("raw_rose_quartz",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block RAW_ROSE_QUARTZ_STAIRS = registerBlock("raw_rose_quartz_stairs",
            new StairsBlock(
                    ModBlocks.RAW_ROSE_QUARTZ.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RAW_ROSE_QUARTZ_SLAB = registerBlock("raw_rose_quartz_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RAW_ROSE_QUARTZ_WALL = registerBlock("raw_rose_quartz_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ROSE_QUARTZ = registerBlock("polished_rose_quartz",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_ROSE_QUARTZ_STAIRS = registerBlock("polished_rose_quartz_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_ROSE_QUARTZ.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ROSE_QUARTZ_SLAB = registerBlock("polished_rose_quartz_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LATERITE_SOIL = registerBlock("laterite_soil",
            new ColoredFallingBlock(
                    new ColorCode(11098145),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.ORANGE)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.5F)
                            .sounds(BlockSoundGroup.SAND)
            )
    );
    public static final Block LATERITE_ROCK = registerBlock("laterite_rock",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block LATERITE_ROCK_STAIRS = registerBlock("laterite_rock_stairs",
            new StairsBlock(
                    ModBlocks.LATERITE_ROCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LATERITE_ROCK_SLAB = registerBlock("laterite_rock_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LATERITE_ROCK_WALL = registerBlock("laterite_rock_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_LATERITE_ROCK = registerBlock("polished_laterite_rock",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_LATERITE_ROCK_STAIRS = registerBlock("polished_laterite_rock_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_LATERITE_ROCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_LATERITE_ROCK_SLAB = registerBlock("polished_laterite_rock_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BLUE_CANDY_CANE = registerBlock("blue_candy_cane",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.XYLOPHONE)
                            .sounds(BlockSoundGroup.BONE)
                            .strength(2.0F, 3.0F)
            )
    );
    public static final Block RED_CANDY_CANE = registerBlock("red_candy_cane",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.XYLOPHONE)
                            .sounds(BlockSoundGroup.BONE)
                            .strength(2.0F, 3.0F)
            )
    );
    public static final Block DUMORTIERITE = registerBlock("dumortierite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_DUMORTIERITE = registerBlock("polished_dumortierite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_DUMORTIERITE_STAIRS = registerBlock("polished_dumortierite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_DUMORTIERITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_DUMORTIERITE_SLAB = registerBlock("polished_dumortierite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_DUMORTIERITE_WALL = registerBlock("polished_dumortierite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_DUMORTIERITE = registerBlock("smooth_dumortierite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block SMOOTH_DUMORTIERITE_STAIRS = registerBlock("smooth_dumortierite_stairs",
            new StairsBlock(
                    ModBlocks.SMOOTH_DUMORTIERITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_DUMORTIERITE_SLAB = registerBlock("smooth_dumortierite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DUMORTIERITE_QUARTZ = registerBlock("dumortierite_quartz",
            new DeadCoralBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_BLUE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.GLASS)
                            .requiresTool()
                            .nonOpaque()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .strength(1.5F, 6.0F)
                            .dynamicBounds()
            )
    );
    public static final Block GREENSCHIST = registerBlock("greenschist",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GREENSCHIST_STAIRS = registerBlock("greenschist_stairs",
            new StairsBlock(
                    ModBlocks.GREENSCHIST.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GREENSCHIST_SLAB = registerBlock("greenschist_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GREENSCHIST_WALL = registerBlock("greenschist_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GREENSCHIST = registerBlock("polished_greenschist",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GREENSCHIST_STAIRS = registerBlock("polished_greenschist_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_GREENSCHIST.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GREENSCHIST_SLAB = registerBlock("polished_greenschist_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHISELED_GREENSCHIST = registerBlock("chiseled_greenschist",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SUGAR_MAPLE_LOG = registerBlock("sugar_maple_log",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.OAK_TAN : MapColor.GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block SUGAR_MAPLE_WOOD = registerBlock("sugar_maple_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block STRIPPED_SUGAR_MAPLE_LOG = registerBlock("stripped_sugar_maple_log",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block STRIPPED_SUGAR_MAPLE_WOOD = registerBlock("stripped_sugar_maple_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block SUGAR_MAPLE_PLANKS = registerBlock("sugar_maple_planks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block SUGAR_MAPLE_STAIRS = registerBlock("sugar_maple_stairs",
            new StairsBlock(
                    ModBlocks.SUGAR_MAPLE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block SUGAR_MAPLE_SLAB = registerBlock("sugar_maple_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block SUGAR_MAPLE_FENCE = registerBlock("sugar_maple_fence",
            new FenceBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block SUGAR_MAPLE_FENCE_GATE = registerBlock("sugar_maple_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block SUGAR_MAPLE_DOOR = registerBlock("sugar_maple_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .nonOpaque()
            )
    );
    public static final Block SUGAR_MAPLE_TRAPDOOR = registerBlock("sugar_maple_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .nonOpaque()
            )
    );
    public static final Block SUGAR_MAPLE_PRESSURE_PLATE = registerBlock("sugar_maple_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block SUGAR_MAPLE_BUTTON = registerBlock("sugar_maple_button",
            new ButtonBlock(BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .noCollision()
            )
    );
    public static final Block SUGAR_MAPLE_LEAVES = registerBlock("sugar_maple_leaves",
            new LeavesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .strength(0.2F)
                            .ticksRandomly()
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
            )
    );
    public static final Block SUGAR_MAPLE_SAPLING = registerBlock("sugar_maple_sapling",
            new SaplingBlock(
                    ModSaplingGenerators.SUGAR_MAPLE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block CHAROITE_ORE = registerBlock("charoite_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(1, 3),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.0F, 3.0F)
            )
    );
    public static final Block CHAROITE_BLOCK = registerBlock("charoite_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block CHAROITE_STAIRS = registerBlock("charoite_stairs",
            new StairsBlock(
                    ModBlocks.CHAROITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHAROITE_SLAB = registerBlock("charoite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHAROITE_WALL = registerBlock("charoite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHAROITE = registerBlock("polished_charoite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_CHAROITE_STAIRS = registerBlock("polished_charoite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_CHAROITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHAROITE_SLAB = registerBlock("polished_charoite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PURPLE)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE = registerBlock("rhyolite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE_STAIRS = registerBlock("rhyolite_stairs",
            new StairsBlock(
                    ModBlocks.RHYOLITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE_SLAB = registerBlock("rhyolite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE_BRICKS = registerBlock("rhyolite_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE_BRICK_STAIRS = registerBlock("rhyolite_brick_stairs",
            new StairsBlock(
                    ModBlocks.RHYOLITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE_BRICK_SLAB = registerBlock("rhyolite_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE_BRICK_WALL = registerBlock("rhyolite_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RHYOLITE = registerBlock("polished_rhyolite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RHYOLITE_STAIRS = registerBlock("polished_rhyolite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_RHYOLITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RHYOLITE_SLAB = registerBlock("polished_rhyolite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE_TILES = registerBlock("rhyolite_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RHYOLITE_TILE_STAIRS = registerBlock("rhyolite_tile_stairs",
            new StairsBlock(
                    ModBlocks.RHYOLITE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );    public static final Block RHYOLITE_TILE_SLAB = registerBlock("rhyolite_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DULL_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );

    public static final Block WHITE_PINE_LOG = registerBlock("white_pine_log",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.PALE_YELLOW : MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block WHITE_PINE_WOOD = registerBlock("white_pine_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block STRIPPED_WHITE_PINE_LOG = registerBlock("stripped_white_pine_log",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block STRIPPED_WHITE_PINE_WOOD = registerBlock("stripped_white_pine_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block WHITE_PINE_PLANKS = registerBlock("white_pine_planks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block WHITE_PINE_STAIRS = registerBlock("white_pine_stairs",
            new StairsBlock(
                    ModBlocks.WHITE_PINE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block WHITE_PINE_SLAB = registerBlock("white_pine_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block WHITE_PINE_FENCE = registerBlock("white_pine_fence",
            new FenceBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block WHITE_PINE_FENCE_GATE = registerBlock("white_pine_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block WHITE_PINE_DOOR = registerBlock("white_pine_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .nonOpaque()
            )
    );
    public static final Block WHITE_PINE_TRAPDOOR = registerBlock("white_pine_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .nonOpaque()
            )
    );
    public static final Block WHITE_PINE_PRESSURE_PLATE = registerBlock("white_pine_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block WHITE_PINE_BUTTON = registerBlock("white_pine_button",
            new ButtonBlock(BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .noCollision()
            )
    );
    public static final Block WHITE_PINE_LEAVES = registerBlock("white_pine_leaves",
            new LeavesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .strength(0.2F)
                            .ticksRandomly()
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
            )
    );
    public static final Block WHITE_PINE_SAPLING = registerBlock("white_pine_sapling",
            new SaplingBlock(
                    ModSaplingGenerators.WHITE_PINE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block ORNATE_PICTURE_WINDOW = registerBlock("ornate_picture_window",
            new TransparentBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );
    public static final Block LARGE_PICTURE_WINDOW_BOTTOM = registerBlock("large_picture_window_bottom",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );
    public static final Block LARGE_PICTURE_WINDOW_MIDDLE = registerBlock("large_picture_window_middle",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );
    public static final Block LARGE_PICTURE_WINDOW_TOP = registerBlock("large_picture_window_top",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
            )
    );
    public static final Block GLACIAL_TILL = registerBlock("glacial_till",
            new ColoredFallingBlock(
                    new ColorCode(-8356741),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.5F)
                            .sounds(BlockSoundGroup.GRAVEL)
            )
    );

    public static final Block TUFFACIOUS_CLAY = registerBlock("tuffacious_clay",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.FLUTE)
                            .sounds(BlockSoundGroup.GRAVEL)
                            .requiresTool()
                            .strength(0.6F)
            )
    );
    public static final Block TUFFACIOUS_CLAY_BRICKS = registerBlock("tuffacious_clay_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TUFFACIOUS_CLAY_BRICK_STAIRS = registerBlock("tuffacious_clay_brick_stairs",
            new StairsBlock(
                    ModBlocks.TUFFACIOUS_CLAY_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TUFFACIOUS_CLAY_BRICK_SLAB = registerBlock("tuffacious_clay_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TUFFACIOUS_CLAY_BRICK_WALL = registerBlock("tuffacious_clay_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OOLITE = registerBlock("oolite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OOLITE_STAIRS = registerBlock("oolite_stairs",
            new StairsBlock(
                    ModBlocks.OOLITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block OOLITE_SLAB = registerBlock("oolite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_OOLITE = registerBlock("polished_oolite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_OOLITE_STAIRS = registerBlock("polished_oolite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_OOLITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_OOLITE_SLAB = registerBlock("polished_oolite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_OOLITE_WALL = registerBlock("polished_oolite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PALE_YELLOW)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PORPHYRY = registerBlock("porphyry",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PORPHYRY_STAIRS = registerBlock("porphyry_stairs",
            new StairsBlock(
                    ModBlocks.PORPHYRY.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PORPHYRY_SLAB = registerBlock("porphyry_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PORPHYRY_BRICKS = registerBlock("porphyry_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PORPHYRY_BRICK_STAIRS = registerBlock("porphyry_brick_stairs",
            new StairsBlock(
                    ModBlocks.PORPHYRY_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PORPHYRY_BRICK_SLAB = registerBlock("porphyry_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block PORPHYRY_BRICK_WALL = registerBlock("porphyry_brick_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block POLISHED_PORPHYRY = registerBlock("polished_porphyry",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PORPHYRY_STAIRS = registerBlock("polished_porphyry_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_PORPHYRY.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PORPHYRY_SLAB = registerBlock("polished_porphyry_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block LARIMAR = registerBlock("larimar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_AQUA)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .strength(0.5F)
            )
    );
    public static final Block LARIMAR_STAIRS = registerBlock("larimar_stairs",
            new StairsBlock(
                    ModBlocks.LARIMAR.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_AQUA)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .strength(0.5F)
            )
    );
    public static final Block LARIMAR_SLAB = registerBlock("larimar_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_AQUA)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .strength(0.5F)
            )
    );
    public static final Block LARIMAR_WALL = registerBlock("larimar_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_AQUA)
                            .instrument(NoteBlockInstrument.CHIME)
                            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                            .strength(0.5F)
            )
    );
    public static final Block PIGEONITE = registerBlock("pigeonite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PIGEONITE_STAIRS = registerBlock("pigeonite_stairs",
            new StairsBlock(
                    ModBlocks.PIGEONITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PIGEONITE_SLAB = registerBlock("pigeonite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PIGEONITE_WALL = registerBlock("pigeonite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PIGEONITE = registerBlock("polished_pigeonite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PIGEONITE_STAIRS = registerBlock("polished_pigeonite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_PIGEONITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PIGEONITE_SLAB = registerBlock("polished_pigeonite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PIGEONITE_TILES = registerBlock("pigeonite_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PIGEONITE_TILE_STAIRS = registerBlock("pigeonite_tile_stairs",
            new StairsBlock(
                    ModBlocks.PIGEONITE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );    public static final Block PIGEONITE_TILE_SLAB = registerBlock("pigeonite_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block YEW_LOG = registerBlock("yew_log",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.TERRACOTTA_GRAY : MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block YEW_WOOD = registerBlock("yew_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block STRIPPED_YEW_LOG = registerBlock("stripped_yew_log",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block STRIPPED_YEW_WOOD = registerBlock("stripped_yew_wood",
            new PillarBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block YEW_PLANKS = registerBlock("yew_planks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block YEW_STAIRS = registerBlock("yew_stairs",
            new StairsBlock(
                    ModBlocks.YEW_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block YEW_SLAB = registerBlock("yew_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block YEW_FENCE = registerBlock("yew_fence",
            new FenceBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block YEW_FENCE_GATE = registerBlock("yew_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block YEW_DOOR = registerBlock("yew_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .nonOpaque()
            )
    );
    public static final Block YEW_TRAPDOOR = registerBlock("yew_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .nonOpaque()
            )
    );
    public static final Block YEW_PRESSURE_PLATE = registerBlock("yew_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
            )
    );
    public static final Block YEW_BUTTON = registerBlock("yew_button",
            new ButtonBlock(BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .strength(2.0F, 3.0F)
                            .sounds(BlockSoundGroup.WOOD)
                            .burnable()
                            .noCollision()
            )
    );
    public static final Block YEW_LEAVES = registerBlock("yew_leaves",
            new LeavesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .strength(0.2F)
                            .ticksRandomly()
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
            )
    );
    public static final Block YEW_SAPLING = registerBlock("yew_sapling",
            new SaplingBlock(
                    ModSaplingGenerators.YEW,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block GRAY_SILTSTONE = registerBlock("gray_siltstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GRAY_SILTSTONE_STAIRS = registerBlock("gray_siltstone_stairs",
            new StairsBlock(
                    ModBlocks.GRAY_SILTSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GRAY_SILTSTONE_SLAB = registerBlock("gray_siltstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GRAY_SILTSTONE = registerBlock("polished_gray_siltstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GRAY_SILTSTONE_STAIRS = registerBlock("polished_gray_siltstone_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_GRAY_SILTSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GRAY_SILTSTONE_SLAB = registerBlock("polished_gray_siltstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GRAY_SILTSTONE_WALL = registerBlock("polished_gray_siltstone_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BUFF_SILTSTONE = registerBlock("buff_siltstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BUFF_SILTSTONE_STAIRS = registerBlock("buff_siltstone_stairs",
            new StairsBlock(
                    ModBlocks.BUFF_SILTSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BUFF_SILTSTONE_SLAB = registerBlock("buff_siltstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BUFF_SILTSTONE = registerBlock("polished_buff_siltstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BUFF_SILTSTONE_STAIRS = registerBlock("polished_buff_siltstone_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_BUFF_SILTSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BUFF_SILTSTONE_SLAB = registerBlock("polished_buff_siltstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BUFF_SILTSTONE_WALL = registerBlock("polished_buff_siltstone_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RED_SILTSTONE = registerBlock("red_siltstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RED_SILTSTONE_STAIRS = registerBlock("red_siltstone_stairs",
            new StairsBlock(
                    ModBlocks.RED_SILTSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block RED_SILTSTONE_SLAB = registerBlock("red_siltstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RED_SILTSTONE = registerBlock("polished_red_siltstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RED_SILTSTONE_STAIRS = registerBlock("polished_red_siltstone_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_RED_SILTSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RED_SILTSTONE_SLAB = registerBlock("polished_red_siltstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_RED_SILTSTONE_WALL = registerBlock("polished_red_siltstone_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BURGUNDY_SILTSTONE = registerBlock("burgundy_siltstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BURGUNDY_SILTSTONE_STAIRS = registerBlock("burgundy_siltstone_stairs",
            new StairsBlock(
                    ModBlocks.BURGUNDY_SILTSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block BURGUNDY_SILTSTONE_SLAB = registerBlock("burgundy_siltstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );

    public static final Block POLISHED_BURGUNDY_SILTSTONE = registerBlock("polished_burgundy_siltstone",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BURGUNDY_SILTSTONE_STAIRS = registerBlock("polished_burgundy_siltstone_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_BURGUNDY_SILTSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BURGUNDY_SILTSTONE_SLAB = registerBlock("polished_burgundy_siltstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_BURGUNDY_SILTSTONE_WALL = registerBlock("polished_burgundy_siltstone_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_RED)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PARRADIO = registerBlock("parradio",
            new ParradioBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(0.5F, 3.0F)
                            .nonOpaque()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block BLAHAJ = registerBlock("blahaj",
            new BlahajBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WATER_BLUE)
                            .instrument(NoteBlockInstrument.GUITAR)
                            .strength(0.8F)
                            .nonOpaque()
                            .sounds(BlockSoundGroup.WOOL)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block TETO_PLUSHIE = registerBlock("teto_plushie",
            new TetoBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BRIGHT_RED)
                            .instrument(NoteBlockInstrument.FLUTE)
                            .strength(0.8F)
                            .nonOpaque()
                            .sounds(BlockSoundGroup.WOOL)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block GUMI_PLUSHIE = registerBlock("gumi_plushie",
            new TetoBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.EMERALD_GREEN)
                            .instrument(NoteBlockInstrument.FLUTE)
                            .strength(0.8F)
                            .nonOpaque()
                            .sounds(BlockSoundGroup.WOOL)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block BLOCK_OF_RUBBLE = registerBlock("block_of_rubble",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BROWN)
                            .sounds(BlockSoundGroup.WOOD)
                            .instrument(NoteBlockInstrument.BASS)
                            .strength(0.8F, -1.0F)
            )
    );
    public static final Block BRAMBLES = registerBlock("brambles",
            new BramblesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.BROWN)
                            .strength(2.5F, 1.0F)
                            .sounds(BlockSoundGroup.SWEET_BERRY_BUSH)
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .noCollision()
            )
    );
    public static final Block TRAVERTINE = registerBlock("travertine",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TRAVERTINE_STAIRS = registerBlock("travertine_stairs",
            new StairsBlock(
                    ModBlocks.TRAVERTINE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TRAVERTINE_SLAB = registerBlock("travertine_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TRAVERTINE_WALL = registerBlock("travertine_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );

    public static final Block POLISHED_TRAVERTINE = registerBlock("polished_travertine",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TRAVERTINE_STAIRS = registerBlock("polished_travertine_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_TRAVERTINE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TRAVERTINE_SLAB = registerBlock("polished_travertine_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMALL_FORSYTHIA_LOG = registerBlock("small_forsythia_log",
            new TubeBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASS)
                            .sounds(BlockSoundGroup.WOOD)
                            .ticksRandomly()
                            .strength(2.0F, 3.0F)
                            .nonOpaque()
            )
    );
    public static final Block FORSYTHIA_FLOWERS = registerBlock("forsythia_flowers",
            new LeavesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.YELLOW)
                            .strength(0.2F)
                            .ticksRandomly()
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
            )
    );
    public static final Block FORSYTHIA_SAPLING = registerBlock("forsythia_sapling",
            new SaplingBlock(
                    ModSaplingGenerators.FORSYTHIA,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block PINK_CLAY_ROOF_TILES = registerBlock("pink_clay_roof_tiles",
            new GlazedTerracottaBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DECORATED_POT)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_CLAY_ROOF_TILE_STAIRS = registerBlock("pink_clay_roof_tile_stairs",
            new StairsBlock(
                    ModBlocks.PINK_CLAY_ROOF_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DECORATED_POT)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PINK_CLAY_ROOF_TILE_SLAB = registerBlock("pink_clay_roof_tile_slab",
            new DirectionalSlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.DECORATED_POT)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block MAGIC = registerBlock("magic",
            new MagicBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .sounds(BlockSoundGroup.SLIME)
                            .breakInstantly()
            )
    );
    public static final Block SMALL_JAPANESE_MAPLE_LOG = registerBlock("small_japanese_maple_log",
            new TubeBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_CRIMSON)
                            .instrument(NoteBlockInstrument.BASS)
                            .sounds(BlockSoundGroup.WOOD)
                            .strength(2.0F, 3.0F)
                            .nonOpaque()
            )
    );
    public static final Block JAPANESE_MAPLE_LEAVES = registerBlock("japanese_maple_leaves",
            new LeavesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_RED)
                            .strength(0.2F)
                            .ticksRandomly()
                            .sounds(BlockSoundGroup.GRASS)
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)
            )
    );
    public static final Block JAPANESE_MAPLE_SAPLING = registerBlock("japanese_maple_sapling",
            new SaplingBlock(
                    ModSaplingGenerators.JAPANESE_MAPLE,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block TRACHYANDESITE = registerBlock("trachyandesite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TRACHYANDESITE_STAIRS = registerBlock("trachyandesite_stairs",
            new StairsBlock(
                    ModBlocks.TRACHYANDESITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TRACHYANDESITE_SLAB = registerBlock("trachyandesite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TRACHYANDESITE_WALL = registerBlock("trachyandesite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TRACHYANDESITE = registerBlock("polished_trachyandesite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TRACHYANDESITE_STAIRS = registerBlock("polished_trachyandesite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_TRACHYANDESITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_TRACHYANDESITE_SLAB = registerBlock("polished_trachyandesite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PICRITE_BASALT = registerBlock("picrite_basalt",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PICRITE_BASALT_STAIRS = registerBlock("picrite_basalt_stairs",
            new StairsBlock(
                    ModBlocks.PICRITE_BASALT.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PICRITE_BASALT_SLAB = registerBlock("picrite_basalt_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PICRITE_BASALT_WALL = registerBlock("picrite_basalt_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PICRITE_BASALT = registerBlock("polished_picrite_basalt",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PICRITE_BASALT_STAIRS = registerBlock("polished_picrite_basalt_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_PICRITE_BASALT.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PICRITE_BASALT_SLAB = registerBlock("polished_picrite_basalt_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_PICRITE_BASALT_WALL = registerBlock("polished_picrite_basalt_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CATTAILS = registerBlock("cattails",
            new AmphibiousTallPlantBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block CHLORAPATITE = registerBlock("chlorapatite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHLORAPATITE_STAIRS = registerBlock("chlorapatite_stairs",
            new StairsBlock(
                    ModBlocks.CHLORAPATITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHLORAPATITE_SLAB = registerBlock("chlorapatite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHLORAPATITE = registerBlock("polished_chlorapatite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHLORAPATITE_STAIRS = registerBlock("polished_chlorapatite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_CHLORAPATITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHLORAPATITE_SLAB = registerBlock("polished_chlorapatite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_CHLORAPATITE_WALL = registerBlock("polished_chlorapatite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block EXTRA_POLISHED_CHLORAPATITE = registerBlock("extra_polished_chlorapatite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LICHEN_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block EXTRA_POLISHED_CHLORAPATITE_STAIRS = registerBlock("extra_polished_chlorapatite_stairs",
            new StairsBlock(
                    ModBlocks.EXTRA_POLISHED_CHLORAPATITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LICHEN_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block EXTRA_POLISHED_CHLORAPATITE_SLAB = registerBlock("extra_polished_chlorapatite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LICHEN_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block EXTRA_POLISHED_CHLORAPATITE_WALL = registerBlock("extra_polished_chlorapatite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.LICHEN_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FULLY_POLISHED_CHLORAPATITE = registerBlock("fully_polished_chlorapatite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FULLY_POLISHED_CHLORAPATITE_STAIRS = registerBlock("fully_polished_chlorapatite_stairs",
            new StairsBlock(
                    ModBlocks.FULLY_POLISHED_CHLORAPATITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FULLY_POLISHED_CHLORAPATITE_SLAB = registerBlock("fully_polished_chlorapatite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FULLY_POLISHED_CHLORAPATITE_WALL = registerBlock("fully_polished_chlorapatite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SHORT_STINGING_NETTLE = registerBlock("short_stinging_nettle",
            new ShortEffectPlantBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .replaceable()
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XYZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block TALL_STINGING_NETTLE = registerBlock("tall_stinging_nettle",
            new TallEffectPlantBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .replaceable()
                            .noCollision()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.GRASS)
                            .offset(AbstractBlock.OffsetType.XZ)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );
    public static final Block FEATHER_BLOCK = registerBlock("feather_block",
            new NoFallDamageBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WHITE)
                            .instrument(NoteBlockInstrument.GUITAR)
                            .sounds(BlockSoundGroup.WOOL)
                            .strength(0.5F)
            )
    );
    public static final Block STONE_SHELL_PAVEMENT = registerBlock("stone_shell_pavement",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block TRACHYANDESITE_SHELL_PAVEMENT = registerBlock("trachyandesite_shell_pavement",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block PERIDOTITE_SHELL_PAVEMENT = registerBlock("peridotite_shell_pavement",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DIRT_BROWN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block CHLORAPATITE_SHELL_PAVEMENT = registerBlock("chlorapatite_shell_pavement",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OFF_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DACITE = registerBlock("dacite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block DACITE_STAIRS = registerBlock("dacite_stairs",
            new StairsBlock(
                    ModBlocks.DACITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DACITE_SLAB = registerBlock("dacite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DACITE_WALL = registerBlock("dacite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_DACITE = registerBlock("polished_dacite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_DACITE_STAIRS = registerBlock("polished_dacite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_DACITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_DACITE_SLAB = registerBlock("polished_dacite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DACITE_TILES = registerBlock("dacite_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DACITE_TILE_STAIRS = registerBlock("dacite_tile_stairs",
            new StairsBlock(
                    ModBlocks.DACITE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block DACITE_TILE_SLAB = registerBlock("dacite_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HYDROXYLAPATITE = registerBlock("hydroxylapatite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block HYDROXYLAPATITE_STAIRS = registerBlock("hydroxylapatite_stairs",
            new StairsBlock(
                    ModBlocks.HYDROXYLAPATITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HYDROXYLAPATITE_SLAB = registerBlock("hydroxylapatite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_HYDROXYLAPATITE = registerBlock("polished_hydroxylapatite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_HYDROXYLAPATITE_STAIRS = registerBlock("polished_hydroxylapatite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_HYDROXYLAPATITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_HYDROXYLAPATITE_SLAB = registerBlock("polished_hydroxylapatite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_HYDROXYLAPATITE_WALL = registerBlock("polished_hydroxylapatite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HYDROXYLAPATITE_TILES = registerBlock("hydroxylapatite_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HYDROXYLAPATITE_TILE_STAIRS = registerBlock("hydroxylapatite_tile_stairs",
            new StairsBlock(
                    ModBlocks.HYDROXYLAPATITE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HYDROXYLAPATITE_TILE_SLAB = registerBlock("hydroxylapatite_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HYDROXYLAPATITE_SHELL_PAVEMENT = registerBlock("hydroxylapatite_shell_pavement",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.OAK_TAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block WROUGHT_IRON_FENCE = registerBlock("wrought_iron_fence",
            new FenceWithSpikesBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                            .requiresTool()
                            .strength(5.0F, 6.0F)
                            .sounds(BlockSoundGroup.METAL)
                            .nonOpaque()
            )
    );
    public static final Block FOYAITE = registerBlock("foyaite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block FOYAITE_STAIRS = registerBlock("foyaite_stairs",
            new StairsBlock(
                    ModBlocks.FOYAITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FOYAITE_SLAB = registerBlock("foyaite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FOYAITE_WALL = registerBlock("foyaite_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_FOYAITE = registerBlock("polished_foyaite",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_FOYAITE_STAIRS = registerBlock("polished_foyaite_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_FOYAITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_FOYAITE_SLAB = registerBlock("polished_foyaite_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FOYAITE_TILES = registerBlock("foyaite_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FOYAITE_TILE_STAIRS = registerBlock("foyaite_tile_stairs",
            new StairsBlock(
                    ModBlocks.FOYAITE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FOYAITE_TILE_SLAB = registerBlock("foyaite_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.RAW_IRON_PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GABBRO = registerBlock("gabbro",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GABBRO_STAIRS = registerBlock("gabbro_stairs",
            new StairsBlock(
                    ModBlocks.GABBRO.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GABBRO_SLAB = registerBlock("gabbro_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GABBRO_WALL = registerBlock("gabbro_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GABBRO = registerBlock("polished_gabbro",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GABBRO_STAIRS = registerBlock("polished_gabbro_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_GABBRO.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_GABBRO_SLAB = registerBlock("polished_gabbro_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GABBRO_BRICKS = registerBlock("gabbro_bricks",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GABBRO_BRICK_STAIRS = registerBlock("gabbro_brick_stairs",
            new StairsBlock(
                    ModBlocks.GABBRO_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block GABBRO_BRICK_SLAB = registerBlock("gabbro_brick_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FLOWSTONE = registerBlock("flowstone",
            new FlowstoneBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
                            .nonOpaque()
            )
    );
    public static final Block FLOWSTONE_BLOCK = registerBlock("flowstone_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FLOWSTONE_STAIRS = registerBlock("flowstone_stairs",
            new StairsBlock(
                    ModBlocks.FLOWSTONE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FLOWSTONE_SLAB = registerBlock("flowstone_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block FLOWSTONE_WALL = registerBlock("flowstone_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_WHITE)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block HYDROTHERMAL_VENT = registerBlock("hydrothermal_vent",
            new HydrothermalVentBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DEEPSLATE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(0.5F, 3.0F)
                            .noCollision()
            )
    );
    public static final Block HYDROTHERMAL_PLUME = registerBlock("hydrothermal_plume",
            new HydrothermalPlumeBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.WATER_BLUE)
                            .replaceable()
                            .noCollision()
                            .dropsNothing()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .liquid()
                            .sounds(BlockSoundGroup.INTENTIONALLY_EMPTY)
            )
    );
    public static final Block MICROCLINE = registerBlock("microcline",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_MICROCLINE = registerBlock("polished_microcline",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_MICROCLINE_STAIRS = registerBlock("polished_microcline_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_MICROCLINE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_MICROCLINE_SLAB = registerBlock("polished_microcline_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_MICROCLINE = registerBlock("smooth_microcline",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_MICROCLINE_STAIRS = registerBlock("smooth_microcline_stairs",
            new StairsBlock(
                    ModBlocks.SMOOTH_MICROCLINE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_MICROCLINE_SLAB = registerBlock("smooth_microcline_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block SMOOTH_MICROCLINE_WALL = registerBlock("smooth_microcline_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CYAN)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOCLASE_FELDSPAR = registerBlock("orthoclase_feldspar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 1.0F)
            )
    );
    public static final Block ORTHOCLASE_FELDSPAR_STAIRS = registerBlock("orthoclase_feldspar_stairs",
            new StairsBlock(
                    ModBlocks.ORTHOCLASE_FELDSPAR.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOCLASE_FELDSPAR_SLAB = registerBlock("orthoclase_feldspar_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOCLASE_FELDSPAR_WALL = registerBlock("orthoclase_feldspar_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ORTHOCLASE_FELDSPAR = registerBlock("polished_orthoclase_feldspar",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ORTHOCLASE_FELDSPAR_STAIRS = registerBlock("polished_orthoclase_feldspar_stairs",
            new StairsBlock(
                    ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block POLISHED_ORTHOCLASE_FELDSPAR_SLAB = registerBlock("polished_orthoclase_feldspar_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOCLASE_FELDSPAR_TILES = registerBlock("orthoclase_feldspar_tiles",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOCLASE_FELDSPAR_TILE_STAIRS = registerBlock("orthoclase_feldspar_tile_stairs",
            new StairsBlock(
                    ModBlocks.ORTHOCLASE_FELDSPAR_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block ORTHOCLASE_FELDSPAR_TILE_SLAB = registerBlock("orthoclase_feldspar_tile_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block KHEWRA_SALT_BLOCK = registerBlock("khewra_salt_block",
            new Block(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block KHEWRA_SALT_STAIRS = registerBlock("khewra_salt_stairs",
            new StairsBlock(
                    ModBlocks.KHEWRA_SALT_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block KHEWRA_SALT_SLAB = registerBlock("khewra_salt_slab",
            new SlabBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );
    public static final Block KHEWRA_SALT_WALL = registerBlock("khewra_salt_wall",
            new WallBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.PINK)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(1.5F, 6.0F)
            )
    );


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AntisolarBlocks.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AntisolarBlocks.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AntisolarBlocks.LOGGER.info("Registering Mod Blocks for " + AntisolarBlocks.MOD_ID);
    }
}
