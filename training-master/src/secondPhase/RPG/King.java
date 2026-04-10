package secondPhase.RPG;

public class King extends Enemy{
    public King() {
        super("King", 200 , 15);
    }

    @Override
    public void attack(){
        System.out.println("King na teba hádže svoju zlatú kopiu osudu za "+ damage + (" dmg!"));
    }
}
