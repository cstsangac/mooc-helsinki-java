/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import wormgame.Direction;
import wormgame.domain.Worm;

/**
 *
 * @author ChiuSing
 */
public class KeyboardListener implements KeyListener{
    private Worm worm;

    public KeyboardListener(Worm worm) {
        this.worm = worm;
    }
    
    
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        Direction d = Direction.UP;
        if(ke.getKeyCode()==KeyEvent.VK_UP){
            d = Direction.UP;
        }else if(ke.getKeyCode()==KeyEvent.VK_DOWN){
            d = Direction.DOWN;
        }else if(ke.getKeyCode()==KeyEvent.VK_LEFT){
            d = Direction.LEFT;
        }else if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
            d = Direction.RIGHT;
        }
        worm.setDirection(d);
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}
