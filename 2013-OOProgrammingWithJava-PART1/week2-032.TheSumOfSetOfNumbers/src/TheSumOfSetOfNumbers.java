
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int a = Integer.parseInt(reader.nextLine());
        int x = 0;
        while(a > 0)
            x += a--;
        System.out.println("Sum is " + x);
    }
}
