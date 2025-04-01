package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.particle.BlockDustParticle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.particle.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.parra.antisolarblocks.particle.ModParticles;
import org.joml.Vector3f;

public class NoFallDamageBlock extends Block {
    public static final MapCodec<NoFallDamageBlock> CODEC = createCodec(NoFallDamageBlock::new);

    public Vector3f getFeatherColor() {
    return new Vector3f(1.0F, 1.0F, 1.0F);
    }

    @Override
    public MapCodec<NoFallDamageBlock> getCodec() {
        return CODEC;
    }

    public NoFallDamageBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (entity.bypassesLandingEffects()) {
            super.onLandedUpon(world, state, pos, entity, fallDistance);
        } else {
            entity.handleFallDamage(fallDistance, 0.0F, world.getDamageSources().fall());

        }
        if (!((double)fallDistance < 4.0) && entity instanceof LivingEntity livingEntity) {
            SoundEvent soundEvent = (double)fallDistance < 7.0 ? SoundEvents.BLOCK_WOOL_PLACE : SoundEvents.BLOCK_WOOL_BREAK;
            entity.playSound(soundEvent, 1.0F, 1.0F);
            if(!world.isClient()){
                ((ServerWorld) world).spawnParticles(ModParticles.FEATHER_PARTICLE
                        , entity.getX()
                        , entity.getY() + 0.5F
                        , entity.getZ()
                        ,200, 0.9, 0.2, 0.9, 0.1
                );
            }
        } else {
            if(!world.isClient()){
                ((ServerWorld) world).spawnParticles(ModParticles.FEATHER_PARTICLE
                        , entity.getX()
                        , entity.getY() + 0.5F
                        , entity.getZ()
                        ,20, 0.2, 0.1, 0.2, 0.1
                );
            }
        }
    }
}
