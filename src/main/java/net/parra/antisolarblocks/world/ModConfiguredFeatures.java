package net.parra.antisolarblocks.world;


import net.minecraft.block.BlockState;
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
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.*;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.world.tree.WallLogConnectDecorator;

import java.util.List;
import java.util.OptionalInt;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> SUGAR_MAPLE_KEY = registryKey("sugar_maple");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WHITE_PINE_KEY = registryKey("white_pine");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YEW_KEY = registryKey("yew");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PEAR_KEY = registryKey("pear");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUSA_KEY = registryKey("musa");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORANGE_KEY = registryKey("orange");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_ROWAN_KEY = registryKey("red_rowan");
    public static final RegistryKey<ConfiguredFeature<?, ?>> YELLOW_ROWAN_KEY = registryKey("yellow_rowan");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLUE_MAHOE_KEY = registryKey("blue_mahoe");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MANGO_KEY = registryKey("mango");
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

        register(context, PEAR_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.PEAR_LOG),
                        new StraightTrunkPlacer(2, 1, 2),
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.PEAR_LEAVES.getDefaultState(), 3)
                                .add(ModBlocks.PEAR_BEARING_LEAVES.getDefaultState(), 1)
                                .build()),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2),
                        ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
        .build()
        );

        register(context, MUSA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.MUSA_LOG),
                        new StraightTrunkPlacer(7, 2, 2),
                        BlockStateProvider.of(ModBlocks.MUSA_LEAVES),
                        new RandomSpreadFoliagePlacer(
                                ConstantIntProvider.create(2),  // radius
                                ConstantIntProvider.create(0),  // offset
                                ConstantIntProvider.create(3),  // height
                                50 // number of leaf placement attempts
                        ),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
        .build()
        );


        register(context, ORANGE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.ORANGE_LOG),
                        new ForkingTrunkPlacer(5, 3, 3),
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.ORANGE_LEAVES.getDefaultState(), 4)
                                .add(ModBlocks.ORANGE_BEARING_LEAVES.getDefaultState(), 1)
                                .build()),
                        new RandomSpreadFoliagePlacer(ConstantIntProvider.create(3),
                                ConstantIntProvider.create(0), ConstantIntProvider.create(3), 100),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                        .build()
        );


        register(context, RED_ROWAN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.ROWAN_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.RED_ROWAN_LEAVES.getDefaultState(), 3)
                                .add(ModBlocks.RED_ROWAN_BEARING_LEAVES.getDefaultState(), 1)
                                .build()),
                new BlobFoliagePlacer(ConstantIntProvider.create(2),
                        ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                        .build()
        );


        register(context, YELLOW_ROWAN_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.ROWAN_LOG),
                new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.YELLOW_ROWAN_LEAVES.getDefaultState(), 3)
                                .add(ModBlocks.YELLOW_ROWAN_BEARING_LEAVES.getDefaultState(), 1)
                                .build()),
                new BlobFoliagePlacer(ConstantIntProvider.create(2),
                        ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                        .build()
        );


        register(context, BLUE_MAHOE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.BLUE_MAHOE_LOG),
                        new StraightTrunkPlacer(4, 2, 1),
                BlockStateProvider.of(ModBlocks.BLUE_MAHOE_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2),
                                ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                        .build()
        );

        register(context, MANGO_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(ModBlocks.MANGO_LOG),
                        new StraightTrunkPlacer(4, 2, 0),
                        new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                                .add(ModBlocks.MANGO_LEAVES.getDefaultState(), 4)
                                .add(ModBlocks.MANGO_BEARING_LEAVES.getDefaultState(), 1)
                                .build()),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2),
                                ConstantIntProvider.create(0), 3),
                        new TwoLayersFeatureSize(1, 0, 1)
                )
                        .build()
        );

        register(context, FORSYTHIA_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SMALL_FORSYTHIA_LOG),
                new ForkingTrunkPlacer(2, 2, 1),
                BlockStateProvider.of(ModBlocks.FORSYTHIA_FLOWERS),
                new RandomSpreadFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(2), 30),
                new TwoLayersFeatureSize(0, 0, 0)
        )
                .dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK))
                .decorators(List.of(new WallLogConnectDecorator()))
                .build()
        );


        register(context, JAPANESE_MAPLE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.SMALL_JAPANESE_MAPLE_LOG),
                        new ForkingTrunkPlacer(3, 1, 1),
                BlockStateProvider.of(ModBlocks.JAPANESE_MAPLE_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                new TwoLayersFeatureSize(1, 0, 2)
        )
                .dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK))
                .decorators(List.of(new WallLogConnectDecorator()))
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
