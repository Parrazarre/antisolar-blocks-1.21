package net.parra.antisolarblocks.block.custom;

import net.minecraft.block.*;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.parra.antisolarblocks.block.ModBlocks;

public class GiantPearBlock extends Block {
    protected static final VoxelShape SHAPE_1 = Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 2.0, 15.0);
    protected static final VoxelShape SHAPE_2 = Block.createCuboidShape(0.0, 2.0, 0.0, 16.0, 10.0, 16.0);
    protected static final VoxelShape SHAPE_3 = Block.createCuboidShape(1.0, 10.0, 1.0, 15.0, 12.0, 15.0);
    protected static final VoxelShape SHAPE_4 = Block.createCuboidShape(3.0, 12.0, 3.0, 13.0, 14.0, 13.0);
    protected static final VoxelShape SHAPE_5 = Block.createCuboidShape(6.0, 14.0, 6.0, 10.0, 16.0, 10.0);
    protected static final VoxelShape SHAPE = VoxelShapes.union(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4, SHAPE_5);
    private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final BooleanProperty HANGING = Properties.HANGING;

    public GiantPearBlock(Settings settings) {
        super(settings);
        setDefaultState(getStateManager().getDefaultState()
                .with(WATERLOGGED, false)
                .with(HANGING, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, HANGING);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public static BlockState getHangingState() {
        return ModBlocks.GIANT_PEAR.getDefaultState().with(HANGING, true);
    }
}