/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ChiuSing
 */
public class Dungeon {

    private int length, height, vampires, moves;
    private boolean vampiresMove;
    private Scanner reader = new Scanner(System.in);
    private Player p;
    private static char[] STEP = {'w', 's', 'a', 'd'};
    private int[][] coor;
    private ArrayList<Vampire> l = new ArrayList<Vampire>();

    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        p = new Player(0, 0);
        coor = new int[length][height];
        coor[0][0] = 1;
        for (int i = 0; i < vampires; i++) {
            int x, y;
            while (true) {
                x = new Random().nextInt(length);
                y = new Random().nextInt(height);
                if (coor[x][y] == 0) {
                    break;
                }
            }
            coor[x][y] = -1;
            l.add(new Vampire(x, y));
        }
    }

    public void run() {

        while (true) {
            printStatus();
            String x = reader.nextLine();
            for (char c : x.toCharArray()) {
                if (move(p, c)) {
                    System.out.println("YOU WIN");
                    return;
                }
                if (!this.vampiresMove) {
                    continue;
                }
                for (Vampire v : l) {
                    c = STEP[new Random().nextInt(4)];
                    if (move(v, c)) {
                        System.out.println("YOU WIN");
                        return;
                    }
                }

            }
            moves--;
            if (moves < 1) {
                System.out.println("YOU LOSE");
                return;
            }
        }
    }

    public void printStatus() {
        System.out.println(moves);
        System.out.println();
        System.out.println(p);
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
        System.out.println();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < length; x++) {
                String s = "";
                switch (coor[x][y]) {
                    case 1:
                        s = "@";
                        break;
                    case -1:
                        s = "v";
                        break;
                    default:
                        s = ".";
                        break;
                }
                System.out.print(s);
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    private boolean move(Life life, char c) {
        int type = life.getType();
        int x = life.getX();
        int y = life.getY();
        int old_x = x;
        int old_y = y;
        switch (c) {
            case 'w':
                if (y - 1 < 0) {
                    return false;
                }
                y--;
                break;
            case 's':
                if (y + 1 > height - 1) {
                    return false;
                }
                y++;
                break;
            case 'a':
                if (x - 1 < 0) {
                    return false;
                }
                x--;
                break;
            case 'd':
                if (x + 1 > length - 1) {
                    return false;
                }
                x++;
                break;
            default:
                break;
        }
        if (coor[x][y] * type == -1) {
            killVampire(x, y);
            coor[old_x][old_y] = 0;
            coor[x][y] = type;
            life.setX(x);
            life.setY(y);
        } else if (coor[x][y] == type) {
            return false;
        } else {
            coor[old_x][old_y] = 0;
            coor[x][y] = type;
            life.setX(x);
            life.setY(y);
        }
        if (l.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void killVampire(int x, int y) {
        ArrayList<Object> toBeRemoved = new ArrayList<Object>();
        for (Vampire v : l) {
            if (v.getX() == x && v.getY() == y) {
                toBeRemoved.add(v);
                coor[x][y] = 0;
            }
        }
        l.removeAll(toBeRemoved);
    }

}
