package secondPhase.RPG;

public class Player {

    int hp ;
    int damage ;

    Player (int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }
    public Player() {
        this( 200 , 15);
    }
}
