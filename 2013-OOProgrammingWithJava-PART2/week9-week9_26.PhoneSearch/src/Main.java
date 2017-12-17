
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Start your program here
        // ATTENTION: In your program, you can create only one instance of class Scanner!
        System.out.println("phone search\n"
                + "available operations:\n"
                + " 1 add a number\n"
                + " 2 search for a number\n"
                + " 3 search for a person by phone number\n"
                + " 4 add an address\n"
                + " 5 search for personal information\n"
                + " 6 delete personal information\n"
                + " 7 filtered listing\n"
                + " x quit");

        Scanner reader = new Scanner(System.in);
        String c;
        PhoneBook pb = new PhoneBook();
        while (true) {
            System.out.println("\ncommand: ");
            c = reader.nextLine();
            if (c.equals("1")) {
                System.out.println("whose number: ");
                String name = reader.nextLine();
                System.out.println("number: ");
                String num = reader.nextLine();
                pb.addNumber(name, num);
            } else if (c.equals("2")) {
                System.out.println("whose number: ");
                String name = reader.nextLine();
                pb.searchByName(name);
            } else if (c.equals("3")) {
                System.out.println("number: ");
                String num = reader.nextLine();
                pb.searchByNumber(num);
            } else if (c.equals("4")) {
                System.out.println("whose address: ");
                String name = reader.nextLine();
                System.out.println("street: ");
                String street = reader.nextLine();
                System.out.println("city: ");
                String city = reader.nextLine();
                pb.addAddr(name, ("" + street + " " + city));
            } else if (c.equals("5")) {
                System.out.println("whose information: ");
                String name = reader.nextLine();
                pb.getInfo(name);
            } else if (c.equals("6")) {
                System.out.println("whose information: ");
                String name = reader.nextLine();
                pb.delete(name);
            } else if (c.equals("7")) {
                System.out.println("keyword (if empty, all listed): ");
                String k = reader.nextLine();
                pb.filter(k);
            } else if (c.equals("x")) {
                break;
            }
        }
    }
}
