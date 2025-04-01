package net.parra.antisolarblocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.SUGAR_MAPLE_LOG.asItem())
                .add(ModBlocks.SUGAR_MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SUGAR_MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_SUGAR_MAPLE_WOOD.asItem())
                .add(ModBlocks.WHITE_PINE_LOG.asItem())
                .add(ModBlocks.WHITE_PINE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WHITE_PINE_LOG.asItem())
                .add(ModBlocks.STRIPPED_WHITE_PINE_WOOD.asItem())
                .add(ModBlocks.YEW_LOG.asItem())
                .add(ModBlocks.YEW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_YEW_LOG.asItem())
                .add(ModBlocks.STRIPPED_YEW_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.SUGAR_MAPLE_PLANKS.asItem())
                .add(ModBlocks.WHITE_PINE_PLANKS.asItem())
                .add(ModBlocks.YEW_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModBlocks.GIANT_PASSIFLORA_INCARNATA.asItem())
                .add(ModBlocks.GIANT_PASSIFLORA_CAERULA.asItem())
                .add(ModBlocks.BLAHAJ.asItem())
                .add(ModBlocks.TETO_PLUSHIE.asItem())
                .add(ModBlocks.GUMI_PLUSHIE.asItem())
                .add(ModBlocks.OSAGE_CHAN_PLUSHIE.asItem());


        getOrCreateTagBuilder(ConventionalItemTags.FOODS)
                .add(ModItems.HIMALAYAN_SALT)
                .add(ModItems.KAOLINITE_CLAY_CHUNK);

    }
}
