/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;

/**
 *
 * @author ChiuSing
 */
public class Farm implements Alive {

    private ArrayList<Cow> cows = new ArrayList<Cow>();
    private String name;
    private Barn barn;

    public Farm(String name, Barn barn) {
        this.name = name;
        this.barn = barn;
    }

    public void addCow(Cow c) {
        cows.add(c);
    }

    public void manageCows() {
        barn.takeCareOf(cows);
    }

    @Override
    public String toString() {
        String s = "Farm owner: " + name
                + "\nBarn bulk tank: " + barn.getBulkTank().toString();
        if (cows.size() == 0) {
            s += "\nNo cows.";
        } else {
            s += "\nAnimals:";
            for(Cow c:cows){
                s += "\n        " + c;
            }
        }
        return s;
    }
    public void installMilkingRobot(MilkingRobot mr){
        barn.installMilkingRobot(mr);
    }
    @Override
    public void liveHour() {
        for (Cow c : cows) {
            c.liveHour();
        }
    }
    public String getOwner(){
        return name;
    }
}
