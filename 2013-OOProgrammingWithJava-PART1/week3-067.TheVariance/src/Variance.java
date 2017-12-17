import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int x = 0;
        for(Integer i : list){
            x += i;
        }
        return x;
    
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        return (double)sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double v = 0;
        for(Integer i : list){
            v += (i - avg)*(i - avg);
        }
        v /= (list.size() - 1);
        return v;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
