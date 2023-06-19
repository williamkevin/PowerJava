import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.event.ItemListener;
import java.awt.GridBagLayout;
import java.awt.event.ItemEvent;

public class CheckBoxTest1 extends JFrame {
    JLabel label;
    JCheckBox checkbox1, checkbox2;
    public CheckBoxTest1() {
        setLocation(500, 400);
        setSize(400, 200);
        setTitle("Example 11-6 Check Box Test");
        setLayout(new GridLayout(0, 1));

        label = new JLabel();
        checkbox1 = new JCheckBox("Pizza");
        checkbox2 = new JCheckBox("Spagetti");

        add(label);
        add(checkbox1);
        add(checkbox2);

        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Pizza가 " + (e.getStateChange() == 1 ? "선택되었습니다." : "선택되지 않았습니다."));
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("Spagetti가 " + (e.getStateChange() == 1 ? "선택되었습니다." : "선택되지 않았습니다."));
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        CheckBoxTest c = new CheckBoxTest();
    }
}
