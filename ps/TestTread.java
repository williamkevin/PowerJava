class MyRunnable implements Runnable {
    String myName;
    public MyRunnable(String name) {
        myName = name;
    }
    public void run() {
        for (int i = 0; i <= 10; i++)
            System.out.println(myName + i + " ");
    }
}

public class TestTread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("A"));
        Thread t2 = new Thread(new MyRunnable("B"));
        Thread t3 = new Thread(new MyRunnable("C"));

        t1.start();
        t2.start();
        t3.start();
    }
}
