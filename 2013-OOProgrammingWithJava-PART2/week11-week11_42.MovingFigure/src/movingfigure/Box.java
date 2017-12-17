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
public class Box extends Figure {

    int width, height;

    public Box(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(getX(), getY(), width, height);
    }

}
