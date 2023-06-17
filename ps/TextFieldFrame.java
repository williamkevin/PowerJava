import java.lang.Integer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextFieldFrame extends JFrame {
    private JButton button;
    private JTextField text, result;
    private ButtonListener listener = new ButtonListener();

    public TextFieldFrame() {
        setLocation(600, 400);
        setSize(300, 150);
        setTitle("제곱 계산하기");

        JPanel panel = new JPanel();

        panel.add(new JLabel("Number Input: "));
        text = new JTextField(15);
        text.addActionListener(listener);
        panel.add(text);

        panel.add(new JLabel("제곱한 값: "));
        result = new JTextField(15);
        result.setEditable(false);
        panel.add(result);

        button = new JButton("OK");
        button.addActionListener(listener);
        panel.add(button);

        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button || e.getSource() == text) {
                String name = text.getText();
                int value = Integer.parseInt(name);
                result.setText(" " + value * value);
                text.requestFocus();
            }
        }
    }

    public static void main(String [] args) {
        TextFieldFrame f = new TextFieldFrame();
    }
}
