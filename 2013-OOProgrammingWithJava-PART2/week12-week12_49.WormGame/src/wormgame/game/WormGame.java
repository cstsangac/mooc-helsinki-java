package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.Direction;
import wormgame.domain.Apple;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.gui.Updatable;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        this.worm = new Worm(width / 2, height / 2, Direction.DOWN);
        this.initApple();
        addActionListener(this);
        setInitialDelay(2000);

    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }

    public Apple getApple() {
        return apple;
    }

    public Worm getWorm() {
        return worm;
    }

    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    private void initApple() {
        int x = 0;
        int y = 0;

        boolean ok = false;
        while (!ok) {
            x = new Random().nextInt(width);
            y = new Random().nextInt(height);
            ok = true;
            for (Piece p : worm.getPieces()) {
                if (x == p.getX() && y == p.getY()) {
                    ok = false;
                }
            }
        }
        this.apple = new Apple(x, y);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        worm.move();
        if (worm.runsInto(apple)) {
            worm.grow();
            this.initApple();
        }
        if (worm.runsIntoItself()
                || worm.getX() < 0
                || worm.getX() >= width
                || worm.getY() < 0
                || worm.getY() >= height) {
            continues = false;
        }
        this.updatable.update();
        super.setDelay(1000 / worm.getLength());
    }

}
