package secondPhase.RPG;
import java.util.Scanner;

public class miniRPG {

     static void main(String[] args) {

         boolean spustenie = true;
         boolean zaProlog = false;
         boolean hraZacala = false;
         boolean smrt = false;
         boolean prezitie = false;
         int vitazstvo= 0;
         int tahy = 0;
        double sancaNaUtek = 0.20;
        String[] schopnosti = {"silný útok","healing", "útek"};
        int [] hodnoty = {45, 60, 20};

         Scanner scanner = new Scanner(System.in);

         while (spustenie && !zaProlog){
             System.out.println("1 - Začíname");
             System.out.println("2 - Ukončiť");

             int prolog = scanner.nextInt();
         switch (prolog) {
             case 1:
                 zaProlog = true;
                 System.out.println("Tak ideme na to ty hrdina");
                 break;
             case 2:
                 System.out.println("Zbohom slabko");
                 spustenie = false;
                 break;
             default:
                 System.out.println("nehraj sa na testera");
                 break;

         }
         }
         //menu hry
         while (spustenie && !hraZacala) {

             System.out.println("====Mini rpg=====");
             System.out.println("1 - Spustiť hru");
             System.out.println("2 - pravidlá");
             System.out.println("0 - vypnúť hru");

             int menu = scanner.nextInt();

             switch (menu) {
                 case 1:
                     hraZacala = true;
                     System.out.println("Tak ideme na to");
                     break;
                 case 2:
                     System.out.println("Si hrdina v lese a objaví sa nepriateľ");
                     System.out.println("Základ je ho zabiť alebo újsť");
                     System.out.println("Každé 3 ťahy máš na výber špeciálny útok");
                     System.out.println("vyberaj ich s rozvahou, lebo nepriateľ je silný");
                     System.out.println("Good luck hrdina");
                     break;
                 case 0:
                     System.out.println("Tak možno nabudúce");
                     spustenie = false;
                     break;
             }
             Player player = new Player(220, 35);
            if (hraZacala) {System.out.println("si v lese");
            System.out.println("prepadol ta " + Enemy.name);}

        while (vitazstvo <= 5 && !prezitie) {
            Enemy enemy;

            switch (vitazstvo) {
                case 0:
                     enemy = Enemy.gremlin();
                    break;
                case 1:
                    enemy = Enemy.troll();
                    player.hp= 250;
                    break;
                case 2:
                    enemy = Enemy.knight();
                    player.hp= 300;
                    break;
                case 3:
                     enemy = Enemy.hunter();
                    player.hp= 350;
                    break;
                case 4:
                     enemy = Enemy.king();
                    player.hp= 350;
                break;
                default: enemy = null;
                break;
            }

             while (spustenie && hraZacala && !smrt) {

                 System.out.println("máš " + player.hp + " HP");
                 System.out.println(Enemy.name + " má " + enemy.hp + " HP");

                 //vzbrat nejakz dalsi utok pre klasickz combat
                 if (tahy > 0 && tahy % 3 == 0) {
                     System.out.println("máš " + player.hp + " HP");
                     System.out.println("Goblin má " + enemy.hp + " HP");
                     System.out.println("🎉 Máš špeciálny útok na výber!");

                     // tu môžeš zobraziť nové útoky

                     for (int i = 0; i < hodnoty.length; i++) {
                         System.out.println((i + 1) + "-" + schopnosti[i] + "(" + hodnoty[i] + ")");
                     }
                     int volba = scanner.nextInt();
                     switch (volba) {
                         case 1:
                             System.out.println("Silno si uderil za " + hodnoty[0] + " DMG");
                             enemy.hp = enemy.hp - hodnoty[0];

                             break;
                         case 2:
                             System.out.println("heal");
                             player.hp = player.hp + hodnoty[1];
                             System.out.println("Uzdravil si sa za " + hodnoty[1] + " HP");
                             break;
                         case 3:
                             System.out.println("Snažíš sa utiecť");
                             if (Math.random() < sancaNaUtek) {
                                 System.out.println("Podarilo sa ti uniect ty zbabelec ale prežil si.");
                                 System.out.print(" ");

                                 hraZacala = false;
                                 break;
                             }
                         default:
                             System.out.println("tvoj vymysel goblina nepobavil a jednu ti tresol");
                             break;

                     }
                 }

                 //kazde 3 tahy vypise specialny utok

                 else {

                     System.out.println("Si na rade");
                     System.out.println("1 - Klasicky utok");
                     System.out.println("2 - Pokus o útek");

                     int volba = scanner.nextInt();
                     switch (volba) {
                         case 1:
                             enemy.hp = enemy.hp - player.damage;
                             System.out.println("útocis klasickym utokom na nepriatela za + " + player.damage + " DMG");
                             System.out.print(" ");
                             break;
                         case 2:
                             if (Math.random() < sancaNaUtek) {
                                 System.out.println("Podarilo sa ti uniect ty zbabelec ale prežil si.");
                                 System.out.print(" ");

                                 hraZacala = false;
                                 break;
                             }
                         default:
                             System.out.println("Vymyslel si si útok ktorý nezabral, smola");
                             System.out.print(" ");
                     }
                 }

                 if (enemy.hp <= 0) {
                     System.out.println("Podarilo sa ti prezit, no pokracujes dalej");
                     vitazstvo++;
                     break;}

                 player.hp = player.hp - enemy.damage;
                 System.out.println("nepriatel ti dal za "+ enemy.damage + " DMG");
                 if (player.hp <= 0) {
                     smrt = true;
                 break;}
                 tahy++;

                 }
                 if (smrt) {
                     System.out.println("Umrel si v bolestiach. " + Enemy.name + " znásilnil a zožral tvoju mrtvolu.");
                     break;
                 }
             }
}
             if (vitazstvo >=5) {
                 System.out.println("dokazal si to");
             }scanner.close();
             }

         }



