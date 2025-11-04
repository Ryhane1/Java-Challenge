import java.util.Scanner;

public class Chal4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a;
        int b = 100000;
        int c;
        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Consulter le solde   \n" +
                    "2. Dépôt   \n" +
                    "3. Retrait   \n" +
                    "4. Quitter   \n");
            System.out.println("Entrez votre choix :");
            a = reader.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Votre solde : " + b);
                    break;
                case 2:
                    System.out.println("Entre le montant : ");
                    c = reader.nextInt();
                    int d = b + c;
                    System.out.println("Nouveau solde : " + d);
                    break;
                case 3:
                    System.out.println("Entre le montant : ");
                    c = reader.nextInt();
                    int e = b - c;
                    System.out.println("Nouveau solde : " + e);
                    break;
                case 4:
                    System.out.println("Merci d'avoir utilisé notre service. Au revoir !");
                    reader.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}