
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
public class Library {

    private ArrayList<Book> bks;

    public Library() {
        bks = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        bks.add(newBook);
    }

    public void printBooks() {
        for (Book bk : bks) {
            System.out.println(bk);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> x = new ArrayList<Book>();
        for (Book bk : bks) {
            if (StringUtils.included(bk.title(), title)) {
                x.add(bk);
            }
        }
        return x;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> x = new ArrayList<Book>();
        for (Book bk : bks) {
            if (StringUtils.included(bk.publisher(), publisher)) {
                x.add(bk);
            }
        }
        return x;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> x = new ArrayList<Book>();
        for (Book bk : bks) {
            if (bk.year() == year) {
                x.add(bk);
            }
        }
        return x;
    }
}
