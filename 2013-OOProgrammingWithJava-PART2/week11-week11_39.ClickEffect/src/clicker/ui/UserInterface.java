package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator cal;

    public UserInterface(Calculator cal) {
        this.cal = cal;
    }
    

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);

        
        JLabel textAreaRight = new JLabel();
        JButton copyButton = new JButton("Click!");

        ClickListener cl = new ClickListener(cal, textAreaRight);
        copyButton.addActionListener(cl);

        container.add(textAreaRight, BorderLayout.CENTER);
        container.add(copyButton,BorderLayout.SOUTH);
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
