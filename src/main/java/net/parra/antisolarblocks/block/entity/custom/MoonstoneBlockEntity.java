package net.parra.antisolarblocks.block.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.parra.antisolarblocks.block.entity.ModBlockEntityType;

public class MoonstoneBlockEntity extends BlockEntity{
    public MoonstoneBlockEntity( BlockPos pos, BlockState state) {
        super(ModBlockEntityType.MOONSTONE_BLOCK_ENTITY, pos, state);
    }
}
