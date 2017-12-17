
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int a = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int b = Integer.parseInt(reader.nextLine());
        while(a<(b+1))
            System.out.println(a++);
        
        
    }
}
