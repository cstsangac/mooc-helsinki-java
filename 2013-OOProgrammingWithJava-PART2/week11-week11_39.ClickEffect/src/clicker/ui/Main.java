package clicker.ui;

import clicker.applicationlogic.Calculator;
import clicker.applicationlogic.PersonalCalculator;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new UserInterface((Calculator)new PersonalCalculator());
        SwingUtilities.invokeLater(ui);
    }
}
