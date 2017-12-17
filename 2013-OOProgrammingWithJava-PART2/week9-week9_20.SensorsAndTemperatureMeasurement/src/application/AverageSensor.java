/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ChiuSing
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> l = new ArrayList<Sensor>();
    private ArrayList<Integer> readings = new ArrayList<Integer>();
    
    public void addSensor(Sensor additional) {
        this.l.add(additional);
    }

    @Override
    public boolean isOn() {
        boolean x = true;
        for (int i = 0; i < this.l.size(); i++) {
            x = this.l.get(i).isOn() ? x : false;
        }
        return x;
    }

    @Override
    public void on() {
        for (int i = 0; i < this.l.size(); i++) {
            this.l.get(i).on();
        }
    }

    @Override
    public void off() {
        for (int i = 0; i < this.l.size(); i++) {
            this.l.get(i).off();
        }
    }

    @Override
    public int measure() {
        if (this.l.size() == 0 || !this.isOn()) {
            throw new IllegalStateException();
        }
        int x = 0;
        for (int i = 0; i < this.l.size(); i++) {
            x += this.l.get(i).measure();
        }
        x = (int) x / this.l.size();
        this.readings.add(x);
        return x;
    }

    public List<Integer> readings() {
        return this.readings;
    }

    public static void main(String[] args) {
        Sensor kumpula = new Thermometer();
        Sensor kaisaniemi = new Thermometer();
        Sensor helsinkiVantaa = new Thermometer();

        AverageSensor helsinkiArea = new AverageSensor();
        helsinkiArea.addSensor(kumpula);
        helsinkiArea.addSensor(kaisaniemi);
        helsinkiArea.addSensor(helsinkiVantaa);

        helsinkiArea.on();
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");
        System.out.println("the temperature in Helsinki area is " + helsinkiArea.measure() + " degrees");

        System.out.println("readings: " + helsinkiArea.readings());
    }
}
