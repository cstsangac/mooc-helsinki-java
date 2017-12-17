
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
class Player implements Comparable<Player> {

    private final String name;
    private int pt;
    private ArrayList<Integer> l = new ArrayList<Integer>();

    public Player(String name) {
        this.name = name;
        this.pt = 0;
    }

    public String getName() {
        return name;
    }

    public int getPt() {
        return pt;
    }

    public void setPt(int pt) {
        this.pt = pt;
    }

    public void addLength(int l) {
        this.l.add(l);
    }

    public String getLengths() {
        String s = "";
        for (int i = 0; i < this.l.size(); i++) {
            if (i == 0) {
                s += this.l.get(i) + " m";
            } else {
                s += ", " + this.l.get(i) + " m";
            }
        }
        return s;
    }

    @Override
    public int compareTo(Player t) {
        return this.pt - t.getPt();
    }

}
