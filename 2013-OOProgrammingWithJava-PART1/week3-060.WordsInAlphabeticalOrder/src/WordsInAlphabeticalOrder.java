
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String s;
        while( !(s = reader.nextLine()).isEmpty()){
            words.add(s);
        }
        Collections.sort(words);
        for(String x : words){
            System.out.println(x);
        }
    }
}
