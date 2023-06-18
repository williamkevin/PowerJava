import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class MoveCar extends JFrame {
    int img_x = 150, img_y = 150;
    JPanel panel;
    JButton button;
    ImageIcon icon;

    public MoveCar() {
        setLocation(600, 400);
        setSize(600, 300);
        setTitle("Example 10-3");

        icon = new ImageIcon("Ram.jpeg");
        button = new JButton("");
        button.setIcon(icon);
        button.setLocation(img_x, img_y);
        button.setSize(200, 100);

        panel = new JPanel();
        panel.setLayout(null);

        panel.add(button);
        panel.requestFocus();
        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                int keycode = e.getKeyCode();
                switch (keycode) {
                    case KeyEvent.VK_UP: img_y -= 10; break;
                    case KeyEvent.VK_DOWN: img_y += 10; break;
                    case KeyEvent.VK_LEFT: img_x -= 10; break;
                    case KeyEvent.VK_RIGHT: img_x += 10; break;
                }

                button.setLocation(img_x, img_y);
            }

            public void keyReleased(KeyEvent arg0) { }
            public void keyTyped(KeyEvent arg0) { }
        });

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String [] args) {
        MoveCar f = new MoveCar();
    }
}
