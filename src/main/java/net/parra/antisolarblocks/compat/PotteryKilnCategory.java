package net.parra.antisolarblocks.compat;

import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryIngredients;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.block.ModBlocks;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PotteryKilnCategory implements DisplayCategory<BasicDisplay> {
    private static final Identifier TEXTURE =
            Identifier.of(AntisolarBlocks.MOD_ID,
                    "textures/gui/container/pottery_kiln.png");

    public static final CategoryIdentifier<PotteryKilnDisplay> POTTERY_KILN =
            CategoryIdentifier.of(AntisolarBlocks.MOD_ID, "pottery_kiln");


    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return POTTERY_KILN;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("block.antisolarblocks.pottery_kiln");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModBlocks.POTTERY_KILN.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();

        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 32, startPoint.y + 17))
                .entries(display.getInputEntries().get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 50, startPoint.y + 17))
                .entries(display.getInputEntries().get(1)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 32, startPoint.y + 35))
                .entries(display.getInputEntries().get(2)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 50, startPoint.y + 35))
                .entries(display.getInputEntries().get(3)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 32, startPoint.y + 53))
                .entries(display.getInputEntries().get(4)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 50, startPoint.y + 53))
                .entries(display.getInputEntries().get(5)).markInput());

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 80, startPoint.y + 53))
                .entries(EntryIngredients.ofItemStacks(getFuelStacks()))
                .markInput());

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 118, startPoint.y + 21))
                .entries(display.getOutputEntries().get(0)).markOutput());

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }

    private static List<ItemStack> getFuelStacks() {
        return AbstractFurnaceBlockEntity.createFuelTimeMap()
                .keySet()
                .stream()
                .map(ItemStack::new)
                .collect(Collectors.toList());
    }
}
