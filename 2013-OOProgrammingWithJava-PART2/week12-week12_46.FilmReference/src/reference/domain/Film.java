/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author ChiuSing
 */
public class Film {
    private String name;

    public Film(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return name.hashCode() == o.hashCode();
    }

    
    @Override
    public int hashCode() {
        return name.hashCode();
    }
    
    
}
