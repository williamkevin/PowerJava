class LocalInner {
    private int data = 30;

    void display() {
        final String msg = "현재의 데이터 값은 ";

        class Local {
            void printMsg() {
                System.out.println(msg + data);
            }
        }

        Local obj = new Local();
        obj.printMsg();
    }
}

public class localClassTest {
    public static void main(String [] args) {
        LocalInner obj = new LocalInner();
        obj.display();
    }
}
