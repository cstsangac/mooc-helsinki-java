
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        int b = Integer.parseInt(reader.nextLine());
        int x = 0;
        while( b >= a)
            x += b--;
        System.out.println("The sum is " + x);
        
        
        
    }
}
