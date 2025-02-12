package net.parra.antisolarblocks.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

import java.util.Map;

public class MagicBlock extends TransparentBlock {
    public static final MapCodec<MagicBlock> CODEC = createCodec(MagicBlock::new);
    @Override
    public MapCodec<MagicBlock> getCodec() {
        return CODEC;
    }
    private static final VoxelShape SHAPE= Block.createCuboidShape(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 16.0F);
    public MagicBlock(Settings settings) {

        super(settings);
    }

    private Map<BlockState, VoxelShape> getShapeMap() {
        return null;
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        Vec3d vec3d = new Vec3d(2.0F, 1.0F, 2.0F);
        entity.slowMovement(state, vec3d);
    }
    @Override
    public void onEntityLand(BlockView world, Entity entity) {
        if (entity.bypassesLandingEffects()) {
            super.onEntityLand(world, entity);
        } else {
            this.bounce(entity);
        }
    }

    private void bounce(Entity entity) {
        Vec3d vec3d = entity.getVelocity();
        if (vec3d.y < 0.0) {
            double d = entity instanceof LivingEntity ? 1.05 : 1.0;
            entity.setVelocity(vec3d.x, -vec3d.y * d, vec3d.z);
        }
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        double d = Math.abs(entity.getVelocity().y);
        if (d < 0.1 && !entity.bypassesSteppingEffects()) {
            double e = 4.0 + d * 2.0;
            entity.setVelocity(entity.getVelocity().multiply(e, 1.0, e));
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
