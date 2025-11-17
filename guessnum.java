//猜測數字
import java.util.Random;
import java.util.Scanner;

public class guessnum {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100); 
        Scanner scan = new Scanner(System.in); 

        while (true) {
            System.out.println("Guess the number (0-99):");
            int num = scan.nextInt();

            if (num > i) {
                System.out.println("Too large!");
            } else if (num < i) {
                System.out.println("Too small!");
            } else {
                System.out.println("You got it! The number is " + i);
                break;
            }
        }

        scan.close();
    }
}
