
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // add the methods here
    public void addMeal(String m){
        if(!this.meals.contains(m)) this.meals.add(m);
    }
    
    public void printMeals(){
        for(String m:this.meals){
            System.out.println(m);
        }
    }
    
    public void clearMenu(){
        this.meals = new ArrayList<String>();
    }
}
