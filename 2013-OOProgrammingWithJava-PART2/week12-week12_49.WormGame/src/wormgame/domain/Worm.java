/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

/**
 *
 * @author ChiuSing
 */
public class Worm {

    private boolean g;
    private int x, y;
    private Direction direction;
    private List<Piece> pieces = new ArrayList<Piece>();

    public Worm(int originalX, int originalY, Direction originalDirection) {
        x = originalX;
        y = originalY;
        direction = originalDirection;
        pieces.add(new Piece(x, y));
        g = true;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getLength() {
        return pieces.size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void move() {
        if (pieces.size() < 3) {
            grow();
        }
        if (!g) {
            pieces.remove(0);
        }
        g = false;

        if (direction == Direction.UP) {
            y--;
        } else if (direction == Direction.DOWN) {
            y++;
        } else if (direction == Direction.LEFT) {
            x--;
        } else if (direction == Direction.RIGHT) {
            x++;
        }
        pieces.add(new Piece(x, y));
    }

    public void grow() {
        //pieces.add(new Piece(x, y));
        g = true;
    }

    public boolean runsInto(Piece piece) {
        for (Piece p : pieces) {
            if (p.runsInto(piece)) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        
        for (int i = 0; i < pieces.size() - 1; i++) {
            if (pieces.get(i).getX() == x && pieces.get(i).getY() == y) {
                return true;
            }
        }
        return false;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

}
