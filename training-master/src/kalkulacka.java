import java.util.Scanner;

//cele cisla

public class kalkulacka {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cislo1;
        int cislo2;
        char funkcia;
        int vysledok;
        System.out.println("Zadaj prvé číslo: ");
        cislo1 = scanner.nextInt();

        System.out.println("Zadaj druhé číslo: ");
        cislo2 = scanner.nextInt();

        System.out.println(" zadaj funkciu (+ , - , / , *) : ");
        funkcia =  scanner.next().charAt(0);

        switch (funkcia){
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
                if(cislo2 != 0) {
                    vysledok = cislo1 / cislo2;

                }
                else{
                    System.out.println("Delenie 0 nie je možné!");
                    return;
                }
                break;
            default:
                    System.out.println("neznáma operácia");
                    return;

            }
        scanner.close();
        System.out.println("výsledok: "+ vysledok);

        }





    }


