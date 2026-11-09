package net.parra.antisolarblocks.world.tree;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.parra.antisolarblocks.AntisolarBlocks;

public class ModTreeDecorators {
    public static final TreeDecoratorType<WallLogConnectDecorator> WALL_LOG_CONNECT =
            Registry.register(Registries.TREE_DECORATOR_TYPE,
                    Identifier.of(AntisolarBlocks.MOD_ID, "wall_log_connect"),
                    new TreeDecoratorType<>(WallLogConnectDecorator.CODEC));

    public static void register() {}
}
