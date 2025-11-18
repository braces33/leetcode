import java.util.Scanner;
import java.util.ArrayList;

public class dectohex {
    public static void main(String[] args) { 
        System.out.println("input a number");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        ArrayList<Character> list = new ArrayList<>();
        
        if (num == 0) {
            list.add('0');
        }
        
        while (num != 0) {
            int remainder = num % 16; 
            
            if (remainder == 10){
                list.add('A');
            }
            else if (remainder == 11){
                list.add('B');
            }
            else if (remainder == 12){
                list.add('C');
            }
            else if (remainder == 13){
                list.add('D');
            }
            else if (remainder == 14){
                list.add('E');
            }
            else if (remainder == 15){
                list.add('F'); 
            }
            else {
                list.add((char)(remainder + '0')); 
            }
            num = num / 16;
        }
        
        System.out.print("hex = ");
        
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
    }
}
