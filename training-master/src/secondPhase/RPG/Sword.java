package secondPhase.RPG;

public class Sword extends Items{

    private int damage;

    public Sword(String name, int damage) {
        super(name, 10, 0, false); // oneTimeUse = true
        this.damage = damage;
    }

    @Override
    public void use(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Zaútočil si za " + damage + " DMG");
    }

}
