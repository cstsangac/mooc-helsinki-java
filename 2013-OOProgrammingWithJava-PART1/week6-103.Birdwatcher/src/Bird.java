/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Bird {
    private String n;
    private String ln;
    private int o;

    public Bird(String n, String ln) {
        this.n = n;
        this.ln = ln;
        this.o = 0;
    }

    public String getN() {
        return n;
    }

    public String getLn() {
        return ln;
    }

    public int getO() {
        return o;
    }

    public void next() {
        this.o++;
    }
    
    
}
