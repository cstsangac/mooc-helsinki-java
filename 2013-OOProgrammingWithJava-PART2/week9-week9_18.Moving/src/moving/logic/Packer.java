/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

/**
 *
 * @author ChiuSing
 */
public class Packer {

    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> l = new ArrayList<Box>();
        l.add(new Box(this.boxesVolume));
        int index = 0;

        for (Thing t : things) {
            while (!l.get(index).addThing(t)) {
                l.add(new Box(this.boxesVolume));
                index++;
            }
        }
        return l;
    }
}
