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
public class Teacher extends Person {

    private int salary;

    public Teacher(String name, String addr, int salary) {
        super(name, addr);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + this.salary + " euros/month"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
