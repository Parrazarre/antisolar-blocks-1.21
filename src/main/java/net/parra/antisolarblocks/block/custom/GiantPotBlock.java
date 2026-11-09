package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Equipment;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.*;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.parra.antisolarblocks.entity.ModBlockEntities;
import net.parra.antisolarblocks.entity.custom.GiantPotBlockEntity;
import java.util.function.Predicate;

import java.util.Optional;

public class GiantPotBlock extends BlockWithEntity implements Equipment,BlockEntityProvider {
    public static final MapCodec<GiantPotBlock> CODEC = createCodec(GiantPotBlock::new);

    protected static final VoxelShape SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 16.0, 16.0);


    public GiantPotBlock(Settings settings) {
        super(settings);
    }

    @Override
    public MapCodec<GiantPotBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GiantPotBlockEntity(ModBlockEntities.SOIL_BE, pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    @Override
    protected void onStateReplaced(BlockState state, World world, BlockPos pos, BlockState newState, boolean moved) {
        if(state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if(blockEntity instanceof GiantPotBlockEntity) {
                ItemScatterer.spawn(world, pos, ((GiantPotBlockEntity) blockEntity));
                world.updateComparators(pos, this);
            }
            super.onStateReplaced(state, world, pos, newState, moved);
        }
    }

    private static boolean isFullOpaqueBlock(ItemStack stack, World world, BlockPos pos) {
        if (!(stack.getItem() instanceof BlockItem blockItem)) {
            return false;
        }
        return blockItem.getBlock().getDefaultState().isOpaqueFullCube(world, pos);
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos,
                                             PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (world.getBlockEntity(pos) instanceof GiantPotBlockEntity giantPotBlockEntity) {
            if (giantPotBlockEntity.isEmpty() && !stack.isEmpty()) {
                if (!isFullOpaqueBlock(stack, world, pos)) {
                    return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION; // reject non-full / transparent blocks
                }

                giantPotBlockEntity.setStack(0, stack.copyWithCount(1));
                world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 2f);

                if (!player.isCreative()) {
                    stack.decrement(1);
                }

                giantPotBlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
                notifyPlantAbove(world, pos, state);
            } else if (stack.isEmpty() && !player.isSneaking()) {
                ItemStack stackOnPedestal = giantPotBlockEntity.getStack(0);
                player.setStackInHand(Hand.MAIN_HAND, stackOnPedestal);
                world.playSound(player, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1f, 1f);
                giantPotBlockEntity.clear();

                giantPotBlockEntity.markDirty();
                world.updateListeners(pos, state, state, 0);
                notifyPlantAbove(world, pos, state);
            }
        }

        return ItemActionResult.SUCCESS;
    }

    private void notifyPlantAbove(World world, BlockPos pos, BlockState state) {
        if (world.isClient) {
            return;
        }

        state.updateNeighbors(world, pos, Block.NOTIFY_ALL);

        BlockPos above = pos.up();
        BlockState aboveState = world.getBlockState(above);
        if (!aboveState.isAir()) {
            world.scheduleBlockTick(above, aboveState.getBlock(), 1);
        }
    }

    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }

    public static Optional<BlockState> getSoil(BlockView world, BlockPos potPos) {
        if (world.getBlockEntity(potPos) instanceof GiantPotBlockEntity pot
                && !pot.isEmpty()
                && pot.getStack(0).getItem() instanceof BlockItem blockItem) {
            return Optional.of(blockItem.getBlock().getDefaultState());
        }
        return Optional.empty();
    }

    public static boolean soilMatches(BlockView world, BlockPos potPos, Predicate<BlockState> test) {
        return getSoil(world, potPos).map(test::test).orElse(false);
    }
}
