package net.parra.antisolarblocks.entity.renderer;

import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.parra.antisolarblocks.block.custom.TetoHoldingBlock;
import net.parra.antisolarblocks.entity.custom.TetoHoldingBlockEntity;

public class TetoHoldingBlockEntityRenderer implements BlockEntityRenderer<TetoHoldingBlockEntity> {
    public TetoHoldingBlockEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(TetoHoldingBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = entity.getStack(0);

        BlockState state = entity.getCachedState();
        Direction facing = state.contains(TetoHoldingBlock.FACING)
                ? state.get(TetoHoldingBlock.FACING)
                : Direction.NORTH;

        matrices.push();

        if (facing == Direction.NORTH) {
            matrices.translate(0.5f, (entity.getBoobbing()), 0.8f);
            matrices.scale(0.75f, 0.75f, 0.75f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.getRotato()));
        } else if (facing == Direction.SOUTH) {
            matrices.translate(0.5f, (entity.getBoobbing()), 0.2f);
            matrices.scale(0.75f, 0.75f, 0.75f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.getRotato()));
        } else if (facing == Direction.EAST) {
            matrices.translate(0.2f, (entity.getBoobbing()), 0.5f);
            matrices.scale(0.75f, 0.75f, 0.75f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.getRotato()));
        } else if (facing == Direction.WEST) {
            matrices.translate(0.8f, (entity.getBoobbing()), 0.5f);
            matrices.scale(0.75f, 0.75f, 0.75f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.getRotato()));
        } else {
            matrices.translate(0.5f, (entity.getBoobbing()), 0.2f);
            matrices.scale(0.75f, 0.75f, 0.75f);
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.getRotato()));
        }

        itemRenderer.renderItem(stack, ModelTransformationMode.GROUND, getLightLevel(entity.getWorld(),
                entity.getPos()), OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 1);

        matrices.pop();
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = world.getLightLevel(LightType.BLOCK, pos);
        int sLight = world.getLightLevel(LightType.SKY, pos);
        return LightmapTextureManager.pack(bLight, sLight);
    }
}