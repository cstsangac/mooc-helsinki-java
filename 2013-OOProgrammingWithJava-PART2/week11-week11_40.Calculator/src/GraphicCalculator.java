
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField f1 = new JTextField();
        f1.setText("0");
        f1.setEnabled(false);
        JTextField f2 = new JTextField();

        JLabel textAreaRight = new JLabel();
        JButton copyButton = new JButton("Copy!");

        

        
        
        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("Z");
        b3.setEnabled(false);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        Calculator cal = new Calculator(f1,f2,b3);
        b1.addActionListener(cal);
        b2.addActionListener(cal);
        b3.addActionListener(cal);
        container.add(f1);
        container.add(f2);
        container.add(panel);
    }


    public JFrame getFrame() {
        return frame;
    }
}
