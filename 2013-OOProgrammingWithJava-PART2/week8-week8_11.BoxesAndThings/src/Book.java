/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Book implements ToBeStored{
    private String wrtier;
    private String name;
    private double weight;

    public Book(String wrtier, String name, double weight) {
        this.wrtier = wrtier;
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return "" + this.wrtier + ": " + this.name;
    }
    
}
