package net.parra.antisolarblocks.world.tree;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WallLogConnectDecorator extends TreeDecorator {
    public static final MapCodec<WallLogConnectDecorator> CODEC =
            MapCodec.unit(WallLogConnectDecorator::new);

    @Override
    protected TreeDecoratorType<?> getType() {
        return ModTreeDecorators.WALL_LOG_CONNECT;
    }

    @Override
    public void generate(Generator generator) {
        WorldAccess world = (WorldAccess) generator.getWorld();

        List<BlockPos> original = generator.getLogPositions().stream()
                .filter(p -> !world.getBlockState(p).isIn(BlockTags.DIRT))
                .toList();
        Set<BlockPos> logs = new HashSet<>(original);

        for (BlockPos pos : original) {
            BlockPos below = pos.down();
            if (logs.contains(below)) continue;

            if (world.getBlockState(below).isIn(BlockTags.DIRT)) {
                generator.replace(below, Blocks.GRASS_BLOCK.getDefaultState());
            }
        }

        for (BlockPos pos : original) {
            BlockPos above = pos.up();
            if (logs.contains(above)) continue;

            for (Direction dir : Direction.Type.HORIZONTAL) {
                if (logs.contains(above.offset(dir))) {
                    generator.replace(above, world.getBlockState(pos));
                    logs.add(above);
                    break;
                }
            }
        }

        for (BlockPos pos : logs) {
            BlockState state = world.getBlockState(pos);
            BlockState updated = Block.postProcessState(state, world, pos);
            if (updated != state) {
                generator.replace(pos, updated);
            }
        }
    }
}