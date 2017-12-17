
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
    }
    public static int[] copy(int[] array){
        int[] x = new int[array.length];
        int index = 0;
        for(int i : array){
            x[index++] = i;
        }
        return x;
    }
    public static int[] reverseCopy(int[] array){
        int[] x = new int[array.length];
        int index = 1;
        for(int i : array){
            x[ array.length - index++] = i;
        }
        return x;
    }
}
