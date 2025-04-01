package net.parra.antisolarblocks.block.entity;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.block.entity.custom.MoonstoneBlockEntity;

public class ModBlockEntityType {
    public static final BlockEntityType<MoonstoneBlockEntity> MOONSTONE_BLOCK_ENTITY = register("moonstone_block_entity",
            BlockEntityType.Builder.create(MoonstoneBlockEntity::new, ModBlocks.MOONSTONE)
                    .build());

    public static <T extends BlockEntity> BlockEntityType<T> register(String name, BlockEntityType<T> type) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(AntisolarBlocks.MOD_ID, name), type);
    }

    public static void registerModBlockEntityType() {
        AntisolarBlocks.LOGGER.info("Registering Mod Block Entities for " + AntisolarBlocks.MOD_ID);
    }
}
