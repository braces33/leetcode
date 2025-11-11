//2025.11.11 計算有幾個正方形 
//公式：n^2的總和

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1"); 
        int num1 = sc.nextInt();
        
        if (num1>0){
            int ans = (num1 * (num1 + 1) * (2 * num1 + 1)) / 6;
            System.out.println("square："+ans);
        }
    }
}
