package net.parra.antisolarblocks.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.block.ModBlocks;
import net.parra.antisolarblocks.item.ModItems;

public class ModLootTableModifiers {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {
            if (LootTables.IGLOO_CHEST_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModBlocks.BLAHAJ));

                tableBuilder.pool(poolBuilder.build());
            }

            if (LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(ModBlocks.AXOLOTL_PLUSHIE_BLUE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.AXOLOTL_PLUSHIE_BROWN).weight(3))
                        .with(ItemEntry.builder(ModBlocks.AXOLOTL_PLUSHIE_CYAN).weight(3))
                        .with(ItemEntry.builder(ModBlocks.AXOLOTL_PLUSHIE_GOLD).weight(3))
                        .with(ItemEntry.builder(ModBlocks.AXOLOTL_PLUSHIE_PINK).weight(3));

                tableBuilder.pool(poolBuilder.build());
            }
            if (LootTables.VILLAGE_PLAINS_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModBlocks.TETO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MIKU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.AKITA_NERU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LUKA_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MEIKO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.KAITO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.GUMI_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.OSAGE_CHAN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LEN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.RIN_PLUSHIE).weight(1));

                tableBuilder.pool(poolBuilder.build());
            }
            if (LootTables.VILLAGE_SAVANNA_HOUSE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModBlocks.TETO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MIKU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.AKITA_NERU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LUKA_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MEIKO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.KAITO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.GUMI_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.OSAGE_CHAN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LEN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.RIN_PLUSHIE).weight(1));

                tableBuilder.pool(poolBuilder.build());
            }
            if (LootTables.VILLAGE_DESERT_HOUSE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModBlocks.TETO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MIKU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.AKITA_NERU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LUKA_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MEIKO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.KAITO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.GUMI_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.OSAGE_CHAN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LEN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.RIN_PLUSHIE).weight(1));

                tableBuilder.pool(poolBuilder.build());
            }
            if (LootTables.VILLAGE_SNOWY_HOUSE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModBlocks.TETO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MIKU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.AKITA_NERU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LUKA_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MEIKO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.KAITO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.GUMI_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.OSAGE_CHAN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LEN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.RIN_PLUSHIE).weight(1));

                tableBuilder.pool(poolBuilder.build());
            }
            if (LootTables.VILLAGE_TAIGA_HOUSE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModBlocks.TETO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MIKU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.AKITA_NERU_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LUKA_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.MEIKO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.KAITO_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.GUMI_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.OSAGE_CHAN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.LEN_PLUSHIE).weight(1))
                        .with(ItemEntry.builder(ModBlocks.RIN_PLUSHIE).weight(1));

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}

