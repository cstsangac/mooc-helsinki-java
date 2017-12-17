
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your username: ");
        String un = reader.nextLine();
        System.out.print("Type your password: ");
        String up = reader.nextLine();
        
        boolean l = false;
        l = un.equals("alex") && up.equals("mightyducks") ? true : l;
        l = un.equals("emily") && up.equals("cat") ? true : l;
        if(l) System.out.println("You are now logged into the system!"); else System.out.println("Your username or password was invalid!");
            
        
    }
}
