package net.parra.antisolarblocks.entity.custom;

import net.minecraft.entity.*;
import net.minecraft.entity.projectile.thrown.ThrownItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ItemStackParticleEffect;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.parra.antisolarblocks.item.ModItems;

public class CobbleProjectileEntity extends ThrownItemEntity{

    public CobbleProjectileEntity(EntityType<? extends CobbleProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public CobbleProjectileEntity(World world, LivingEntity owner) {
        super(EntityType.SNOWBALL, owner, world);
    }

    public CobbleProjectileEntity(World world, double x, double y, double z) {
        super(EntityType.SNOWBALL, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.COBBLE;
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getStack();
        return (ParticleEffect)(!itemStack.isEmpty() && !itemStack.isOf(this.getDefaultItem())
                ? new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack)
                : ParticleTypes.ITEM);
    }

    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            ParticleEffect particleEffect = this.getParticleParameters();

            for (int i = 0; i < 12; i++) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.5, 2.0, 0.5);
            }
        }
    }

    @Override
    protected void onEntityHit(EntityHitResult entityHitResult) {
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity();
        int i = 2;
        entity.damage(this.getDamageSources().thrown(this, this.getOwner()), (float)i);
        this.getWorld().playSound(
                null,
                this.getX(),
                this.getY(),
                this.getZ(),
                SoundEvents.ENTITY_ARROW_HIT_PLAYER,
                SoundCategory.NEUTRAL,
                1.0F,
                -2.0F
        );
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        super.onCollision(hitResult);
        if (!this.getWorld().isClient) {
            this.getWorld().playSound(
                    null,
                    this.getX(),
                    this.getY(),
                    this.getZ(),
                    SoundEvents.BLOCK_BASALT_BREAK,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    0.4F
            );
            this.getWorld().sendEntityStatus(this, EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES);
            this.discard();
        }
    }
}