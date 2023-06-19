class MyThread implements Runnable {
    String myName;
    public MyThread(String myName) {
        this.myName = myName;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(myName + i + " ");
        }
    }
}

public class TestThread {
    public static void main(String [] args) {
        Thread t1 = new Thread(new MyThread("A"));
        Thread t2 = new Thread(new MyThread("B"));

        t1.start();
        t2.start();
    }
}
// B0 B1 A0 A1 A2 A3 A4 A5 B2 B3 B4 B5 B6 B7 B8 A6 A7 A8 A9 B9