package net.parra.antisolarblocks.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;

public class ModVillagers {
    public static final RegistryKey<PointOfInterestType> GEOLOGIST_POI_KEY = registerPoiKey("geologist_poi");
    public static final PointOfInterestType GEOLOGIST_POI = registerPOI("geologist_poi", ModBlocks.POTTERY_KILN);

    public static final VillagerProfession GEOLOGIST = registerProfession("geologist", GEOLOGIST_POI_KEY);
    public static final RegistryKey<VillagerProfession> GEOLOGIST_KEY =
            RegistryKey.of(RegistryKeys.VILLAGER_PROFESSION, Identifier.of(AntisolarBlocks.MOD_ID, "geologist"));

    public static final RegistryKey<PointOfInterestType> BOTANIST_POI_KEY = registerPoiKey("botanist_poi");
    public static final PointOfInterestType BOTANIST_POI = registerPOI("botanist_poi", ModBlocks.BOTANY_TABLE);

    public static final VillagerProfession BOTANIST = registerProfession("botanist", BOTANIST_POI_KEY);
    public static final RegistryKey<VillagerProfession> BOTANIST_KEY =
            RegistryKey.of(RegistryKeys.VILLAGER_PROFESSION, Identifier.of(AntisolarBlocks.MOD_ID, "botanist"));
    
    private static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, Identifier.of(AntisolarBlocks.MOD_ID, name),
                new VillagerProfession(name, entry -> entry.matchesKey(type), entry -> entry.matchesKey(type),
                        ImmutableSet.of(), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_MASON));
    }

    private static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(Identifier.of(AntisolarBlocks.MOD_ID, name),
                1, 1, block);
    }

    private static RegistryKey<PointOfInterestType> registerPoiKey(String name) {
        return RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(AntisolarBlocks.MOD_ID, name));
    }

    public static void registerVillagers() {
        AntisolarBlocks.LOGGER.info("Registering Villagers for " + AntisolarBlocks.MOD_ID);
    }
}
