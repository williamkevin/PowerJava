import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventTest3 extends JFrame implements ActionListener {
    private JButton button;
    private JLabel label;
    private int counter;

    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("현재 카운터 값은: " + counter);
    }

    public EventTest3() {
        setLocation(400, 150);
        setSize(400, 150);
        setTitle("프레임 클래스가 이벤트 처리를 하는 방법");
        setLayout(new FlowLayout());

        button = new JButton("증가");
        label = new JLabel("현재 카운터 값은 : " + counter);

        button.addActionListener(this);

        add(button);
        add(label);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args ) {
        EventTest3 et = new EventTest3();
    }
}
