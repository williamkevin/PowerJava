import java.util.Scanner;

public class Factorial {
    public static void main(String [] args) {
        int num, factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하시오: ");
        num = sc.nextInt();

        if (num != 0) {
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
        }

        System.out.println(num + "!의 값은 " + factorial + "입니다.");
    }
}
