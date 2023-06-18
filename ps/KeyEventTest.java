import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class KeyEventTest extends JFrame implements KeyListener {
    public KeyEventTest() {
        setLocation(600, 400);
        setSize(300, 200);
        JTextField tf = new JTextField(20);
        tf.addKeyListener(this);
        add(tf);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void keyTyped(KeyEvent e) {
        display(e, "KeyTyped ");
    }

    public void keyPressed(KeyEvent e) {
        display(e, "KeyPressed");
    }

    public void keyReleased(KeyEvent e) {
        display(e, "Key Released ");
    }

    protected void display(KeyEvent e, String s) {
        char c = e.getKeyChar();
        int keyCode = e.getKeyChar();
        String modifiers = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
        System.out.println(s + " " + c + " " + keyCode + " modifiers");
    }

    public static void main(String [] args) {
        KeyEventTest f = new KeyEventTest();
    }
}
