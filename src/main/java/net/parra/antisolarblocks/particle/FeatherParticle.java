package net.parra.antisolarblocks.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.util.math.MathHelper;
import org.jetbrains.annotations.Nullable;

public class FeatherParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    protected FeatherParticle(
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
        this.velocityMultiplier = 0.96F;
        this.gravityStrength = gravityStrength;
        this.ascending = true;
        this.spriteProvider = spriteProvider;
        this.velocityX *= (double)randomVelocityXMultiplier;
        this.velocityY *= (double)randomVelocityYMultiplier;
        this.velocityZ *= (double)randomVelocityZMultiplier;
        this.velocityX += velocityX;
        this.velocityY += velocityY;
        this.velocityZ += velocityZ;
        this.scale *= 0.75F * scaleMultiplier;
        this.maxAge = (int)((double)baseMaxAge / ((double)world.random.nextFloat() * 0.8 + 0.2) * (double)scaleMultiplier);
        this.maxAge = Math.max(this.maxAge, 1);
        this.setSpriteForAge(spriteProvider);
        this.collidesWithWorld = collidesWithWorld;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public float getSize(float tickDelta) {
        return this.scale * MathHelper.clamp(((float)this.age + tickDelta) / (float)this.maxAge * 4.0F, 0.8F, 1.2F);
    }

    @Override
    public void tick() {
        super.tick();
        this.setSpriteForAge(this.spriteProvider);
    }


    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<SimpleParticleType> {
        private final SpriteProvider spriteProvider;

        public Factory(SpriteProvider spriteProvider) {
            this.spriteProvider = spriteProvider;
        }

        @Override
        public @Nullable Particle createParticle(SimpleParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            FeatherParticle featherParticle = new FeatherParticle(world, x, y, z, (float) velocityX, (float) velocityY, (float) velocityZ, velocityX, velocityY, velocityZ, 4.0F, this.spriteProvider, 10, 0.10F, true);
            featherParticle.setSprite(this.spriteProvider);
            return featherParticle;
        }
    }
}
