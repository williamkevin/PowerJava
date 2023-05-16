class Circle {
    private int radius;
    public Circle(int radius) {
        this.radius = radius;
    }
    public String toString() {
        return "Circle(r=" + radius + ")";
    }
}

public class CIrcleTest3 {
    public static void main(String[] args) {
        Circle obj = new Circle(10);
        System.out.println(obj);
    }
}
