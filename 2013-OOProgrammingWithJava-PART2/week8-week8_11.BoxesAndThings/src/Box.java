
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
public class Box implements ToBeStored{
    private double m;
    private ArrayList<ToBeStored> l = new ArrayList<ToBeStored>();
    public Box(double m) {
        this.m = m;
    }
    
    public void add(ToBeStored t){
        double w = 0;
        for(ToBeStored x: this.l){
            w += x.weight();
        }
        if( w + t.weight() <= this.m){
            this.l.add(t);
        }
    }
    public double weight() {
        double w = 0;
        for(ToBeStored x: this.l){
            w += x.weight();
        }
        return w;
    }

    @Override
    public String toString() {
        double w = 0;
        for(ToBeStored x: this.l){
            w += x.weight();
        }
        return "Box: " + this.l.size() + " things, total weight " + w + " kg";
    }
    
    
}
