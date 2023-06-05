import java.util.Set;
import java.util.HashSet;

public class SetTest {
    public static void main(String [] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham"))
            System.out.println("Ham 있음");
    }

    Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
    Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(2, 4, 6, 8));

    s1.retainAll(S2);
    System.out.println(s2);
}