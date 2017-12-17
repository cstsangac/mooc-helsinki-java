/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;

/**
 *
 * @author ChiuSing
 */
public class Square extends Figure {

    private int l;

    public Square(int x, int y, int l) {
        super(x, y);
        this.l = l;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(getX(), getY(), l, l);
        
    }

}
