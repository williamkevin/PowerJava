import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;;
import javax.swing.JButton;

public class LoginWindow2 extends JFrame {
    JPanel panel;
    JLabel l1, l2;
    JTextField tf;
    JPasswordField pf;
    JButton b1, b2;

    public LoginWindow2() {
        setLocation(600, 400);
        setSize(400, 150);
        setTitle("Login Window");

        panel = new JPanel();
        l1 = new JLabel("ID: ");
        l2 = new JLabel("PW: ");
        tf = new JTextField(15);
        pf = new JPasswordField(15);
        b1 = new JButton("Login");
        b2 = new JButton("Cancel");

        panel.add(l1);
        panel.add(tf);
        panel.add(l2);
        panel.add(pf);
        panel.add(b1);
        panel.add(b2);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        LoginWindow l = new LoginWindow();
    }
}