package secondPhase;

import java.util.Scanner;

public class toDoList {

    public static void main(String []args) {
        Scanner stlacenieCisla = new Scanner(System.in);

        int vyberUlohy;
        boolean spustene = true;
        String [] ulohy = new String[8];
        int pocetUloh = 0;
        int vyberMenu;



        while (spustene) {

            System.out.println("----------------");
            System.out.println("To-Do List");
            System.out.println("----------------");
            System.out.println("1 - Pridať úlohu");
            System.out.println("2 - Odobrať úlohu");
            System.out.println("3 - pozrieť zoznam úloh");
            System.out.println("0 - Ukončiť program");
            vyberMenu = stlacenieCisla.nextInt();


            switch (vyberMenu){

                case 1:
                    if(pocetUloh >= ulohy.length) {
                        System.out.println("Zoznam je plný");}
                        else{
                            stlacenieCisla.nextLine();
                            System.out.println("Pridaj úlohu: ");
                            String novaUloha = stlacenieCisla.nextLine();

                            ulohy[pocetUloh] = novaUloha;
                            pocetUloh++;
                        System.out.println("Úloha bola pridaná");


                    }
                    break;
                case 2:

                    if (pocetUloh == 0) {
                        System.out.println("Nie je čo zmazať");
                    }

                    else {System.out.println("odobranie ulohy v progrese");

                    for (int i = 0; i < pocetUloh; i++) {
                        System.out.println((i + 1) + ". " + ulohy[i]);}

                        System.out.println("Zadaj číslo úlohy na zmazanie");
                        int vyberIndex = stlacenieCisla.nextInt();
                        int index = vyberIndex - 1;


                    if (index < 0 || index >= pocetUloh) {
                            System.out.println("Neplatný výber");
                        } else {
                            for (int i = index; i < pocetUloh - 1; i++) {
                                ulohy[i] = ulohy[i + 1];



                        }
                            System.out.println("Úloha je zmazaná");
                            pocetUloh--;

                    }

                    }

                    break;
                case 3:
                    System.out.println("Zobraziť úlohy");
                    if (pocetUloh == 0) {
                        System.out.println("Nie su žiadne úlohy na zobrazenie");}
                        else{ for (int i = 0; i < pocetUloh; i++){
                        System.out.println((i+1) + ". " + ulohy[i]);
                    }

                        }

                    break;
                case 0:
                    System.out.println("ukoncenie v progrese");
                    spustene = false;
                    break;
                default:
                    System.out.println("Neplatná voľba");
        }

    }
stlacenieCisla.close();
}}
