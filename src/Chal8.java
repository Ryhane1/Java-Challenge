import java.util.Scanner;

public class Chal8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] tableau = new int[5];
        for(int i =0 ; i< tableau.length; i++){
            System.out.println("Entre le Numero : ");
            tableau[i] = reader.nextInt();
        }
        int cible;
        System.out.println("Entre le cible : ");
        cible = reader.nextInt();
    for (int i = 0 ; i< tableau.length; i++){
        if (tableau[i] == cible) {
            System.out.print("[" + tableau[i] + "] ");
        }

        for(int j= i+1 ; j< tableau.length; j++){
            int somme = tableau[i]+tableau[j];
            if (somme == cible){
                System.out.print("["+tableau[i]+" , "+tableau[j]+"]");
            }


        }
    }




    }
}
