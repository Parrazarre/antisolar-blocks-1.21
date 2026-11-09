package net.parra.antisolarblocks.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.CactusBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;
import net.parra.antisolarblocks.block.custom.GiantPotBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CactusBlock.class)
public class CactusBlockMixin {
    @Inject(method = "canPlaceAt", at = @At("HEAD"), cancellable = true)
    private void antisolar$potSoil(BlockState state, WorldView world, BlockPos pos,
                                   CallbackInfoReturnable<Boolean> cir) {
        BlockPos below = pos.down();
        if (!(world.getBlockState(below).getBlock() instanceof GiantPotBlock)) return;

        for (Direction dir : Direction.Type.HORIZONTAL) {
            BlockPos side = pos.offset(dir);
            if (world.getBlockState(side).isSolid()
                    || world.getFluidState(side).isIn(FluidTags.LAVA)) {
                cir.setReturnValue(false);
                return;
            }
        }

        boolean soilOk = GiantPotBlock.soilMatches(world, below, soil -> soil.isIn(BlockTags.SAND));
        cir.setReturnValue(soilOk && !world.getBlockState(pos.up()).isLiquid());
    }
}
