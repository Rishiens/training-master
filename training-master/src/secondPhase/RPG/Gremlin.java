package secondPhase.RPG;

public class Gremlin extends Enemy{

    public Gremlin() {
        super("gremlin", 200 , 15);
    }

    @Override
    public void attack(){
        System.out.println("Gremlin na teba skočí a poškriabe ťa za "+ damage + (" dmg!"));
    }
}
