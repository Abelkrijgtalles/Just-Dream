package nl.abelkrijgtalles.balls.fabric.specialentrypoints;

import net.fabricmc.api.ClientModInitializer;
import nl.abelkrijgtalles.justdream.InitJustDreamClient;

public class EntrypointClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        InitJustDreamClient.init();
    }
}
