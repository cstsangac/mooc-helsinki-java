/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author ChiuSing
 */
public class Person {
    private String name;
    private String addr;

    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "" + this.name + "\n  " + this.addr;
    }
    
}