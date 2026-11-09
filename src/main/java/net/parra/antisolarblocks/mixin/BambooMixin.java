package net.parra.antisolarblocks.mixin;

import net.minecraft.block.BambooBlock;
import net.minecraft.block.BambooShootBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.CactusBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldView;
import net.parra.antisolarblocks.block.custom.GiantPotBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({BambooBlock.class, BambooShootBlock.class})
public class BambooMixin {
    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void antisolar$potSoil(BlockState state, WorldView world, BlockPos pos,
                                   CallbackInfoReturnable<Boolean> cir) {
        BlockPos below = pos.down();
        if (world.getBlockState(below).getBlock() instanceof GiantPotBlock) {
            cir.setReturnValue(GiantPotBlock.soilMatches(world, below,
                    soil -> soil.isIn(BlockTags.BAMBOO_PLANTABLE_ON)));
        }
    }
}
