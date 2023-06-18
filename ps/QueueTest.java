import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String [] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        for (int i = 0; i < 5; i++) {
            q.add(i);
            System.out.println("add 이후 " + q);
        }

        for (int i = 0; i < 10; i++) {
            q.poll();
            System.out.println(q);
        }

        for (int i = 5; i < 10; i++) {
            q.offer(i);
            System.out.println("offer 이후 : " + q);
        }

        System.out.println("peak : " + q.peek());

        for (int i = 0; i < 5; i++) {
            q.remove();
            System.out.println("remove 이후 : " + q);
        }

        System.out.println("element : " + q.element());
    }
}
