package net.parra.antisolarblocks.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class DarkPlumeParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    protected DarkPlumeParticle(
            ClientWorld world,
            double x,
            double y,
            double z,
            float randomVelocityXMultiplier,
            float randomVelocityYMultiplier,
            float randomVelocityZMultiplier,
            double velocityX,
            double velocityY,
            double velocityZ,
            float scaleMultiplier,
            SpriteProvider spriteProvider,
            int baseMaxAge,
            float gravityStrength,
            boolean collidesWithWorld
    ) {
        super(world, x, y, z, 0.0, 0.0, 0.0);
        this.gravityStrength = 3.0E-6F;
        this.ascending = true;
        this.spriteProvider = spriteProvider;
        this.velocityX *= (double)randomVelocityXMultiplier;
        this.velocityY *= (double)randomVelocityYMultiplier;
        this.velocityZ *= (double)randomVelocityZMultiplier;
        this.velocityX += velocityX;
        this.velocityY = velocityY + (double)(this.random.nextFloat() / 500.0F);
        this.velocityZ += velocityZ;
        this.scale *= 0.75F * scaleMultiplier;
        this.maxAge = (int)((double)baseMaxAge / ((double)world.random.nextFloat() * 0.8 + 0.2) * (double)scaleMultiplier);
        this.maxAge = Math.max(this.maxAge, 1);
        this.setSpriteForAge(spriteProvider);
        this.collidesWithWorld = collidesWithWorld;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Override
    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;
        if (this.age++ < this.maxAge && !(this.alpha <= 0.0F)) {
            this.velocityX = this.velocityX + (double)(this.random.nextFloat() / 5000.0F * (float)(this.random.nextBoolean() ? 1 : -1));
            this.velocityZ = this.velocityZ + (double)(this.random.nextFloat() / 5000.0F * (float)(this.random.nextBoolean() ? 1 : -1));
            this.velocityY = this.velocityY - (double)this.gravityStrength;
            this.move(this.velocityX, this.velocityY, this.velocityZ);
            if (this.age >= this.maxAge - 20 && this.alpha > 0.01F) {
                this.alpha -= 0.015F;
            }
        } else {
            this.markDead();
        }
    }


    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            DarkPlumeParticle darkPlumeParticle = new DarkPlumeParticle(world, x, y, z, (float) velocityX, (float) velocityY, (float) velocityZ, velocityX, velocityY, velocityZ, 1.0F, this.spriteProvider, 5, 1.00F, true);
            darkPlumeParticle.setAlpha(0.95F);
            darkPlumeParticle.setSprite(this.spriteProvider);
            return darkPlumeParticle;
        }
    }
}
