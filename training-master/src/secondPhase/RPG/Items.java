package secondPhase.RPG;

public class Items {
    String name;
    int damage;
    int heal;
    boolean oneTimeUse;

    Items(String name, int damage, int heal, boolean oneTimeUse) {
        this.name = name;
        this.damage = damage;
        this.heal = heal;
        this.oneTimeUse = oneTimeUse;
    }
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
    public int getHeal() {
        return heal;
    }
    public boolean getOneTimeUse() {
        return oneTimeUse;
    }
    public static Items Sword = new Items ("Sword", 10, 0, false);
    public static Items Zweihander = new Items ("Zweihander", 15, 0,false);
    public static Items MagicWand = new Items ("MagicWand", 20, 0,false);
    public static Items Granate = new Items ("Granate", 100, 0, true);
    public static Items HealthPotion = new Items ("HealthPotion", 0, 150, true);


}
