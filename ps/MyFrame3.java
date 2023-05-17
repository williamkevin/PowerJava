import java.awt.*;
import javax.swing.*;

public class MyFrame3 extends JFrame {
    public MyFrame3() {
        setSize(300, 150);
        setLocation(500, 500);
        setTitle("My Frame");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow);

        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");
        add(button1);
        add(button2);

        setVisible(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyFrame3 f = new MyFrame3();
    }
}
