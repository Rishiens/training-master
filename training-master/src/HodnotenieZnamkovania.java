import java.util.Scanner;

public class HodnotenieZnamkovania {

    static void main(String[] args) {

        int znamkaScanner;
        //int znamka1 = 1;
        //int znamka2 = 2;
        //int znamka3 = 3;
        //int znamka4 = 4;
        //int znamka5 = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("akú si dostal známku? : ");
        znamkaScanner = scanner.nextInt();

        switch(znamkaScanner){

            case 1 :
                System.out.println("výborne, dostal si 1 :) ");
                break;
            case 2 :
                System.out.println("chvalitebne, dostal si 2 :) ");
                break;
            case 3 :
                System.out.println("dobre, dostal si 3 :/ ");
                break;
            case 4 :
                System.out.println("fuuu, dostal si 4, polepsi sa ");
                break;
            case 5 :
                System.out.println("dostal si 5, dojebal si to ");
                break;

            default:
                System.out.println("nevložil si známku");
                return;

        }

        scanner.close();



    }

}
