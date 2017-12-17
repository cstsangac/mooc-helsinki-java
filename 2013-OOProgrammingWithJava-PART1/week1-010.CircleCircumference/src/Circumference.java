
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.print("Type the radius: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.println("Circumference of the circle: " + (2*a*Math.PI));
    }
}
