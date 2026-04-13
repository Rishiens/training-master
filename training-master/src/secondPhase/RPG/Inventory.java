package secondPhase.RPG;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Items> loot = new ArrayList<>();
    public void addItem(Items item) {
        loot.add(item);
    }
}
