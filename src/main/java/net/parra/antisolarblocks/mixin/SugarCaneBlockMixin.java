package net.parra.antisolarblocks.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SugarCaneBlock;
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

@Mixin(SugarCaneBlock.class)
public class SugarCaneBlockMixin {
    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void antisolar$potSoil(BlockState state, WorldView world, BlockPos pos,
                                   CallbackInfoReturnable<Boolean> cir) {
        BlockPos below = pos.down();
        if (!(world.getBlockState(below).getBlock() instanceof GiantPotBlock)) return;

        boolean soilOk = GiantPotBlock.soilMatches(world, below,
                soil -> soil.isIn(BlockTags.DIRT) || soil.isIn(BlockTags.SAND));
        boolean waterNear = false;
        if (soilOk) {
            for (Direction dir : Direction.Type.HORIZONTAL) {
                BlockPos side = below.offset(dir);
                if (world.getFluidState(side).isIn(FluidTags.WATER)
                        || world.getBlockState(side).isOf(Blocks.FROSTED_ICE)) {
                    waterNear = true;
                    break;
                }
            }
        }
        cir.setReturnValue(soilOk && waterNear);
    }
}
