public class BitOperator2 {
    public static void main(String [] args) {
        int x = 0b00001101;
        int y = 0b00001010;

        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);
        System.out.println(x >> 1);
        System.out.println(x << 1);
        System.out.println(x >> 1);
    }
}
