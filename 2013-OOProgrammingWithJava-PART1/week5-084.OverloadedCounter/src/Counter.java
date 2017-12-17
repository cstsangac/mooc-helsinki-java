/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Counter {

    private int startingValue;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.check = check;
        if (check && startingValue < 0) {
            this.startingValue = 0;
        } else {
            this.startingValue = startingValue;
        }
    }

    public Counter(int startingValue) {
        this.check = false;
        this.startingValue = startingValue;
    }

    public Counter(boolean check) {
        this.check = check;
        this.startingValue = 0;
    }

    public Counter() {
        this.check = false;
        this.startingValue = 0;
    }

    public int value() {
        return this.startingValue;
    }

    public void increase() {
        this.startingValue++;
    }

    public void decrease() {
        this.startingValue--;
        if (this.check && this.startingValue < 0) {
            this.startingValue = 0;
        }
    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0) {
            this.startingValue += increaseAmount;
        }
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount > 0) {
            this.startingValue -= decreaseAmount;
            if (this.check && this.startingValue < 0) {
                this.startingValue = 0;
            }
        }
    }
}
