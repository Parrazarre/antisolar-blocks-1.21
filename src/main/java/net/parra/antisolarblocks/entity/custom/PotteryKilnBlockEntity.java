package net.parra.antisolarblocks.entity.custom;


import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.FurnaceScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.entity.ModBlockEntities;
import net.parra.antisolarblocks.screen.custom.PotteryKilnScreenHandler;
import org.jetbrains.annotations.Nullable;

public class PotteryKilnBlockEntity extends AbstractFurnaceBlockEntity implements ExtendedScreenHandlerFactory<BlockPos> {
    public static final Text TITLE = Text.literal("container." + AntisolarBlocks.MOD_ID + ".pottery_kiln");


    public PotteryKilnBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.POTTERY_KILN_BE, pos, state, RecipeType.SMELTING);
    }

    @Override
    protected Text getContainerName() {
        return Text.translatable("tooltip.antisolarblocks.container.pottery_kiln");
    }

    @Override
    protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
        return new FurnaceScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
    }

    public BlockPos getScreenOpeningData(ServerPlayerEntity player) {
        return this.pos;
    }

    @Override
    public Text getDisplayName(){
        return TITLE;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return new PotteryKilnScreenHandler(syncId, playerInventory, this.pos);
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

}

