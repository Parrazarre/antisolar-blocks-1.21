package net.parra.antisolarblocks.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SmallDripleafBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.parra.antisolarblocks.block.custom.GiantPotBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SmallDripleafBlock.class)
public class SmallDripleafBlockMixin {
    @Inject(method = "canPlantOnTop", at = @At("HEAD"), cancellable = true)
    private void antisolar$potSoil(BlockState floor, BlockView world, BlockPos pos,
                                   CallbackInfoReturnable<Boolean> cir) {
        // pos is the block below the plant, i.e. the pot
        if (!(floor.getBlock() instanceof GiantPotBlock)) return;

        boolean inWater = world.getFluidState(pos.up()).isOf(Fluids.WATER);

        cir.setReturnValue(GiantPotBlock.soilMatches(world, pos, soil ->
                soil.isIn(BlockTags.SMALL_DRIPLEAF_PLACEABLE)
                        || (inWater && (soil.isIn(BlockTags.DIRT) || soil.isOf(Blocks.FARMLAND)))));
    }
}
