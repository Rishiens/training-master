import java.util.Scanner;

public class enhancedSwitch {
    static void main(String[] args) {


        System.out.println(" Aky je dnes den? :");
        Scanner scanner = new Scanner(System.in);
        String day = scanner.next();

        switch (day){
            case "Pondelok" -> System.out.println("nobody likes Pondelok");
            case "Utorok" -> System.out.println("nobody likes Utorok");
            case "Streda" -> System.out.println("nobody likes Streda");
            case "Stvrtok" -> System.out.println("nobody likes Stvrtok");
            case "Piatok" -> System.out.println("nobody likes Piatok");
            case "Sobota" -> System.out.println("nobody likes Sobota");
            case "Nedela" -> System.out.println("nobody likes Nedela");

            default -> System.out.println("to nie je den v tyzdni!");

        }
        scanner.close();
    }
}
