package net.parra.antisolarblocks.world.tree;

import net.minecraft.block.SaplingGenerator;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.world.ModConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator SUGAR_MAPLE = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":sugar_maple",
            Optional.empty(), Optional.of(ModConfiguredFeatures.SUGAR_MAPLE_KEY), Optional.empty());

    public static final SaplingGenerator WHITE_PINE = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":white_pine",
            Optional.empty(), Optional.of(ModConfiguredFeatures.WHITE_PINE_KEY), Optional.empty());

    public static final SaplingGenerator YEW = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":yew",
            Optional.of(ModConfiguredFeatures.YEW_KEY), Optional.empty(), Optional.empty());

    public static final SaplingGenerator FORSYTHIA = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":forsythia",
            Optional.empty(), Optional.of(ModConfiguredFeatures.FORSYTHIA_KEY), Optional.empty());

    public static final SaplingGenerator JAPANESE_MAPLE = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":japanese_maple",
            Optional.empty(), Optional.of(ModConfiguredFeatures.JAPANESE_MAPLE_KEY), Optional.empty());

}
