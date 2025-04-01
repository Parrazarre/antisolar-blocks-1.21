package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.parra.antisolarblocks.block.entity.custom.MoonstoneBlockEntity;
import org.jetbrains.annotations.Nullable;

public class MoonstoneBlock extends BlockWithEntity {
    public static final MapCodec<MoonstoneBlock> CODEC = createCodec(MoonstoneBlock::new);

    @Override
    public MapCodec<MoonstoneBlock> getCodec() {
        return CODEC;
    }

    public MoonstoneBlock(Settings settings) {
        super(settings);
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new MoonstoneBlockEntity(pos, state);
    }

    @Override
    protected BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
