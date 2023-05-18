import java.awt.*;
import javax.swing.*;

public class MyFrame9 extends JFrame{
    private JButton b1, b2;

    public MyFrame9() {
        setTitle("Absolute Position Test");
        setSize(300, 150);
        setLayout(null);

        b1 = new JButton("Button #1");
        add(b1);
        b1.setLocation(50, 30);
        b1.setSize(90, 50);

        b2 = new JButton("Button #2");
        add(b2);
        b2.setBounds(180, 30, 90, 20);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        MyFrame9 f = new MyFrame9();
    }
}
