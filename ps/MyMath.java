public class MyMath {
    public static int abs(int i) {
        return (i > 0 ? i : -i);
    }

    public static int power(int i, int j) {
        int result = 1;
        for (int k = 0; k < j; k++) {
            result *= i;
        }
        return result;
    }

    public static void main(String [] args) {
        System.out.println("10의 3승은 " + MyMath.power(10, 3));
    }
}
