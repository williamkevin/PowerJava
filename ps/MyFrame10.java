import javax.swing.JFrame;

public class MyFrame10 extends JFrame {
    public MyFrame10() {
        setSize(300, 150);
        setTitle("MyFrame");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame10 f = new MyFrame10();
    }
}
