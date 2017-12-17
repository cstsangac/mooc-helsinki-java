/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author ChiuSing
 */
public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        boolean[][] board = super.getBoard();
        for (int x = 0; x < super.getWidth(); x++) {
            for (int y = 0; y < super.getHeight(); y++) {
                double sign = d - (new Random().nextDouble());
                board[x][y] = sign > 0;
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if (i < 0 || i >= getWidth() || i1 < 0 || i1 >= getHeight()) {
            return false;
        }
        return super.getBoard()[i][i1];
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if (i < 0 || i >= getWidth() || i1 < 0 || i1 >= getHeight()) {
            return;
        }
        //if (getNumberOfLivingNeighbours(i, i1) == 3) {
        super.getBoard()[i][i1] = true;
        //}
    }

    @Override
    public void turnToDead(int i, int i1) {
        if (i < 0 || i >= getWidth() || i1 < 0 || i1 >= getHeight()) {
            return;
        }
        //if (getNumberOfLivingNeighbours(i, i1) < 2 || getNumberOfLivingNeighbours(i, i1) > 3) {
        super.getBoard()[i][i1] = false;
        //}
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        boolean[][] board = super.getBoard();
        int result = 0;
        for (int dx = -1; dx < 2; dx++) {
            for (int dy = -1; dy < 2; dy++) {
                int x = i + dx;
                int y = i1 + dy;
                if (x < 0 || x >= getWidth() || y < 0 || y >= getHeight() || (x == i && y == i1)) {
                    continue;
                }
                result = board[x][y] ? result + 1 : result;
            }
        }
        return result;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if (i2 < 2 || i2 > 3) {
            this.turnToDead(i, i1);
        }else if (i2 == 3) {
            this.turnToLiving(i, i1);
        }
    }

}
