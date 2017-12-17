
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChiuSing
 */
public class Reader {

    private Scanner r = new Scanner(System.in);

    public Reader() {
    }

    public String readString() {
        return this.r.nextLine();
    }

    public int readInteger() {
        return Integer.parseInt(this.r.nextLine());
    }

}
