package net.parra.antisolarblocks.block.custom;

import net.minecraft.block.*;
import net.minecraft.block.enums.DoubleBlockHalf;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class AmphibiousTallPlantBlock extends TallFlowerBlock {
    private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public AmphibiousTallPlantBlock(Settings settings) {
        super(settings);
        this.setDefaultState(
                this.stateManager.getDefaultState().with(HALF, DoubleBlockHalf.LOWER).with(WATERLOGGED, Boolean.valueOf(false))
        );
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isIn(BlockTags.DEAD_BUSH_MAY_PLACE_ON)
                || world.getFluidState(pos.up()).isEqualAndStill(Fluids.WATER) && super.canPlantOnTop(floor, world, pos);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockState blockState = super.getPlacementState(ctx);
        return blockState != null
                ? withWaterloggedState(ctx.getWorld(), ctx.getBlockPos(), blockState)
                : null;
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack itemStack) {
        if (!world.isClient()) {
            BlockPos blockPos = pos.up();
            BlockState blockState = TallPlantBlock.withWaterloggedState(
                    world, blockPos, this.getDefaultState().with(HALF, DoubleBlockHalf.UPPER));
            world.setBlockState(blockPos, blockState, Block.NOTIFY_ALL);
        }
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        if ((Boolean)state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(HALF, WATERLOGGED);
    }
}
