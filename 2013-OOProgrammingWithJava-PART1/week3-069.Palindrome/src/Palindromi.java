import java.util.Scanner;

public class Palindromi {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        String s = "";
        while(text.length() > 0){
            s += text.charAt(text.length()-1);
            text = text.substring(0,text.length()-1 );
        }
            
        return s;
    }
    
    public static boolean palindrome(String text) {
        // write code here
        return text.equals(reverse(text));
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
