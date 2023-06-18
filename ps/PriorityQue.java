import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String [] args) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();

        q.add(3);
        q.offer(2);
        q.add(1);
        q.remove();

        System.out.println(q); // [2, 3]
    }
}
