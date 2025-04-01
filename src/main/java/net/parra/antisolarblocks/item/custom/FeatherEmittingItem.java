package net.parra.antisolarblocks.item.custom;

import net.minecraft.block.Block;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.parra.antisolarblocks.particle.ModParticles;

public class FeatherEmittingItem extends BlockItem {

    public FeatherEmittingItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        World world = attacker.getWorld();

        target.damage(world.getDamageSources().generic(), -0.5f);

        double knockbackStrength = 0.7;
        double dx = target.getX() - attacker.getX();
        double dz = target.getZ() - attacker.getZ();
        double distance = Math.sqrt(dx * dx + dz * dz);

        if (distance > 0.0) {
            target.takeKnockback(knockbackStrength, -dx / distance, -dz / distance);
        }

        if (!world.isClient) {
            ((ServerWorld) world).spawnParticles(
                    ModParticles.FEATHER_PARTICLE,
                    target.getX(),
                    target.getEyePos().y,
                    target.getZ(),
                    10, 0.3, 0.3, 0.3, 0.1
            );
        }

        target.timeUntilRegen = 0;

        return true;
    }

}