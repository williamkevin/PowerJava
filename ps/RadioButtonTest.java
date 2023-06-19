import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class RadioButtonTest extends JFrame implements ActionListener {
    JPanel topPanel, sizePanel, resultPanel;
    JRadioButton small, medium, large;
    JLabel text;

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == small) {
            text.setText("small 사이즈가 선택되었습니다.");
        }
        else if (e.getSource() == medium) {
            text.setText("medium 사이즈가 선택되었습니다.");
        }
        else
            text.setText("Large 사이즈가 선택되었습니다.");
    }

    public RadioButtonTest() {
        setLocation(500, 400);
        setSize(400, 150);
        setTitle("Example 11-7 Coffee Ordering Page");
        
        topPanel = new JPanel();
        topPanel.add(new JLabel("원하시는 커피의 크기를 선택하세요."));
        add(topPanel, BorderLayout.NORTH);

        sizePanel = new JPanel();
        small = new JRadioButton("small");
        medium = new JRadioButton("medium");
        large = new JRadioButton("large");

        ButtonGroup group = new ButtonGroup();
        group.add(small);
        group.add(medium);
        group.add(large);

        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);

        small.addActionListener(this);
        medium.addActionListener(this);
        large.addActionListener(this);
        add(sizePanel, BorderLayout.CENTER);

        resultPanel = new JPanel();
        text = new JLabel("크기가 선택되지 않았습니다.");
        text.setForeground(Color.RED);
        resultPanel.add(text);
        add(resultPanel, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        new RadioButtonTest();
    }
}
