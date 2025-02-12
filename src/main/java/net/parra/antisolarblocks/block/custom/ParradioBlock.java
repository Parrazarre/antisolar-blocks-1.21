package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class ParradioBlock extends HorizontalFacingBlock {
    public static final MapCodec<ParradioBlock> CODEC = createCodec(ParradioBlock::new);

    protected static final VoxelShape Z_AXIS_SHAPE = Block.createCuboidShape(1.0, 0.0, 4.5, 15.0, 7.0, 11.5);
    protected static final VoxelShape X_AXIS_SHAPE = Block.createCuboidShape(4.5, 0.0, 1.0, 11.5, 7.0, 15.0);


    public ParradioBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<? extends HorizontalFacingBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? X_AXIS_SHAPE : Z_AXIS_SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
