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
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.parra.antisolarblocks.entity.custom.GiantPotBlockEntity;

public class GiantPotBlockEntityRenderer implements BlockEntityRenderer<GiantPotBlockEntity> {
    public GiantPotBlockEntityRenderer(BlockEntityRendererFactory.Context context) {

    }

    @Override
    public void render(GiantPotBlockEntity entity, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light, int overlay) {
        ItemRenderer itemRenderer = MinecraftClient.getInstance().getItemRenderer();
        ItemStack stack = entity.getStack(0);
        matrices.push();

        matrices.translate(0.5f, 0.0f, 0.5f);
        matrices.scale(3.2f, 3.2f, 3.2f);

        itemRenderer.renderItem(stack, ModelTransformationMode.GROUND, getLightLevel(entity.getWorld(),
                entity.getPos()), OverlayTexture.DEFAULT_UV, matrices, vertexConsumers, entity.getWorld(), 1);

        matrices.pop();
    }

    private int getLightLevel(World world, BlockPos pos) {
        int bLight = 0;
        int sLight = 0;

        for (Direction dir : Direction.values()) {
            BlockPos neighbor = pos.offset(dir);
            bLight = Math.max(bLight, world.getLightLevel(LightType.BLOCK, neighbor));
            sLight = Math.max(sLight, world.getLightLevel(LightType.SKY, neighbor));
        }

        return LightmapTextureManager.pack(bLight, sLight);
    }
}