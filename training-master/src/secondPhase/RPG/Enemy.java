package secondPhase.RPG;

public class Enemy {
    static String name;
     int hp ;
     int damage;

    Enemy (String name , int hp, int damage) {
        this.name= name;
        this.hp = hp;
        this.damage = damage;
    }

    static Enemy gremlin(){
        return new Enemy ("Gremlyn" , 200 , 20);

    }
     static Enemy troll() {

        return new Enemy ("Troll" , 300 , 24);
    }
    static Enemy knight() {

        return new Enemy ("Knight" , 350 , 28);
    }
    static Enemy hunter() {

        return new Enemy ("Hunter" , 400 , 32);
    }
    static Enemy king() {

        return new Enemy ("King" , 500 , 35);
    }

}
