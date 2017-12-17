/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Person {
    private String name;
    private String number;

    public Person(String n, String id) {
        this.name = n;
        this.number = id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
    public void changeNumber(String id){
        this.number = id;
    }

    @Override
    public String toString() {
        return "" + getName() + " number: " + getNumber();
    }
    
    
}
