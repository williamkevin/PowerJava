# Chapter 09 자바 GUI 기초

## 9.1 자바 GUI 소개

- 콘솔 기반: 명령 프롬프트와 같이 텍스트만을 사용하여 대화하는 것 <-> Graphical User Interface(GUI)

### JWT, 스윙, JavaFX

현재 자바에서 사용할 수 있는 GUI

- Abstract Window Toolkit(AWT): 초기 자바 버전에서 제공하던 GUI. 운영체계가 제공하는 자원을 이용하여 컴포넌트 생성
- Swing: 순수 자바로 작성되어 어떤 플랫폼에서도 일관된 화면을 보여줄 수 있다.

|AWT|Swing|
|---|---|
|플랫폼에 따라 다르게 보인다.|자바로 작성되어 플랫폼에 독립적이다.|
|무겁다.|가볍다.|
|룩앤필을 지원하지 않는다.|룩앤필을 지원한다.|
|컴포넌트의 개수가 적다.|컴포넌트가 많다.|
|모델 뷰 컨트롤러(MVC) 모델을 따르지 않는다.|MVC 모델을 따른다.|

### 스윙 패키지

|Swing Package|Contents|
|---|---|
|java.awt|GUI 컴포넌트를 위한 부모 클래스들을 제공하고 추가로 Color나 Point와 같은 유틸리티 타입의 클래스들을 포함하고 있다.|
|java.awt.event|GUI 컴포넌트로부터 발생되는 버튼 클릭과 같은 이벤트를 처리하기 위한 클래스와 인터페이스를 가지고 잇다.|

## 9.2 자바 GUI 기초

### 컨테이너 컴포넌트

|Component 종류|설명|예|
|---|---|---|
|단순 컴포넌트|단순한 컴포넌트|JButton, JLabel, JCheckbox, JChoice, JList, JMenu, JTextField, JScrollbak, JTextArea, JCanvas|
|컨테이너 컴포넌트|다른 컴포넌트를 안에 포함할 수 있는 컴포넌트|JFrame, JDialog, JPanel, JScrollPane|

### 최상위 컨테이너

- 최상위 Container: 다른 Containeer 안에 포함될 수 없는 Container. JFrame, JDialog, JApplet  

### GUI 프로그램을 만드는 절차

1. Container를 생성한다.
2. Component를 추가한다.

### 프레임을 생성하는 방법 #1

JFrame 객체를 이용하는 방법

1. swing을 사용하기 위하여 javax.swing 패키지 안의 모든 클래스를 포함한다.
2. new 연산자를 이용하여서 JFrame 객체를 생성한다.
3. 프레임의 타이틀을 설정한다.
4. 프레임 객체의 setSize() 메소드를 호출하여 프레임의 크기를 변경한다.
5. 프레임 객체의 setVisible() 메소드를 호출하여 프레임을 화면에 나타낸다.
6. 프레임의 닫힘 버튼을 누르면 전체 프로그램이 종료되게 만든다.

```java
import javax.swing.*;

public class FrameTest {
    public static void main(String [] args) {
        JFrame f = new JFrame("FrameTest");

        f.setTitle("MyFrame");
        f.setSize(300, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
```

### 프레임을 생성하는 방법 #2

JFrame을 상속한 클래스의 객체를 이용하는 방법

1. swing을 사용하기 위하여 javax.swing 패키지 안에 있는 JFrame 클래스를 포함한다.
2. JFrame을 상속하여 MyFrame 클래스를 정의한다.
3. MyFrame 클래스의 생성자에서 MyFrame 객체를 초기화한다.
4. main()에서 MyFrame 객체를 생성한다. MyFrame 생성자가 호출되면서 모든 작업이 시작된다.

```java
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300, 200);
        setTitle("MyFrame");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}
```

### 프레임에 버튼 추가하기

1. MyFrame 클래스의 생성자에서 setLayout(new FlowLayout()); 문장을 실행하여 배치 관리자(컨테이너 안에서 자식 컴포넌트들의 배치를 담당하는 객체)를 FlowLayout으로 변경한다. 배치 관리자도 객체이므로 new로 생성하였다. FlowLayout은 자식 컴포넌트들을 순차적으로 배치하는 배치 관리자다.
2. new 연산자를 이용하여 버튼 객체를 생성한다.
3. add(button); 문장을 실행하여 버튼을 프레임에 추가한다.

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class MyFrame2 extends JFrame {
    public MyFrame2() {
        setSize(300, 200);
        setTitle("MyFrame");

        setLayout(new FlowLayout());
        JButton button = new JButton("버튼");
        add(button);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        MyFrame2 f = new MyFrame2();
    }
}
```

## 9.3 컨테이너 살펴보기

## 9.4 배치 관리자

## 9.5 스윙 비주얼 디자이너: WindowBuilder

## 9.6 기초 컴포넌트들
