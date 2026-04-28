package secondPhase.RPG;

public abstract class Items {
    String name;
    int damage;
    int heal;
    boolean oneTimeUse;

    // v Items
    public void use(Player player) {
        System.out.println("Použil si item, ale nič sa nestalo...");
    }
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
//public static Items Zweihander = new Items ("Zweihander", 20, 0,false);
   // public static Items MagicWand = new Items ("MagicWand", 30, 0,false);
   // public static Items Granate = new Items ("Granate", 100, 0, true);
   // public static Items HealthPotion = new Items ("HealthPotion", 0, 150, true);




        public void use(Enemy enemy) {

        }

}
