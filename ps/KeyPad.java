import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyPad extends JFrame implements ActionListener {
    private JPanel panel;
    private JTextField txt;

    public KeyPad() {
        setLocation(600, 400);
        setSize(500, 500);
        setTitle("Key Pad");

        txt = new JTextField();
        add(txt, BorderLayout.NORTH);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        add(panel, BorderLayout.CENTER);

        for ( int i = 1; i <= 9; i++) {
            JButton btn = new JButton("" + i);
            btn.addActionListener(this);
            btn.setPreferredSize(new Dimension(100, 30));
            panel.add(btn);
        }
        pack();

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        txt.setText(txt.getText() + actionCommand);
    }

    public static void main(String [] args) {
        KeyPad f = new KeyPad();
    }
}
