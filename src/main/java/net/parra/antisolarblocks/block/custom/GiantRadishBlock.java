package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class GiantRadishBlock extends TranslucentBlock {
    public static final BooleanProperty ON = BooleanProperty.of("on");

    public static final MapCodec<GiantRadishBlock> CODEC =
            GiantRadishBlock.createCodec(GiantRadishBlock::new);

    protected static final VoxelShape SHAPE_1 = Block.createCuboidShape(0.0, 4.0, 0.0, 16.0, 16.0, 16.0);
    protected static final VoxelShape SHAPE_2 = Block.createCuboidShape(1.0, 2.0, 1.0, 15.0, 4.0, 15.0);
    protected static final VoxelShape SHAPE_3 = Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 2.0, 14.0);
    protected static final VoxelShape SHAPE = VoxelShapes.union(SHAPE_1, SHAPE_2, SHAPE_3);

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    public GiantRadishBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState().with(ON, true));
    }

    @Override
    protected MapCodec<? extends GiantRadishBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(ON);
    }

    @Override
    protected ActionResult onUse(
            BlockState state,
            World world,
            BlockPos pos,
            PlayerEntity player,
            BlockHitResult hit
    ) {
        if (!player.getAbilities().allowModifyWorld) {
            return ActionResult.PASS;
        }

        if (!world.isClient) {
            boolean currentOn = state.get(ON);

            world.setBlockState(
                    pos,
                    state.with(ON, !currentOn)
            );
        }

        return ActionResult.SUCCESS;
    }
}
