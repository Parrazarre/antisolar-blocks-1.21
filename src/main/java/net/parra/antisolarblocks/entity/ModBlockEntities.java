package net.parra.antisolarblocks.entity;

import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.entity.custom.PotteryKilnBlockEntity;

public class ModBlockEntities {

    public static final BlockEntityType<PotteryKilnBlockEntity> POTTERY_KILN_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(AntisolarBlocks.MOD_ID, "pottery_kiln_be"),
                    BlockEntityType.Builder.create(PotteryKilnBlockEntity::new, ModBlocks.POTTERY_KILN).build(null));

    public static void registerModBlockEntities() {
        AntisolarBlocks.LOGGER.info("Registering Mod Block Entities for " + AntisolarBlocks.MOD_ID);
    }
}
