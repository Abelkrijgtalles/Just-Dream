package nl.abelkrijgtalles.balls;

import com.mojang.brigadier.context.CommandContext;
import java.lang.reflect.Field;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.storage.DerivedLevelData;
import net.minecraft.world.level.storage.PrimaryLevelData;
import net.minecraft.world.level.storage.ServerLevelData;
import net.minecraft.world.level.storage.WorldData;

public class TestWorld {

    public static int test(CommandContext<CommandSourceStack> context) {
        
        MinecraftServer server = context.getSource().getServer();
        Object executor = null;
        try {
            Field executorField = MinecraftServer.class.getDeclaredField("executor");
            executorField.setAccessible(true);
            executor = executorField.get(server);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            Balls.LOGGER.error("Can't get the executor of the Minecraft server.");
            throw new RuntimeException(e);
        }

        server.getW
        new ServerLevel(server, executor, server.getSessionService(), new DerivedLevelData(server.getWorldData(), ))

        return 1;
    }

}
