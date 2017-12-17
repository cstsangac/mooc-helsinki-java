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
public class Not implements Criterion {

    Criterion c;

    public Not(Criterion c) {
        this.c = c;
    }

    @Override
    public boolean complies(String line) {
        return !c.complies(line);
    }

}
