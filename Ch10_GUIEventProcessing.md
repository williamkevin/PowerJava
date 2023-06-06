# Chapter 10 GUI 이벤트 처리

## 10.1 이벤트 처리 개요

### 이벤트란?

- Event-driven programming(이벤트 구동 프로그래밍): 어떤 이벤트가 일어나는지를 감시하고 있다가 이벤트가 발생하면 적절한 처리를 해주는 프로그래밍 방식
- Event: 사용자가 버튼을 클릭하거나 마우스를 움직이거나 키를 누르면 발생한다.

|Term|Description|Example|
|---|---|---|
|이벤트 객체|발생한 이벤트에 대한 정보를 가지고 있는 객체|마우스 이벤트 객체라면 현재 위치, 버튼 눌림 상태 등을 가지고 있다.|
|이벤트 소스|이벤트를 생성하는 컴포넌트|버튼이 이벤트를 발생하였다면 그 버튼은 이벤트 소스다.|
|이벤트 리스너|발생된 이벤트 객체에 반응하여서 이벤트를 처리하는 객체. 이벤트를 처리하기 위하여 이벤트에 귀를 기울이고 있는 객체.|버튼에서 발생하는 이벤트를 처리하려면 이벤트 리스너를 버튼에 등록해야 한다.|

### 이벤트 처리 과정

1. 이벤트를 작성한다.
    - 리스너 인터페이스: 종류에 따른 이벤트를 처리하기 위한 규격
    - 클래스가 이벤트 리스너가 되려면 해당하는 리스너 인터페이스를 구현해야 한다.

2. 이벤트 리스너를 컴포넌트에 등록한다.
    - 각 컴포넌트가 제공하는 이벤트를 등록할 수 있는 메소드를 이용한다.

### 이벤트 객체

- 이벤트 객체는 발생된 이벤트에 대한 모든 정보를 리스너로 전달한다.
- 이벤트 객체는 getSource() 메소드를 가진다.
- getSource() 메소드: 이벤트가 발생한 이벤트 소스를 Object 타입으로 반환한다. 이것을 필요한 타입으로 형변환해서 사용해야 한다.

## 10.2 이벤트 처리 방법

### 내부 클래스가 이벤트를 처리하는 방법

1. 이벤트를 처리하는 클래스들이 모여 있는 패키지를 java.awt.event를 포함한다.
2. 리스너 인터페이스를 구현하는 클래스를 내부 클래스로 하여 작성한다.
    - 내부 클래스: 다른 클래스 안에 위치하는 클래스로서 외부 클래스의 필드들을 자유롭게 사용할 수 있다.
3. 이벤트 리스너 객체를 생성하고 addActionListener()를 이용하여 버튼에 리스너 객체를 등록한다.

```java
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.*;

public class EventTest1 extends JFrame {
    private JButton button;
    private JLabel label;
    private int counter = 0;

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            counter++;
            label.setText("현재의 카운터 값: " + counter);
        }
    }

    public EventTest1() {
        setLocation(500, 500);
        setSize(400, 150);
        setTitle("내부 클래스가 이벤트를 처리하는 방법");
        setLayout(new BorderLayout());

        button = new JButton("증가");
        label = new JLabel("현재의 카운터 값: " + counter);

        button.addActionListener(new MyListener());

        add(label, "Center");
        add(button, "East");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        EventTest1 t = new EventTest1();
    }
}
```

### 외부 클래스가 이벤트를 처리하는 방법

- 이벤트를 처리하는 외부 클래스에서 다른 클래스의 내부 객체에 접근할 수 없기 때문에 이벤트에 대응하기 어렵다.

```java
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
```

### 프레임 클래스가 이벤트를 처리하는 방법

- 프레임 클래스가 JFrame을 상속받으면서 동시에 ActionListener 인터페이스도 구현하는 방법
- 비교적 많이 사용된다.

```java
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
```

### 익명 클래스를 사용하는 방법

- 익명 클래스: 이름이 없는 클래스를 작성하여 바로 한 번만 사용한다.
- 많이 사용된다. 특히 안드로이드 프로그램에서 주로 사용된다.

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest4 extends JFrame {
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private int counter = 0; 

    public EventTest4() {
        setLocation(1000, 1000);
        setSize(500, 500);
        setTitle("익명 클래스를 이용하는 방법");
        
        panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재 카운터 값은:   " + counter);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("증가된 카운터 값은: " + counter);
            }
        });

        panel.add(button);
        panel.add(label);
        add(panel);

        setVisible(true);
    }

    public static void main(String [] args) {
        EventTest4 et = new EventTest4();
    }
}
```

### 람다식을 이용하는 방법

- Lambda expression: 이름이 없는 메소드
- Lambda expression은 한 번만 사용되고 메소드의 길이가 짧은 경우에 유용하다.

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class EventTest5 extends JFrame {
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private int counter;

    public EventTest5() {
        setLocation(400, 400);
        setSize(400, 500);
        setTitle("The way using lambda expression");

        panel = new JPanel();
        button = new JButton("증가");
        label = new JLabel("현재 카운터 값은: " + counter);

        button.addActionListener(e -> {
            counter++;
            label.setText("현재 카운터 값은: " + counter);
        });

        panel.add(button);
        panel.add(label);
        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String [] args) {
        EventTest5 t = new EventTest5();
    }
}
```

## 10.3 스윙 컴포넌트의 이벤트

## 10.4 키 이벤트

## 10.5 Mouse와 Mousemotion 이벤트

## 10.6 이벤트 클래스
