
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        System.out.println("Up to what number? ");
        int read = Integer.parseInt(reader.nextLine());
        int i = 1;
        while(true){
            if(i > read) break;
            System.out.println(i++);
        }
        
    }
}
