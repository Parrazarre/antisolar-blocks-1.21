package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import net.parra.antisolarblocks.block.ModBlocks;

public class ShortEffectPlantBlock extends PlantBlock implements Fertilizable {
    public static final MapCodec<ShortEffectPlantBlock> CODEC = createCodec(ShortEffectPlantBlock::new);
    protected static final VoxelShape SHAPE = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    @Override
    public MapCodec<ShortEffectPlantBlock> getCodec() {
        return CODEC;
    }

    public ShortEffectPlantBlock(AbstractBlock.Settings settings) {
        super(settings);
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity livingEntity && !livingEntity.isInvulnerableTo(world.getDamageSources().generic())) {
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, 205));
            }
        }
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        TallEffectPlantBlock tallEffectPlantBlock = (TallEffectPlantBlock)(ModBlocks.TALL_STINGING_NETTLE);
        if (tallEffectPlantBlock.getDefaultState().canPlaceAt(world, pos) && world.isAir(pos.up())) {
            TallEffectPlantBlock.placeAt(world, tallEffectPlantBlock.getDefaultState(), pos, 2);
        }
    }
}
