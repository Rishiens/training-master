import java.util.Scanner;



//desatinne cisla

public class kalkulackaDesatinneCisla {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cislo1;
        double cislo2;
        char funkcia;
        double vysledok;
        System.out.println("Zadaj prvé číslo: ");
        cislo1 = scanner.nextDouble();

        System.out.println("Zadaj druhé číslo: ");
        cislo2 = scanner.nextDouble();

        System.out.println(" zadaj funkciu (+ , - , / , *) : ");
        funkcia = scanner.next().charAt(0);

        switch (funkcia) {
            case '+':
                vysledok = cislo1 + cislo2;
                break;
            case '-':
                vysledok = cislo1 - cislo2;
                break;
            case '*':
                vysledok = cislo1 * cislo2;
                break;
            case '/':
                if (cislo2 != 0) {
                    vysledok = cislo1 / cislo2;

                } else {
                    System.out.println("Delenie 0 nie je možné!");
                    return;
                }
                break;
            default:
                System.out.println("neznáma operácia");
                return;

        }
        scanner.close();
        System.out.println("výsledok: " + vysledok);

    }


}



