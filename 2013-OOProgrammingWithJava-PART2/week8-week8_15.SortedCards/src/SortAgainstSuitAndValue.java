
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class SortAgainstSuitAndValue implements Comparator<Card>{
    public int compare(Card card1, Card card2) {
        int x = card1.getSuit()-card2.getSuit();
        return x == 0? card1.getValue()-card2.getValue() : x;
    }
}
