/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;

/**
 *
 * @author ChiuSing
 */
public class DrawingBoard extends JPanel implements Updatable{

    private WormGame wormGame;
    private int pieceLength;

    public DrawingBoard(WormGame wormGame, int pieceLength) {
        this.wormGame = wormGame;
        this.pieceLength = pieceLength;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs); //To change body of generated methods, choose Tools | Templates.
        grphcs.setColor(Color.BLACK);
        for (Piece p : wormGame.getWorm().getPieces()) {
            grphcs.fill3DRect(p.getX()*pieceLength, p.getY()*pieceLength, pieceLength, pieceLength, true);
        }
        grphcs.setColor(Color.RED);
        grphcs.fillOval(wormGame.getApple().getX()*pieceLength, wormGame.getApple().getY()*pieceLength, pieceLength, pieceLength);
    }

    @Override
    public void update() {
        super.repaint();
    }

}
