import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ImageTest extends JFrame {
    private JPanel panel;
    private JLabel label;

    public ImageTest() {
        setLocation(200, 200);
        setSize(1000, 1000);
        setTitle("Image Test");

        panel = new JPanel();
        label = new JLabel();

        ImageIcon icon = new ImageIcon("./Retriever.jpeg");
        label.setIcon(icon);

        panel.add(label);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        ImageTest i = new ImageTest();
    }
}
