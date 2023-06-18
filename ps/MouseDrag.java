import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class MouseDrag extends JFrame {
    JPanel panel;
    public MouseDrag() {
        setLocation(500, 400);
        setSize(400, 400);
        setTitle("Example 10-7");

        panel = new JPanel();
        panel.addMouseListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                System.out.println(e);
            }
        });

        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MouseDrag md = new MouseDrag();
    }
}
