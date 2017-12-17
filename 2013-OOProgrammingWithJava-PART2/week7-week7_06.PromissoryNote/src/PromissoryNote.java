
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class PromissoryNote {
    private HashMap<String, Double> h = new HashMap<String, Double>();
    public PromissoryNote() {
    }
    public void setLoan(String toWhom, double value){
        this.h.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        
        return this.h.containsKey(whose) ? this.h.get(whose) : 0;
    }
}
