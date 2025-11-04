import java.util.Random;
import java.util.Scanner;

public class Chal3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10) + 1;
        int b ;
        System.out.println("Devinez le nombre entre 1 et 10 :");


while (true) {
    System.out.println("Entre your Number : ");
    b = reader.nextInt();

if (b > randomNumber ){
    System.out.println("Trop grand ! Essayez encore. ");
} else if (b < randomNumber) {
    System.out.println("Trop petit ! Essayez encore. ");
}else {
    System.out.println("Bravo ! Vous avez trouvé. ");
break;
}
    }
}}
