
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int a = Integer.parseInt(reader.nextLine());
        
        String g = "failed";
        
        if( a >= 30) g = "1";
        if( a >= 35) g = "2";
        if( a >= 40) g = "3";
        if( a >= 45) g = "4";
        if( a >= 50) g = "5";
        System.out.println("Grade: " + g);
    }
}
