/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ChiuSing
 */
public class Employees {

    private ArrayList<Person> l = new ArrayList<Person>();

    public Employees() {
    }

    public void add(Person person) {
        l.add(person);
    }

    public void add(List<Person> persons) {
        for (Person p : persons) {
            add(p);
        }
    }

    public void print() {
        Iterator<Person> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> i = l.iterator();
        while (i.hasNext()) {
            Person p = (Person) i.next();
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education){
        //ArrayList<Person> toBeFired = new ArrayList<Person>();
        Iterator<Person> i = l.iterator();
        while (i.hasNext()) {
            Person p = (Person) i.next();
            if (p.getEducation() == education) {
                //toBeFired.add(p);
                i.remove();
            }
        }
        //l.removeAll(toBeFired);
    }
}
