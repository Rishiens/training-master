package secondPhase.RPG;

public class Enemy {
     String name;
     int hp ;
     int damage;

    Enemy (String name , int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }
void attack(){
    System.out.println(name + " na teba útočí za "+ damage + " dmg!");
}

    void attack(Player player){
        player.hp -= this.damage;
    }
int takeDamage(int amount){
        this.hp -= amount;
        return this.hp;
}
}
