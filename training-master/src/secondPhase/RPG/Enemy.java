package secondPhase.RPG;

public class Enemy {
    String name;
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
         return new Enemy ("Troll" , 300 , 28);
    }

}
