package net.parra.antisolarblocks.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;

public class PotteryKilnScreen extends HandledScreen<PotteryKilnScreenHandler> {

    private static final Identifier GUI_TEXTURE =
            Identifier.of(
                    AntisolarBlocks.MOD_ID,
                    "textures/gui/container/kiln.png"
            );

    private static final int GUI_WIDTH = 176;
    private static final int GUI_HEIGHT = 166;

    public PotteryKilnScreen(
            PotteryKilnScreenHandler handler,
            PlayerInventory inventory,
            Text title
    ) {
        super(handler, inventory, title);

        this.backgroundWidth = GUI_WIDTH;
        this.backgroundHeight = GUI_HEIGHT;
    }

    @Override
    protected void drawBackground(
            DrawContext context,
            float delta,
            int mouseX,
            int mouseY
    ) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);

        context.drawTexture(
                GUI_TEXTURE,
                this.x,
                this.y,
                0,
                0,
                GUI_WIDTH,
                GUI_HEIGHT,
                256,
                256
        );

        int progressWidth = this.handler.getScaledProgress(24);

        if (progressWidth > 0) {
            context.drawTexture(
                    GUI_TEXTURE,

                    // Screen position
                    this.x + 76,
                    this.y + 16,

                    // Texture position
                    176,
                    14,

                    // Size to draw
                    progressWidth,
                    16,

                    // Full texture size
                    256,
                    256
            );
        }

        int fuelHeight = this.handler.getScaledFuel(14);

        if (fuelHeight > 0) {
            context.drawTexture(
                    GUI_TEXTURE,

                    // Screen position
                    this.x + 80,
                    this.y + 36 + (14 - fuelHeight),

                    // Texture position — V now shifts too
                    176,
                    14 - fuelHeight,

                    // Size to draw
                    14,
                    fuelHeight,

                    // Full texture size
                    256,
                    256
            );
        }
    }

    @Override
    public void render(
            DrawContext context,
            int mouseX,
            int mouseY,
            float delta
    ) {
        this.renderBackground(context, mouseX, mouseY, delta);

        super.render(context, mouseX, mouseY, delta);

        this.drawMouseoverTooltip(context, mouseX, mouseY);
    }
}