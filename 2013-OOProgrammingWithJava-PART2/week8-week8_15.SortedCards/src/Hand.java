
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Hand implements Comparable<Hand>{
    private List<Card> l = new ArrayList<Card>();

    public Hand() {
    }
    
    public void add(Card card){
        this.l.add(card);
    }
    public void print(){
        for(Card c: this.l){
            System.out.println("" + Card.VALUES[c.getValue()] + " of " + Card.SUITS[c.getSuit()]);
        }
    }
    public void sort(){
        Collections.sort(this.l);
    }
    public void sortAgainstSuit(){
        Collections.sort(this.l, new SortAgainstSuitAndValue());
    }
    public int sum(){
        int x = 0;
        for(Card c: this.l){
            x += c.getValue();
        }
        return x;
    }
    @Override
    public int compareTo(Hand t) {
        return this.sum() - t.sum();
    }
}
