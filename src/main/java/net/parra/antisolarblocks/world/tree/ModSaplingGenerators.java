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

    public static final SaplingGenerator PEAR = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":pear",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PEAR_KEY), Optional.empty());

    public static final SaplingGenerator MUSA = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":musa",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MUSA_KEY), Optional.empty());

    public static final SaplingGenerator ORANGE = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":orange",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ORANGE_KEY), Optional.empty());

    public static final SaplingGenerator RED_ROWAN = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":red_rowan",
            Optional.empty(), Optional.of(ModConfiguredFeatures.RED_ROWAN_KEY), Optional.empty());
    public static final SaplingGenerator YELLOW_ROWAN = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":yellow_rowan",
            Optional.empty(), Optional.of(ModConfiguredFeatures.YELLOW_ROWAN_KEY), Optional.empty());

    public static final SaplingGenerator BLUE_MAHOE = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":blue_mahoe",
            Optional.empty(), Optional.of(ModConfiguredFeatures.BLUE_MAHOE_KEY), Optional.empty());

    public static final SaplingGenerator MANGO = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":mango",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MANGO_KEY), Optional.empty());

    public static final SaplingGenerator FORSYTHIA = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":forsythia",
            Optional.empty(), Optional.of(ModConfiguredFeatures.FORSYTHIA_KEY), Optional.empty());

    public static final SaplingGenerator JAPANESE_MAPLE = new SaplingGenerator(AntisolarBlocks.MOD_ID + ":japanese_maple",
            Optional.empty(), Optional.of(ModConfiguredFeatures.JAPANESE_MAPLE_KEY), Optional.empty());

}
