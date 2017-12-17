
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        double ap = 0;
        int accepted = 0;
        int addScore = 0;
        String g0 = "";
        String g1 = "";
        String g2 = "";
        String g3 = "";
        String g4 = "";
        String g5 = "";
        
        
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        while (true) {
            int s = Integer.parseInt(lukija.nextLine());
            if (s == -1) {
                break;
            }
            if (s < 0 || s > 60) {
                continue;
            }
            addScore++;
            if (s >=30 ){
                accepted++;
            }
            if (s >= 50) {
                g5 += "*";
                continue;
            }
            if (s >= 45) {
                g4 += "*";
                continue;
            }
            if (s >= 40) {
                g3 += "*";
                continue;
            }
            if (s >= 35) {
                g2 += "*";
                continue;
            }
            if (s >= 30) {
                g1 += "*";
                continue;
            }
            
            g0 += "*";
            
            
            

        }
        System.out.println("Grade distribution:");
        System.out.println("5: " + g5);
        System.out.println("4: " + g4);
        System.out.println("3: " + g3);
        System.out.println("2: " + g2);
        System.out.println("1: " + g1);
        System.out.println("0: " + g0);
        System.out.println("Acceptance percentage: " + ((double)accepted*100/addScore));
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }
}
