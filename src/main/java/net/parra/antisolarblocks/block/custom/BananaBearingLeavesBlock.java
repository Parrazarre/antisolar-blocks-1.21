package net.parra.antisolarblocks.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MangroveLeavesBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class BananaBearingLeavesBlock extends MangroveLeavesBlock {
    private static final int GROW_CHANCE = 5; // 1-in-20 per random tick
    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
    public BananaBearingLeavesBlock(Settings settings) {
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
        world.setBlockState(below(pos), BananaBunchBlock.getHangingState(), 2);
    }

    private static BlockPos below(BlockPos pos) {
        return pos.down();
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}