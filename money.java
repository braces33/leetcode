import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float hour = scan.nextFloat(); 
        float money ;
        if (hour <= 60){
            money = hour * 120;
        }
        else if (hour > 60 && hour <= 80){ 
            money = (hour - 60) * 120 * 1.25f + 60 * 120; 
        }
        else if (hour > 80){
            money = ((hour - 80) * 120 * 1.5f) + 20*120*1.25f + (60 * 120); 
        } else {
             money = 0.0f;
        }
        System.out.print(money);
    }
}
