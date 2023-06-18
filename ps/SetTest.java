import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetTest {
    public static void main(String [] args) {
        TreeSet<String> set = new TreeSet<String>();

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

    // Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
    // Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(2, 4, 6, 8));

    // s1.retainAll(S2);
    // System.out.println(s2);
}

/*
HashSet인 경우
[Ham, Butter, Cheese, Milk, Bread]
Ham 있음

TreeSet인 경우 : 알파벳 순서대로 정렬됨
[Bread, Butter, Cheese, Ham, Milk]
Ham 있음

LinkedHashSet인 경우 : 입력한 순서대로 출력됨
[Milk, Bread, Butter, Cheese, Ham]
Ham 있음
 */