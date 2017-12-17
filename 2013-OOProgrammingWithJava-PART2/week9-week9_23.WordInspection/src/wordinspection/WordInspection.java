/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ChiuSing
 */
public class WordInspection {

    //Scanner reader = new Scanner(file, "UTF-8")
    private File file;

    public WordInspection(File file) {
        this.file = file;
    }

    public int wordCount() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        int x = 0;
        while (reader.hasNextLine()) {
            x++;
            reader.nextLine();
        }
        reader.close();
        return x;
    }

    public List<String> wordsContainingZ() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> x = new ArrayList<String>();
        String s;
        while (reader.hasNextLine()) {

            s = reader.nextLine();
            if (s.contains("z")) {
                x.add(s);
            }
        }
        reader.close();
        return x;
    }

    public List<String> wordsEndingInL() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> x = new ArrayList<String>();
        String s;
        while (reader.hasNextLine()) {

            s = reader.nextLine();
            if (s.charAt(s.length() - 1) == 'l') {
                x.add(s);
            }
        }
        reader.close();
        return x;
    }

    public List<String> palindromes() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> x = new ArrayList<String>();
        String s;
        while (reader.hasNextLine()) {
            s = reader.nextLine();
            boolean b = true;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                } else {
                    b = false;
                }
            }
            if (b) {
                x.add(s);
            }
        }
        reader.close();
        return x;
    }

    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> x = new ArrayList<String>();
        String s;
        while (reader.hasNextLine()) {
            s = reader.nextLine();
            //aeiouyäö
            if (s.contains("a")
                    && s.contains("e")
                    && s.contains("i")
                    && s.contains("o")
                    && s.contains("u")
                    && s.contains("y")
                    && s.contains("ä")
                    && s.contains("ö")) {
                x.add(s);
            }
        }
        reader.close();
        return x;
    }
}
