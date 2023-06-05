import java.util.*;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {return "(" + x + ", " + y + ")";}
}

public class ArrayListTest {
    public static void main(String [] args) {
        ArrayList<Point> list = new ArrayList<Point>();

        list.add(new Point(1, 1));
        list.add(new Point(1, 2));
        list.add(new Point(1, 3));
        list.add(new Point(1, 4));
        list.add(new Point(1, 5));

        System.out.println(list);
    }
}
