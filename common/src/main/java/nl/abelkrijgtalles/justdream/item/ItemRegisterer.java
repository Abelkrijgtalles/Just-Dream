package nl.abelkrijgtalles.justdream.item;

import java.util.ArrayList;
import java.util.List;
import nl.abelkrijgtalles.justdream.JustDream;
import nl.abelkrijgtalles.justdream.util.multiloader.item.InventoryGroups;
import nl.abelkrijgtalles.justdream.util.multiloader.item.ItemPropertyType;

public class ItemRegisterer {

    public static List<BallsItem> items = new ArrayList<>();

    public void registerModItems() {

        JustDream.LOGGER.info("Registering items.");
        items.add(new BallsItem(InventoryGroups.FOOD_AND_DRINKS, "frikandel_broodje", ItemPropertyType.DEFAULT));

    }

}
