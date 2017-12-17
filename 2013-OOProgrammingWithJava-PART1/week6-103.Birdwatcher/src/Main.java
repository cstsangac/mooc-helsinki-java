
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        Scanner reader = new Scanner(System.in);
        ArrayList<Bird> l = new ArrayList<Bird>();
        while (true) {
            String c = reader.nextLine();
            if (c.equals("Add")) {
                System.out.println("Name: ");
                String n = reader.nextLine();
                String ln = reader.nextLine();
                l.add(new Bird(n, ln));
                continue;
            } else if (c.equals("Observation")) {
                System.out.println("What was observed:? ");
                String n = reader.nextLine();
                for (Bird b : l) {
                    if (b.getN().equals(n)) {
                        b.next();
                        continue;
                    }
                }
                System.out.println("Is not a bird!");
                continue;
            } else if (c.equals("Statistics")) {
                for (Bird b : l) {
                    System.out.println("" + b.getN() + " (" + b.getLn() + "): " + b.getO() + " observations");
                }
                continue;
            } else if (c.equals("Show")) {
                System.out.println("What? ");
                String n = reader.nextLine();
                for (Bird b : l) {
                    if (b.getN().equals(n)) {
                        System.out.println("" + b.getN() + " (" + b.getLn() + "): " + b.getO() + " observations");
                    }
                }
                continue;
            } else if (c.equals("Quit")) {
                break;
            }
        }
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }

}
