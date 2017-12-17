
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        int x = 0;
        while(a > -1)
            x += (int)Math.pow(2, a--);
        System.out.println("The result is " + x);
    }
}
