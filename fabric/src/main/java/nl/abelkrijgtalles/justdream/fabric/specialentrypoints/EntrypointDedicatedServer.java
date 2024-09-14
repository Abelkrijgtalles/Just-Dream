package nl.abelkrijgtalles.balls.fabric.specialentrypoints;

import net.fabricmc.api.DedicatedServerModInitializer;
import nl.abelkrijgtalles.justdream.InitJustDreamDedicatedServer;

public class EntrypointDedicatedServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        InitJustDreamDedicatedServer.init();
    }
}
