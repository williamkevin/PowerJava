import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import java.awt.GridLayout;
import java.awt.BorderLayout;

public class RockPapperScissor extends JFrame implements ActionListener {
    final int SCISSOR = 0;
    final int ROCK = 1;
    final int PAPPER = 2;

    private JPanel panel;
    private JLabel information, output;
    private JButton rock, papper, scissor;

    public RockPapperScissor() {
        setLocation(600, 400);
        setSize(500, 500);
        setTitle("가위 바위 보");

        panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3));

        information = new JLabel("아래의 버튼 중에서 하나를 클릭하시오!");
        output = new JLabel("Good Lurk");

        rock = new JButton("ROCK");
        papper = new JButton("PAPPER");
        scissor = new JButton("SCISSOR");

        rock.addActionListener(this);
        papper.addActionListener(this);
        scissor.addActionListener(this);

        panel.add(rock);
        panel.add(papper);
        panel.add(scissor);

        add(information, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(output, BorderLayout.SOUTH);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        RockPapperScissor f = new RockPapperScissor();
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        int user = 0;

        if (b.getText().equals("ROCK"))
            user = ROCK;
        else if (b.getText().equals("PAPPER"))
            user = PAPPER;
        else if (b.getText().equals("SCISSOR"))
            user = SCISSOR;

        Random random = new Random();
        int computer = random.nextInt(3);

        if (user == computer)
            output.setText("무승부");
        else if (user == (computer + 1) % 3)
            output.setText("승리");
        else
            output.setText("패배");
    }
}
