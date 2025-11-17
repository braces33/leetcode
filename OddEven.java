// 奇數偶數

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input the num：");
        int num = scan.nextInt(); 

        while (true) {
            
            if (num == 1 || num >= 100000) {
                System.out.println("Program ended!");
                break;
            }
            else if (num % 2 == 1) {
                num = num * 5 - 1;
                System.out.print(num + " ");
            } 
            else {
                num = num / 2;
                System.out.print(num + " ");
            }
        }

        scan.close();
    }
}
