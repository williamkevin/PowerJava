import java.awt.*;
import javax.swing.*;

public class MyFrame6 extends JFrame {
    public MyFrame6() {
        setTitle("BorderLayout");
        setSize(500, 500);
        setLocation(300, 400);
        setLayout(new BorderLayout());

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("West");
        JButton b4 = new JButton("East");
        JButton b5 = new JButton("Center");

        add(b1, "North");
        add(b2, "South");
        add(b3, "West");
        add(b4, "East");
        add(b5, "Center");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyFrame6 f = new MyFrame6();
    }
}
