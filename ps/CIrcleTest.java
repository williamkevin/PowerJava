class Shape {
    int x, y;
}

class Circle extends Shape {
    private int radius;
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
}

public class CIrcleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(0, 0, 10);
        
        System.out.println("원의 중심: " + circle.x + circle.y);
        System.out.println("원의 넓이: " + circle.getArea());
    }
}
