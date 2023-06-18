import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.lang.Comparable;

class Student implements Comparable<Student> {
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String toString() { return name; }

    public int compareTo(Student s) {
        return s.number - number;
    }
}

public class SortTest {
    public static void main(String [] args) {
        Student array [] = {
            new Student(10, "김철수"),
            new Student(20, "이철수"),
            new Student(30, "박철수")
        };

        System.out.println(array);

        List<Student> list = Arrays.asList(array);
        
        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }
}
