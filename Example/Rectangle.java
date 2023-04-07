class Shpae {
    protected int x, y;


    void print() {
        System.out.println("x좌펴: " + x + " y좌표: " + y);
    }
}


public class Rectangle extends Shape {
    int width, heigh;

    double calcArea() {
        return 3.14 * width * heigh;
    }

    void draw() {
        System.out.println("(" + x + ", " + y + ")" + " 위치에 " + "가로: " + width + "세로: " + heigh);
    }
}
