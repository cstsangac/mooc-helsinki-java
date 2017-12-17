/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;

/**
 *
 * @author ChiuSing
 */
public class MaxWeightBox extends Box {

    private int maxWeight;
    private ArrayList<Thing> l = new ArrayList<Thing>();

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public void add(Thing thing) {
        int w = 0;
        for (int i = 0; i < l.size(); i++) {
            w += l.get(i).getWeight();
        }
        if (w + thing.getWeight() <= maxWeight) {
            l.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return l.contains(thing);
    }

}
