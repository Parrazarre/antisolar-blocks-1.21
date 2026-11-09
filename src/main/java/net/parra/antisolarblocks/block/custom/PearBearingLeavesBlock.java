package net.parra.antisolarblocks.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.MangroveLeavesBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class PearBearingLeavesBlock extends MangroveLeavesBlock {
    private static final int GROW_CHANCE = 10; // 1-in-20 per random tick

    public PearBearingLeavesBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(GROW_CHANCE) == 0) {
            BlockPos below = pos.down();
            boolean isAir = world.getBlockState(below).isAir();
            if (isAir) {
                grow(world, random, pos, state);
            }
        }
    }
    @Override
    protected boolean hasRandomTicks(BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        world.setBlockState(below(pos), GiantPearBlock.getHangingState(), 2);
    }

    private static BlockPos below(BlockPos pos) {
        return pos.down();
    }
}