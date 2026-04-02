import java.util.Scanner;

public class stlpcovanie {
    static void main(String[] args) {

Scanner skener = new Scanner(System.in);

   int riadky;
   int stlpce;
   char symbol;

        System.out.print("Vlož počer riadkov: ");
        riadky = skener.nextInt();
        System.out.print("Vlož počer stĺpcov: ");
        stlpce = skener.nextInt();
        System.out.print("Vlož symbol: ");
        symbol = skener.next().charAt(0);

for (int i = 0; i < riadky; i++){
    for(int j = 0; j < stlpce; j++){
        System.out.print(symbol);

    }
    System.out.println();
}




skener.close();
    }

        }

