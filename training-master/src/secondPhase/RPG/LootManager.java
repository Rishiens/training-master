package secondPhase.RPG;

import java.util.ArrayList;

public class LootManager {

    ArrayList<Items> loot = new ArrayList<>();
     public LootManager() {
       loot.add(new Sword("Sword", 10));
        loot.add(new Zweihundert("Zweihundert", 20));
        loot.add(new MagicWand("Magic wand", 30));
        loot.add(new Granate("Granate", 100));
        loot.add(new Potion ("healing potion", 100 ));
    }
}
