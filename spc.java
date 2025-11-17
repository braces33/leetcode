import java.util.Random;
import java.util.Scanner;

public class spc {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int rock = 0;
        int paper = 1;
        int scissors = 2;

        while (true) {
            // 電腦隨機出拳
            int i = rand.nextInt(3);

            System.out.println("請輸入出拳 (0=石頭, 1=布, 2=剪刀, 9=離開)：");
            int rps = scan.nextInt();

            if (rps == 9) {
                System.out.println("遊戲結束！");
                break;
            }

            if (rps < 0 || rps > 2) {
                System.out.println("輸入錯誤，請重新輸入！");
                continue;
            }

            System.out.println("你出的是：" + rps + "；電腦出的是：" + i);

            // === 你的原始判斷邏輯改良版 ===
            if (rps == i) {
                System.out.println("平手！");
            }
            else if (rps == rock) { // 玩家出石頭
                if (i == paper) {
                    System.out.println("你輸了！");
                } else if (i == scissors) {
                    System.out.println("你贏了！");
                }
            }
            else if (rps == paper) { // 玩家出布
                if (i == scissors) {
                    System.out.println("你輸了！");
                } else if (i == rock) {
                    System.out.println("你贏了！");
                }
            }
            else if (rps == scissors) { // 玩家出剪刀
                if (i == rock) {
                    System.out.println("你輸了！");
                } else if (i == paper) {
                    System.out.println("你贏了！");
                }
            }

            System.out.println(); // 換行讓畫面更整潔
        }

        scan.close();
    }
}
