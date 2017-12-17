/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author ChiuSing
 */
public class OneThingBox extends Box {

    private Thing t;

    public OneThingBox() {
        t = null;
    }

    @Override
    public void add(Thing thing) {
        if (t == null) {
            t = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if (t == null) {
            return false;
        } else {
            return t.equals(thing);
        }
    }

}
