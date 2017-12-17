
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChiuSing
 */
class Game {

    private ArrayList<Player> l = new ArrayList<Player>();
    private int round;

    public Game() {
        this.round = 0;
    }

    public void addPlayer(String name) {
        l.add(new Player(name));
    }

    void jump() {
        this.round++;
        System.out.println("\nRound " + this.round);
        
        System.out.println("\nJumping order: ");

        for (int i = 0; i < this.l.size() ; i++) {
            Player p = this.l.get(i);
            System.out.println("  " + (i + 1) + ". " + p.getName() + " (" + p.getPt() + " points)");
        }
        System.out.println("\nResults of round " + this.round);
        for (Player p : this.l) {
            int length = (new Random()).nextInt(60) + 60;
            p.addLength(length);
            int[] vote = new int[5];
            for (int i = 0; i < 5; i++) {
                vote[i] = (new Random()).nextInt(10) + 10;
            }
            System.out.println("  " + p.getName()
                    + "\n    length: " + length
                    + "\n    judge votes: " + Arrays.toString(vote));
            Arrays.sort(vote);
            p.setPt(p.getPt() + length + vote[1] + vote[2] + vote[3]);
        }
        Collections.sort(this.l);

    }

    void printResults() {
        Collections.reverse(this.l);
        System.out.println("\nTournament results:\n"
                + "Position    Name");
        for (int i = 0; i < this.l.size(); i++) {
            Player p = this.l.get(i);
            System.out.println("" + (i+1) + "           " + p.getName()
                    + " (" + p.getPt() + " points)"
                    + "\n            jump lengths: " + p.getLengths());
        }
    }
}
