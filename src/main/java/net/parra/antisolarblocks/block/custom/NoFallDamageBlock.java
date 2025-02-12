package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlimeBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class NoFallDamageBlock extends Block {
    public static final MapCodec<NoFallDamageBlock> CODEC = createCodec(NoFallDamageBlock::new);

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
            LivingEntity.FallSounds fallSounds = livingEntity.getFallSounds();
            SoundEvent soundEvent = (double)fallDistance < 7.0 ? fallSounds.small() : fallSounds.big();
            entity.playSound(soundEvent, 1.0F, 1.0F);
        }
    }
}
