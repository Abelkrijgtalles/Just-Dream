package nl.abelkrijgtalles.justdream;

import nl.abelkrijgtalles.justdream.item.ItemRegisterer;
import nl.abelkrijgtalles.justdream.util.ModLoaderStatistics;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JustDream {
    public static final String MOD_ID = "balls";
    public static Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static void init() {

        ModLoaderStatistics.printStats();

        ItemRegisterer itemRegisterer = new ItemRegisterer();
        itemRegisterer.registerModItems();

    }
}
