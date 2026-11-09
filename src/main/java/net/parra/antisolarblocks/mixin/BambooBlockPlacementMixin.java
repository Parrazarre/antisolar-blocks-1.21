package net.parra.antisolarblocks.mixin;

import net.minecraft.block.BambooBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.parra.antisolarblocks.block.custom.GiantPotBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import net.minecraft.registry.tag.BlockTags;

@Mixin(BambooBlock.class)
public class BambooBlockPlacementMixin {
    @Inject(method = "getPlacementState", at = @At("HEAD"), cancellable = true)
    private void antisolar$potPlacement(ItemPlacementContext ctx,
                                        CallbackInfoReturnable<BlockState> cir) {
        World world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();
        BlockPos below = pos.down();

        if (!(world.getBlockState(below).getBlock() instanceof GiantPotBlock)) return;

        if (!world.getFluidState(pos).isEmpty()) {
            cir.setReturnValue(null);
            return;
        }

        boolean soilOk = GiantPotBlock.soilMatches(world, below,
                soil -> soil.isIn(BlockTags.BAMBOO_PLANTABLE_ON));

        // Planting bamboo directly on the pot always starts as a sapling
        cir.setReturnValue(soilOk ? Blocks.BAMBOO_SAPLING.getDefaultState() : null);
    }
}