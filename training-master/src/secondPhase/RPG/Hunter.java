package secondPhase.RPG;

public class Hunter extends Enemy{
    public Hunter() {
        super("Hunter", 200 , 15);
    }

    @Override
    public void attack(){
        System.out.println("Hunter na teba strieľa z luku za "+ damage + (" dmg!"));
    }
}
