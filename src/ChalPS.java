import java.util.Scanner;

public class ChalPS {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float consmt ;
        System.out.println("Entre le nombre des unites consommer : ");
        consmt = reader.nextInt();
        if (consmt>0 && consmt<= 100){
            float total = consmt* 0.8f;
            float tax = total * 0.1f;
            float ttc = total + tax ;
            System.out.println("Facture avant taxe : "+total+" MAD\n"
            +"Taxe (10%) : "+tax+" MAD\n"+
            "Facture totale : "+ttc+" MAD\n" );
        } else if (consmt>100 && consmt<=300) {
            float somme1 = 80;
            float somme2 = (consmt - 100 ) * 1.2f;
            float total = somme1 + somme2 ;
            float tax = total * 0.1f;
            float ttc = total + tax ;
            System.out.println("Facture avant taxe : "+total+" MAD\n"
                    +"Taxe (10%) : "+tax+" MAD\n"+
                    "Facture totale : "+ttc+" MAD\n" );
        } else if (consmt> 300  ) {
            float somme1 = 320;
            float somme2 = (consmt - 300 ) * 1.5f;
            float total = somme1 + somme2 ;
            float tax = total * 0.1f;
            float ttc = total + tax ;
            System.out.println("Facture avant taxe : "+total+" MAD\n"
                    +"Taxe (10%) : "+tax+" MAD\n"+"Facture totale : "+ttc+" MAD\n" );
        }
        System.out.println();


    }
}
