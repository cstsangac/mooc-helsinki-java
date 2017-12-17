import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String s = reader.nextLine();
        int l = s.length() - 1;
        while(l > -1){
            System.out.print(s.charAt(l--));
        }
    }
}
