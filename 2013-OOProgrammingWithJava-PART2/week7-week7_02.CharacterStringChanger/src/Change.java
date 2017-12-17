/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ChiuSing
 */
public class Change {

    private char fc;
    private char tc;

    public Change(char fromCharacter, char toCharacter) {
        this.fc = fromCharacter;
        this.tc = toCharacter;
    }

    public String change(String characterString) {
        String s = "";
        for (int i = 0; i < characterString.length(); i++) {
            if (characterString.charAt(i) == this.fc) {
                s += this.tc;
            } else {
                s += characterString.charAt(i);
            }
        }
        return s;
    }
    
}
