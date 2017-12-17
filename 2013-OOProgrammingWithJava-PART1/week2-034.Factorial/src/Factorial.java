import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        int x = 1;
        while( a > 0 ){
            x *= a--;
        }
        System.out.println("Factorial is " + x);
    }
}
