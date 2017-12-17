
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
public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        setDensity(density);
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {
        setDensity(0.1);
        this.width = width;
        this.height = height;
    }

    public NightSky(double density, int width, int height) {
        setDensity(density);
        this.width = width;
        this.height = height;
    }

    public void setDensity(double density) {
        if (density > 1) {
            this.density = 1;
        } else {
            this.density = density;
        }
    }

    public void printLine() {
        int w = this.width;
        

        for (int i = 0; i < w; i++) {
            if (new Random().nextInt((int) (1 / this.density)) == 0) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }

    public void print() {
        int h = this.height;
        this.starsInLastPrint = 0;
        for (int i = 0; i < h; i++) {
            this.printLine();
        }
    }

   

    public int starsInLastPrint() {
        return this.starsInLastPrint;
    }

}
