
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("studentnumber: ");
            String id = reader.nextLine();
            list.add(new Student(name, id));
        }
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("Give search term: ");
        String kw = reader.nextLine();
        System.out.println("Result:");
        for (Student s : list) {
            if (s.getName().contains(kw)) {
                System.out.println(s);
            }
        }

    }
}
