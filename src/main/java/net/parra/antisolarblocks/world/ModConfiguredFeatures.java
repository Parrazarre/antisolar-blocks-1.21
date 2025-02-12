package net.parra.antisolarblocks.world;


import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.*;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;

import java.util.OptionalInt;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SUGAR_MAPLE_KEY = registryKey("sugar_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_PINE_KEY = registryKey("white_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YEW_KEY = registryKey("yew");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FORSYTHIA_KEY = registryKey("forsythia");
    public static final RegistryKey<ConfiguredFeature<?, ?>> JAPANESE_MAPLE_KEY = registryKey("japanese_maple");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, SUGAR_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SUGAR_MAPLE_LOG),
                new LargeOakTrunkPlacer(4, 8, 0),
                BlockStateProvider.of(ModBlocks.SUGAR_MAPLE_LEAVES),
                new LargeOakFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(3), 3),
                new TwoLayersFeatureSize(1, 0, 3, OptionalInt.of(4))
        ).build()
        );

        register(context, WHITE_PINE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.WHITE_PINE_LOG),
                new StraightTrunkPlacer(3, 13, 0),
                BlockStateProvider.of(ModBlocks.WHITE_PINE_LEAVES),
                new SpruceFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(3), ConstantIntProvider.create(3)),
                new TwoLayersFeatureSize(1, 0, 2, OptionalInt.of(4))
        ).build()
        );

        register(context, YEW_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.YEW_LOG),
                new DarkOakTrunkPlacer(9, 3, 2),
                BlockStateProvider.of(ModBlocks.YEW_LEAVES),
                        new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                        new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())
                )
                        .ignoreVines()
                        .build()
        );

        register(context, FORSYTHIA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SMALL_FORSYTHIA_LOG),
                new ForkingTrunkPlacer(1, 2, 2),
                BlockStateProvider.of(ModBlocks.FORSYTHIA_FLOWERS),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 30),
                new TwoLayersFeatureSize(0, 0, 0)
        )
                .dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK))
                .forceDirt()
                .build()
        );

        register(context, JAPANESE_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SMALL_JAPANESE_MAPLE_LOG),
                new CherryTrunkPlacer(
                        3,
                        1,
                        0,
                        new WeightedListIntProvider(
                                DataPool.<IntProvider>builder().add(ConstantIntProvider.create(1), 1).add(ConstantIntProvider.create(2), 1).add(ConstantIntProvider.create(3), 1).build()
                        ),
                        UniformIntProvider.create(2, 4),
                        UniformIntProvider.create(-4, -3),
                        UniformIntProvider.create(-1, 0)
                ),
                BlockStateProvider.of(ModBlocks.JAPANESE_MAPLE_LEAVES),
                new CherryFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(0), ConstantIntProvider.create(4), 0.25F, 0.5F, 0.16666667F, 0.33333334F),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK))
                .forceDirt()
                .build()
        );

    }



    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(AntisolarBlocks.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
