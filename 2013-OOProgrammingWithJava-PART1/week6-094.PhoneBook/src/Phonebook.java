
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChiuSing
 */
public class Phonebook {

    private ArrayList<Person> list;

    public Phonebook() {
        this.list = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        this.list.add(new Person(name, number));
    }

    public void printAll() {
        for (Person p : this.list) {
            System.out.println(p);
        }
    }

    public String searchNumber(String name) {
        for (Person p : this.list) {
            if (name.equals(p.getName())) {
                return p.getNumber();
            }

        }
        return "number not known";
    }

}
