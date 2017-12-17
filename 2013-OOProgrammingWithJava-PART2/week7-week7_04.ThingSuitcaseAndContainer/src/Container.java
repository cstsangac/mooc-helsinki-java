
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
public class Container {

    private int m;
    private ArrayList<Suitcase> l = new ArrayList<Suitcase>();

    public Container(int m) {
        this.m = m;
    }

    public void addSuitcase(Suitcase suitcase) {
        int y = 0;
        for (Suitcase s : this.l) {
            y += s.totalWeight();
        }
        if (y + suitcase.totalWeight() <= this.m) {
            this.l.add(suitcase);
        }
    }

    public void printThings() {
        for (Suitcase s : this.l) {
            s.printThings();
        }
    }

    @Override
    public String toString() {
        int y = 0;
        for (Suitcase s : this.l) {
            y += s.totalWeight();
        }
        return "" + this.l.size() + " suitcases (" + y + " kg)";
    }

}
