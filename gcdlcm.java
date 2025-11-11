//2025.11.11 最大公因 最小公因數

import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1"); //輸入值 num1
        int num1 = sc.nextInt();
        System.out.println("Input num2"); //輸入值 num2
        int num2 = sc.nextInt();

        //進行數值大小比較，並用mini,max作為後續計算的代稱
        int mini = 0 ;
        int max = 0 ;
        if (num1 < num2) {
            mini = num1;
            max = num2;
        } else {
            mini = num2;
            max = num1;
        }

        //求最大公因數
        int gcd = 0;
        for (int i = 1; i <= mini; i++) {
            if (mini % i == 0 && max % i == 0) { // 兩餘數都為0時就可以得知他有哪些公因數，而因為我們要求的是最大公因數，因此直接輸出最後一個公因數及為最大公因數
                gcd = i ;
            }
        }

        //求最最小公倍數
       int lcm =0 ;
       lcm = num1*num2/gcd ;

        //輸出計算結果
       System.out.println("GCD: " + gcd + ", LCM: " + lcm);
        
    }
}
