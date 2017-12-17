/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author ChiuSing
 */
public class Cow implements Milkable, Alive {

    private String name;
    private double capacity = (new Random()).nextInt(25) + 15;
    private double amount;

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow() {
        this.name = NAMES[(new Random()).nextInt(NAMES.length)];
        amount = 0;
    }

    public Cow(String name) {
        this.name = name;
        amount = 0;
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "" + name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }

    @Override
    public double milk() {
        double x = amount;
        amount = 0;
        return x;
    }

    @Override
    public void liveHour() {
        double x = (new Random()).nextInt(14) / 10 + 0.7;
        amount += x;
        if (amount > capacity) {
            amount = capacity;
        }
    }

}
