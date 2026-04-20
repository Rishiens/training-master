package secondPhase.RPG;
import java.util.ArrayList;
import java.util.Random;
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
             System.out.println();
             System.out.println("1 - Začíname");
             System.out.println("2 - Ukončiť");
             System.out.println();


             int prolog = scanner.nextInt();
         switch (prolog) {
             case 1:
                 zaProlog = true;
                 System.out.println("Tak ideme na to ty hrdina");
                 System.out.println();
                 break;
             case 2:
                 System.out.println("Zbohom slabko");
                 spustenie = false;
                 break;
             default:
                 System.out.println("nehraj sa na testera");
                 System.out.println();
                 break;

         }
         }
         //menu hry
         while (spustenie && !hraZacala) {
             System.out.println();
             System.out.println("====Mini rpg=====");
             System.out.println("1 - Spustiť hru");
             System.out.println("2 - pravidlá");
             System.out.println("0 - vypnúť hru");
             System.out.println();

             int menu = scanner.nextInt();

             switch (menu) {
                 case 1:
                     hraZacala = true;
                     System.out.println("Tak ideme na to");
                     break;
                 case 2:
                     System.out.println();
                     System.out.println("****************************************************");
                     System.out.println("Si hrdina v lese a objaví sa nepriateľ");
                     System.out.println("Základ je ho zabiť alebo újsť");
                     System.out.println("Každé 3 ťahy máš na výber špeciálny útok");
                     System.out.println("vyberaj ich s rozvahou, lebo nepriateľ je silný");
                     System.out.println("Good luck hrdina");
                     System.out.println("****************************************************");
                     System.out.println();
                     break;
                 case 0:
                     System.out.println("Tak možno nabudúce");
                     spustenie = false;
                     break;
             }
         } Enemy enemy = null;
         Player player = new Player();
        Inventory inventory = new Inventory();
        while (vitazstvo <= 5 && !prezitie) {


            switch (vitazstvo) {
                case 0:
                     enemy = new Gremlin();
                    System.out.println("prepadol ta " + enemy.name);
                    break;
                case 1:
                    enemy = new Troll();
                    System.out.println("prepadol ta " + enemy.name);
                    player.hp = player.hp + 50;
                    break;
                case 2:
                    enemy = new Knight();
                    System.out.println("prepadol ta " + enemy.name);
                    player.hp = player.hp + 60;
                    break;
                case 3:
                     enemy = new Hunter();
                    System.out.println("prepadol ta " + enemy.name);
                    player.hp = player.hp + 70;
                    break;
                case 4:
                     enemy = new King();
                    System.out.println("prepadol ta " + enemy.name);
                    player.hp = player.hp + 80;
                    break;
                default:
                    System.out.println("Dokončil si svoju pomstu");
                    break;
            }

             while (spustenie && hraZacala && !smrt) {
                 System.out.println();
                 System.out.println("máš " + player.hp + " HP");
                 System.out.println(enemy.name + " má " + enemy.hp + " HP");
                 System.out.println();

                 //vzbrat nejakz dalsi utok pre klasickz combat
                 if (tahy > 0 && tahy % 3 == 0) {
                     System.out.println();
                     System.out.println("máš " + player.hp + " HP");
                     System.out.println(enemy.name + " " + enemy.hp + " HP");
                     System.out.println("🎉 Máš špeciálny útok na výber!");
                     System.out.println();


                     // tu môžeš zobraziť nové útoky

                     for (int i = 0; i < hodnoty.length; i++) {
                         System.out.println((i + 1) + "-" + schopnosti[i] + "(" + hodnoty[i] + ")");
                         System.out.println();
                     }
                     System.out.println("4 - použiť item");
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
                                 System.out.println();
                                 hraZacala = false;
                                 break;
                             }
                         case 4:
                             //tu pojde vyber predmetu

                                 //int index = scanner.nextInt(inventory.loot.size());
                                Items itemsForUse = inventory.loot.get(inventory.loot.size() - 1);
                                System.out.println("máš na výber " + itemsForUse.getName());

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
                     System.out.println("3 - Pužiť item");

                     int volba = scanner.nextInt();
                     switch (volba) {
                         case 1:
                             enemy.hp = enemy.hp - player.damage;
                             System.out.println("útocis klasickym utokom na nepriatela za " + player.damage + " DMG");
                             System.out.print(" ");
                             break;
                         case 2:
                             if (Math.random() < sancaNaUtek) {
                                 System.out.println("Podarilo sa ti uniect ty zbabelec ale prežil si.");
                                 System.out.print(" ");
                                 hraZacala = false;
                                break;
                             }break;
                             case 3:
                                 boolean hasUsableItem = false;

                                 for (Items item : inventory.loot) {
                                     if (item.oneTimeUse) {
                                         hasUsableItem = true;
                                         break;
                                     }
                                 }
                                // vzpise itemy aj tie ktore su na dlhodobe pouzitie
                                 //urobit podmienku nech sa zobrazuju na pouzitie itemy
                                 if (inventory.loot.isEmpty() || !hasUsableItem) {
                                     System.out.println("Nemáš žiadny predmet");
                                 }
                                 else {
                                     ArrayList<Items> usableItems = new ArrayList<>();

                                         for (Items item : inventory.loot) {
                                         if (item.oneTimeUse) {
                                             usableItems.add(item);
                                         }
                                         }
                                     for (int i = 0; i < usableItems.size(); i++) {
                                         System.out.println((i + 1) + " - " + usableItems.get(i).getName());
                                     }
                                         System.out.println("Vyber si item ");
                                         System.out.println();
                                         int index = scanner.nextInt();
                                         if (index > 0 && index <= usableItems.size()){
                                             Items selected = usableItems.get(index - 1);
                                             selected.use(player);
                                             System.out.println("použil si " + selected.getName());
                                            inventory.loot.remove(selected);
                                         }
                                         else {
                                             System.out.println("Zlá voľba");
                                         }}break;


                         default:
                             System.out.println("Vymyslel si si útok ktorý nezabral, smola");
                             System.out.print(" ");
                     }
                 }

                 if (enemy.hp <= 0) {
                     System.out.println("Podarilo sa ti prezit, no pokracujes dalej");
                     vitazstvo++;
                     tahy = 0;

                     LootManager manager = new LootManager();
                     Random random = new Random();
                     int index = random.nextInt(manager.loot.size());
                     Items droppedItem = manager.loot.get(index);
                     System.out.println("Našiel si " + droppedItem.getName());

                     inventory.addItem(droppedItem);
                    //dokoncit itemy
                     if (droppedItem.getOneTimeUse()){
                         System.out.println("Tento item je na jedno použitie");
                     }
                     else {
                         System.out.println("Tento predmet ti ostane do smrti");
                     }
                     break;}

                 player.hp = player.hp - enemy.damage;
                 System.out.println("nepriatel ti dal za "+ enemy.damage + " DMG");
                 if (player.hp <= 0) {
                     smrt = true;
                 break;}
                 tahy++;

                 }
                 if (smrt) {
                     System.out.println("Umrel si v bolestiach. " + enemy.name + " znásilnil a zožral tvoju mrtvolu.");
                     break;
                 }
                 if (vitazstvo >=5) {
                System.out.println("dokazal si to");
             }
}
         scanner.close();
             }
             }





