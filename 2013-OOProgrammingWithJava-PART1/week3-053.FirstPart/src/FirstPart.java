
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String s = reader.nextLine();
        int l = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + s.substring(0,l));
    }
}
