package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    public JFrame getFrame() {
        return frame;
    }

    private void createComponents(Container contentPane) {
        BoxLayout layout = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
        contentPane.setLayout(layout);

        contentPane.add(new JLabel("Are you?"));
        contentPane.add(new JCheckBox("Yes!"));
        contentPane.add(new JCheckBox("No!"));

        contentPane.add(new JLabel("Why?"));
        JRadioButton r1 = new JRadioButton("No reason.");
        JRadioButton r2 = new JRadioButton("Because it is fun!");
        
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        
        
        contentPane.add(r1);
        contentPane.add(r2);
        JButton button = new JButton("Done!");
        button.addActionListener(new MessageListener());
        contentPane.add(button);
    }
}
