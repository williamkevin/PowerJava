import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Sort {
    public static void main(String [] args) {
        String[] s = {"i", "am", "iron", "man"};

        System.out.println(s);

        List<String> list = Arrays.asList(s);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
/*
[Ljava.lang.String;@1dbd16a6
[i, am, iron, man]
[am, i, iron, man]
 */