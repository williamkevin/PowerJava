import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String [] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Pear");
        list.add("Graph");

        int index = list.indexOf("Mango");

        System.out.println("Mango의 index: " + index);
    }
}
