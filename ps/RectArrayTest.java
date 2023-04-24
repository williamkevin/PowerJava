class Rect {
    private int width, height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public double getArea() {
        return (double)width *height;
    }
}

public class RectArrayTest {
    public static void main(String [] args) {
        Rect [] list = new Rect[5];

        for (int i = 0; i < list.length; i++) {
            list[i] = new Rect(i, i);
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(i + "번째 사각형의 면적 = " + list[i].getArea());
        }
    }
}
