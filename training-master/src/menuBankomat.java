import java.util.Scanner;

public class menuBankomat {

    static void main(String[] args) {

        Scanner stlaceneTlacidlo = new Scanner(System.in);

        double balance = 0 ;
        boolean spustene = true;
        int pokračovanie;
        int vklad;
        int vyber;
        int hlavneMenu ;
        int vyberTlacidla;

//hlavná obrazovka

        System.out.println("_____________");
        System.out.println("Bankomat VUB");
        System.out.println("_____________");
        System.out.println("Prajete si pokračovať? 1-Áno 2-Nie");

 //výber či začať alebo skončit

        pokračovanie = stlaceneTlacidlo.nextInt();
while (spustene){
        switch (pokračovanie){
            case 1:
                System.out.println("vyberte si prosím jednu z možností 1- 4");
                System.out.println("1 - vklad");
                System.out.println("2 - výber");
                System.out.println("3 - zostatok na účte");
                System.out.println("4 - ukončiť výber");
                break;

            case 2:
                System.out.println("Ďakujeme a prajeme pekný deň");
                spustene = false;
                break;

            default:
                System.out.println("neznáma operácia");
                break;
        }
       hlavneMenu = stlaceneTlacidlo.nextInt();
switch (hlavneMenu){
    case 1:
        System.out.println("Koľko si prajete vložiť?");
        vklad = stlaceneTlacidlo.nextInt();
        balance =+ vklad;
        System.out.println("Ďakujeme na vašom účte je momentálne " + balance );
        System.out.println("Prajete sa vráťiť na začiatok - 1, alebo ukončiť program - 2?");
        pokračovanie = stlaceneTlacidlo.nextInt();
        break;
    case 2:
        System.out.println("Koľko si prajete vvybrať?");
        vyber = stlaceneTlacidlo.nextInt();
        if (vyber > balance){
            System.out.println("Na túto akcu nemáte dosť prostriedkov na účte");
            System.out.println("Prajete sa vráťiť na začiatok - 1, alebo ukončiť program - 2?");
            pokračovanie = stlaceneTlacidlo.nextInt();
        }else {
            System.out.println("Ďakujeme za dôveru, nezabudnite si zobrať peniaze z boxu a bankomatovú kartu");
            spustene = false;
        }

        break;
    case 3:
        if (balance == 0){
            System.out.println("Nemáte žiadne finančné prostriedky");
        }else {
        System.out.println(balance);
    }
        System.out.println("Na účte máte " + balance);
        break;
    case 4:
        System.out.println("Dovidenia a prajeme pekný deň");
        spustene = false;
        break;
}

    }stlaceneTlacidlo.close();
}}
