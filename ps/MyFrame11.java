// 화씨 온도라는 문구와 화씨 온도를 입력할 수 있는 텍스트 필드, 그리고 섭씨 온도라는 문구와 섭씨 온도를 입력할 수 있는 텍스트 필드가 제시되는 GUI를 만든다.
import java.awt.*; // 필요한 패키지를 가져온다.
import javax.swing.*; // swing과 awt에 속한 모든 메소드를 가져온다.

public class TempConverter extends JFrame { // JFrame 객체를 생성하지 않고도 JFrame에 속한 JPanel, JLabel 등의 메소드를 사용하기 위해 JFrame을 상속한다.
    public TempConverter() {
        JPanel panel = new JPanel(); // panel 객체를 생성
        add(panel); // panel을 띄운다.

        JLabel label1 = new JLabel("화씨 온도"); // 화씨 온도라는 문구를 만들기 위한 객체 생성
        JLabel label2 = new JLabel("섭씨 온도");
        JTextField field1 = new JTextField(15); // 사용자로부터 화씨 온도를 입력받기 위한 텍스트 상자를 만들기 위한 객체 생성
        JTextField field2 = new JTextField(15);
        JButton button = new JButton("변환"); // 변환이라는 버튼을 만들기 위한 객체 생성

        panel.add(label1); // 화씨 온도라는 문구를 만들 수 있는 객체를 패널에 제시
        panel.add(field1); // 화씨 온도를 입력할 수 있는 텍스트 상자를 패널에 제시
        panel.add(label2); // 섭씨 온도라는 문구를 만들 수 있는 객체를 패널에 제시
        panel.add(field2); // 섭씨 온도를 입력할 수 있는 텍스트 상자를 패널에 제시
        panel.add(button); // 변환 버튼을 패널에 제시

        setSize(300, 150); // GUI의 크기 설정
        setTitle("온도 변환기"); // GUI의 제목 설정
        setVisible(true); // GUI를 시각화할 것인지 설정
    }

    public static void main(String [] args) {
        TempConverter f = new TempConverter(); // 생성자 함수 실행
        System.out.println("2022440025 김세원");
    }
}
