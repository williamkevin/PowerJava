import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MoveCar3 extends JFrame {
    private int img_x = 150, img_y = 150;
    JPanel panel;
    JLabel label;
    ImageIcon icon;

    private class MyMouseListener implements MouseListener {
        public void mousePressed(MouseEvent e) {
            img_x = e.getX();
            img_y = e.getY();
            label.setLocation(img_x, img_y);
        }

        public void mouseReleased(MouseEvent e) { }
        public void mouseClicked(MouseEvent e) { }
        public void mouseEntered(MouseEvent e) { }
        public void mouseExited(MouseEvent e) { }
    }

    public MoveCar3() {
        setLocation(500, 400);
        setSize(600, 600);
        setTitle("Example 10-5 by inner class");

        icon = new ImageIcon("Ram.jpeg");
        label = new JLabel();
        label.setIcon(icon);
        label.setLocation(img_x, img_y);
        label.setSize(200, 100);

        panel = new JPanel();
        panel.setLayout(null);
        panel.add(label);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addMouseListener(new MyMouseListener());

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MoveCar3 car = new MoveCar3();
    }
}
