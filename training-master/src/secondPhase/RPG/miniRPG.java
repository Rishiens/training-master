package secondPhase.RPG;

//import java.util.Arrays;
import secondPhase.RPG.Player;

import java.util.Scanner;

public class miniRPG {

     static void main(String[] args) {

         boolean spustenie = true;
         boolean zaProlog = false;
         boolean hraZacala = false;
         boolean smrt = false;
         boolean prezitie = false;
         int tahy = 0;
        int hpHrac = 100;
        int utokHrac = 5;
        int utokNepriatel = 15;
        int hpNepriatel = 100;
        double sancaNaUtek = 0.20;
        String[] schopnosti = {"silný útok","healing", "útek"};
        int [] hodnoty = {15, 15, 20};
         Scanner scanner = new Scanner(System.in);


         // tu pojdu uvodne texty





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
                 case 1:hraZacala = true;
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
             System.out.println("si v lese");
             System.out.println("prepadol ta goblin");
             while (spustenie && !prezitie && !smrt) {
                 if (hpNepriatel <= 0) {prezitie = true;}

                 Player.hp = Player.hp - utokNepriatel;
                 if (Player.hp <= 0) {smrt = true;}



                 System.out.println("máš - " + Player.hp + " HP");
                 System.out.println("Goblin má" + hpNepriatel +" HP");
                 //vzbrat nejakz dalsi utok pre klasickz combat
                if (tahy != 3) {

                    System.out.println("Si na rade");
                    System.out.println("1 - Klasicky utok");
                    System.out.println("2 - Pokus o útek");

                    int volba = scanner.nextInt();
                    switch (volba) {
                        case 1: hpNepriatel = hpNepriatel - Player.hp ;
                            System.out.println("útocis klasickym utokom na nepriatela za 5 DMG");
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


                 //kazde 3 tahy vypise specialny utok

                 if (tahy % 3 == 0) {
                     System.out.println("máš " + Player.hp + " HP");
                     System.out.println("Goblin má" + hpNepriatel +" HP");
                     System.out.println("Si na rade");
                     System.out.println("🎉 Máš špeciálny útok na výber!");

                     // tu môžeš zobraziť nové útoky

                     for (int i = 0; i < hodnoty.length; i++) {
                         System.out.println((i + 1) + "-" + schopnosti[i] + "(" + hodnoty[i] + ")");}
                         int volba = scanner.nextInt();
                         switch (volba) {
                             case 1:
                                 System.out.println("Silno si uderil za " + hodnoty[0] + " DMG");
                                 hpNepriatel = hpNepriatel - utokHrac;
                                 break;
                             case 2:
                                 System.out.println("heal");
                                 Player.hp = Player.hp + hodnoty[1];
                                 System.out.println("Uzdravil si sa za " + hodnoty[1] + " HP");
                                 break;
                             case 3:
                                 System.out.println("Snažíš sa utiecť");
                                 if (Math.random() < sancaNaUtek) {
                                 System.out.println("Podarilo sa ti uniect ty zbabelec ale prežil si.");
                                 System.out.print(" ");

                                 hraZacala = false;}
                                 break;
                             default:
                                 System.out.println("tvoj vymysel goblina nepobavil a jednu ti tresol");
                                 break;
                     }



                 }






                 } tahy++;


             }scanner.close();
         }
         //si v hre a musis si vybrat utok z array


    }

