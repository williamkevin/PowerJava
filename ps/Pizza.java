public class Pizza {
    public static void main(String [] args) {
        final double PI = 3.141593;
        double onePizza = PI * 30 * 30;
        double twoPizza = PI * 20 * 20 * 2;

        System.out.println("20cm 피자 두 개 면적: " + twoPizza);
        System.out.println("23cm 피자 한 개 면적: " + onePizza);
        System.out.println(((onePizza > twoPizza) ? "30cm 피자 한 개" : "20cm 피자 2개") + "를 주문하세요." );
    }
}