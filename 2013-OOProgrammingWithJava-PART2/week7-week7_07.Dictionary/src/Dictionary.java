
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChiuSing
 */
public class Dictionary {

    private HashMap<String, String> h = new HashMap<String, String>();

    public String translate(String word) {
        return this.h.containsKey(word) ? this.h.get(word) : null;
    }

    public void add(String word, String translation) {
        this.h.put(word, translation);
    }

    public int amountOfWords() {
        return this.h.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> l = new ArrayList<String>();
        for (HashMap.Entry<String, String> e : this.h.entrySet()) {
            l.add("" + e.getKey() + " = " + e.getValue());
        }
        return l;
    }
}
