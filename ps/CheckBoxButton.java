// 2022440025 김세원
// 4가지 체크 박스를 만들고 각 버튼에 해당하는 가격을 더하여 출력한다.

import java.awt.*; 
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class CheckBoxButton extends JFrame {
    public CheckBoxButton() {
        setTitle("CheckBoxDemo"); // 제목 설정
        setLayout(new FlowLayout()); // 레이아웃 설정

        JLabel label = new JLabel(); // JLabel 객체를 생성
        JCheckBox checkbox1 = new JCheckBox("엔진 오일 교환"); // 4가지 체크 버튼 생성
        JCheckBox checkbox2 = new JCheckBox("자동 변속기 오일 교환");
        JCheckBox checkbox3 = new JCheckBox("에어컨 필터 교환");
        JCheckBox checkbox4 = new JCheckBox("타이어 교환");

        add(checkbox1); // 체크 버튼을 프레임에 추가
        add(checkbox2);
        add(checkbox3);
        add(checkbox4);
        add(label);

        ItemListener itemListener = new ItemListener() { // 선택한 체크 박스의 가격을 모두 더하는 로직
            public void itemStateChanged(ItemEvent e) {
                int total = 0;
                if (checkbox1.isSelected()) {
                    total += 45000; 
                }
                if (checkbox2.isSelected()) {
                    total += 80000; 
                }
                if (checkbox3.isSelected()) {
                    total += 30000; 
                }
                if (checkbox4.isSelected()) {
                    total += 100000; 
                }
                label.setText("현재까지의 가격은 " + total + "입니다."); // 현재까지의 가격 출력
            }
        };

        checkbox1.addItemListener(itemListener); // 체크 버튼마다 가격 더하는 로직 적용
        checkbox2.addItemListener(itemListener);
        checkbox3.addItemListener(itemListener);
        checkbox4.addItemListener(itemListener);

        setSize(500, 150); // 크기 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫기 버튼 설정
        setVisible(true); // 보이기 설정
    }

    public static void main(String[] args) {
        new CheckBoxButton();
        System.out.println("2022440025 김세원");
    }
}
