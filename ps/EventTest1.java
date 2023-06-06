import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventTest1 extends JFrame {
    private JButton button;
    private JLabel label;
    private int counter = 0;

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counter++;
            label.setText("현재의 카운터 값: " + counter);
        }
    }

    public EventTest1() {
        setLocation(500, 500);
        setSize(300, 150);
        setTitle("내부 클래스가 이벤트를 처리하는 방법");
        setLayout(new FlowLayout());

        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값: " + counter);

        button.addActionListener(new MyListener());

        add(label);
        add(button);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        EventTest1 t = new EventTest1();
    }
}