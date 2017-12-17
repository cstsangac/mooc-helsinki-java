
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int counter = 1;
        for (int i : array) {
            if (counter++ > 1) {
                System.out.print(", ");
            }
            System.out.print("" + i);
        }
    }
}
