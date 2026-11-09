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
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.parra.antisolarblocks.entity.ModEntities;
import net.parra.antisolarblocks.item.ModItems;

public class CobbleProjectileEntity extends ThrownItemEntity {

    private static final int MAX_BOUNCES = 4;
    private int bounceCount = 0;

    public CobbleProjectileEntity(EntityType<? extends CobbleProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public CobbleProjectileEntity(World world, LivingEntity owner) {
        super(ModEntities.COBBLE, owner, world);
    }

    public CobbleProjectileEntity(World world, double x, double y, double z) {
        super(ModEntities.COBBLE, x, y, z, world);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.COBBLE;
    }

    private ParticleEffect getParticleParameters() {
        ItemStack itemStack = this.getStack();
        if (itemStack.isEmpty()) {
            itemStack = new ItemStack(this.getDefaultItem());
        }
        return new ItemStackParticleEffect(ParticleTypes.ITEM, itemStack);
    }

    @Override
    public void handleStatus(byte status) {
        if (status == EntityStatuses.PLAY_DEATH_SOUND_OR_ADD_PROJECTILE_HIT_PARTICLES) {
            ParticleEffect particleEffect = this.getParticleParameters();

            for (int i = 0; i < 12; i++) {
                this.getWorld().addParticle(particleEffect, this.getX(), this.getY(), this.getZ(), 0.5, 0.5, 0.5);
            }
        }
    }

    @Override
    public void tick() {
        super.tick();

        if (!this.getWorld().isClient
                && bounceCount < MAX_BOUNCES
                && this.isTouchingWater()
                && this.getVelocity().y < 0.0) {

            Vec3d velocity = this.getVelocity();
            this.setVelocity(velocity.x * 0.9, -velocity.y * 1.1, velocity.z * 0.9);
            bounceCount++;

            this.getWorld().playSound(
                    null,
                    this.getX(),
                    this.getY(),
                    this.getZ(),
                    SoundEvents.ENTITY_FISHING_BOBBER_SPLASH,
                    SoundCategory.NEUTRAL,
                    0.5F,
                    1.2F
            );
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