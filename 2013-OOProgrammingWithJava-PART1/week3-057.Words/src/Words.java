import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        String s = reader.nextLine();
        while( !s.isEmpty()){
            words.add(s);
            s = reader.nextLine();
        }
        for(String x: words){
            System.out.println(x);
        }
    }
}
