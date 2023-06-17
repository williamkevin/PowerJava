import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class ImageLabelTest extends JFrame {
    JPanel panel;
    JLabel label;

    public ImageLabelTest() {
        setLocation(600, 400);
        setSize(400, 400);
        setTitle("Example 9-4");

        panel = new JPanel();
        label = new JLabel();

        ImageIcon image = new ImageIcon("Retriever.jpeg");
        label = new JLabel("Retriever");
        label.setIcon(image);

        panel.add(label);

        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        ImageLabelTest i = new ImageLabelTest();
    }
}
