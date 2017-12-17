/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author ChiuSing
 */
public class AtLeastOne implements Criterion{
    
    Criterion[]c;

    public AtLeastOne(Criterion... criteria) {
        this.c = criteria;
    }
    
     @Override
    public boolean complies(String line) {
        for (Criterion x : c) {
            if (x.complies(line)) {
                return true;
            }
        }
        return false;
    }

}
