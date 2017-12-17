/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ChiuSing
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {

    private Map<String, Set<String>> l = new HashMap<String, Set<String>>();

    public PersonalMultipleEntryDictionary() {
    }

    @Override
    public void add(String word, String entry) {
        if (this.l.containsKey(word)) {
            this.l.get(word).add(entry);
        } else {
            this.l.put(word, new HashSet<String>());
            this.l.get(word).add(entry);
        }
    }

    @Override
    public Set<String> translate(String word) {
        Set<String> s = null;
        if (this.l.containsKey(word)) {
            s = this.l.get(word);
        }
        return s;
    }

    @Override
    public void remove(String word) {
        if (this.l.containsKey(word)) {
            this.l.remove(word);
        }
    }

}
