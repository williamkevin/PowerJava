import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
/*
[6, 8, 9, 3, 1, 4, 2, 7, 5, 0]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
