import java.util.HashMap;
import java.util.Scanner;

public class Chal7 {
    public static void main(String[] args) {
        int[] tableau = new int[7];
        Scanner reader = new Scanner(System.in);
        for (int i =0 ; i < tableau.length; i++){
            System.out.println("Entre le Numero : ");
            tableau[i] = reader.nextInt();
        }
        HashMap<Integer,Integer> tab =new HashMap<>();
        for(int n : tableau){
          if (tab.containsKey(n))  {
              tab.put(n , tab.get(n)+1 );
          }else {
              tab.put(n, 1);
          }
        }
        System.out.println("\n--- Résultat ---");
        System.out.println(tab);

    }
}
