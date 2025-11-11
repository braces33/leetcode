import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1");
        int num1 = sc.nextInt();
        System.out.println("Input num2");
        int num2 = sc.nextInt();
        
        int mini, max;
        if (num1 < num2) {
            mini = num1;
            max = num2;
        } else {
            mini = num2;
            max = num1;
        }
        
        int gcd = 0;
        for (int i = 1; i <= mini; i++) {
            if (mini % i == 0 && max % i == 0) {
                gcd = i ;
            }
        }
       
       int lcm =0 ;
       lcm = num1*num2/gcd ;
       
       System.out.println("GCD: " + gcd + ", LCM: " + lcm);
        
    }
}
