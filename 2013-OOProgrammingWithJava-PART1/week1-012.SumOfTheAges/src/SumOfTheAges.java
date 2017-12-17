
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.print("Type your name: ");
        String an = reader.nextLine();
        System.out.print("Type your age: ");
        int aa = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type your name: ");
        String bn = reader.nextLine();
        System.out.print("Type your age: ");
        int ba = Integer.parseInt(reader.nextLine());
        
        
        System.out.println(an + " and " + bn + " are " + (aa+ba) + " years old in total" );
        
    }
}
