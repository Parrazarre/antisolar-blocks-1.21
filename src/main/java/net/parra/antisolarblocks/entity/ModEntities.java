package net.parra.antisolarblocks.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.entity.custom.CobbleProjectileEntity;

public class ModEntities {

    public static final EntityType<CobbleProjectileEntity> COBBLE = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(AntisolarBlocks.MOD_ID, "cobble_thrown"),
            EntityType.Builder
                    .<CobbleProjectileEntity>create(CobbleProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.25F, 0.25F)
                    .maxTrackingRange(4)
                    .trackingTickInterval(10)
                    .build()
        )
    ;

    public static void registerModEntities() {
        AntisolarBlocks.LOGGER.info("Registering Mod Entities for " + AntisolarBlocks.MOD_ID);
    }
}
