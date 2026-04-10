package secondPhase.RPG;

public class Knight extends Enemy{
    public Knight() {
        super("gremlin", 200 , 15);
    }

    @Override
    public void attack(){
        System.out.println("Knight sa na teba zaženie mečom a dá ti za "+ damage + (" dmg!"));
    }
}
