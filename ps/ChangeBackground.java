import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeBackground extends JFrame {
    private JPanel panel;
    private JButton buttonYellow;
    private JButton buttonPink;

    public ChangeBackground() {
        setLocation(500, 500);
        setSize(500, 200);
        setTitle("버튼으로 배경색 변경하기");

        panel = new JPanel();

        buttonYellow = new JButton("노랑색");
        buttonYellow.addActionListener(new MyListener());
        panel.add(buttonYellow);

        buttonPink = new JButton("분홍색");
        buttonPink.addActionListener(new MyListener());
        panel.add(buttonPink);

        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == buttonYellow) {
                panel.setBackground(Color.yellow);
            } else if (e.getSource() == buttonPink) {
                panel.setBackground(Color.pink);
            }
        }
    }

    public static void main(String[] args) {
        ChangeBackground c = new ChangeBackground();
    }
}
