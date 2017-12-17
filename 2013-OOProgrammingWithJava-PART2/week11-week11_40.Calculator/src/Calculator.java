
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ChiuSing
 */
public class Calculator implements ActionListener {

    private JTextField f1, f2;
    private JButton b3;

    public Calculator(JTextField f1, JTextField f2, JButton b3) {
        this.f1 = f1;
        this.f2 = f2;
        this.b3 = b3;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("+")) {
            int x;
            try {
                x = Integer.parseInt(f1.getText()) + Integer.parseInt(f2.getText());
            } catch (Exception e) {
                f2.setText("");
                return;
            }
            f1.setText("" + x);
            f2.setText("");
            if (f1.getText().equals("0")) {
                b3.setEnabled(false);
            } else {
                b3.setEnabled(true);
            }
        } else if (ae.getActionCommand().equals("-")) {
            int x;
            try {
                x = Integer.parseInt(f1.getText()) - Integer.parseInt(f2.getText());
            } catch (Exception e) {
                f2.setText("");
                return;
            }
            f1.setText("" + x);
            f2.setText("");
            if (f1.getText().equals("0")) {
                b3.setEnabled(false);
            } else {
                b3.setEnabled(true);
            }
        } else if (ae.getActionCommand().equals("Z")) {
            f1.setText("0");
            f2.setText("");
            if (f1.getText().equals("0")) {
                b3.setEnabled(false);
            } else {
                b3.setEnabled(true);
            }
        }
    }

}
