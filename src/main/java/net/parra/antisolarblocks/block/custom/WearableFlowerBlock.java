package net.parra.antisolarblocks.block.custom;

import net.minecraft.block.FlowerBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Equipment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;

import java.util.List;

public class WearableFlowerBlock extends FlowerBlock implements Equipment {
    public WearableFlowerBlock(RegistryEntry<StatusEffect> stewEffect, float effectLengthInSeconds, Settings settings) {
        super(stewEffect, effectLengthInSeconds, settings);
    }

    @Override
    public EquipmentSlot getSlotType() {
        return EquipmentSlot.HEAD;
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(Text.translatable("tooltip.antisolarblocks.wearable.head"));
        super.appendTooltip(stack, context, tooltip, options);
    }
}
