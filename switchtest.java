import java.util.Scanner;

public class switchtest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("input the apple");
        int num = scan.nextInt(); 
        
        switch(num){
            case 0:
                System.out.println("none");       
            case 1:
                System.out.println("few");            
            case 2:
                System.out.println("few");  
            case 3:
                System.out.println("several");
            default:
                System.out.println("many");
               
        }
        
      System.out.println(" ");
      
      switch(num){
            case 0:
                System.out.println("none");  
                break;
            case 1:
                System.out.println("few");     
                break;
            case 2:
                System.out.println("few");  
                break;
            case 3:
                System.out.println("several");
                break;
            default:
                System.out.println("many");
                break;
        }

        scan.close();
    }
}
