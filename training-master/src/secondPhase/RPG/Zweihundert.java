package secondPhase.RPG;

public class Zweihundert extends Items{

    private int damage;

    public Zweihundert(String name, int damage) {
        super(name, 20, 0, false); // oneTimeUse = true
        this.damage = damage;
    }

    @Override
    public void use(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.println("Zaútočil si za " + damage + " DMG");
    }

}
