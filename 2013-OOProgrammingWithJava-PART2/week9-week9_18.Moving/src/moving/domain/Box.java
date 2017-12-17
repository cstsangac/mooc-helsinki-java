/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;

/**
 *
 * @author ChiuSing
 */
public class Box implements Thing{

    private int maximunCapacity;
    private ArrayList<Thing> l = new ArrayList<Thing>();

    public Box(int maximunCapacity) {
        this.maximunCapacity = maximunCapacity;
    }

    public boolean addThing(Thing thing) {
        int w = 0;
        for (int i = 0; i < this.l.size(); i++) {
            w += this.l.get(i).getVolume();
        }
        if (w + thing.getVolume() <= this.maximunCapacity) {
            this.l.add(thing);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getVolume() {
        int w = 0;
        for (int i = 0; i < this.l.size(); i++) {
            w += this.l.get(i).getVolume();
        }
        return w;
    }
}
