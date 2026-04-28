package secondPhase.RPG;

public class Player {

    int hp ;
    int damage ;
    int maxHp;

    Player (int hp, int damage, int maxHp) {
        this.hp = hp;
        this.damage = damage;
        this.maxHp = maxHp;
    }
    public Player() {
        this( 200 , 15, 300);
    }

    public void heal(int amount) {
        hp += amount;
        if (hp > maxHp) {
            hp = maxHp;
        }
        System.out.println("Aktuálne HP: " + hp);
}
    void attack(Enemy enemy){
        enemy.hp -= this.damage;
    }
}
