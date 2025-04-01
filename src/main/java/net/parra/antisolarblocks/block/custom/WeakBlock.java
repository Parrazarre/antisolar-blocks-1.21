package net.parra.antisolarblocks.block.custom;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.block.*;
import net.minecraft.block.enums.Tilt;
import net.minecraft.entity.Entity;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.particle.BlockStateParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Util;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class WeakBlock extends Block {
    public static final MapCodec<WeakBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(ColorCode.CODEC.fieldOf("falling_dust_color").forGetter(block -> block.color), createSettingsCodec())
                    .apply(instance, WeakBlock::new)
    );
    private final ColorCode color;
    private static final EnumProperty<Tilt> TILT = Properties.TILT;
    private static final Object2IntMap<Tilt> NEXT_TILT_DELAYS = Util.make(new Object2IntArrayMap<>(), delays -> {
        delays.defaultReturnValue(-1);
        delays.put(Tilt.UNSTABLE, 10);
        delays.put(Tilt.PARTIAL, 10);
        delays.put(Tilt.FULL, 100);
    });
    private static final Map<Tilt, VoxelShape> SHAPES_FOR_TILT = ImmutableMap.of(
            Tilt.NONE,
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.5, 16.0),
            Tilt.UNSTABLE,
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 15.0, 16.0),
            Tilt.PARTIAL,
            Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
            Tilt.FULL,
            VoxelShapes.empty()
    );

    public WeakBlock(ColorCode color, Settings settings) {
        super(settings);
        this.color = color;
        this.setDefaultState(this.stateManager.getDefaultState().with(TILT, Tilt.NONE));
        Map<BlockState, VoxelShape> shapes = this.getShapesForStates(WeakBlock::getShapeForState);
    }

    private static VoxelShape getShapeForState(BlockState state) {
        return VoxelShapes.union(SHAPES_FOR_TILT.get(state.get(TILT)));
    }

    @Override
    public MapCodec<WeakBlock> getCodec() {
        return CODEC;
    }


    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient) {
            if (state.get(TILT) == Tilt.NONE && isEntityAbove(pos, entity)) {
                this.changeTilt(state, world, pos, Tilt.UNSTABLE, null);
            }
        }
    }

    @Override
    protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return VoxelShapes.fullCube();
    }

    @Override
    protected VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
            Tilt tilt = state.get(TILT);
            if (tilt == Tilt.UNSTABLE) {
                this.changeTilt(state, world, pos, Tilt.PARTIAL, SoundEvents.INTENTIONALLY_EMPTY);
            } else if (tilt == Tilt.PARTIAL) {
                this.changeTilt(state, world, pos, Tilt.FULL, SoundEvents.INTENTIONALLY_EMPTY);
            } else if (tilt == Tilt.FULL) {
                if (canFallThrough(world.getBlockState(pos.down())) && pos.getY() >= world.getBottomY()) {
                    FallingBlockEntity fallingBlockEntity = FallingBlockEntity.spawnFromBlock(world, pos, state);
                    this.configureFallingBlockEntity(fallingBlockEntity);

                }
                resetTilt(state, world, pos);
            }
    }

    private static void playTiltSound(World world, BlockPos pos, SoundEvent soundEvent) {
        float f = MathHelper.nextBetween(world.random, 0.4F, 0.8F);
        world.playSound(null, pos, soundEvent, SoundCategory.BLOCKS, 0.3F, f);
    }

    private static boolean isEntityAbove(BlockPos pos, Entity entity) {
        return entity.isOnGround() && entity.getPos().y > (double)((float)pos.getY() + 0.6875F);
    }

    private void changeTilt(BlockState state, World world, BlockPos pos, Tilt tilt, @Nullable SoundEvent sound) {
        changeTilt(state, world, pos, tilt);
        if (sound != null) {
            playTiltSound(world, pos, sound);
        }

        int i = NEXT_TILT_DELAYS.getInt(tilt);
        if (i != -1) {
            world.scheduleBlockTick(pos, this, i);
        }
    }

    /**
     * Gets the amount of time in ticks this block will wait before attempting to start falling.
     */
    protected int getFallDelay() {
        return 2;
    }

    private static void changeTilt(BlockState state, World world, BlockPos pos, Tilt tilt) {
        Tilt tilt2 = state.get(TILT);
        world.setBlockState(pos, state.with(TILT, tilt), Block.NOTIFY_LISTENERS);
        if (tilt.isStable() && tilt != tilt2) {
            world.emitGameEvent(null, GameEvent.BLOCK_CHANGE, pos);
        }
    }

    private static void resetTilt(BlockState state, World world, BlockPos pos) {
        if (!canFallThrough(world.getBlockState(pos.down()))) {
        changeTilt(state, world, pos, Tilt.NONE);}
        if (state.get(TILT) != Tilt.NONE) {
            playTiltSound(world, pos, SoundEvents.BLOCK_STONE_PLACE);
        }
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return (VoxelShape)SHAPES_FOR_TILT.get(state.get(TILT));
    }

    @Override
    protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.fullCube();
    }

    protected void configureFallingBlockEntity(FallingBlockEntity entity) {
    }

    /**
     * Gets the amount of time in ticks this block will wait before attempting to start falling.
     */

    public static boolean canFallThrough(BlockState state) {
        return state.isAir() || state.isIn(BlockTags.FIRE) || state.isLiquid() || state.isReplaceable();
    }

    @Override
    protected void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(16) == 0) {
            BlockPos blockPos = pos.down();
            if (canFallThrough(world.getBlockState(blockPos))) {
                ParticleUtil.spawnParticle(world, pos, random, new BlockStateParticleEffect(ParticleTypes.FALLING_DUST, state));
            }
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(TILT);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        world.scheduleBlockTick(pos, this, this.getFallDelay());
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public int getColor(BlockState state, BlockView world, BlockPos pos) {
        return this.color.rgba();
    }
}
