import java.util.Random;
import java.util.Scanner;

public class hadanieRandomCisla {
    static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomCislo = random.nextInt(1,7);
        int hadajCislo;

        System.out.println("hádaj číslo od 0 do 6: ");
        hadajCislo = scanner.nextInt();

        if(randomCislo == hadajCislo){
            System.out.println(" výborne je to " + randomCislo);
        }
        else{
            System.out.println(" Bohuzial, netrafil si to");
        }

        scanner.close();

    }
}
