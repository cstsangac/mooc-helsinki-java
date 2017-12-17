
import java.util.ArrayList;
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
public class TextUserInterface {

    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    private void add() {
        this.dictionary.add(this.reader.nextLine(), this.reader.nextLine());
    }

    private void translate() {
        String k = this.reader.nextLine();
        System.out.println("Translation: " + this.dictionary.translate(k));
    }

    public void start() {
        System.out.println("Statements:\n" +
"  add - adds a word pair to the dictionary\n" +
"  translate - asks a word and prints its translation\n" +
"  quit - quits the text user interface");
        
        while (true) {
            String c = this.reader.nextLine();
            System.out.println("Statement: ");
            if (c.equals("add")) {
                this.add();
            } else if (c.equals("translate")) {
                this.translate();
            } else if (c.equals("quit")) {
                break;
            }else{
                System.out.println("Unknown statement");
            }
        }
    }

}
