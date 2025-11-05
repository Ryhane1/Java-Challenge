import java.util.Arrays;
import java.util.Scanner;

public class Chal6 {
    public static void main(String[] args) {
        int[] tableau = new int[6];
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i <tableau.length; i++) {
            System.out.println("Entre the Number " + (i + 1));
            tableau[i] = reader.nextInt();
        }
        Arrays.sort(tableau);
        int[] nvtab = new int[tableau.length];
        int lastvr = tableau[tableau.length-1];
        nvtab[0] = lastvr;
        for (int i = 0 ; i< tableau.length-1;i++){
            nvtab[i+1]= tableau[i];
        }

        System.out.println(Arrays.toString(nvtab));

    }
}
