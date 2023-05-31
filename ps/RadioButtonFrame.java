// 2022440025 김세원
// 5가지 라디오 버튼을 만들고 각 버튼에 해당하는 사진을 출력

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class RadioButtonFrame extends JFrame implements ActionListener {
    private JRadioButton bird, cat, dog, rabbit, pig; 
    private JLabel imageLabel;
    private ImageIcon birdImage;
    private ImageIcon catImage;
    private ImageIcon dogImage;
    private ImageIcon rabbitImage;
    private ImageIcon pigImage;

    public RadioButtonFrame() {
        setTitle("RadioButtonDemo"); // 제목 설정
        setSize(500, 400); // 크기 설정

        JPanel radioPanel = new JPanel(); // 패널 객체 선언
        radioPanel.setLayout(new BoxLayout(radioPanel, BoxLayout.Y_AXIS));

        bird = new JRadioButton("bird"); // 라디오 버튼 객체 선언
        cat = new JRadioButton("cat");
        dog = new JRadioButton("dog");
        rabbit = new JRadioButton("rabbit");
        pig = new JRadioButton("pig");

        ButtonGroup animalGroup = new ButtonGroup(); // 버튼 그룹 객체 선언
        animalGroup.add(bird); // 버튼 그룹 객체에 각 라디오 버튼 추가
        animalGroup.add(cat);
        animalGroup.add(dog);
        animalGroup.add(rabbit);
        animalGroup.add(pig);

        bird.addActionListener(this); // 라디오 버튼마다 기능 추가
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        radioPanel.add(bird); // 패널에 각 라디오 버튼 추가
        radioPanel.add(cat);
        radioPanel.add(dog);
        radioPanel.add(rabbit);
        radioPanel.add(pig);
        add(radioPanel, BorderLayout.CENTER);

        JPanel imagePanel = new JPanel(); // 이미지를 넣을 패널 객체 생성
        imageLabel = new JLabel();
        imagePanel.add(imageLabel);
        add(imagePanel, BorderLayout.SOUTH);

        birdImage = new ImageIcon("bird_image.jpeg"); // 이미지 객체 생성
        catImage = new ImageIcon("cat_image.jpeg");
        dogImage = new ImageIcon("dog_image.jpeg");
        rabbitImage = new ImageIcon("rabbit_image.jpeg");
        pigImage = new ImageIcon("pig_image.jpeg");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) { // 라디오 버튼에 해당하는 이미지 생성 로직
        if (e.getSource() == bird) {
            imageLabel.setIcon(birdImage);
        } else if (e.getSource() == cat) {
            imageLabel.setIcon(catImage);
        } else if (e.getSource() == dog) {
            imageLabel.setIcon(dogImage);
        } else if (e.getSource() == rabbit) {
            imageLabel.setIcon(rabbitImage);
        } else if (e.getSource() == pig) {
            imageLabel.setIcon(pigImage);
        }
    }

    public static void main(String[] args) {
        new RadioButtonFrame(); // 출력
        System.out.println("2022440025 김세원");
    }
}