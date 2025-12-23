package net.parra.antisolarblocks.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.parra.antisolarblocks.AntisolarBlocks;
import net.parra.antisolarblocks.screen.custom.PotteryKilnScreenHandler;

public class ModScreenHandlers{
    public static final ScreenHandlerType<PotteryKilnScreenHandler> POTTERY_KILN_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(AntisolarBlocks.MOD_ID, "pottery_kiln_screen_handler"),
                    new ExtendedScreenHandlerType<>(PotteryKilnScreenHandler::new, BlockPos.PACKET_CODEC));

    public static void registerModScreenHandlers() {
        AntisolarBlocks.LOGGER.info("Registering Screen Handlers for " + AntisolarBlocks.MOD_ID);
    }
}
