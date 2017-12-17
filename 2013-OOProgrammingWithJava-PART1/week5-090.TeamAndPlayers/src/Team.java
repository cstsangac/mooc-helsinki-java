
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChiuSing
 */
public class Team {

    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String n) {
        this.name = n;
        this.players = new ArrayList<Player>();
        this.maxSize = 0;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player p) {
        if (this.maxSize == 0  || this.players.size() < this.maxSize) {
            this.players.add(p);
        }

    }
    
    public void printPlayers(){
        for(Player p : this.players){
            System.out.println(p);
        }
    }
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int size() {
        return this.players.size();
    }

    public int goals() {
        int g = 0;
        for (Player p : this.players) {
            g += p.goals();
        }
        return g;
    }
    
}
