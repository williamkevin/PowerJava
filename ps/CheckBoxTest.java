import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

public class CheckBoxTest extends JFrame {
    public CheckBoxTest() {
        setTitle("CheckBox Test");
        setLayout(new GridLayout(0, 1));

        JLabel label = new JLabel();
        JCheckBox checkbox1 = new JCheckBox("pizza");
        JCheckBox checkbox2 = new JCheckBox("spagetti");
        add(checkbox1);
        add(checkbox2);
        add(label);

        checkbox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("피자가 " + (e.getStateChange() == 1 ? "선택되었습니다." : "선택되지 않았습니다."));
            }
        });

        checkbox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                label.setText("스파게티가 " + (e.getStateChange() == 1 ? "선택되었습니다." : "선택되지 않았습니다."));
            }
        });

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxTest();
    }
}