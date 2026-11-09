package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.parra.antisolarblocks.entity.ModBlockEntities;
import net.parra.antisolarblocks.entity.custom.PotteryKilnBlockEntity;
import org.jetbrains.annotations.Nullable;

public class PotteryKilnBlock extends AbstractFurnaceBlock implements BlockEntityProvider {

    private static final VoxelShape SHAPE =
            Block.createCuboidShape(0, 0, 0, 16, 16, 16);

    public static final MapCodec<PotteryKilnBlock> CODEC =
            PotteryKilnBlock.createCodec(PotteryKilnBlock::new);

    public PotteryKilnBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends AbstractFurnaceBlock> getCodec() {
        return CODEC;
    }

    @Nullable
    protected ActionResult onUse(
            ItemStack itemStack,
            BlockState blockState,
            World world,
            BlockPos pos,
            PlayerEntity player,
            Hand hand,
            BlockHitResult hit
    ) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }

        NamedScreenHandlerFactory factory =
                this.createScreenHandlerFactory(blockState, world, pos);

        if (factory != null) {
            player.openHandledScreen(factory);
        }

        return ActionResult.CONSUME;
    }

    @Override
    protected VoxelShape getOutlineShape(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        return SHAPE;
    }

    @Override
    protected void openScreen(
            World world,
            BlockPos pos,
            PlayerEntity player
    ) {
        BlockEntity blockEntity = world.getBlockEntity(pos);

        if (blockEntity instanceof PotteryKilnBlockEntity kiln) {
            player.openHandledScreen(kiln);
        }
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(
            World world,
            BlockState state,
            BlockEntityType<T> type
    ) {
        return validateTicker(
                type,
                ModBlockEntities.POTTERY_KILN_BE,
                PotteryKilnBlockEntity::tick
        );
    }

    @Override
    protected void onStateReplaced(
            BlockState state,
            World world,
            BlockPos pos,
            BlockState newState,
            boolean moved
    ) {
        if (!state.isOf(newState.getBlock())) {

            BlockEntity blockEntity = world.getBlockEntity(pos);

            if (blockEntity instanceof PotteryKilnBlockEntity) {

                if (world instanceof ServerWorld) {
                    ItemScatterer.spawn(
                            world,
                            pos,
                            (Inventory) blockEntity
                    );
                }

                super.onStateReplaced(
                        state,
                        world,
                        pos,
                        newState,
                        moved
                );

                world.updateComparators(pos, this);

            } else {
                super.onStateReplaced(
                        state,
                        world,
                        pos,
                        newState,
                        moved
                );
            }
        }
    }

    @Override
    public BlockEntity createBlockEntity(
            BlockPos pos,
            BlockState state
    ) {
        return new PotteryKilnBlockEntity(pos, state);
    }

    @Override
    public void randomDisplayTick(
            BlockState state,
            World world,
            BlockPos pos,
            Random random
    ) {
        if (state.get(LIT)) {

            double d = pos.getX() + 0.5;
            double e = pos.getY() + 0.2;
            double f = pos.getZ() + 0.5;

            if (random.nextDouble() < 0.1) {
                world.playSound(
                        d,
                        e,
                        f,
                        SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE,
                        SoundCategory.BLOCKS,
                        1.0F,
                        1.0F,
                        false
                );
            }

            Direction direction = state.get(FACING);
            Direction.Axis axis = direction.getAxis();

            double h = random.nextDouble() * 0.6 - 0.3;

            double i = axis == Direction.Axis.X
                    ? direction.getOffsetX() * 0.52
                    : h;

            double j = random.nextDouble() * 6.0 / 16.0;

            double k = axis == Direction.Axis.Z
                    ? direction.getOffsetZ() * 0.52
                    : h;

            world.addParticle(
                    ParticleTypes.SMOKE,
                    d + i,
                    e + j,
                    f + k,
                    0.0,
                    0.0,
                    0.0
            );

            world.addParticle(
                    ParticleTypes.FLAME,
                    d + i,
                    e + j,
                    f + k,
                    0.0,
                    0.0,
                    0.0
            );
        }
    }
}