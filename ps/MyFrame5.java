import java.awt.*;
import javax.swing.*;

public class MyFrame5 extends JFrame {
    public MyFrame5() {
        setTitle("Flow Layout Test");
        setSize(500, 150);
        setLocation(300, 500);

        setLayout(new FlowLayout());

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("Button4"));
        add(new JButton("Button5"));

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame5 f = new MyFrame5();
    }
}
