import java.util.Scanner;

public class callfution {
    public static void main(String[] args) {
        callFunction.myFunction();
    }

    static void printStar() {
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

class CallFunction {
    static void myFunction() {
        callfuntion.printStar();
        callfuntion.printStar();
    }
}
