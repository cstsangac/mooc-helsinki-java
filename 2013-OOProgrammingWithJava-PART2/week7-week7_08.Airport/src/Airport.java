
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
class Airport {

    private Scanner reader;
    private ArrayList<Plane> pl = new ArrayList<Plane>();
    private ArrayList<Flight> fl = new ArrayList<Flight>();

    public Airport(Scanner reader) {
        this.reader = reader;
    }

    public void start() {
        System.out.println("Airport panel\n"
                + "--------------------\n"
                + "");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit");

            String c = this.reader.nextLine();
            if (c.equals("1")) {
                System.out.println("Give plane ID: ");
                String pid = this.reader.nextLine();
                System.out.println("Give plane capacity: ");
                int cap = Integer.parseInt(this.reader.nextLine());
                pl.add(new Plane(pid, cap));
            } else if (c.equals("2")) {
                System.out.println("Give plane ID: ");
                String pid = this.reader.nextLine();
                System.out.println("Give departure airport code: ");
                String depart = this.reader.nextLine();
                System.out.println("Give destination airport code: ");
                String dest = this.reader.nextLine();
                fl.add(new Flight(pid, depart, dest));
            } else if (c.equals("x")) {
                break;
            }
        }

        System.out.println("Flight service\n"
                + "------------\n"
                + "");
        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit");
            String c = this.reader.nextLine();
            if (c.equals("1")) {
                for (Plane p : pl) {
                    System.out.println(p);
                }
            } else if (c.equals("2")) {
                for (Flight f : fl) {
                    for (Plane p : pl) {
                        if (p.getId().equals(f.getPid())) {
                            System.out.println("" + p + f.getRoute());
                        }
                    }
                }
            } else if (c.equals("3")) {
                System.out.println("Give plane ID: ");
                String pid = this.reader.nextLine();
                for (Plane p : pl) {
                    if (p.getId().equals(pid)) {
                        System.out.println(p);
                    }
                }
            } else if (c.equals("x")) {
                break;
            }
        }

    }
}
