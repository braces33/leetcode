import java.util.Scanner;

// 1. 檔名與類別名稱改為 Apnrv (首字大寫符合 Java 慣例)
public class Apnrv { 

    // 方法：有參數 (int x)，無回傳值 (void)
    public static void printlevelstar(int x) {
        for (int i = 1; i <= x; i++) {
            // 2. 修正：內層迴圈的 j 忘了宣告型態，加上 int
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // 3. 修正：Strings[] 拼錯了，應為 String[] (單數)
    public static void main(String[] args) { 
        System.out.print("First N level star:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        // 4. 修正：呼叫時必須把參數 n 傳進去，不能留空 ()
        printlevelstar(n); 
    }
}
