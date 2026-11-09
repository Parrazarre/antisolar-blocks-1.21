package net.parra.antisolarblocks.mixin;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.structure.pool.StructurePool;
import net.minecraft.structure.pool.StructurePoolElement;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(StructurePool.class)
public interface StructurePoolAccessor {
    @Accessor("elements")
    ObjectArrayList<StructurePoolElement> antisolar$getElements();

    @Accessor("elementCounts")
    List<Pair<StructurePoolElement, Integer>> antisolar$getElementCounts();

    @Mutable
    @Accessor("elementCounts")
    void antisolar$setElementCounts(List<Pair<StructurePoolElement, Integer>> elementCounts);
}