
import java.util.Arrays;
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

public class Main {

    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {
        int s = array[0];
        for (int i : array) {
            s = i < s ? i : s;
        }
        return s;
    }

    public static int indexOfTheSmallest(int[] array) {
        int s = smallest(array);
        int index = 0;
        for (int i : array) {
            if (i == s) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int[] newArray = Arrays.copyOfRange(array, index, array.length);
        return indexOfTheSmallest(newArray) + index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int t = array[index2];
        array[index2] = array[index1];
        array[index1] = t;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length ; i++){
            swap(array, i, indexOfTheSmallestStartingFrom(array,i));
        }
    }
}
