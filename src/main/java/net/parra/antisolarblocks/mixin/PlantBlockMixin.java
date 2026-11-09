package net.parra.antisolarblocks.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.parra.antisolarblocks.block.custom.GiantPotBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlantBlock.class)
public abstract class PlantBlockMixin {
    @Shadow protected abstract boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos);

    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void antisolar$potSoil(BlockState state, WorldView world, BlockPos pos,
                                   CallbackInfoReturnable<Boolean> cir) {
        BlockPos below = pos.down();
        if (world.getBlockState(below).getBlock() instanceof GiantPotBlock) {
            cir.setReturnValue(GiantPotBlock.soilMatches(world, below,
                    soil -> this.canPlantOnTop(soil, world, below)));
        }
    }
}
