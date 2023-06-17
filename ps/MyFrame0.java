import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MyFrame0 extends JFrame {
    public MyFrame0() {
        setLocation(400, 300);
        setSize(400, 150);
        setTitle("Example 9-1");
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.yellow);

        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");

        this.add(button1);
        add(button2);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyFrame0 mf = new MyFrame0();
    }
}
