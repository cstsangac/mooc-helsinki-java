
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
public class Suitcase {

    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int m;

    public Suitcase(int m) {
        this.m = m;
    }

    public void addThing(Thing thing) {
        int y = 0;
        for (Thing t : this.things) {
            y += t.getWeight();
        }
        if (thing.getWeight() + y <= this.m) {
            this.things.add(thing);
        }
    }

    public void printThings() {
        for (Thing t : this.things) {
            System.out.println(t);
        }
    }

    public int totalWeight() {
        int y = 0;
        for (Thing t : this.things) {
            y += t.getWeight();
        }
        return y;
    }

    public Thing heaviestThing() {
        int y = 0;
        for (Thing t : this.things) {
            y = y < t.getWeight() ? t.getWeight() : y;
        }
        for (Thing t : this.things) {
            if (y == t.getWeight()) {
                return t;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        int y = 0;
        for (Thing t : this.things) {
            y += t.getWeight();
        }
        if (this.things.size() == 0) {
            return "empty (0 kg)";
        } else if (this.things.size() == 1) {
            return "1 thing (" + y + " kg)";
        } else {
            return "" + this.things.size() + " things (" + y + " kg)";
        }
    }

}
