import java.util.Scanner;
import java.util.ArrayList;

public class dectobin {
    public static void main(String[] args) { 
        System.out.println("input a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        
        while (num != 0) {
            list.add(num % 2); 
            num = num / 2;
        }
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}
