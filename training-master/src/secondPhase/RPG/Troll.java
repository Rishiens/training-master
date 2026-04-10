package secondPhase.RPG;

public class Troll extends Enemy{
    public Troll() {
        super("Troll", 200 , 15);
    }

    @Override
    public void attack(){
        System.out.println("Troll na teba zaútočí za "+ damage + (" dmg!"));
    }
}
