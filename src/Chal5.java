import java.util.Arrays;
import java.util.Scanner;

public class Chal2 {
    public static void main(String[] args) {
        int[] tableau = new int[7];
        Scanner reader = new Scanner(System.in);
        for( int i = 0 ; i < tableau.length; i++){
            System.out.println("Entre your Number : "+ (i+1));
            tableau[i] = reader.nextInt();
        }
        Arrays.sort(tableau);

        System.out.println( " la deuxieme grand valeur est : "+  tableau[tableau.length - 2]);
    }
}
