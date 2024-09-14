package nl.abelkrijgtalles.balls.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import nl.abelkrijgtalles.justdream.JustDream;
import nl.abelkrijgtalles.justdream.TestWorld;
import nl.abelkrijgtalles.balls.fabric.util.multiloader.FabricItemHandler;
import static net.minecraft.commands.Commands.*;

public class Entrypoint implements ModInitializer {
    @Override
    public void onInitialize() {
        // Code here will run on both physical client and server.
        // Client classes may or may not be available - be careful!
        JustDream.LOGGER.info("Running on Fabric.");
        JustDream.init();

        FabricItemHandler.register();

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("worldtest")
                .executes(TestWorld::test)));
    }
}
