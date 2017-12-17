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
public class Both implements Criterion{

    Criterion c, cc;

    public Both(Criterion c, Criterion cc) {
        this.c = c;
        this.cc = cc;
    }
    
    @Override
    public boolean complies(String line) {
        return c.complies(line) && cc.complies(line);
    }
    
}
