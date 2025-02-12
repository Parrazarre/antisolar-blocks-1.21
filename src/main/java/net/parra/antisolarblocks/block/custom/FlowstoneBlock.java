package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.enums.Thickness;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.parra.antisolarblocks.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

public class FlowstoneBlock extends Block implements Waterloggable {
    public static final MapCodec<FlowstoneBlock> CODEC = createCodec(FlowstoneBlock::new);
    public static final EnumProperty<Thickness> THICKNESS = Properties.THICKNESS;
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    private static final VoxelShape DOWN_TIP_SHAPE = Block.createCuboidShape(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
    private static final VoxelShape BASE_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    private static final VoxelShape FRUSTUM_SHAPE = Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
    private static final VoxelShape MIDDLE_SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

    @Override
    public MapCodec<FlowstoneBlock> getCodec() {
        return CODEC;
    }

    public FlowstoneBlock(Settings settings) {
        super(settings);
        this.setDefaultState(
                this.stateManager.getDefaultState().with(THICKNESS, Thickness.BASE).with(WATERLOGGED, Boolean.valueOf(false))
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(THICKNESS, WATERLOGGED);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        WorldAccess worldAccess = ctx.getWorld();
        BlockPos blockPos = ctx.getBlockPos();
        Direction direction = ctx.getVerticalPlayerLookDirection().getOpposite();
            boolean bl = !ctx.shouldCancelInteraction();
            Thickness thickness = getThickness(worldAccess, blockPos, Direction.UP, bl);
            return thickness == null
                    ? null
                    : this.getDefaultState()
                    .with(THICKNESS, thickness)
                    .with(WATERLOGGED, Boolean.valueOf(worldAccess.getFluidState(blockPos).getFluid() == Fluids.WATER));

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

        if (direction != Direction.UP && direction != Direction.DOWN) {
            return state;
        } else {
            Direction direction2 = Direction.UP;
            if (direction2 == Direction.DOWN && world.getBlockTickScheduler().isQueued(pos, this)) {
                return state;
            } else if (direction == direction2.getOpposite() && !this.canPlaceAt(state, world, pos)) {
                if (direction2 == Direction.DOWN) {
                    world.scheduleBlockTick(pos, this, 2);
                } else {
                    world.scheduleBlockTick(pos, this, 1);
                }

                return state;
            } else {
                boolean bl = state.get(THICKNESS) == Thickness.TIP_MERGE;
                Thickness thickness = getThickness(world, pos, Direction.UP, bl);
                return state.with(THICKNESS, thickness);
            }
        }
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Thickness thickness = state.get(THICKNESS);
        VoxelShape voxelShape;
        if (thickness == Thickness.TIP) {
            voxelShape = BASE_SHAPE;
        } else if (thickness == Thickness.FRUSTUM) {
            voxelShape = MIDDLE_SHAPE;
        } else if (thickness == Thickness.MIDDLE) {
            voxelShape = FRUSTUM_SHAPE;
        } else {
            voxelShape = DOWN_TIP_SHAPE;
        }
        return voxelShape;
    }

    private static void place(WorldAccess world, BlockPos pos, Thickness thickness) {
        BlockState blockState = ModBlocks.FLOWSTONE
                .getDefaultState()
                .with(THICKNESS, thickness)
                .with(WATERLOGGED, Boolean.valueOf(world.getFluidState(pos).getFluid() == Fluids.WATER));
        world.setBlockState(pos, blockState, Block.NOTIFY_ALL);
    }

    private static Thickness getThickness(WorldView world, BlockPos pos, Direction direction, boolean tryMerge) {
        Direction direction2 = direction.getOpposite();
        BlockState blockState = world.getBlockState(pos.offset(direction));
        if (isPointedDripstoneFacingDirection(blockState, direction2)) {
            return !tryMerge && blockState.get(THICKNESS) != Thickness.TIP_MERGE ? Thickness.TIP : Thickness.TIP_MERGE;
        } else if (!isPointedDripstoneFacingDirection(blockState, direction)) {
            return Thickness.TIP;
        } else {
            Thickness thickness = blockState.get(THICKNESS);
            if (thickness != Thickness.TIP && thickness != Thickness.TIP_MERGE) {
                BlockState blockState2 = world.getBlockState(pos.offset(direction2));
                return !isPointedDripstoneFacingDirection(blockState2, direction) ? Thickness.BASE : Thickness.MIDDLE;
            } else {
                return Thickness.FRUSTUM;
            }
        }
    }

    private static boolean canPlaceAtWithDirection(WorldView world, BlockPos pos, Direction direction) {
        BlockPos blockPos = pos.offset(direction.getOpposite());
        BlockState blockState = world.getBlockState(blockPos);
        return blockState.isSideSolidFullSquare(world, blockPos, direction) || isPointedDripstoneFacingDirection(blockState, direction);
    }

    private static boolean isPointingDown(BlockState state) {
        return isPointedDripstoneFacingDirection(state, Direction.UP);
    }

    private static boolean isHeldByPointedDripstone(BlockState state, WorldView world, BlockPos pos) {
        return isPointingDown(state) && !world.getBlockState(pos.up()).isOf(ModBlocks.FLOWSTONE);
    }

    private static boolean isPointedDripstoneFacingDirection(BlockState state, Direction direction) {
        return state.isOf(ModBlocks.FLOWSTONE) && Direction.UP == direction;
    }
}
