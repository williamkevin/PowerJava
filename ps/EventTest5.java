import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EventTest5 extends JFrame {
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private int counter;

    public EventTest5() {
        setLocation(400, 400);
        setSize(400, 500);
        setTitle("The way using lambda expression");

        panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재 카운터 값은: " + counter);

        button.addActionListener(e -> {
            counter++;
            label.setText("현재 카운터 값은: " + counter);
        });

        panel.add(button);
        panel.add(label);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        EventTest5 t = new EventTest5();
    }
}
// panel 없이 구현했을 때 왜 버튼이 출력되지 않을까?