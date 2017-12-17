/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ChiuSing
 */
public class MindfulDictionary {

    private String file;
    private Map<String, String> map = new HashMap<String, String>();

    public MindfulDictionary() {
    }

    public MindfulDictionary(String file) {
        this.file = file;
    }

    public boolean load() {
        Scanner fileReader;
        try {
            fileReader = new Scanner(new File(file));
        } catch (Exception e) {
            return false;
        }
        while (fileReader.hasNextLine()) {
            String line = fileReader.nextLine();
            String[] parts = line.split(":");   // the line is split at :

            add(parts[0], parts[1]);
        }
        fileReader.close();
        return true;
    }

    public boolean save() {
        FileWriter fw;
        try {
            fw = new FileWriter(file);

            ArrayList<String> added = new ArrayList<String>();
            for (Map.Entry<String, String> e : map.entrySet()) {
                if (!added.contains(e.getKey())) {
                    added.add(e.getKey());
                    added.add(e.getValue());
                    String s = "" + e.getKey() + ":" + e.getValue() + "\n";
                    fw.write(s);
                }
            }
            fw.close();
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public void add(String word, String translation) {
        if (!map.containsKey(word)) {
            map.put(word, translation);
        }
        if (!map.containsKey(translation)) {
            map.put(translation, word);
        }
    }

    public String translate(String word) {
        if (map.containsKey(word)) {
            return map.get(word);
        } else {
            return null;
        }
    }

    public void remove(String word) {
        if (map.containsKey(word)) {
            String k = map.get(word);
            if (map.containsKey(k)) {
                map.remove(k);
            }
            map.remove(word);
        }
    }

}
