package net.parra.antisolarblocks.block.entity;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;

public class ModBlockEntityType {
    public static <T extends BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> type) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(AntisolarBlocks.MOD_ID, name), type);
    }

    public static void registerModBlockEntityType() {
        AntisolarBlocks.LOGGER.info("Registering Mod Block Entities for " + AntisolarBlocks.MOD_ID);
    }
}
