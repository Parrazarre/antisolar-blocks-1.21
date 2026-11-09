package net.parra.antisolarblocks.world;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.structure.pool.SinglePoolElement;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import net.minecraft.structure.processor.StructureProcessorList;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.mixin.StructurePoolAccessor;

import java.util.ArrayList;
import java.util.List;

public class VillageHouses {

    public static void addToPool(MinecraftServer server, Identifier poolId, Identifier houseId,
                                 Identifier processorListId, int weight) {
        Registry<StructurePool> poolRegistry = server.getRegistryManager().get(RegistryKeys.TEMPLATE_POOL);
        Registry<StructureProcessorList> processorRegistry =
                server.getRegistryManager().get(RegistryKeys.PROCESSOR_LIST);

        StructurePool pool = poolRegistry.get(poolId);
        if (pool == null) {
            System.out.println("VillageHouses: pool not found: " + poolId);
            return;
        }

        RegistryEntry<StructureProcessorList> processors = processorRegistry.entryOf(
                RegistryKey.of(RegistryKeys.PROCESSOR_LIST, processorListId));

        SinglePoolElement element = SinglePoolElement
                .ofProcessedSingle(houseId.toString(), processors)
                .apply(StructurePool.Projection.RIGID);

        StructurePoolAccessor accessor = (StructurePoolAccessor) pool;

        List<Pair<StructurePoolElement, Integer>> counts = new ArrayList<>(accessor.antisolar$getElementCounts());
        counts.add(Pair.of(element, weight));
        accessor.antisolar$setElementCounts(counts);

        for (int i = 0; i < weight; i++) {
            accessor.antisolar$getElements().add(element);
        }
    }
}