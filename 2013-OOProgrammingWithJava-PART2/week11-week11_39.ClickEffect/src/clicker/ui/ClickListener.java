/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author ChiuSing
 */
public class ClickListener implements ActionListener{
    private Calculator cal;
    private JLabel jl;

    public ClickListener(Calculator cal, JLabel jl) {
        this.cal = cal;
        this.jl = jl;
        this.jl.setText("" +cal.giveValue());
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        cal.increase();
        jl.setText("" +cal.giveValue());
    }
    
}
