import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class LabelTest1 extends JFrame {
    private JPanel panel;
    private JLabel label1, label2;

    public LabelTest1() {
        setLocation(600, 400);
        setSize(400, 150);
        setTitle("Font Test");

        panel = new JPanel();
        label1 = new JLabel("Color Label");
        label1.setForeground(Color.BLUE);

        label2 = new JLabel();
        label2.setFont(new Font("Arial", Font.ITALIC, 30));
        label2.setForeground(Color.ORANGE);

        panel.add(label1);
        panel.add(label2);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        LabelTest l = new LabelTest();
    }
}
