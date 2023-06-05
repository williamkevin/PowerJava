import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String [] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Milk");
        list.add("Bread");
        list.add("Butter");
        list.add(1, "Apple");
        list.set(2, "Graph");
        list.remove(3);

        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
