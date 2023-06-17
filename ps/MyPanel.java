import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MyPanel extends JFrame {
    JPanel panel;
    JButton button1, button2;

    public MyPanel() {
        setLocation(600, 400);
        setSize(400, 150);
        setTitle("Example 9-2");

        panel = new JPanel();
        panel.setBackground(Color.orange);

        button1 = new JButton("확인");
        button1.setBackground(Color.yellow);


        button2 = new JButton("취소");
        button2.setBackground(Color.GREEN);

        panel.add(button1);
        panel.add(button2);

        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyPanel m = new MyPanel();
    }
}
