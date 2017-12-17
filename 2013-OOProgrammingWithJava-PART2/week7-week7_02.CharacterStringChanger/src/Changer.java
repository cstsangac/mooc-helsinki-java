
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Changer {

    private ArrayList<Change> l = new ArrayList<Change>();

    public Changer() {
    }

    public void addChange(Change change) {
        this.l.add(change);
    }

    public String change(String characterString) {
        for(Change c:this.l){
            characterString =  c.change(characterString);
        }
        return characterString;
    }
}
