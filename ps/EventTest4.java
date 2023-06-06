import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest4 extends JFrame {
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private int counter = 0; 

    public EventTest4() {
        setLocation(1000, 1000);
        setSize(500, 500);
        setTitle("익명 클래스를 이용하는 방법");
        
        panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재 카운터 값은:   " + counter);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("증가된 카운터 값은: " + counter);
            }
        });

        panel.add(button);
        panel.add(label);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        EventTest4 et = new EventTest4();
    }
}