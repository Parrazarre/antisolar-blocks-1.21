package net.parra.antisolarblocks.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.parra.antisolarblocks.entity.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

import java.awt.*;

public class TetoHoldingBlockEntity extends BlockEntity implements ImplementedInventory {
    private float rotato = 0f;
    private float time = 0f;
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(1, ItemStack.EMPTY);

    public TetoHoldingBlockEntity(BlockEntityType<?> type,BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    public float getBoobbing(){
        time += 0.1f; // controls oscillation speed

        float min = 0.03f;
        float max = 0.15f;
        float amplitude = (max - min) / 2f;
        float midpoint = (max + min) / 2f;

        return midpoint + amplitude * (float) Math.sin(time);
    }

    public float getRotato() {
        rotato += 0.8f;
        if(rotato > 360f) {
            rotato = 0f;
        }
        return rotato;
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.writeNbt(nbt, registryLookup);
        Inventories.writeNbt(nbt, inventory, registryLookup);
    }

    @Override
    protected void readNbt(NbtCompound nbt, RegistryWrapper.WrapperLookup registryLookup) {
        super.readNbt(nbt, registryLookup);
        Inventories.readNbt(nbt, inventory, registryLookup);
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt(RegistryWrapper.WrapperLookup registryLookup) {
        return createNbt(registryLookup);
    }


}
