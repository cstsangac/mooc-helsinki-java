
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String s = reader.nextLine();
        int l = s.length();
        for(int i = 0; i < l; i++){
            System.out.println((i+1) + ". character: " + s.charAt(i));
        }
    }
}
