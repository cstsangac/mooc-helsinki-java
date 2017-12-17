/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ChiuSing
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private int dup;
    private Set<String> s;

    public PersonalDuplicateRemover() {
        s = new HashSet<String>();
        dup = 0;
    }
    
    @Override
    public void add(String characterString) {
        if(this.s.add(characterString)){
        }else{
            this.dup++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.dup;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.s;
    }

    @Override
    public void empty() {
        s = new HashSet<String>();
        dup = 0;
    }
    
}
