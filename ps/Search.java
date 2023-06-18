import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Search {
    public static void main(String [] args) {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }

        System.out.println("탐색의 반환값: " + Collections.binarySearch(list, 50)); // 50

    }
}

