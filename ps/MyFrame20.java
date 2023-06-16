import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class MyFrame20 extends JFrame {
    class MyPanel extends JPanel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(60, 50, 60, 60);
            g.drawRect(120, 50, 60, 60);
            g.setColor(Color.BLUE);
            g.fillOval(180, 50, 60, 60);
            g.fillRect(240, 50, 60, 60);
        }
    }

    public MyFrame20() {
        setLocation(500, 500);
        setSize(600, 200);
        setTitle("Basic Painting");
        add(new MyPanel());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyFrame20 mf = new MyFrame20();
    }
}