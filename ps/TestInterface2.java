class Shape {
    protected int x, y;
}

interface Drawable {
    public abstract void draw();
}

class Circle extends Shape implements Drawable {
    @Override
    public void draw() {
        System.out.println("draw (" + x + ", " + y + ")");
    }
}

public class TestInterface2 {
    public static void main(String [] args) {
        Drawable obj = new Circle();
        obj.draw();
    }
}
