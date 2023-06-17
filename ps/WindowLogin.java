import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class WindowLogin extends JFrame {
    public WindowLogin() {
        setLocation(600, 400);
        setSize(230, 150);
        setTitle("로그인");

        JPanel panel = new JPanel();
        panel.add(new JLabel("ID"));
        panel.add(new JTextField(15));
        panel.add(new JLabel("PW"));
        panel.add(new JPasswordField(15));

        JButton button1 = new JButton("로그인");
        panel.add(button1);

        JButton button2 = new JButton("취소");
        panel.add(button2);

        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        WindowLogin w = new WindowLogin();
    }
}
