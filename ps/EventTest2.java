import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        // counter++;
        // label.setText("현재의 카운터 값: " + counter);
    }
}

public class EventTest2 extends JFrame {
    private JButton button;
    protected JLabel label;
    int counter = 0;

    public EventTest2() {
        setLocation(300, 300);
        setSize(400, 150);
        setTitle("외부 클래스가 이벤트를 처리하는 방법");
        setLayout(new FlowLayout());

        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값: " + counter);

        button.addActionListener(new MyListener());

        add(button);
        add(label);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        EventTest2 et = new EventTest2();
    }
}
