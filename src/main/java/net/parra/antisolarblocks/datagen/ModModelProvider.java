package net.parra.antisolarblocks.datagen;

import com.google.gson.JsonElement;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.block.custom.RadishCropBlock;
import net.parra.antisolarblocks.item.ModItems;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool
                chertPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CHERT);
        BlockStateModelGenerator.BlockTexturePool
                polishedChertPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_CHERT);

        BlockStateModelGenerator.BlockTexturePool
                peridotiteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PERIDOTITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                polishedPeridotitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_PERIDOTITE);
        BlockStateModelGenerator.BlockTexturePool
                peridotiteTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PERIDOTITE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                darkGneissBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.DARK_GNEISS_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                lightGneissBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIGHT_GNEISS_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                pinkGneissBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PINK_GNEISS_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                darkPolishedGneissPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.DARK_POLISHED_GNEISS);
        BlockStateModelGenerator.BlockTexturePool
                lightPolishedGneissPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIGHT_POLISHED_GNEISS);
        BlockStateModelGenerator.BlockTexturePool
                pinkPolishedGneissPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PINK_POLISHED_GNEISS);

        BlockStateModelGenerator.BlockTexturePool
                andesiteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ANDESITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                blueschistPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BLUESCHIST);
        BlockStateModelGenerator.BlockTexturePool
                polishedBlueschistPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_BLUESCHIST);

        BlockStateModelGenerator.BlockTexturePool
                olivinePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.OLIVINE);
        BlockStateModelGenerator.BlockTexturePool
                polishedOlivinePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_OLIVINE);
        BlockStateModelGenerator.BlockTexturePool
                olivineTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.OLIVINE_TILES);
        BlockStateModelGenerator.BlockTexturePool
                smallOlivineTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SMALL_OLIVINE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                polishedPotassiumFeldsparPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_POTASSIUM_FELDSPAR);
        BlockStateModelGenerator.BlockTexturePool
                potassiumFeldsparBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POTASSIUM_FELDSPAR_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                potassiumFeldsparTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POTASSIUM_FELDSPAR_TILES);

        BlockStateModelGenerator.BlockTexturePool
                harzburgitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.HARZBURGITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedHarzburgitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_HARZBURGITE);
        BlockStateModelGenerator.BlockTexturePool
                harzburgiteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.HARZBURGITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                orthopyroxenePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ORTHOPYROXENE);
        BlockStateModelGenerator.BlockTexturePool
                polishedOrthopyroxenePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_ORTHOPYROXENE);
        BlockStateModelGenerator.BlockTexturePool
                smoothOrthopyroxenePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SMOOTH_ORTHOPYROXENE);
        BlockStateModelGenerator.BlockTexturePool
                orthopyroxeneBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ORTHOPYROXENE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                polishedDripstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_DRIPSTONE);
        BlockStateModelGenerator.BlockTexturePool
                dripstoneTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.DRIPSTONE_TILES);
        BlockStateModelGenerator.BlockTexturePool
                dripstoneBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.DRIPSTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                albiteFeldsparPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ALBITE_FELDSPAR);
        BlockStateModelGenerator.BlockTexturePool
                polishedAlbiteFeldsparPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_ALBITE_FELDSPAR);
        BlockStateModelGenerator.BlockTexturePool
                albiteFeldsparTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ALBITE_FELDSPAR_TILES);

        BlockStateModelGenerator.BlockTexturePool
                jadeBlockPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.JADE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool
                polishedJadePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_JADE);
        BlockStateModelGenerator.BlockTexturePool
                jadeTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.JADE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                polishedAnorthiteFeldsparPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_ANORTHITE_FELDSPAR);
        BlockStateModelGenerator.BlockTexturePool
                anorthiteFeldsparBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ANORTHITE_FELDSPAR_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                mossyAnorthiteFeldsparBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                arkosePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ARKOSE);
        BlockStateModelGenerator.BlockTexturePool
                polishedArkosePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_ARKOSE);
        BlockStateModelGenerator.BlockTexturePool
                arkoseBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ARKOSE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                polishedSodalitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_SODALITE);
        BlockStateModelGenerator.BlockTexturePool
                sodaliteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SODALITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                pegmatitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PEGMATITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedPegmatitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_PEGMATITE);
        BlockStateModelGenerator.BlockTexturePool
                pegmatiteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PEGMATITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                pegmatiteTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PEGMATITE_TILES);
        BlockStateModelGenerator.BlockTexturePool
                smallPegmatiteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SMALL_PEGMATITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                thulitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.THULITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedThulitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_THULITE);
        BlockStateModelGenerator.BlockTexturePool
                thuliteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.THULITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                rapakiviPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RAPAKIVI);
        BlockStateModelGenerator.BlockTexturePool
                polishedRapakiviPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_RAPAKIVI);
        BlockStateModelGenerator.BlockTexturePool
                rapakiviBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RAPAKIVI_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                rawRoseQuartzPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RAW_ROSE_QUARTZ);
        BlockStateModelGenerator.BlockTexturePool
                polishedRoseQuartzPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_ROSE_QUARTZ);

        BlockStateModelGenerator.BlockTexturePool
                lateriteRockPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LATERITE_ROCK);
        BlockStateModelGenerator.BlockTexturePool
                polishedLateriteRockPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_LATERITE_ROCK);

        BlockStateModelGenerator.BlockTexturePool
                polishedDumortieritePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_DUMORTIERITE);
        BlockStateModelGenerator.BlockTexturePool
                smoothDumortieritePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SMOOTH_DUMORTIERITE);

        BlockStateModelGenerator.BlockTexturePool
                greenschistPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GREENSCHIST);
        BlockStateModelGenerator.BlockTexturePool
                polishedGreenschistPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_GREENSCHIST);

        BlockStateModelGenerator.BlockTexturePool
                sugarMaplePlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SUGAR_MAPLE_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                yewPlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.YEW_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                pearPlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PEAR_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                musaPlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.MUSA_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                orangePlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ORANGE_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                rowanPlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ROWAN_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                blueMahoePlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BLUE_MAHOE_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                mangoPlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.MANGO_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                charoiteBlockPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CHAROITE_BLOCK);
        BlockStateModelGenerator.BlockTexturePool
                polishedCharoitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_CHAROITE);

        BlockStateModelGenerator.BlockTexturePool
                rhyolitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RHYOLITE);
        BlockStateModelGenerator.BlockTexturePool
                rhyoliteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RHYOLITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                polishedRhyolitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_RHYOLITE);
        BlockStateModelGenerator.BlockTexturePool
                rhyoliteTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RHYOLITE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                whitePinePlanksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.WHITE_PINE_PLANKS);

        BlockStateModelGenerator.BlockTexturePool
                gypsumAlabasterPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GYPSUM_ALABASTER);
        BlockStateModelGenerator.BlockTexturePool
                polishedGypsumAlabasterPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_GYPSUM_ALABASTER);
        BlockStateModelGenerator.BlockTexturePool
                smoothGypsumAlabasterPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SMOOTH_GYPSUM_ALABASTER);

        BlockStateModelGenerator.BlockTexturePool
                tuffaciousClayBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.TUFFACIOUS_CLAY_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                oolitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.OOLITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedOolitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_OOLITE);

        BlockStateModelGenerator.BlockTexturePool
                tephritePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.TEPHRITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedTephritePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_TEPHRITE);

        BlockStateModelGenerator.BlockTexturePool
                porphyryPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PORPHYRY);
        BlockStateModelGenerator.BlockTexturePool
                polishedPorphyryPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_PORPHYRY);
        BlockStateModelGenerator.BlockTexturePool
                porphyryBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PORPHYRY_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                larimarPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LARIMAR);

        BlockStateModelGenerator.BlockTexturePool
                roughCobblestoneBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ROUGH_COBBLESTONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                cobblestoneBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.COBBLESTONE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                pigeonitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PIGEONITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedPigeonitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_PIGEONITE);
        BlockStateModelGenerator.BlockTexturePool
                pigeoniteTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PIGEONITE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                graySiltstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GRAY_SILTSTONE);
        BlockStateModelGenerator.BlockTexturePool
                buffSiltstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BUFF_SILTSTONE);
        BlockStateModelGenerator.BlockTexturePool
                redSiltstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RED_SILTSTONE);
        BlockStateModelGenerator.BlockTexturePool
                burgundySiltstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BURGUNDY_SILTSTONE);

        BlockStateModelGenerator.BlockTexturePool
                polishedGraySiltstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRAY_SILTSTONE);
        BlockStateModelGenerator.BlockTexturePool
                polishedBuffSiltstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_BUFF_SILTSTONE);
        BlockStateModelGenerator.BlockTexturePool
                polishedRedSiltstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_RED_SILTSTONE);
        BlockStateModelGenerator.BlockTexturePool
                polishedBurgundySiltstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_BURGUNDY_SILTSTONE);

        BlockStateModelGenerator.BlockTexturePool
                kimberlitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.KIMBERLITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedKimberlitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_KIMBERLITE);

        BlockStateModelGenerator.BlockTexturePool
                travertinePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.TRAVERTINE);
        BlockStateModelGenerator.BlockTexturePool
                polishedTravertinePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_TRAVERTINE);

        BlockStateModelGenerator.BlockTexturePool
                trachyandesitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.TRACHYANDESITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedTrachyandesitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_TRACHYANDESITE);

        BlockStateModelGenerator.BlockTexturePool
                picriteBasaltPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PICRITE_BASALT);
        BlockStateModelGenerator.BlockTexturePool
                polishedPicriteBasaltPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_PICRITE_BASALT);

        BlockStateModelGenerator.BlockTexturePool
                chlorapatitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CHLORAPATITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedChlorapatitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_CHLORAPATITE);
        BlockStateModelGenerator.BlockTexturePool
                extraPolishedChlorapatitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.EXTRA_POLISHED_CHLORAPATITE);
        BlockStateModelGenerator.BlockTexturePool
                fullyPolishedChlorapatitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.FULLY_POLISHED_CHLORAPATITE);

        BlockStateModelGenerator.BlockTexturePool
                dacitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.DACITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedDacitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_DACITE);
        BlockStateModelGenerator.BlockTexturePool
                daciteTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.DACITE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                hydroxylapatitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.HYDROXYLAPATITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedHydroxylapatitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_HYDROXYLAPATITE);
        BlockStateModelGenerator.BlockTexturePool
                hydroxylapatiteTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.HYDROXYLAPATITE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                foyaitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.FOYAITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedFoyaitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_FOYAITE);
        BlockStateModelGenerator.BlockTexturePool
                foyaiteTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.FOYAITE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                gabbroPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GABBRO);
        BlockStateModelGenerator.BlockTexturePool
                polishedGabbroPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_GABBRO);
        BlockStateModelGenerator.BlockTexturePool
                gabbroBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GABBRO_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                flowstoneBlockPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.FLOWSTONE_BLOCK);

        BlockStateModelGenerator.BlockTexturePool
                polishedMicroclinePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_MICROCLINE);
        BlockStateModelGenerator.BlockTexturePool
                smoothMicroclinePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SMOOTH_MICROCLINE);

        BlockStateModelGenerator.BlockTexturePool
                orthoclaseFeldsparPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ORTHOCLASE_FELDSPAR);
        BlockStateModelGenerator.BlockTexturePool
                polishedOrthoclaseFeldsparPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR);
        BlockStateModelGenerator.BlockTexturePool
                orthoclaseFeldsparTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ORTHOCLASE_FELDSPAR_TILES);

        BlockStateModelGenerator.BlockTexturePool
                saltBlockPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SALT_BLOCK);

        BlockStateModelGenerator.BlockTexturePool
                khewraSaltBlockPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.KHEWRA_SALT_BLOCK);

        BlockStateModelGenerator.BlockTexturePool
                packedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PACKED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                kaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                whiteKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.WHITE_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                lightGrayKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                grayKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GRAY_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                blackKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BLACK_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                brownKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BROWN_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                redKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RED_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                orangeKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ORANGE_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                yellowKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.YELLOW_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                limeKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIME_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                greenKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GREEN_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                cyanKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CYAN_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                lightBlueKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                blueKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BLUE_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                purpleKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PURPLE_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                magentaKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.MAGENTA_KAOLINITE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                pinkKaoliniteBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PINK_KAOLINITE_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                hardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                whiteHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.WHITE_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                lightGrayHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                grayHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GRAY_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                blackHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BLACK_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                brownHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BROWN_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                redHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RED_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                orangeHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ORANGE_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                yellowHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.YELLOW_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                limeHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIME_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                greenHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GREEN_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                cyanHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CYAN_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                lightBlueHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                blueHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BLUE_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                purpleHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PURPLE_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                magentaHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.MAGENTA_HARDENED_KAOLINITE_CLAY);
        BlockStateModelGenerator.BlockTexturePool
                pinkHardenedKaoliniteClayPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PINK_HARDENED_KAOLINITE_CLAY);

        BlockStateModelGenerator.BlockTexturePool
                sunstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SUNSTONE);

        BlockStateModelGenerator.BlockTexturePool
                limburgitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIMBURGITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedLimburgitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_LIMBURGITE);
        BlockStateModelGenerator.BlockTexturePool
                limburgiteTilesPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIMBURGITE_TILES);

        BlockStateModelGenerator.BlockTexturePool
                hawaiitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.HAWAIITE);
        BlockStateModelGenerator.BlockTexturePool
                polishedHawaiitePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.POLISHED_HAWAIITE);

        BlockStateModelGenerator.BlockTexturePool
                scoriaPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.SCORIA);

        BlockStateModelGenerator.BlockTexturePool
                pumicePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PUMICE);

        BlockStateModelGenerator.BlockTexturePool
                ancientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                whiteAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.WHITE_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                lightGrayAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                grayAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GRAY_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                blackAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BLACK_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                brownAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BROWN_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                redAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RED_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                orangeAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.ORANGE_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                yellowAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.YELLOW_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                limeAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIME_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                greenAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.GREEN_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                cyanAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.CYAN_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                lightBlueAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                blueAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.BLUE_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                purpleAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PURPLE_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                magentaAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.MAGENTA_ANCIENT_BRICKS);
        BlockStateModelGenerator.BlockTexturePool
                pinkAncientBricksPool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.PINK_ANCIENT_BRICKS);

        BlockStateModelGenerator.BlockTexturePool
                rawMoonstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.RAW_MOONSTONE);
        BlockStateModelGenerator.BlockTexturePool
                moonstonePool = blockStateModelGenerator
                .registerCubeAllModelTexturePool(ModBlocks.MOONSTONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GNEISS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_CLAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MOSSY_ANCIENT_CLAY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VERY_MOSSY_ANCIENT_CLAY);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ACACIA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_BAMBOO_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_BIRCH_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_CHERRY_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_CRIMSON_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_JUNGLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_MANGROVE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_DARK_OAK_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_WARPED_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_SUGAR_MAPLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_WHITE_PINE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_YEW_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_PEAR_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_MUSA_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ORANGE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_ROWAN_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_BLUE_MAHOE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_MANGO_PLANKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_BLUESCHIST);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POTASSIUM_FELDSPAR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIGHT_SHALE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DARK_SHALE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OIL_SHALE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.JADE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRACKED_JADE_TILES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_JADE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANORTHITE_FELDSPAR);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SODALITE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_QUARTZ_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LATERITE_SOIL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUMORTIERITE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHISELED_GREENSCHIST);

        blockStateModelGenerator.registerDoor(ModBlocks.SUGAR_MAPLE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.SUGAR_MAPLE_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SUGAR_MAPLE_SAPLING, ModBlocks.POTTED_SUGAR_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.YEW_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YEW_SAPLING, ModBlocks.POTTED_YEW_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YEW_LEAVES);

        blockStateModelGenerator.registerDoor(ModBlocks.PEAR_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.PEAR_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PEAR_SAPLING, ModBlocks.POTTED_PEAR_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerLog(ModBlocks.PEAR_LOG)
                .log(ModBlocks.PEAR_LOG)
                .wood(ModBlocks.PEAR_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PEAR_LOG)
                .log(ModBlocks.STRIPPED_PEAR_LOG)
                .wood(ModBlocks.STRIPPED_PEAR_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.MUSA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MUSA_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MUSA_SAPLING, ModBlocks.POTTED_MUSA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerLog(ModBlocks.MUSA_LOG)
                .log(ModBlocks.MUSA_LOG)
                .wood(ModBlocks.MUSA_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MUSA_LOG)
                .log(ModBlocks.STRIPPED_MUSA_LOG)
                .wood(ModBlocks.STRIPPED_MUSA_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ORANGE_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_SAPLING, ModBlocks.POTTED_ORANGE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerLog(ModBlocks.ORANGE_LOG)
                .log(ModBlocks.ORANGE_LOG)
                .wood(ModBlocks.ORANGE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ORANGE_LOG)
                .log(ModBlocks.STRIPPED_ORANGE_LOG)
                .wood(ModBlocks.STRIPPED_ORANGE_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.ROWAN_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.ROWAN_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_ROWAN_SAPLING, ModBlocks.POTTED_RED_ROWAN_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_ROWAN_SAPLING, ModBlocks.POTTED_YELLOW_ROWAN_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerLog(ModBlocks.ROWAN_LOG)
                .log(ModBlocks.ROWAN_LOG)
                .wood(ModBlocks.ROWAN_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ROWAN_LOG)
                .log(ModBlocks.STRIPPED_ROWAN_LOG)
                .wood(ModBlocks.STRIPPED_ROWAN_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_ROWAN_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_ROWAN_BEARING_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_ROWAN_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.YELLOW_ROWAN_BEARING_LEAVES);

        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_MAHOE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.BLUE_MAHOE_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_MAHOE_SAPLING, ModBlocks.POTTED_BLUE_MAHOE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerLog(ModBlocks.BLUE_MAHOE_LOG)
                .log(ModBlocks.BLUE_MAHOE_LOG)
                .wood(ModBlocks.BLUE_MAHOE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLUE_MAHOE_LOG)
                .log(ModBlocks.STRIPPED_BLUE_MAHOE_LOG)
                .wood(ModBlocks.STRIPPED_BLUE_MAHOE_WOOD);

        blockStateModelGenerator.registerDoor(ModBlocks.MANGO_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.MANGO_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MANGO_SAPLING, ModBlocks.POTTED_MANGO_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerLog(ModBlocks.MANGO_LOG)
                .log(ModBlocks.MANGO_LOG)
                .wood(ModBlocks.MANGO_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MANGO_LOG)
                .log(ModBlocks.STRIPPED_MANGO_LOG)
                .wood(ModBlocks.STRIPPED_MANGO_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHAROITE_ORE);

        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_PINE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.WHITE_PINE_TRAPDOOR);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_PINE_SAPLING, ModBlocks.POTTED_WHITE_PINE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerLog(ModBlocks.WHITE_PINE_LOG)
                .log(ModBlocks.WHITE_PINE_LOG)
                .wood(ModBlocks.WHITE_PINE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_WHITE_PINE_LOG)
                .log(ModBlocks.STRIPPED_WHITE_PINE_LOG)
                .wood(ModBlocks.STRIPPED_WHITE_PINE_WOOD);
        blockStateModelGenerator.registerSingleton(ModBlocks.WHITE_PINE_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerSingleton(ModBlocks.FORSYTHIA_FLOWERS, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.FORSYTHIA_SAPLING, ModBlocks.POTTED_FORSYTHIA_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSingleton(ModBlocks.JAPANESE_MAPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.JAPANESE_MAPLE_SAPLING, ModBlocks.POTTED_JAPANESE_MAPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SIMPLE_PICTURE_WINDOW);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORNATE_PICTURE_WINDOW);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLACIAL_TILL);

        blockStateModelGenerator.registerTintableCross(ModBlocks.LUMINESCENT_BRIAR, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFFACIOUS_CLAY);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLANKET_FLOWER, ModBlocks.POTTED_BLANKET_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_BLANKET_FLOWER, ModBlocks.POTTED_RED_BLANKET_FLOWER, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_RUBBLE);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.INDIGO_WHITE_VIOLA_TRICOLOR, ModBlocks.POTTED_INDIGO_WHITE_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_VIOLA_TRICOLOR, ModBlocks.POTTED_WHITE_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.HONEY_VIOLA_TRICOLOR, ModBlocks.POTTED_HONEY_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_VIOLA_TRICOLOR, ModBlocks.POTTED_YELLOW_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_VIOLA_TRICOLOR, ModBlocks.POTTED_PURPLE_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_CROWN_VIOLA_TRICOLOR, ModBlocks.POTTED_PURPLE_CROWN_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.VIOLA_TRICOLOR, ModBlocks.POTTED_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PEARL_VIOLET_VIOLA_TRICOLOR, ModBlocks.POTTED_PEARL_VIOLET_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.HONEY_VIOLET_VIOLA_TRICOLOR, ModBlocks.POTTED_HONEY_VIOLET_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_PINK_VIOLA_TRICOLOR, ModBlocks.POTTED_LIGHT_PINK_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_BLUE_VIOLA_TRICOLOR, ModBlocks.POTTED_LIGHT_BLUE_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_VIOLA_TRICOLOR, ModBlocks.POTTED_BLUE_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.COBALT_VIOLA_TRICOLOR, ModBlocks.POTTED_COBALT_VIOLA_TRICOLOR, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerTintableCross(ModBlocks.SHORT_STINGING_NETTLE, BlockStateModelGenerator.TintType.TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.FEATHER_BLOCK);

        blockStateModelGenerator.registerTintableCross(ModBlocks.HYDROTHERMAL_VENT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MICROCLINE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERIDOTITE_SHELL_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRACHYANDESITE_SHELL_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONE_SHELL_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHLORAPATITE_SHELL_PAVEMENT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HYDROXYLAPATITE_SHELL_PAVEMENT);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.KAOLINITE_CLAY);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CRUMBLING_STONE_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SCORIACEOUS_LAPILLI);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUMICEOUS_LAPILLI);

        blockStateModelGenerator.registerTintableCross(ModBlocks.EMPETRUM, BlockStateModelGenerator.TintType.NOT_TINTED);

        chertPool.stairs(ModBlocks.CHERT_STAIRS);
        chertPool.slab(ModBlocks.CHERT_SLAB);
        chertPool.wall(ModBlocks.CHERT_WALL);

        polishedChertPool.stairs(ModBlocks.POLISHED_CHERT_STAIRS);
        polishedChertPool.slab(ModBlocks.POLISHED_CHERT_SLAB);
        polishedChertPool.wall(ModBlocks.POLISHED_CHERT_WALL);

        peridotiteBricksPool.stairs(ModBlocks.PERIDOTITE_BRICK_STAIRS);
        peridotiteBricksPool.slab(ModBlocks.PERIDOTITE_BRICK_SLAB);

        polishedPeridotitePool.stairs(ModBlocks.POLISHED_PERIDOTITE_STAIRS);
        polishedPeridotitePool.slab(ModBlocks.POLISHED_PERIDOTITE_SLAB);

        peridotiteTilesPool.stairs(ModBlocks.PERIDOTITE_TILE_STAIRS);
        peridotiteTilesPool.slab(ModBlocks.PERIDOTITE_TILE_SLAB);

        darkGneissBricksPool.stairs(ModBlocks.DARK_GNEISS_BRICK_STAIRS);
        darkGneissBricksPool.slab(ModBlocks.DARK_GNEISS_BRICK_SLAB);
        darkGneissBricksPool.wall(ModBlocks.DARK_GNEISS_BRICK_WALL);

        darkPolishedGneissPool.stairs(ModBlocks.DARK_POLISHED_GNEISS_STAIRS);
        darkPolishedGneissPool.slab(ModBlocks.DARK_POLISHED_GNEISS_SLAB);

        lightGneissBricksPool.stairs(ModBlocks.LIGHT_GNEISS_BRICK_STAIRS);
        lightGneissBricksPool.slab(ModBlocks.LIGHT_GNEISS_BRICK_SLAB);
        lightGneissBricksPool.wall(ModBlocks.LIGHT_GNEISS_BRICK_WALL);

        lightPolishedGneissPool.stairs(ModBlocks.LIGHT_POLISHED_GNEISS_STAIRS);
        lightPolishedGneissPool.slab(ModBlocks.LIGHT_POLISHED_GNEISS_SLAB);

        pinkGneissBricksPool.stairs(ModBlocks.PINK_GNEISS_BRICK_STAIRS);
        pinkGneissBricksPool.slab(ModBlocks.PINK_GNEISS_BRICK_SLAB);
        pinkGneissBricksPool.wall(ModBlocks.PINK_GNEISS_BRICK_WALL);

        pinkPolishedGneissPool.stairs(ModBlocks.PINK_POLISHED_GNEISS_STAIRS);
        pinkPolishedGneissPool.slab(ModBlocks.PINK_POLISHED_GNEISS_SLAB);

        andesiteBricksPool.stairs(ModBlocks.ANDESITE_BRICK_STAIRS);
        andesiteBricksPool.slab(ModBlocks.ANDESITE_BRICK_SLAB);
        andesiteBricksPool.wall(ModBlocks.ANDESITE_BRICK_WALL);

        blueschistPool.stairs(ModBlocks.BLUESCHIST_STAIRS);
        blueschistPool.slab(ModBlocks.BLUESCHIST_SLAB);
        blueschistPool.wall(ModBlocks.BLUESCHIST_WALL);

        polishedBlueschistPool.stairs(ModBlocks.POLISHED_BLUESCHIST_STAIRS);
        polishedBlueschistPool.slab(ModBlocks.POLISHED_BLUESCHIST_SLAB);

        olivinePool.stairs(ModBlocks.OLIVINE_STAIRS);
        olivinePool.slab(ModBlocks.OLIVINE_SLAB);
        olivinePool.wall(ModBlocks.OLIVINE_WALL);

        polishedOlivinePool.stairs(ModBlocks.POLISHED_OLIVINE_STAIRS);
        polishedOlivinePool.slab(ModBlocks.POLISHED_OLIVINE_SLAB);

        olivineTilesPool.stairs(ModBlocks.OLIVINE_TILE_STAIRS);
        olivineTilesPool.slab(ModBlocks.OLIVINE_TILE_SLAB);

        smallOlivineTilesPool.stairs(ModBlocks.SMALL_OLIVINE_TILE_STAIRS);
        smallOlivineTilesPool.slab(ModBlocks.SMALL_OLIVINE_TILE_SLAB);

        polishedPotassiumFeldsparPool.stairs(ModBlocks.POLISHED_POTASSIUM_FELDSPAR_STAIRS);
        polishedPotassiumFeldsparPool.slab(ModBlocks.POLISHED_POTASSIUM_FELDSPAR_SLAB);

        potassiumFeldsparBricksPool.stairs(ModBlocks.POTASSIUM_FELDSPAR_BRICK_STAIRS);
        potassiumFeldsparBricksPool.slab(ModBlocks.POTASSIUM_FELDSPAR_BRICK_SLAB);
        potassiumFeldsparBricksPool.wall(ModBlocks.POTASSIUM_FELDSPAR_BRICK_WALL);

        potassiumFeldsparTilesPool.stairs(ModBlocks.POTASSIUM_FELDSPAR_TILE_STAIRS);
        potassiumFeldsparTilesPool.slab(ModBlocks.POTASSIUM_FELDSPAR_TILE_SLAB);

        harzburgitePool.stairs(ModBlocks.HARZBURGITE_STAIRS);
        harzburgitePool.slab(ModBlocks.HARZBURGITE_SLAB);

        polishedHarzburgitePool.stairs(ModBlocks.POLISHED_HARZBURGITE_STAIRS);
        polishedHarzburgitePool.slab(ModBlocks.POLISHED_HARZBURGITE_SLAB);

        harzburgiteBricksPool.stairs(ModBlocks.HARZBURGITE_BRICK_STAIRS);
        harzburgiteBricksPool.slab(ModBlocks.HARZBURGITE_BRICK_SLAB);
        harzburgiteBricksPool.wall(ModBlocks.HARZBURGITE_BRICK_WALL);

        orthopyroxenePool.stairs(ModBlocks.ORTHOPYROXENE_STAIRS);
        orthopyroxenePool.slab(ModBlocks.ORTHOPYROXENE_SLAB);
        orthopyroxenePool.wall(ModBlocks.ORTHOPYROXENE_WALL);

        polishedOrthopyroxenePool.stairs(ModBlocks.POLISHED_ORTHOPYROXENE_STAIRS);
        polishedOrthopyroxenePool.slab(ModBlocks.POLISHED_ORTHOPYROXENE_SLAB);

        smoothOrthopyroxenePool.stairs(ModBlocks.SMOOTH_ORTHOPYROXENE_STAIRS);
        smoothOrthopyroxenePool.slab(ModBlocks.SMOOTH_ORTHOPYROXENE_SLAB);

        orthopyroxeneBricksPool.stairs(ModBlocks.ORTHOPYROXENE_BRICK_STAIRS);
        orthopyroxeneBricksPool.slab(ModBlocks.ORTHOPYROXENE_BRICK_SLAB);
        orthopyroxeneBricksPool.wall(ModBlocks.ORTHOPYROXENE_BRICK_WALL);

        polishedDripstonePool.stairs(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        polishedDripstonePool.slab(ModBlocks.POLISHED_DRIPSTONE_SLAB);

        dripstoneTilesPool.stairs(ModBlocks.DRIPSTONE_TILE_STAIRS);
        dripstoneTilesPool.slab(ModBlocks.DRIPSTONE_TILE_SLAB);

        dripstoneBricksPool.stairs(ModBlocks.DRIPSTONE_BRICK_STAIRS);
        dripstoneBricksPool.slab(ModBlocks.DRIPSTONE_BRICK_SLAB);
        dripstoneBricksPool.wall(ModBlocks.DRIPSTONE_BRICK_WALL);

        albiteFeldsparPool.stairs(ModBlocks.ALBITE_FELDSPAR_STAIRS);
        albiteFeldsparPool.slab(ModBlocks.ALBITE_FELDSPAR_SLAB);
        albiteFeldsparPool.wall(ModBlocks.ALBITE_FELDSPAR_WALL);

        polishedAlbiteFeldsparPool.stairs(ModBlocks.POLISHED_ALBITE_FELDSPAR_STAIRS);
        polishedAlbiteFeldsparPool.slab(ModBlocks.POLISHED_ALBITE_FELDSPAR_SLAB);

        albiteFeldsparTilesPool.stairs(ModBlocks.ALBITE_FELDSPAR_TILE_STAIRS);
        albiteFeldsparTilesPool.slab(ModBlocks.ALBITE_FELDSPAR_TILE_SLAB);

        jadeBlockPool.stairs(ModBlocks.JADE_BLOCK_STAIRS);
        jadeBlockPool.slab(ModBlocks.JADE_BLOCK_SLAB);
        jadeBlockPool.wall(ModBlocks.JADE_BLOCK_WALL);

        polishedJadePool.stairs(ModBlocks.POLISHED_JADE_STAIRS);
        polishedJadePool.slab(ModBlocks.POLISHED_JADE_SLAB);

        jadeTilesPool.stairs(ModBlocks.JADE_TILE_STAIRS);
        jadeTilesPool.slab(ModBlocks.JADE_TILE_SLAB);

        polishedAnorthiteFeldsparPool.stairs(ModBlocks.POLISHED_ANORTHITE_FELDSPAR_STAIRS);
        polishedAnorthiteFeldsparPool.slab(ModBlocks.POLISHED_ANORTHITE_FELDSPAR_SLAB);

        anorthiteFeldsparBricksPool.stairs(ModBlocks.ANORTHITE_FELDSPAR_BRICK_STAIRS);
        anorthiteFeldsparBricksPool.slab(ModBlocks.ANORTHITE_FELDSPAR_BRICK_SLAB);
        anorthiteFeldsparBricksPool.wall(ModBlocks.ANORTHITE_FELDSPAR_BRICK_WALL);

        mossyAnorthiteFeldsparBricksPool.stairs(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_STAIRS);
        mossyAnorthiteFeldsparBricksPool.slab(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_SLAB);
        mossyAnorthiteFeldsparBricksPool.wall(ModBlocks.MOSSY_ANORTHITE_FELDSPAR_BRICK_WALL);

        arkosePool.stairs(ModBlocks.ARKOSE_STAIRS);
        arkosePool.slab(ModBlocks.ARKOSE_SLAB);

        polishedArkosePool.stairs(ModBlocks.POLISHED_ARKOSE_STAIRS);
        polishedArkosePool.slab(ModBlocks.POLISHED_ARKOSE_SLAB);

        arkoseBricksPool.stairs(ModBlocks.ARKOSE_BRICK_STAIRS);
        arkoseBricksPool.slab(ModBlocks.ARKOSE_BRICK_SLAB);
        arkoseBricksPool.wall(ModBlocks.ARKOSE_BRICK_WALL);

        polishedSodalitePool.stairs(ModBlocks.POLISHED_SODALITE_STAIRS);
        polishedSodalitePool.slab(ModBlocks.POLISHED_SODALITE_SLAB);

        sodaliteBricksPool.stairs(ModBlocks.SODALITE_BRICK_STAIRS);
        sodaliteBricksPool.slab(ModBlocks.SODALITE_BRICK_SLAB);
        sodaliteBricksPool.wall(ModBlocks.SODALITE_BRICK_WALL);

        pegmatitePool.stairs(ModBlocks.PEGMATITE_STAIRS);
        pegmatitePool.slab(ModBlocks.PEGMATITE_SLAB);
        pegmatitePool.wall(ModBlocks.PEGMATITE_WALL);

        polishedPegmatitePool.stairs(ModBlocks.POLISHED_PEGMATITE_STAIRS);
        polishedPegmatitePool.slab(ModBlocks.POLISHED_PEGMATITE_SLAB);

        pegmatiteBricksPool.stairs(ModBlocks.PEGMATITE_BRICK_STAIRS);
        pegmatiteBricksPool.slab(ModBlocks.PEGMATITE_BRICK_SLAB);

        pegmatiteTilesPool.stairs(ModBlocks.PEGMATITE_TILE_STAIRS);
        pegmatiteTilesPool.slab(ModBlocks.PEGMATITE_TILE_SLAB);

        smallPegmatiteBricksPool.stairs(ModBlocks.SMALL_PEGMATITE_BRICK_STAIRS);
        smallPegmatiteBricksPool.slab(ModBlocks.SMALL_PEGMATITE_BRICK_SLAB);
        smallPegmatiteBricksPool.wall(ModBlocks.SMALL_PEGMATITE_BRICK_WALL);

        thulitePool.stairs(ModBlocks.THULITE_STAIRS);
        thulitePool.slab(ModBlocks.THULITE_SLAB);
        thulitePool.wall(ModBlocks.THULITE_WALL);

        polishedThulitePool.stairs(ModBlocks.POLISHED_THULITE_STAIRS);
        polishedThulitePool.slab(ModBlocks.POLISHED_THULITE_SLAB);

        thuliteBricksPool.stairs(ModBlocks.THULITE_BRICK_STAIRS);
        thuliteBricksPool.slab(ModBlocks.THULITE_BRICK_SLAB);

        rapakiviPool.stairs(ModBlocks.RAPAKIVI_STAIRS);
        rapakiviPool.slab(ModBlocks.RAPAKIVI_SLAB);
        rapakiviPool.wall(ModBlocks.RAPAKIVI_WALL);

        polishedRapakiviPool.stairs(ModBlocks.POLISHED_RAPAKIVI_STAIRS);
        polishedRapakiviPool.slab(ModBlocks.POLISHED_RAPAKIVI_SLAB);

        rapakiviBricksPool.stairs(ModBlocks.RAPAKIVI_BRICK_STAIRS);
        rapakiviBricksPool.slab(ModBlocks.RAPAKIVI_BRICK_SLAB);

        rawRoseQuartzPool.stairs(ModBlocks.RAW_ROSE_QUARTZ_STAIRS);
        rawRoseQuartzPool.slab(ModBlocks.RAW_ROSE_QUARTZ_SLAB);
        rawRoseQuartzPool.wall(ModBlocks.RAW_ROSE_QUARTZ_WALL);

        polishedRoseQuartzPool.stairs(ModBlocks.POLISHED_ROSE_QUARTZ_STAIRS);
        polishedRoseQuartzPool.slab(ModBlocks.POLISHED_ROSE_QUARTZ_SLAB);

        lateriteRockPool.stairs(ModBlocks.LATERITE_ROCK_STAIRS);
        lateriteRockPool.slab(ModBlocks.LATERITE_ROCK_SLAB);
        lateriteRockPool.wall(ModBlocks.LATERITE_ROCK_WALL);

        polishedLateriteRockPool.stairs(ModBlocks.POLISHED_LATERITE_ROCK_STAIRS);
        polishedLateriteRockPool.slab(ModBlocks.POLISHED_LATERITE_ROCK_SLAB);

        polishedDumortieritePool.stairs(ModBlocks.POLISHED_DUMORTIERITE_STAIRS);
        polishedDumortieritePool.slab(ModBlocks.POLISHED_DUMORTIERITE_SLAB);
        polishedDumortieritePool.wall(ModBlocks.POLISHED_DUMORTIERITE_WALL);

        smoothDumortieritePool.stairs(ModBlocks.SMOOTH_DUMORTIERITE_STAIRS);
        smoothDumortieritePool.slab(ModBlocks.SMOOTH_DUMORTIERITE_SLAB);

        greenschistPool.stairs(ModBlocks.GREENSCHIST_STAIRS);
        greenschistPool.slab(ModBlocks.GREENSCHIST_SLAB);
        greenschistPool.wall(ModBlocks.GREENSCHIST_WALL);

        polishedGreenschistPool.stairs(ModBlocks.POLISHED_GREENSCHIST_STAIRS);
        polishedGreenschistPool.slab(ModBlocks.POLISHED_GREENSCHIST_SLAB);

        sugarMaplePlanksPool.stairs(ModBlocks.SUGAR_MAPLE_STAIRS);
        sugarMaplePlanksPool.slab(ModBlocks.SUGAR_MAPLE_SLAB);
        sugarMaplePlanksPool.fence(ModBlocks.SUGAR_MAPLE_FENCE);
        sugarMaplePlanksPool.fenceGate(ModBlocks.SUGAR_MAPLE_FENCE_GATE);
        sugarMaplePlanksPool.pressurePlate(ModBlocks.SUGAR_MAPLE_PRESSURE_PLATE);
        sugarMaplePlanksPool.button(ModBlocks.SUGAR_MAPLE_BUTTON);

        yewPlanksPool.stairs(ModBlocks.YEW_STAIRS);
        yewPlanksPool.slab(ModBlocks.YEW_SLAB);
        yewPlanksPool.fence(ModBlocks.YEW_FENCE);
        yewPlanksPool.fenceGate(ModBlocks.YEW_FENCE_GATE);
        yewPlanksPool.pressurePlate(ModBlocks.YEW_PRESSURE_PLATE);
        yewPlanksPool.button(ModBlocks.YEW_BUTTON);


        pearPlanksPool.stairs(ModBlocks.PEAR_STAIRS);
        pearPlanksPool.slab(ModBlocks.PEAR_SLAB);
        pearPlanksPool.fence(ModBlocks.PEAR_FENCE);
        pearPlanksPool.fenceGate(ModBlocks.PEAR_FENCE_GATE);
        pearPlanksPool.pressurePlate(ModBlocks.PEAR_PRESSURE_PLATE);
        pearPlanksPool.button(ModBlocks.PEAR_BUTTON);
        blockStateModelGenerator.registerSingleton(ModBlocks.PEAR_LEAVES, TexturedModel.LEAVES);

        musaPlanksPool.stairs(ModBlocks.MUSA_STAIRS);
        musaPlanksPool.slab(ModBlocks.MUSA_SLAB);
        musaPlanksPool.fence(ModBlocks.MUSA_FENCE);
        musaPlanksPool.fenceGate(ModBlocks.MUSA_FENCE_GATE);
        musaPlanksPool.pressurePlate(ModBlocks.MUSA_PRESSURE_PLATE);
        musaPlanksPool.button(ModBlocks.MUSA_BUTTON);

        orangePlanksPool.stairs(ModBlocks.ORANGE_STAIRS);
        orangePlanksPool.slab(ModBlocks.ORANGE_SLAB);
        orangePlanksPool.fence(ModBlocks.ORANGE_FENCE);
        orangePlanksPool.fenceGate(ModBlocks.ORANGE_FENCE_GATE);
        orangePlanksPool.pressurePlate(ModBlocks.ORANGE_PRESSURE_PLATE);
        orangePlanksPool.button(ModBlocks.ORANGE_BUTTON);
        blockStateModelGenerator.registerSingleton(ModBlocks.ORANGE_LEAVES, TexturedModel.LEAVES);

        rowanPlanksPool.stairs(ModBlocks.ROWAN_STAIRS);
        rowanPlanksPool.slab(ModBlocks.ROWAN_SLAB);
        rowanPlanksPool.fence(ModBlocks.ROWAN_FENCE);
        rowanPlanksPool.fenceGate(ModBlocks.ROWAN_FENCE_GATE);
        rowanPlanksPool.pressurePlate(ModBlocks.ROWAN_PRESSURE_PLATE);
        rowanPlanksPool.button(ModBlocks.ROWAN_BUTTON);
        
        blueMahoePlanksPool.stairs(ModBlocks.BLUE_MAHOE_STAIRS);
        blueMahoePlanksPool.slab(ModBlocks.BLUE_MAHOE_SLAB);
        blueMahoePlanksPool.fence(ModBlocks.BLUE_MAHOE_FENCE);
        blueMahoePlanksPool.fenceGate(ModBlocks.BLUE_MAHOE_FENCE_GATE);
        blueMahoePlanksPool.pressurePlate(ModBlocks.BLUE_MAHOE_PRESSURE_PLATE);
        blueMahoePlanksPool.button(ModBlocks.BLUE_MAHOE_BUTTON);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLUE_MAHOE_LEAVES, TexturedModel.LEAVES);
        
        mangoPlanksPool.stairs(ModBlocks.MANGO_STAIRS);
        mangoPlanksPool.slab(ModBlocks.MANGO_SLAB);
        mangoPlanksPool.fence(ModBlocks.MANGO_FENCE);
        mangoPlanksPool.fenceGate(ModBlocks.MANGO_FENCE_GATE);
        mangoPlanksPool.pressurePlate(ModBlocks.MANGO_PRESSURE_PLATE);
        mangoPlanksPool.button(ModBlocks.MANGO_BUTTON);
        blockStateModelGenerator.registerSingleton(ModBlocks.MANGO_LEAVES, TexturedModel.LEAVES);
        
        charoiteBlockPool.stairs(ModBlocks.CHAROITE_STAIRS);
        charoiteBlockPool.slab(ModBlocks.CHAROITE_SLAB);
        charoiteBlockPool.wall(ModBlocks.CHAROITE_WALL);

        polishedCharoitePool.stairs(ModBlocks.POLISHED_CHAROITE_STAIRS);
        polishedCharoitePool.slab(ModBlocks.POLISHED_CHAROITE_SLAB);

        rhyolitePool.stairs(ModBlocks.RHYOLITE_STAIRS);
        rhyolitePool.slab(ModBlocks.RHYOLITE_SLAB);

        rhyoliteBricksPool.stairs(ModBlocks.RHYOLITE_BRICK_STAIRS);
        rhyoliteBricksPool.slab(ModBlocks.RHYOLITE_BRICK_SLAB);
        rhyoliteBricksPool.wall(ModBlocks.RHYOLITE_BRICK_WALL);

        polishedRhyolitePool.stairs(ModBlocks.POLISHED_RHYOLITE_STAIRS);
        polishedRhyolitePool.slab(ModBlocks.POLISHED_RHYOLITE_SLAB);

        rhyoliteTilesPool.stairs(ModBlocks.RHYOLITE_TILE_STAIRS);
        rhyoliteTilesPool.slab(ModBlocks.RHYOLITE_TILE_SLAB);

        whitePinePlanksPool.stairs(ModBlocks.WHITE_PINE_STAIRS);
        whitePinePlanksPool.slab(ModBlocks.WHITE_PINE_SLAB);
        whitePinePlanksPool.fence(ModBlocks.WHITE_PINE_FENCE);
        whitePinePlanksPool.fenceGate(ModBlocks.WHITE_PINE_FENCE_GATE);
        whitePinePlanksPool.pressurePlate(ModBlocks.WHITE_PINE_PRESSURE_PLATE);
        whitePinePlanksPool.button(ModBlocks.WHITE_PINE_BUTTON);

        gypsumAlabasterPool.stairs(ModBlocks.GYPSUM_ALABASTER_STAIRS);
        gypsumAlabasterPool.slab(ModBlocks.GYPSUM_ALABASTER_SLAB);
        gypsumAlabasterPool.wall(ModBlocks.GYPSUM_ALABASTER_WALL);

        polishedGypsumAlabasterPool.stairs(ModBlocks.POLISHED_GYPSUM_ALABASTER_STAIRS);
        polishedGypsumAlabasterPool.slab(ModBlocks.POLISHED_GYPSUM_ALABASTER_SLAB);

        smoothGypsumAlabasterPool.stairs(ModBlocks.SMOOTH_GYPSUM_ALABASTER_STAIRS);
        smoothGypsumAlabasterPool.slab(ModBlocks.SMOOTH_GYPSUM_ALABASTER_SLAB);

        tuffaciousClayBricksPool.stairs(ModBlocks.TUFFACIOUS_CLAY_BRICK_STAIRS);
        tuffaciousClayBricksPool.slab(ModBlocks.TUFFACIOUS_CLAY_BRICK_SLAB);
        tuffaciousClayBricksPool.wall(ModBlocks.TUFFACIOUS_CLAY_BRICK_WALL);

        oolitePool.stairs(ModBlocks.OOLITE_STAIRS);
        oolitePool.slab(ModBlocks.OOLITE_SLAB);

        polishedOolitePool.stairs(ModBlocks.POLISHED_OOLITE_STAIRS);
        polishedOolitePool.slab(ModBlocks.POLISHED_OOLITE_SLAB);
        polishedOolitePool.wall(ModBlocks.POLISHED_OOLITE_WALL);

        tephritePool.stairs(ModBlocks.TEPHRITE_STAIRS);
        tephritePool.slab(ModBlocks.TEPHRITE_SLAB);

        polishedTephritePool.stairs(ModBlocks.POLISHED_TEPHRITE_STAIRS);
        polishedTephritePool.slab(ModBlocks.POLISHED_TEPHRITE_SLAB);
        polishedTephritePool.wall(ModBlocks.POLISHED_TEPHRITE_WALL);

        porphyryPool.stairs(ModBlocks.PORPHYRY_STAIRS);
        porphyryPool.slab(ModBlocks.PORPHYRY_SLAB);

        polishedPorphyryPool.stairs(ModBlocks.POLISHED_PORPHYRY_STAIRS);
        polishedPorphyryPool.slab(ModBlocks.POLISHED_PORPHYRY_SLAB);

        porphyryBricksPool.stairs(ModBlocks.PORPHYRY_BRICK_STAIRS);
        porphyryBricksPool.slab(ModBlocks.PORPHYRY_BRICK_SLAB);
        porphyryBricksPool.wall(ModBlocks.PORPHYRY_BRICK_WALL);

        larimarPool.stairs(ModBlocks.LARIMAR_STAIRS);
        larimarPool.slab(ModBlocks.LARIMAR_SLAB);
        larimarPool.wall(ModBlocks.LARIMAR_WALL);

        roughCobblestoneBricksPool.stairs(ModBlocks.ROUGH_COBBLESTONE_BRICK_STAIRS);
        roughCobblestoneBricksPool.slab(ModBlocks.ROUGH_COBBLESTONE_BRICK_SLAB);

        cobblestoneBricksPool.stairs(ModBlocks.COBBLESTONE_BRICK_STAIRS);
        cobblestoneBricksPool.slab(ModBlocks.COBBLESTONE_BRICK_SLAB);
        cobblestoneBricksPool.wall(ModBlocks.COBBLESTONE_BRICK_WALL);

        pigeonitePool.stairs(ModBlocks.PIGEONITE_STAIRS);
        pigeonitePool.slab(ModBlocks.PIGEONITE_SLAB);
        pigeonitePool.wall(ModBlocks.PIGEONITE_WALL);

        polishedPigeonitePool.stairs(ModBlocks.POLISHED_PIGEONITE_STAIRS);
        polishedPigeonitePool.slab(ModBlocks.POLISHED_PIGEONITE_SLAB);

        pigeoniteTilesPool.stairs(ModBlocks.PIGEONITE_TILE_STAIRS);
        pigeoniteTilesPool.slab(ModBlocks.PIGEONITE_TILE_SLAB);

        graySiltstonePool.stairs(ModBlocks.GRAY_SILTSTONE_STAIRS);
        graySiltstonePool.slab(ModBlocks.GRAY_SILTSTONE_SLAB);

        buffSiltstonePool.stairs(ModBlocks.BUFF_SILTSTONE_STAIRS);
        buffSiltstonePool.slab(ModBlocks.BUFF_SILTSTONE_SLAB);

        redSiltstonePool.stairs(ModBlocks.RED_SILTSTONE_STAIRS);
        redSiltstonePool.slab(ModBlocks.RED_SILTSTONE_SLAB);

        burgundySiltstonePool.stairs(ModBlocks.BURGUNDY_SILTSTONE_STAIRS);
        burgundySiltstonePool.slab(ModBlocks.BURGUNDY_SILTSTONE_SLAB);

        polishedGraySiltstonePool.stairs(ModBlocks.POLISHED_GRAY_SILTSTONE_STAIRS);
        polishedGraySiltstonePool.slab(ModBlocks.POLISHED_GRAY_SILTSTONE_SLAB);
        polishedGraySiltstonePool.wall(ModBlocks.POLISHED_GRAY_SILTSTONE_WALL);

        polishedBuffSiltstonePool.stairs(ModBlocks.POLISHED_BUFF_SILTSTONE_STAIRS);
        polishedBuffSiltstonePool.slab(ModBlocks.POLISHED_BUFF_SILTSTONE_SLAB);
        polishedBuffSiltstonePool.wall(ModBlocks.POLISHED_BUFF_SILTSTONE_WALL);

        polishedRedSiltstonePool.stairs(ModBlocks.POLISHED_RED_SILTSTONE_STAIRS);
        polishedRedSiltstonePool.slab(ModBlocks.POLISHED_RED_SILTSTONE_SLAB);
        polishedRedSiltstonePool.wall(ModBlocks.POLISHED_RED_SILTSTONE_WALL);

        polishedBurgundySiltstonePool.stairs(ModBlocks.POLISHED_BURGUNDY_SILTSTONE_STAIRS);
        polishedBurgundySiltstonePool.slab(ModBlocks.POLISHED_BURGUNDY_SILTSTONE_SLAB);
        polishedBurgundySiltstonePool.wall(ModBlocks.POLISHED_BURGUNDY_SILTSTONE_WALL);
        
        polishedKimberlitePool.stairs(ModBlocks.POLISHED_KIMBERLITE_STAIRS);
        polishedKimberlitePool.slab(ModBlocks.POLISHED_KIMBERLITE_SLAB);
        polishedKimberlitePool.wall(ModBlocks.POLISHED_KIMBERLITE_WALL);
        kimberlitePool.stairs(ModBlocks.KIMBERLITE_STAIRS);
        kimberlitePool.slab(ModBlocks.KIMBERLITE_SLAB);
        
        travertinePool.stairs(ModBlocks.TRAVERTINE_STAIRS);
        travertinePool.slab(ModBlocks.TRAVERTINE_SLAB);
        travertinePool.wall(ModBlocks.TRAVERTINE_WALL);

        polishedTravertinePool.stairs(ModBlocks.POLISHED_TRAVERTINE_STAIRS);
        polishedTravertinePool.slab(ModBlocks.POLISHED_TRAVERTINE_SLAB);

        trachyandesitePool.stairs(ModBlocks.TRACHYANDESITE_STAIRS);
        trachyandesitePool.slab(ModBlocks.TRACHYANDESITE_SLAB);
        trachyandesitePool.wall(ModBlocks.TRACHYANDESITE_WALL);

        polishedTrachyandesitePool.stairs(ModBlocks.POLISHED_TRACHYANDESITE_STAIRS);
        polishedTrachyandesitePool.slab(ModBlocks.POLISHED_TRACHYANDESITE_SLAB);

        picriteBasaltPool.stairs(ModBlocks.PICRITE_BASALT_STAIRS);
        picriteBasaltPool.slab(ModBlocks.PICRITE_BASALT_SLAB);
        picriteBasaltPool.wall(ModBlocks.PICRITE_BASALT_WALL);

        polishedPicriteBasaltPool.stairs(ModBlocks.POLISHED_PICRITE_BASALT_STAIRS);
        polishedPicriteBasaltPool.slab(ModBlocks.POLISHED_PICRITE_BASALT_SLAB);
        polishedPicriteBasaltPool.wall(ModBlocks.POLISHED_PICRITE_BASALT_WALL);

        chlorapatitePool.stairs(ModBlocks.CHLORAPATITE_STAIRS);
        chlorapatitePool.slab(ModBlocks.CHLORAPATITE_SLAB);

        polishedChlorapatitePool.stairs(ModBlocks.POLISHED_CHLORAPATITE_STAIRS);
        polishedChlorapatitePool.slab(ModBlocks.POLISHED_CHLORAPATITE_SLAB);
        polishedChlorapatitePool.wall(ModBlocks.POLISHED_CHLORAPATITE_WALL);

        extraPolishedChlorapatitePool.stairs(ModBlocks.EXTRA_POLISHED_CHLORAPATITE_STAIRS);
        extraPolishedChlorapatitePool.slab(ModBlocks.EXTRA_POLISHED_CHLORAPATITE_SLAB);
        extraPolishedChlorapatitePool.wall(ModBlocks.EXTRA_POLISHED_CHLORAPATITE_WALL);

        fullyPolishedChlorapatitePool.stairs(ModBlocks.FULLY_POLISHED_CHLORAPATITE_STAIRS);
        fullyPolishedChlorapatitePool.slab(ModBlocks.FULLY_POLISHED_CHLORAPATITE_SLAB);
        fullyPolishedChlorapatitePool.wall(ModBlocks.FULLY_POLISHED_CHLORAPATITE_WALL);

        dacitePool.stairs(ModBlocks.DACITE_STAIRS);
        dacitePool.slab(ModBlocks.DACITE_SLAB);
        dacitePool.wall(ModBlocks.DACITE_WALL);

        polishedDacitePool.stairs(ModBlocks.POLISHED_DACITE_STAIRS);
        polishedDacitePool.slab(ModBlocks.POLISHED_DACITE_SLAB);

        daciteTilesPool.stairs(ModBlocks.DACITE_TILE_STAIRS);
        daciteTilesPool.slab(ModBlocks.DACITE_TILE_SLAB);

        hydroxylapatitePool.stairs(ModBlocks.HYDROXYLAPATITE_STAIRS);
        hydroxylapatitePool.slab(ModBlocks.HYDROXYLAPATITE_SLAB);

        polishedHydroxylapatitePool.stairs(ModBlocks.POLISHED_HYDROXYLAPATITE_STAIRS);
        polishedHydroxylapatitePool.slab(ModBlocks.POLISHED_HYDROXYLAPATITE_SLAB);
        polishedHydroxylapatitePool.wall(ModBlocks.POLISHED_HYDROXYLAPATITE_WALL);

        hydroxylapatiteTilesPool.stairs(ModBlocks.HYDROXYLAPATITE_TILE_STAIRS);
        hydroxylapatiteTilesPool.slab(ModBlocks.HYDROXYLAPATITE_TILE_SLAB);

        foyaitePool.stairs(ModBlocks.FOYAITE_STAIRS);
        foyaitePool.slab(ModBlocks.FOYAITE_SLAB);
        foyaitePool.wall(ModBlocks.FOYAITE_WALL);

        polishedFoyaitePool.stairs(ModBlocks.POLISHED_FOYAITE_STAIRS);
        polishedFoyaitePool.slab(ModBlocks.POLISHED_FOYAITE_SLAB);

        foyaiteTilesPool.stairs(ModBlocks.FOYAITE_TILE_STAIRS);
        foyaiteTilesPool.slab(ModBlocks.FOYAITE_TILE_SLAB);

        gabbroPool.stairs(ModBlocks.GABBRO_STAIRS);
        gabbroPool.slab(ModBlocks.GABBRO_SLAB);
        gabbroPool.wall(ModBlocks.GABBRO_WALL);

        polishedGabbroPool.stairs(ModBlocks.POLISHED_GABBRO_STAIRS);
        polishedGabbroPool.slab(ModBlocks.POLISHED_GABBRO_SLAB);

        gabbroBricksPool.stairs(ModBlocks.GABBRO_BRICK_STAIRS);
        gabbroBricksPool.slab(ModBlocks.GABBRO_BRICK_SLAB);

        flowstoneBlockPool.stairs(ModBlocks.FLOWSTONE_STAIRS);
        flowstoneBlockPool.slab(ModBlocks.FLOWSTONE_SLAB);
        flowstoneBlockPool.wall(ModBlocks.FLOWSTONE_WALL);

        polishedMicroclinePool.stairs(ModBlocks.POLISHED_MICROCLINE_STAIRS);
        polishedMicroclinePool.slab(ModBlocks.POLISHED_MICROCLINE_SLAB);

        smoothMicroclinePool.stairs(ModBlocks.SMOOTH_MICROCLINE_STAIRS);
        smoothMicroclinePool.slab(ModBlocks.SMOOTH_MICROCLINE_SLAB);
        smoothMicroclinePool.wall(ModBlocks.SMOOTH_MICROCLINE_WALL);

        orthoclaseFeldsparPool.stairs(ModBlocks.ORTHOCLASE_FELDSPAR_STAIRS);
        orthoclaseFeldsparPool.slab(ModBlocks.ORTHOCLASE_FELDSPAR_SLAB);
        orthoclaseFeldsparPool.wall(ModBlocks.ORTHOCLASE_FELDSPAR_WALL);

        polishedOrthoclaseFeldsparPool.stairs(ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR_STAIRS);
        polishedOrthoclaseFeldsparPool.slab(ModBlocks.POLISHED_ORTHOCLASE_FELDSPAR_SLAB);

        orthoclaseFeldsparTilesPool.stairs(ModBlocks.ORTHOCLASE_FELDSPAR_TILE_STAIRS);
        orthoclaseFeldsparTilesPool.slab(ModBlocks.ORTHOCLASE_FELDSPAR_TILE_SLAB);

        saltBlockPool.stairs(ModBlocks.SALT_STAIRS);
        saltBlockPool.slab(ModBlocks.SALT_SLAB);
        saltBlockPool.wall(ModBlocks.SALT_WALL);

        khewraSaltBlockPool.stairs(ModBlocks.KHEWRA_SALT_STAIRS);
        khewraSaltBlockPool.slab(ModBlocks.KHEWRA_SALT_SLAB);
        khewraSaltBlockPool.wall(ModBlocks.KHEWRA_SALT_WALL);

        packedKaoliniteClayPool.stairs(ModBlocks.PACKED_KAOLINITE_CLAY_STAIRS);
        packedKaoliniteClayPool.slab(ModBlocks.PACKED_KAOLINITE_CLAY_SLAB);
        packedKaoliniteClayPool.wall(ModBlocks.PACKED_KAOLINITE_CLAY_WALL);

        kaoliniteBricksPool.stairs(ModBlocks.KAOLINITE_BRICK_STAIRS);
        kaoliniteBricksPool.slab(ModBlocks.KAOLINITE_BRICK_SLAB);
        kaoliniteBricksPool.wall(ModBlocks.KAOLINITE_BRICK_WALL);
        whiteKaoliniteBricksPool.stairs(ModBlocks.WHITE_KAOLINITE_BRICK_STAIRS);
        whiteKaoliniteBricksPool.slab(ModBlocks.WHITE_KAOLINITE_BRICK_SLAB);
        whiteKaoliniteBricksPool.wall(ModBlocks.WHITE_KAOLINITE_BRICK_WALL);
        lightGrayKaoliniteBricksPool.stairs(ModBlocks.LIGHT_GRAY_KAOLINITE_BRICK_STAIRS);
        lightGrayKaoliniteBricksPool.slab(ModBlocks.LIGHT_GRAY_KAOLINITE_BRICK_SLAB);
        lightGrayKaoliniteBricksPool.wall(ModBlocks.LIGHT_GRAY_KAOLINITE_BRICK_WALL);
        grayKaoliniteBricksPool.stairs(ModBlocks.GRAY_KAOLINITE_BRICK_STAIRS);
        grayKaoliniteBricksPool.slab(ModBlocks.GRAY_KAOLINITE_BRICK_SLAB);
        grayKaoliniteBricksPool.wall(ModBlocks.GRAY_KAOLINITE_BRICK_WALL);
        blackKaoliniteBricksPool.stairs(ModBlocks.BLACK_KAOLINITE_BRICK_STAIRS);
        blackKaoliniteBricksPool.slab(ModBlocks.BLACK_KAOLINITE_BRICK_SLAB);
        blackKaoliniteBricksPool.wall(ModBlocks.BLACK_KAOLINITE_BRICK_WALL);
        brownKaoliniteBricksPool.stairs(ModBlocks.BROWN_KAOLINITE_BRICK_STAIRS);
        brownKaoliniteBricksPool.slab(ModBlocks.BROWN_KAOLINITE_BRICK_SLAB);
        brownKaoliniteBricksPool.wall(ModBlocks.BROWN_KAOLINITE_BRICK_WALL);
        redKaoliniteBricksPool.stairs(ModBlocks.RED_KAOLINITE_BRICK_STAIRS);
        redKaoliniteBricksPool.slab(ModBlocks.RED_KAOLINITE_BRICK_SLAB);
        redKaoliniteBricksPool.wall(ModBlocks.RED_KAOLINITE_BRICK_WALL);
        orangeKaoliniteBricksPool.stairs(ModBlocks.ORANGE_KAOLINITE_BRICK_STAIRS);
        orangeKaoliniteBricksPool.slab(ModBlocks.ORANGE_KAOLINITE_BRICK_SLAB);
        orangeKaoliniteBricksPool.wall(ModBlocks.ORANGE_KAOLINITE_BRICK_WALL);
        yellowKaoliniteBricksPool.stairs(ModBlocks.YELLOW_KAOLINITE_BRICK_STAIRS);
        yellowKaoliniteBricksPool.slab(ModBlocks.YELLOW_KAOLINITE_BRICK_SLAB);
        yellowKaoliniteBricksPool.wall(ModBlocks.YELLOW_KAOLINITE_BRICK_WALL);
        limeKaoliniteBricksPool.stairs(ModBlocks.LIME_KAOLINITE_BRICK_STAIRS);
        limeKaoliniteBricksPool.slab(ModBlocks.LIME_KAOLINITE_BRICK_SLAB);
        limeKaoliniteBricksPool.wall(ModBlocks.LIME_KAOLINITE_BRICK_WALL);
        greenKaoliniteBricksPool.stairs(ModBlocks.GREEN_KAOLINITE_BRICK_STAIRS);
        greenKaoliniteBricksPool.slab(ModBlocks.GREEN_KAOLINITE_BRICK_SLAB);
        greenKaoliniteBricksPool.wall(ModBlocks.GREEN_KAOLINITE_BRICK_WALL);
        cyanKaoliniteBricksPool.stairs(ModBlocks.CYAN_KAOLINITE_BRICK_STAIRS);
        cyanKaoliniteBricksPool.slab(ModBlocks.CYAN_KAOLINITE_BRICK_SLAB);
        cyanKaoliniteBricksPool.wall(ModBlocks.CYAN_KAOLINITE_BRICK_WALL);
        lightBlueKaoliniteBricksPool.stairs(ModBlocks.LIGHT_BLUE_KAOLINITE_BRICK_STAIRS);
        lightBlueKaoliniteBricksPool.slab(ModBlocks.LIGHT_BLUE_KAOLINITE_BRICK_SLAB);
        lightBlueKaoliniteBricksPool.wall(ModBlocks.LIGHT_BLUE_KAOLINITE_BRICK_WALL);
        blueKaoliniteBricksPool.stairs(ModBlocks.BLUE_KAOLINITE_BRICK_STAIRS);
        blueKaoliniteBricksPool.slab(ModBlocks.BLUE_KAOLINITE_BRICK_SLAB);
        blueKaoliniteBricksPool.wall(ModBlocks.BLUE_KAOLINITE_BRICK_WALL);
        purpleKaoliniteBricksPool.stairs(ModBlocks.PURPLE_KAOLINITE_BRICK_STAIRS);
        purpleKaoliniteBricksPool.slab(ModBlocks.PURPLE_KAOLINITE_BRICK_SLAB);
        purpleKaoliniteBricksPool.wall(ModBlocks.PURPLE_KAOLINITE_BRICK_WALL);
        magentaKaoliniteBricksPool.stairs(ModBlocks.MAGENTA_KAOLINITE_BRICK_STAIRS);
        magentaKaoliniteBricksPool.slab(ModBlocks.MAGENTA_KAOLINITE_BRICK_SLAB);
        magentaKaoliniteBricksPool.wall(ModBlocks.MAGENTA_KAOLINITE_BRICK_WALL);
        pinkKaoliniteBricksPool.stairs(ModBlocks.PINK_KAOLINITE_BRICK_STAIRS);
        pinkKaoliniteBricksPool.slab(ModBlocks.PINK_KAOLINITE_BRICK_SLAB);
        pinkKaoliniteBricksPool.wall(ModBlocks.PINK_KAOLINITE_BRICK_WALL);

        hardenedKaoliniteClayPool.stairs(ModBlocks.HARDENED_KAOLINITE_CLAY_STAIRS);
        hardenedKaoliniteClayPool.slab(ModBlocks.HARDENED_KAOLINITE_CLAY_SLAB);
        whiteHardenedKaoliniteClayPool.stairs(ModBlocks.WHITE_HARDENED_KAOLINITE_CLAY_STAIRS);
        whiteHardenedKaoliniteClayPool.slab(ModBlocks.WHITE_HARDENED_KAOLINITE_CLAY_SLAB);
        lightGrayHardenedKaoliniteClayPool.stairs(ModBlocks.LIGHT_GRAY_HARDENED_KAOLINITE_CLAY_STAIRS);
        lightGrayHardenedKaoliniteClayPool.slab(ModBlocks.LIGHT_GRAY_HARDENED_KAOLINITE_CLAY_SLAB);
        grayHardenedKaoliniteClayPool.stairs(ModBlocks.GRAY_HARDENED_KAOLINITE_CLAY_STAIRS);
        grayHardenedKaoliniteClayPool.slab(ModBlocks.GRAY_HARDENED_KAOLINITE_CLAY_SLAB);
        blackHardenedKaoliniteClayPool.stairs(ModBlocks.BLACK_HARDENED_KAOLINITE_CLAY_STAIRS);
        blackHardenedKaoliniteClayPool.slab(ModBlocks.BLACK_HARDENED_KAOLINITE_CLAY_SLAB);
        brownHardenedKaoliniteClayPool.stairs(ModBlocks.BROWN_HARDENED_KAOLINITE_CLAY_STAIRS);
        brownHardenedKaoliniteClayPool.slab(ModBlocks.BROWN_HARDENED_KAOLINITE_CLAY_SLAB);
        redHardenedKaoliniteClayPool.stairs(ModBlocks.RED_HARDENED_KAOLINITE_CLAY_STAIRS);
        redHardenedKaoliniteClayPool.slab(ModBlocks.RED_HARDENED_KAOLINITE_CLAY_SLAB);
        orangeHardenedKaoliniteClayPool.stairs(ModBlocks.ORANGE_HARDENED_KAOLINITE_CLAY_STAIRS);
        orangeHardenedKaoliniteClayPool.slab(ModBlocks.ORANGE_HARDENED_KAOLINITE_CLAY_SLAB);
        yellowHardenedKaoliniteClayPool.stairs(ModBlocks.YELLOW_HARDENED_KAOLINITE_CLAY_STAIRS);
        yellowHardenedKaoliniteClayPool.slab(ModBlocks.YELLOW_HARDENED_KAOLINITE_CLAY_SLAB);
        limeHardenedKaoliniteClayPool.stairs(ModBlocks.LIME_HARDENED_KAOLINITE_CLAY_STAIRS);
        limeHardenedKaoliniteClayPool.slab(ModBlocks.LIME_HARDENED_KAOLINITE_CLAY_SLAB);
        greenHardenedKaoliniteClayPool.stairs(ModBlocks.GREEN_HARDENED_KAOLINITE_CLAY_STAIRS);
        greenHardenedKaoliniteClayPool.slab(ModBlocks.GREEN_HARDENED_KAOLINITE_CLAY_SLAB);
        cyanHardenedKaoliniteClayPool.stairs(ModBlocks.CYAN_HARDENED_KAOLINITE_CLAY_STAIRS);
        cyanHardenedKaoliniteClayPool.slab(ModBlocks.CYAN_HARDENED_KAOLINITE_CLAY_SLAB);
        lightBlueHardenedKaoliniteClayPool.stairs(ModBlocks.LIGHT_BLUE_HARDENED_KAOLINITE_CLAY_STAIRS);
        lightBlueHardenedKaoliniteClayPool.slab(ModBlocks.LIGHT_BLUE_HARDENED_KAOLINITE_CLAY_SLAB);
        blueHardenedKaoliniteClayPool.stairs(ModBlocks.BLUE_HARDENED_KAOLINITE_CLAY_STAIRS);
        blueHardenedKaoliniteClayPool.slab(ModBlocks.BLUE_HARDENED_KAOLINITE_CLAY_SLAB);
        purpleHardenedKaoliniteClayPool.stairs(ModBlocks.PURPLE_HARDENED_KAOLINITE_CLAY_STAIRS);
        purpleHardenedKaoliniteClayPool.slab(ModBlocks.PURPLE_HARDENED_KAOLINITE_CLAY_SLAB);
        magentaHardenedKaoliniteClayPool.stairs(ModBlocks.MAGENTA_HARDENED_KAOLINITE_CLAY_STAIRS);
        magentaHardenedKaoliniteClayPool.slab(ModBlocks.MAGENTA_HARDENED_KAOLINITE_CLAY_SLAB);
        pinkHardenedKaoliniteClayPool.stairs(ModBlocks.PINK_HARDENED_KAOLINITE_CLAY_STAIRS);
        pinkHardenedKaoliniteClayPool.slab(ModBlocks.PINK_HARDENED_KAOLINITE_CLAY_SLAB);

        sunstonePool.stairs(ModBlocks.SUNSTONE_STAIRS);
        sunstonePool.slab(ModBlocks.SUNSTONE_SLAB);
        sunstonePool.wall(ModBlocks.SUNSTONE_WALL);

        rawMoonstonePool.stairs(ModBlocks.RAW_MOONSTONE_STAIRS);
        rawMoonstonePool.slab(ModBlocks.RAW_MOONSTONE_SLAB);
        rawMoonstonePool.wall(ModBlocks.RAW_MOONSTONE_WALL);

        moonstonePool.stairs(ModBlocks.MOONSTONE_STAIRS);
        moonstonePool.slab(ModBlocks.MOONSTONE_SLAB);
        moonstonePool.wall(ModBlocks.MOONSTONE_WALL);

        limburgitePool.stairs(ModBlocks.LIMBURGITE_STAIRS);
        limburgitePool.slab(ModBlocks.LIMBURGITE_SLAB);
        limburgitePool.wall(ModBlocks.LIMBURGITE_WALL);

        polishedLimburgitePool.stairs(ModBlocks.POLISHED_LIMBURGITE_STAIRS);
        polishedLimburgitePool.slab(ModBlocks.POLISHED_LIMBURGITE_SLAB);

        limburgiteTilesPool.stairs(ModBlocks.LIMBURGITE_TILE_STAIRS);
        limburgiteTilesPool.slab(ModBlocks.LIMBURGITE_TILE_SLAB);

        hawaiitePool.stairs(ModBlocks.HAWAIITE_STAIRS);
        hawaiitePool.slab(ModBlocks.HAWAIITE_SLAB);
        hawaiitePool.wall(ModBlocks.HAWAIITE_WALL);

        polishedHawaiitePool.stairs(ModBlocks.POLISHED_HAWAIITE_STAIRS);
        polishedHawaiitePool.slab(ModBlocks.POLISHED_HAWAIITE_SLAB);

        scoriaPool.stairs(ModBlocks.SCORIA_STAIRS);
        scoriaPool.slab(ModBlocks.SCORIA_SLAB);
        scoriaPool.wall(ModBlocks.SCORIA_WALL);

        pumicePool.stairs(ModBlocks.PUMICE_STAIRS);
        pumicePool.slab(ModBlocks.PUMICE_SLAB);
        pumicePool.wall(ModBlocks.PUMICE_WALL);

        ancientBricksPool.stairs(ModBlocks.ANCIENT_BRICK_STAIRS);
        ancientBricksPool.slab(ModBlocks.ANCIENT_BRICK_SLAB);
        whiteAncientBricksPool.stairs(ModBlocks.WHITE_ANCIENT_BRICK_STAIRS);
        whiteAncientBricksPool.slab(ModBlocks.WHITE_ANCIENT_BRICK_SLAB);
        lightGrayAncientBricksPool.stairs(ModBlocks.LIGHT_GRAY_ANCIENT_BRICK_STAIRS);
        lightGrayAncientBricksPool.slab(ModBlocks.LIGHT_GRAY_ANCIENT_BRICK_SLAB);
        grayAncientBricksPool.stairs(ModBlocks.GRAY_ANCIENT_BRICK_STAIRS);
        grayAncientBricksPool.slab(ModBlocks.GRAY_ANCIENT_BRICK_SLAB);
        blackAncientBricksPool.stairs(ModBlocks.BLACK_ANCIENT_BRICK_STAIRS);
        blackAncientBricksPool.slab(ModBlocks.BLACK_ANCIENT_BRICK_SLAB);
        brownAncientBricksPool.stairs(ModBlocks.BROWN_ANCIENT_BRICK_STAIRS);
        brownAncientBricksPool.slab(ModBlocks.BROWN_ANCIENT_BRICK_SLAB);
        redAncientBricksPool.stairs(ModBlocks.RED_ANCIENT_BRICK_STAIRS);
        redAncientBricksPool.slab(ModBlocks.RED_ANCIENT_BRICK_SLAB);
        orangeAncientBricksPool.stairs(ModBlocks.ORANGE_ANCIENT_BRICK_STAIRS);
        orangeAncientBricksPool.slab(ModBlocks.ORANGE_ANCIENT_BRICK_SLAB);
        yellowAncientBricksPool.stairs(ModBlocks.YELLOW_ANCIENT_BRICK_STAIRS);
        yellowAncientBricksPool.slab(ModBlocks.YELLOW_ANCIENT_BRICK_SLAB);
        limeAncientBricksPool.stairs(ModBlocks.LIME_ANCIENT_BRICK_STAIRS);
        limeAncientBricksPool.slab(ModBlocks.LIME_ANCIENT_BRICK_SLAB);
        greenAncientBricksPool.stairs(ModBlocks.GREEN_ANCIENT_BRICK_STAIRS);
        greenAncientBricksPool.slab(ModBlocks.GREEN_ANCIENT_BRICK_SLAB);
        cyanAncientBricksPool.stairs(ModBlocks.CYAN_ANCIENT_BRICK_STAIRS);
        cyanAncientBricksPool.slab(ModBlocks.CYAN_ANCIENT_BRICK_SLAB);
        lightBlueAncientBricksPool.stairs(ModBlocks.LIGHT_BLUE_ANCIENT_BRICK_STAIRS);
        lightBlueAncientBricksPool.slab(ModBlocks.LIGHT_BLUE_ANCIENT_BRICK_SLAB);
        blueAncientBricksPool.stairs(ModBlocks.BLUE_ANCIENT_BRICK_STAIRS);
        blueAncientBricksPool.slab(ModBlocks.BLUE_ANCIENT_BRICK_SLAB);
        purpleAncientBricksPool.stairs(ModBlocks.PURPLE_ANCIENT_BRICK_STAIRS);
        purpleAncientBricksPool.slab(ModBlocks.PURPLE_ANCIENT_BRICK_SLAB);
        magentaAncientBricksPool.stairs(ModBlocks.MAGENTA_ANCIENT_BRICK_STAIRS);
        magentaAncientBricksPool.slab(ModBlocks.MAGENTA_ANCIENT_BRICK_SLAB);
        pinkAncientBricksPool.stairs(ModBlocks.PINK_ANCIENT_BRICK_STAIRS);
        pinkAncientBricksPool.slab(ModBlocks.PINK_ANCIENT_BRICK_SLAB);

        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_HOT_PINK_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_CORAL_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_YELLOW_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_BLUE_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_PURPLE_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_INDIGO_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_PINK_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_LIGHT_PINK_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);
        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_WHITE_HYACINTH, BlockStateModelGenerator.TintType.NOT_TINTED);

        //this.registerTripleFlowerPotPlant(blockStateModelGenerator, ModBlocks.HOT_PINK_HYACINTH, ModBlocks.POTTED_RED_NEMESIA, BlockStateModelGenerator.TintType.NOT_TINTED);
    }



    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.ANCIENT_CLAY_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANCIENT_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.ROSE_QUARTZ, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHAROITE, Models.GENERATED);

    }

    public final void registerTripleFlowerPotPlant(BlockStateModelGenerator blockStateModelGenerator, Block plantBlock, Block tripleFlowerPotBlock, BlockStateModelGenerator.TintType tintType) {
        blockStateModelGenerator.registerTintableCross(plantBlock, tintType);
        TextureMap textureMap = TextureMap.plant(plantBlock);
        Identifier identifier = tintType.getFlowerPotCrossModel().upload(tripleFlowerPotBlock, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(tripleFlowerPotBlock, identifier));
    }


    public Model getTripleFlowerPotCrossModel() {
            return Models.FLOWER_POT_CROSS;
        }

    public static final Model TRIPLE_FLOWER_POT_CROSS = modblockmodel("triple_flower_pot_cross", TextureKey.PLANT);

    private static Model modblockmodel(String parent, TextureKey... requiredTextureKeys) {
        return new Model(Optional.of(Identifier.of("antisolarblocks/models/block/" + parent)), Optional.empty(), requiredTextureKeys);
    }
}
