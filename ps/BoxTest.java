class Box {
    int width, height, length;

    public int getVolume() {return width * height * length;}
}

public class BoxTest {
    public static void main(String [] args) {
        Box box = new Box();

        box.width = 20;
        box.height = 20;
        box.length = 30;

        System.out.println("상자의 가로, 세로, 높이는 " + box.width + ", " + box.height + ", " + box.length + "입니다.");
        System.out.println("상자의 부치는 " + box.getVolume());
    }
}
