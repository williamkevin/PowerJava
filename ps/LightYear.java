// Ex 2-1

public class LightYear {
    public static void main(String[] args) {
        final double SPEED_LIGHT = 3e5;
        final double SECOND_YEAR = 365 * 24 * 60 * 60;
        double lightYear = SPEED_LIGHT *  SECOND_YEAR;

        System.out.println("빛이 1년 동안 가는 거리: " + lightYear + "km");
    }
}