/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author ChiuSing
 */
public class Player extends Life {

    private final int type = 1;

    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String toString() {
        return "@ " + super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
