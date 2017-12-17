
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
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
class PhoneBook {

    private Map<String, Set<String>> m;
    private Map<String, String> n;
    private Map<String, String> a;

    public PhoneBook() {
        m = new HashMap<String, Set<String>>();
        n = new HashMap<String, String>();
        a = new HashMap<String, String>();
    }

    void addNumber(String name, String num) {
        if (this.m.containsKey(name)) {
            this.m.get(name).add(num);
            this.n.put(num, name);
        } else {
            this.m.put(name, new HashSet<String>());
            this.m.get(name).add(num);
            this.n.put(num, name);
        }
    }

    void searchByName(String name) {
        if (this.m.containsKey(name)) {
            for (String num : (String[]) this.m.get(name).toArray(new String[this.m.get(name).size()])) {
                System.out.println(" " + num);
            }
        } else {
            System.out.println("  not found");
        }
    }

    void searchByNumber(String num) {
        if (this.n.containsKey(num)) {
            System.out.println(" " + this.n.get(num));
        } else {
            System.out.println(" not found");
        }
    }

    void getInfo(String name) {
        if (this.a.containsKey(name)) {
            System.out.println("  address: " + this.a.get(name));
        } else {
            if (this.m.containsKey(name)) {
                System.out.println("  address unknown");
            } else {
                System.out.println("  not found");
                return;
            }
        }
        if (this.m.containsKey(name)) {
            System.out.println("  phone numbers:");
            for (String num : (String[]) this.m.get(name).toArray(new String[this.m.get(name).size()])) {
                System.out.println("   " + num);
            }
        } else {
            System.out.println("  phone number not found");
        }
    }

    void addAddr(String name, String addr) {
        this.a.put(name, addr);
    }

    void filter(String k) {
        boolean flag = false;
        ArrayList<String> l = new ArrayList<String>();
        for (Map.Entry<String, Set<String>> e : this.m.entrySet()) {
            if (e.getKey().contains(k) || (this.a.containsKey(e.getKey()) && this.a.get(e.getKey()).contains(k))) {
                l.add(e.getKey());
                flag = true;
            }
        }
        Collections.sort(l);
        for (String x : l) {
            System.out.println("\n " + x);
            this.getInfo(x);
        }
        if (!flag) {
            System.out.println(" keyword not found");
        }
    }

    void delete(String name) {

        if (this.m.containsKey(name)) {
            for (String num : (String[]) this.m.get(name).toArray(new String[this.m.get(name).size()])) {
                if (this.n.containsKey(num)) {
                    this.n.remove(num);
                }
            }
            this.m.remove(name);
        }
        if (this.a.containsKey(name)) {
            this.a.remove(name);
        }
    }

}
