/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ChiuSing
 */
public class ContainerHistory {

    private ArrayList<Double> l = new ArrayList<Double>();

    public ContainerHistory() {
    }

    public ArrayList<Double> getL() {
        return l;
    }

    public void add(double situation) {
        this.l.add(situation);
    }

    public void reset() {
        l = new ArrayList<Double>();
    }

    public String toString() {
        return "" + l;
    }

    public double maxValue() {
        return Collections.max(l);
    }

    public double minValue() {
        return Collections.min(l);
    }

    public double average() {
        double x = 0;
        for (int i = 0; i < l.size(); i++) {
            x += l.get(i);
        }
        x /= l.size();
        return x;
    }

    public double greatestFluctuation() {
        double x = 0;
        if (l.size() == 0 || l.size() == 1) {
            return x;
        } else {
            for (int i = 0; i < l.size() - 1; i++) {
                x = Math.abs(l.get(i) - l.get(i + 1)) > x ? Math.abs(l.get(i) - l.get(i + 1)) : x;
            }
            return x;
        }
    }

    public double variance() {
        double sumDiffsSquared = 0.0;
        double avg = this.average();
        for (double value : l) {
            double diff = value - avg;
            diff *= diff;
            sumDiffsSquared += diff;
        }
        return sumDiffsSquared / (l.size() - 1);
    }
}
