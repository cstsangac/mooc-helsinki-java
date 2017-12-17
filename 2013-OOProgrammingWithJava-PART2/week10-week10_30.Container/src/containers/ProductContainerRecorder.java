/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author ChiuSing
 */
public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory ch;

    public ProductContainerRecorder(String productName, double tilavuus, double initialVolume) {
        super(productName, tilavuus);
        super.addToTheContainer(initialVolume);
        ch = new ContainerHistory();
        ch.add(this.getVolume());
    }

    public String history() {
        return "" + ch.getL();
    }

    public void addToTheContainer(double amount) {
        super.addToTheContainer(amount);
        ch.add(this.getVolume());
    }

    public double takeFromTheContainer(double amount) {
        if (amount <= super.getVolume()) {
            super.takeFromTheContainer(amount);
            ch.add(this.getVolume());
            return this.getVolume();
        }
        return this.getVolume();
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + ch.getL());
        System.out.println("Greatest product amount: " + ch.maxValue());
        System.out.println("Smallest product amount: " + ch.minValue());
        System.out.println("Average: " + ch.average());
        System.out.println("Greatest change: " + ch.greatestFluctuation());
        System.out.println("Variance: " + ch.variance());
    }
}
