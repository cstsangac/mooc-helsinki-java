
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChiuSing
 */
public class Storehouse {

    private Map<String, Integer> p = new HashMap<String, Integer>();
    private Map<String, Integer> s = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.p.put(product, price);
        this.s.put(product, stock);
    }

    public int price(String product) {
        if (this.p.containsKey(product)) {
            return this.p.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.s.containsKey(product)) {
            return this.s.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (this.s.containsKey(product)) {
            int x = this.s.get(product);
            if (x > 0) {
                this.s.replace(product, x - 1);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public Set<String> products(){
        return this.p.keySet();
    }
    
}
