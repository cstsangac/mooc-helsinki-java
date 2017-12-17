/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;

/**
 *
 * @author ChiuSing
 */
public class Group implements Movable {
    
    private ArrayList<Organism> l = new ArrayList<Organism>();
    
    public Group() {
    }
    
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.l.size(); i++) {
            if (i == 0) {
                s += this.l.get(i);
            } else {
                s += "\n" + this.l.get(i);
            }
        }
        return s;
    }

    public void addToGroup(Movable movable) {
        this.l.add((Organism) movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (int i = 0; i < this.l.size(); i++) {
            this.l.get(i).move(dx, dy);
        }
    }
    
}
