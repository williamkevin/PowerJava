import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.*;

class MyPanel20 extends JPanel {
    Font f1, f2, f3, f4, f5;

    public MyPanel20() {
        f1 = new Font("Serif", Font.PLAIN, 20);
        f2 = new Font("San Serif", Font.BOLD, 20);
        f3 = new Font("Monospaced", Font.ITALIC, 20);
        f4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
        f5 = new Font("DialogInput", Font.BOLD, 20);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(f1);
        g.drawString("Setif 20 points PLAIN", 10, 20);
        g.setFont(f2);
        g.drawString("Sanerif 20 points BOLD", 10);
        g.setFont(f3);
        g.drawString("Monospaced 20 points ITALIC", 10, 90);
        g.setFont(f4);
        g.drawString("Dialog 20 points BOLD + ITALIC", 10, 110);
        g.setFont(f5);
        g.drawString("DialogInput 20 points BOLD", 10, 130);
    }
}

public class FontTest extends JFrame {
    public FontTest() {
        setLocation(500, 400);
        setSize(500, 200);
        setTitle("Font Test");
        JPanel panel = new MyPanel20();
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        FontTest s = new FontTest();
    }
}
