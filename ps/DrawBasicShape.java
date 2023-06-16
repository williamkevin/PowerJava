import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

class MyPanel21 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(100, 100, 50, 50);
    }
}

public class DrawBasicShape extends JFrame{
    public DrawBasicShape() {
        setLocation(650, 400);
        setSize(400, 400);
        setTitle("선 그리기");
        JPanel panel = new MyPanel21();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        DrawBasicShape dbs = new DrawBasicShape();
    }
}
