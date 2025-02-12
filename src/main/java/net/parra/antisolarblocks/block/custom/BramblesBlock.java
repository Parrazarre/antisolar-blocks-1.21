package net.parra.antisolarblocks.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.CobwebBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class BramblesBlock extends CobwebBlock {
    public BramblesBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        Vec3d vec3d = new Vec3d(0.9, 0.0F, 0.9);
        entity.slowMovement(state, vec3d);

        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (!entity.isInvulnerableTo(world.getDamageSources().generic()) && entity.getType() != EntityType.ITEM) {
                entity.damage(world.getDamageSources().generic(), 0.8F);
            }
        } else {
            if (!entity.isInvulnerableTo(world.getDamageSources().generic()) && entity.getType() != EntityType.ITEM) {
                entity.damage(world.getDamageSources().generic(), 0.4F);
            }
        }
    }
}
