import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Arrays;

public class retainAllTest {
    public static void main(String [] rags) {
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(3, 4, 5, 6, 7));
        Set<Integer> set3 = new LinkedHashSet<>(Arrays.asList(6, 7, 8, 9, 10));

        set1.retainAll(set2);
        set2.addAll(set3);

        System.out.println(set1); // [3, 4, 5]
        System.out.println(set2); // [3, 4, 5, 6, 7, 8, 9, 10]
    }
}
