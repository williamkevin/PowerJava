import java.util.*;

public class VectorExample {
    public static void main(String [] args) {
        Vector<String> vec = new Vector(2);

        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        System.out.println("벡터의 크기: " + vec.size());

        Collections.sort(vec);

        for (String s: vec)
            System.out.println(s + "  ");
    }
}
