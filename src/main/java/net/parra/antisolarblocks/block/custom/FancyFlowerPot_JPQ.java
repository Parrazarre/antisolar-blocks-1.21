package net.parra.antisolarblocks.block.custom;

import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;
import net.parra.antisolarblocks.block.ModBlocks;

import java.util.List;
import java.util.Map;

public class FancyFlowerPot_JPQ extends Block {
    public static final MapCodec<FancyFlowerPot_JPQ> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(Registries.BLOCK.getCodec().fieldOf("fancy_potted_japanese_quince").forGetter(block -> block.content), createSettingsCodec())
                    .apply(instance, FancyFlowerPot_JPQ::new)
    );
    private static final Map<Block, Block> CONTENT_TO_POTTED = Maps.<Block, Block>newHashMap();
    public static final float field_31095 = 3.0F;
    protected static final VoxelShape SHAPE_1 = Block.createCuboidShape(5.0, 0.0, 5.0, 11.0, 2.0, 11.0);
    protected static final VoxelShape SHAPE_2 = Block.createCuboidShape(4.5, 2.0, 4.5, 11.5, 4.0, 11.5);
    protected static final VoxelShape SHAPE_3 = Block.createCuboidShape(4.0, 4.0, 4.0, 12.0, 9.0, 12.0);
    protected static final VoxelShape SHAPE_4 = Block.createCuboidShape(4.5, 9.0, 4.5, 11.5, 10.0, 11.5);
    protected static final VoxelShape SHAPE_5 = Block.createCuboidShape(5.0, 10.0, 5.0, 11.0, 11.0, 11.0);
    protected static final VoxelShape SHAPE_6 = Block.createCuboidShape(4.0, 11.0, 4.0, 12.0, 12.0, 12.0);
    protected static final VoxelShape SHAPE = VoxelShapes.union(SHAPE_1, SHAPE_2, SHAPE_3, SHAPE_4, SHAPE_5, SHAPE_6);
    public final Block content;

    @Override
    public MapCodec<FancyFlowerPot_JPQ> getCodec() {
        return CODEC;
    }

    public FancyFlowerPot_JPQ(Block content, Settings settings) {
        super(settings);
        this.content = content;
        CONTENT_TO_POTTED.put(content, this);
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        BlockState blockState = (stack.getItem() instanceof BlockItem blockItem
                ? (Block)CONTENT_TO_POTTED.getOrDefault(blockItem.getBlock(), Blocks.AIR)
                : Blocks.AIR)
                .getDefaultState();
        if (blockState.isAir()) {
            return ItemActionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
        } else if (!this.isEmpty()) {
            return ItemActionResult.CONSUME;
        } else {
            world.setBlockState(pos, blockState, Block.NOTIFY_ALL);
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            player.incrementStat(Stats.POT_FLOWER);
            stack.decrementUnlessCreative(1, player);
            return ItemActionResult.success(world.isClient);
        }
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (this.isEmpty()) {
            return ActionResult.CONSUME;
        } else {
            ItemStack itemStack = new ItemStack(this.content);
            if (!player.giveItemStack(itemStack)) {
                player.dropItem(itemStack, false);
            }

            world.setBlockState(pos, ModBlocks.FANCY_JAPANESE_QUINCE_POT.getDefaultState(), Block.NOTIFY_ALL);
            world.emitGameEvent(player, GameEvent.BLOCK_CHANGE, pos);
            return ActionResult.success(world.isClient);
        }
    }

    @Override
    public ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state) {
        return this.isEmpty() ? super.getPickStack(world, pos, state) : new ItemStack(this.content);
    }

    private boolean isEmpty() {
        return this.content == Blocks.AIR;
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        return direction == Direction.DOWN && !state.canPlaceAt(world, pos)
                ? Blocks.AIR.getDefaultState()
                : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public Block getContent() {
        return this.content;
    }

    @Override
    protected boolean canPathfindThrough(BlockState state, NavigationType type) {
        return false;
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("tooltip.antisolarblocks.info.fancy_pot"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}