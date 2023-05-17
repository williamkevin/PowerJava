import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MyFrame4 extends JFrame {
    public MyFrame4() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.orange);

        JButton b1 = new JButton("Button 1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button 2");
        b2.setBackground(Color.green);

        panel.add(b1);
        panel.add(b2);
        add(panel);

        setSize(500, 700);
        setLocation(1000, 1000);
        setTitle("My Frame");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyFrame4 f = new MyFrame4();
    }
}
