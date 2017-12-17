
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner reader = new Scanner(System.in);
        Game g = new Game();
        
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.println("  Participant name: ");
            String x = reader.nextLine();
            if (x.isEmpty()) {
                break;
            }
            g.addPlayer(x);
        }
        System.out.println("\nThe tournament begins!");
        while(true){
            System.out.println("\nWrite \"jump\" to jump; otherwise you quit: ");
            String x = reader.nextLine();
            if(x.equals("jump")){
                g.jump();
            }else if(x.equals("quit")){
                break;
            }
        }
        
        System.out.println("\nThanks!");
        
        g.printResults();

    }
}
