abstract class Shape {
    // private int x, y;
    // public Shape(int x, int y) {
    //     this.x = x;
    //     this.y = y;
    // }
    public abstract void draw();
}

class Rectangle extends Shape {
    // private int width, height;

    // public Rectangle(int witdh, int height) {
    //     super(10, 20);
    //     this.width = width;
    //     this.height = height;
    // }

    @Override
    public void draw() {
        System.out.println("rectangle draw");
    }
}

public class AbstractTest {
    public static void main(String [] args) {
        Shape shape = new Rectangle();
        shape.draw();
    }
}
