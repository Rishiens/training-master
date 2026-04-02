package secondPhase.RPG;

public class Enemy {
    static int hp ;
    static int damage;

    Enemy (int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    static Enemy gremlyn(){
        hp = 200;
        damage = 20 ;
        return null;
    }

    static Enemy troll() {
        hp = 300;
        damage = 28;
        return null;
    }

}
