
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here:
        System.out.print("How old are you? ");
        int a = Integer.parseInt(reader.nextLine());
        String x = a>=18? "You have reached the age of majority!" : "You have not reached the age of majority yet!";
        System.out.print(x);
    }
}
