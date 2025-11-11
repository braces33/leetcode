import java.util.Scanner;
import java.util.Arrays;

public class armstrongsnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num"); 
        int num = sc.nextInt();
        
        int digits = String.valueOf(num).length(); //算出有幾個數字，例如123有3位
        
        int[] l1 = new int[digits]; //建立新的字串以方便後續放值
        
        int ans =0;
        for (int i = 0; i < digits; i++) {
            l1[i] = (num / (int)Math.pow(10, digits - i - 1)) % 10; //計算個單獨數值的大小
            int num1 = (int)Math.pow(l1[i], digits);
            ans=ans+num1;
        }
        
        System.out.println("armstrongs number:"+ans);
    }
}
