package net.parra.antisolarblocks.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.entity.custom.GiantPotBlockEntity;
import net.parra.antisolarblocks.entity.custom.ParradioBlockEntity;
import net.parra.antisolarblocks.entity.custom.PotteryKilnBlockEntity;
import net.parra.antisolarblocks.entity.custom.TetoHoldingBlockEntity;

public class ModBlockEntities {


    public static final BlockEntityType<PotteryKilnBlockEntity> POTTERY_KILN_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(AntisolarBlocks.MOD_ID, "pottery_kiln_be"),
                    BlockEntityType.Builder.create(PotteryKilnBlockEntity::new, ModBlocks.POTTERY_KILN).build(null));

    public static final BlockEntityType<TetoHoldingBlockEntity> HOLDING_BE = createHoldingBe();
    public static final BlockEntityType<GiantPotBlockEntity> SOIL_BE = createSoilBe();
    public static final BlockEntityType<ParradioBlockEntity> PARRADIO_BE = createParradioBe();

    private static BlockEntityType<TetoHoldingBlockEntity> createHoldingBe() {
        return Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(AntisolarBlocks.MOD_ID, "holding_be"),
                FabricBlockEntityTypeBuilder.create(
                        (pos, state) -> new TetoHoldingBlockEntity(HOLDING_BE, pos, state),
                        ModBlocks.TETO_PLUSHIE,
                        ModBlocks.MIKU_PLUSHIE,
                        ModBlocks.FIREWORK_MIKU_PLUSHIE,
                        ModBlocks.CHERRY_MIKU_PLUSHIE,
                        ModBlocks.AKITA_NERU_PLUSHIE,
                        ModBlocks.LUKA_PLUSHIE,
                        ModBlocks.MEIKO_PLUSHIE,
                        ModBlocks.KAITO_PLUSHIE,
                        ModBlocks.GUMI_PLUSHIE,
                        ModBlocks.OSAGE_CHAN_PLUSHIE,
                        ModBlocks.FAUST_PLUSHIE,
                        ModBlocks.PEARTO_PLUSHIE,
                        ModBlocks.RIN_PLUSHIE,
                        ModBlocks.LEN_PLUSHIE,
                        ModBlocks.LEN_FILIPINO_PLUSHIE,
                        ModBlocks.LOPUNNY_PLUSHIE,
                        ModBlocks.OWL_PLUSHIE,
                        ModBlocks.FLYNN_PLUSHIE,
                        ModBlocks.HEATHCLIFF_PLUSHIE,
                        ModBlocks.PARRA_PLUSHIE
                ).build()
        );
    }

    private static BlockEntityType<ParradioBlockEntity> createParradioBe() {
        return Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(AntisolarBlocks.MOD_ID, "parradio_be"),
                FabricBlockEntityTypeBuilder.create(
                        (pos, state) -> new ParradioBlockEntity(pos, state),
                        ModBlocks.PARRADIO
                        ).build()
        );
    }

    private static BlockEntityType<GiantPotBlockEntity> createSoilBe() {
        return Registry.register(
                Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(AntisolarBlocks.MOD_ID, "soil_be"),
                FabricBlockEntityTypeBuilder.create(
                        (pos, state) -> new GiantPotBlockEntity(SOIL_BE, pos, state),
                        ModBlocks.GIANT_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_WHITE_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_LIGHT_GRAY_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_GRAY_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_BLACK_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_PINK_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_MAGENTA_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_PURPLE_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_BLUE_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_LIGHT_BLUE_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_CYAN_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_GREEN_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_LIME_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_YELLOW_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_ORANGE_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_RED_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_BROWN_HARDENED_KAOLINITE_CLAY_POT,
                        ModBlocks.GIANT_TERRACOTTA_POT,
                        ModBlocks.GIANT_WHITE_TERRACOTTA_POT,
                        ModBlocks.GIANT_LIGHT_GRAY_TERRACOTTA_POT,
                        ModBlocks.GIANT_GRAY_TERRACOTTA_POT,
                        ModBlocks.GIANT_BLACK_TERRACOTTA_POT,
                        ModBlocks.GIANT_PINK_TERRACOTTA_POT,
                        ModBlocks.GIANT_MAGENTA_TERRACOTTA_POT,
                        ModBlocks.GIANT_PURPLE_TERRACOTTA_POT,
                        ModBlocks.GIANT_BLUE_TERRACOTTA_POT,
                        ModBlocks.GIANT_LIGHT_BLUE_TERRACOTTA_POT,
                        ModBlocks.GIANT_CYAN_TERRACOTTA_POT,
                        ModBlocks.GIANT_GREEN_TERRACOTTA_POT,
                        ModBlocks.GIANT_LIME_TERRACOTTA_POT,
                        ModBlocks.GIANT_YELLOW_TERRACOTTA_POT,
                        ModBlocks.GIANT_ORANGE_TERRACOTTA_POT,
                        ModBlocks.GIANT_RED_TERRACOTTA_POT,
                        ModBlocks.GIANT_BROWN_TERRACOTTA_POT

                ).build()
        );
    }

    public static void registerModBlockEntities() {
        AntisolarBlocks.LOGGER.info("Registering Mod Block Entities for " + AntisolarBlocks.MOD_ID);
    }
}
