/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Player {
    private String name;
    private int goals;

    public Player(String n) {
        this.name = n;
        this.goals = 0;
    }
    public Player(String n, int g) {
        this.name = n;
        this.goals = g;
    }
    public String getName() {
        return name;
    }

    public int goals() {
        return goals;
    }

    @Override
    public String toString() {
        return "" + this.getName() + ", goals " + this.goals();
    }
    
    
}
