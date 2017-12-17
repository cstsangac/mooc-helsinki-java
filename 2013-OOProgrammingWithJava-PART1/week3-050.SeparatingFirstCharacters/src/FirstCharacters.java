import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String s = reader.nextLine();
        int l = s.length();
        if( l < 3 ) return;
        System.out.println("1. character: " + s.charAt(0));
        System.out.println("2. character: " + s.charAt(1));
        System.out.println("3. character: " + s.charAt(2));
        
    }
    
}
