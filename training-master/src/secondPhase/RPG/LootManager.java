package secondPhase.RPG;

import java.util.ArrayList;

public class LootManager {

    ArrayList<Items> loot = new ArrayList<>();

    public LootManager() {
        loot.add(Items.Sword);
        loot.add(Items.Zweihander);
        loot.add(Items.MagicWand);
        loot.add(Items.Granate);
        loot.add(Items.HealthPotion);
    }
}
