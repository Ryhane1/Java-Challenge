import java.util.Scanner;

public class ChalPS3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int N;
        int M;
        System.out.print("Entre Nombre des Etudiant : ");
        N = reader.nextInt();
        System.out.print("Entrer nombre des Tables : ");
        M = reader.nextInt();
        int N1 = 1;
        for (int i = 1; i<= M; i++){
            System.out.print("Banc "+ i);
        if (N1<=N){
            System.out.print(" Etudiant "+N1);
            N1++;
        }
            if (N1<=N){
                System.out.print(" Etudiant "+N1);
                N1++;
            }
             System.out.println();
        }
        for(int i = N1 ; i <= N ; i++){
           System.out.println(" Etuaidant " + i + " ne trouve pas de place");
        }
    }
}
