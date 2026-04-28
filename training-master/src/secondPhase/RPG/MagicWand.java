package secondPhase.RPG;

public class MagicWand extends Items{

    private int damage;

    public MagicWand(String name, int damage) {
        super(name, 30, 0, false); // oneTimeUse = true
        this.damage = damage;
    }

    @Override
    public void use(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Zaútočil si za " + damage + " DMG");
    }


}
