
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChiuSing
 */
public class ShoppingBasket {

    private Map<String, Purchase> m = new HashMap<String, Purchase>();

    public ShoppingBasket() {
    }

    public void add(String product, int price) {
        if (this.m.containsKey(product)) {
            this.m.get(product).increaseAmount();
        } else {
            this.m.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int x = 0;
        for (Entry<String, Purchase> e : this.m.entrySet()) {
            x += e.getValue().price();
        }
        return x;
    }

    public void print() {
        for (Entry<String, Purchase> e : this.m.entrySet()) {
            System.out.println("" + e.getKey() + ": " + e.getValue().amount());
        }
    }
}
