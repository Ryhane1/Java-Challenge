import java.util.Scanner;
public class ChalPS2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String order ;
        int X = 0 ;
        int Y = 0 ;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Up   \n" +
                    "2. Down   \n" +
                    "3. Left   \n" +
                    "4. Right  \n" +
                    "5. Quitter \n");
            System.out.print("Entre Numero des operations separer par ESPACE : ");
            order = reader.nextLine();
            String[] choix = order.split(" ");
            for (String ob : choix) {
                switch (ob) {
                    case "1":
                        Y++;
                        break;
                    case "2":
                        Y--;
                        break;
                    case "3":
                        X--;
                        break;
                    case "4":
                        X++;
                        break;
                    case "5":
                        System.out.println("Quitter le program ! ");
                        break;
                    default:
                        System.out.println("Choix invalide !");
                }
            }
        }while (!order.contains("5"));
        if (X == 0 && Y == 0) {
            System.out.println("Le robot est revenu au point de départ ");
        }
        System.out.printf("Position finale : (%d, %d)\n", X, Y);
    }
}
