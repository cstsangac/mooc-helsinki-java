/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Calculator {

    private Reader reader = new Reader();
    private int c;

    public Calculator() {
    }

    private void sum(){
        this.c++;
        int s = reader.readInteger() + reader.readInteger();
        System.out.println("sum of the values " + s);
    }
    
    private void difference(){
        this.c++;
        int d = reader.readInteger() - reader.readInteger();
        System.out.println("differences of the values " + d);
    }
    private void product(){
        this.c++;
        int p = reader.readInteger() * reader.readInteger();
        System.out.println("product of the values " + p);
    }
    private void statistics(){
        System.out.println("Calculations done "+this.c);
    }
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }
}
