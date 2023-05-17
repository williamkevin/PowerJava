import java.awt.*;
import javax.swing.*;

public class MyFrame7 extends JFrame {
    public MyFrame7() {
        setTitle("GridLayoutTest");
        setSize(300, 150);
        setLayout(new GridLayout(2, 3));

        add(new JButton("B1"));
        add(new JButton("B2"));
        add(new JButton("B3"));
        add(new JButton("B4"));
        add(new JButton("B5"));
        add(new JButton("ll"));

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyFrame7 f = new MyFrame7();
    }
}
