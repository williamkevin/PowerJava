    class Shape {
        int x;
        int y;
    }

    class Circle extends Shape {
        int radius;

        public Circle(int radius) {
            this.radius = radius;
            x = 0;
            y = 0;
        }

        double getArea() {
            return 3.14 * radius * radius;
        }
    }

    public class CircleTest {
        public static void main(String args[]) {
            Circle obj = new Circle(10);
            System.out.println("원의 중심: (" + obj.x + ", " + obj.y + ")"); // 원의 중심: (0, 0)
            System.out.println("원의 면적: " + obj.getArea()); // 원의 면적: 314.0
        }
    }
