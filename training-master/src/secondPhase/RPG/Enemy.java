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
void attack(){
    System.out.println(name + " na teba útočí za "+ damage + " dmg!");
}


}
