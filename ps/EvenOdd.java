import java.util.Scanner;

public class EvenOdd {
    public static void main(String [] args) {
        boolean isEven;
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하시오: ");
        num = sc.nextInt();

        if (num % 2 == 0) isEven = true;
        else isEven = false;

        System.out.println("입력된 정수는 " + (isEven ? "짝수" : "홀수") + "입니다.");
    }
}
