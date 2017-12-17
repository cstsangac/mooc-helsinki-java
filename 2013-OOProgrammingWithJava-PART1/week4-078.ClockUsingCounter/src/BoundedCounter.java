/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        // write code here
        if (this.value == 0) {
            return "00";
        } else if (this.value > 9) {
            return "" + this.value;
        } else {
            return "0" + this.value;
        }
    }

    public int getValue() {
        // write here code that returns the value
        return this.value;
    }

    public void setValue(int i) {
        if (i >= 0 && i <= this.upperLimit) {
            this.value = i;
        }
    }
}
