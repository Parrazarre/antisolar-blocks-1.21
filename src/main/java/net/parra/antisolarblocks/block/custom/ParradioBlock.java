package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.JukeboxBlockEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.JukeboxPlayableComponent;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.entity.ModBlockEntities;
import net.parra.antisolarblocks.entity.custom.ParradioBlockEntity;
import org.jetbrains.annotations.Nullable;

public class ParradioBlock extends BlockWithEntity {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;
    public static final MapCodec<ParradioBlock> CODEC = createCodec(ParradioBlock::new);
    public static final BooleanProperty HAS_RECORD;

    public MapCodec<ParradioBlock> getCodec() {
        return CODEC;
    }

    public ParradioBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.stateManager.getDefaultState()).with(HAS_RECORD, false));
    }

    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        super.onPlaced(world, pos, state, placer, itemStack);
        NbtComponent nbtComponent = (NbtComponent)itemStack.getOrDefault(DataComponentTypes.BLOCK_ENTITY_DATA, NbtComponent.DEFAULT);
        if (nbtComponent.contains("RecordItem")) {
            world.setBlockState(pos, (BlockState)state.with(HAS_RECORD, true), 2);
        }

    }

    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if ((Boolean)state.get(HAS_RECORD)) {
            BlockEntity var7 = world.getBlockEntity(pos);
            if (var7 instanceof ParradioBlockEntity) {
                ParradioBlockEntity parradioBlockEntity = (ParradioBlockEntity)var7;
                parradioBlockEntity.dropRecord();
                return ActionResult.success(world.isClient);
            }
        }

        return ActionResult.PASS;
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos,
                                             PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (state.get(HAS_RECORD)) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        if (!stack.contains(DataComponentTypes.JUKEBOX_PLAYABLE)) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        }

        if (!world.isClient) {
            ItemStack disc = stack.splitUnlessCreative(1, player);

            if (world.getBlockEntity(pos) instanceof ParradioBlockEntity radio) {
                radio.setStack(disc);
                world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(player, state));
            }

            player.incrementStat(Stats.PLAY_RECORD);
        }

        return ItemActionResult.success(world.isClient);
    }

    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if (!state.isOf(newState.getBlock())) {
            BlockEntity var7 = world.getBlockEntity(pos);
            if (var7 instanceof ParradioBlockEntity) {
                ParradioBlockEntity parradioBlockEntity = (ParradioBlockEntity)var7;
                parradioBlockEntity.dropRecord();
            }

            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ParradioBlockEntity(pos, state);
    }

    public boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    public int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        BlockEntity var6 = world.getBlockEntity(pos);
        if (var6 instanceof ParradioBlockEntity parradioBlockEntity) {
            if (parradioBlockEntity.getManager().isPlaying()) {
                return 15;
            }
        }

        return 0;
    }

    protected boolean hasComparatorOutput(BlockState state) {
        return true;
    }

    protected int getComparatorOutput(BlockState state, World world, BlockPos pos) {
        BlockEntity var5 = world.getBlockEntity(pos);
        if (var5 instanceof ParradioBlockEntity parradioBlockEntity) {
            return parradioBlockEntity.getComparatorOutput();
        } else {
            return 0;
        }
    }

    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{HAS_RECORD,FACING});
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return (Boolean)state.get(HAS_RECORD) ? validateTicker(type, ModBlockEntities.PARRADIO_BE, ParradioBlockEntity::tick) : null;
    }

    static {
        HAS_RECORD = Properties.HAS_RECORD;
    }

    protected static final VoxelShape Z_AXIS_SHAPE = Block.createCuboidShape(1.0, 0.0, 4.5, 15.0, 7.0, 11.5);
    protected static final VoxelShape X_AXIS_SHAPE = Block.createCuboidShape(4.5, 0.0, 1.0, 11.5, 7.0, 15.0);


    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction direction = state.get(FACING);
        return direction.getAxis() == Direction.Axis.X ? X_AXIS_SHAPE : Z_AXIS_SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }


}