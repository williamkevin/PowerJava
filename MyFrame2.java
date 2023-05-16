import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class MyFrame2 extends JFrame {
    public MyFrame2() {
        setSize(300, 200);
        setTitle("MyFrame");

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        add(button);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyFrame2 f = new MyFrame2();
    }
}
