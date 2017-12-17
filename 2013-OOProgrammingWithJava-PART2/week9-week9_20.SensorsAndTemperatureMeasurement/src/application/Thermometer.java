/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author ChiuSing
 */
public class Thermometer implements Sensor {

    private boolean isOn;
    private int value;

    public Thermometer() {
        this.isOn = false;

    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void on() {
        this.isOn = true;

    }

    @Override
    public void off() {
        this.isOn = false;
    }

    @Override
    public int measure() {
        if (this.isOn) {
            this.value = (new Random()).nextInt(60) - 30;
            return this.value;
        } else {
            throw new IllegalStateException();
        }
    }

}
