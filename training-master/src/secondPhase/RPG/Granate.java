package secondPhase.RPG;

public class Granate extends Items{

    private int damage;

    public Granate(String name, int damage) {
        super(name, 0, 150, true); // oneTimeUse = true
        this.damage = damage;
    }

    @Override
    public void use(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Zaútočil si za " + damage + " DMG");
    }

}
