/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ChiuSing
 */
public class Analysis {
    private File file;

    public Analysis(File file){
        this.file = file;
    }
    public int lines() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file);
        int x = 0;
        while(reader.hasNextLine()){
            x++;
            reader.nextLine();
        }
        reader.close();
        return x;
    }
    public int characters() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        int x = 0;
        String s;
        while(reader.hasNextLine()){
            x++;
             s = reader.nextLine();
             x += s.length();
        }
        reader.close();
        return x;
    }
}
