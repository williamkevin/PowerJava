//public class Practice {
//    public static void main(String[] args) {
//        final double PI = 3.141592;
//        System.out.println(PI); // 3.141592
//    }
//}

// 예제 2-1 1광년 거리 계산하기

//public class Practice {
//    public static void main(String[] args) {
//        final double SPEED_OF_LIGHT = 300000000;
//        double lightYear;
//
//        lightYear = SPEED_OF_LIGHT * 365 * 24 * 60 * 60;
//
//        System.out.println("빛이 1년 동안 가는 거리: " + lightYear + "km");
//    }
//}

// 예제 2-2 원의 면적 계산하기

//public class Practice {
//    public static void main(String[] args) {
//        final double PI = 3.141592;
//        double radius, area;
//
//        radius = 5;
//        area = PI * radius * radius;
//        System.out.println("반지름이 5인 원의 면적은 " + area); // 반지름이 5인 원의 면적은 78.5398
//    }
//}

//public class Practice {
//    public static void main(String[] args) {
//        int i;
//        double f;
//
//        f = 1 / 5;
//        System.out.println(f);
//
//        f = (double)1 / 5;
//        System.out.println(f);
//
//        i = (int) 1.7 + (int) 1.8;
//        System.out.println(i);
//    }
//}

import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, sum;

        System.out.print("첫 번째 숫자를 입력하시오: ");
        x = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하시오: ");
        y = sc.nextInt();

        sum = x + y;
        System.out.println(sum);
    }
}