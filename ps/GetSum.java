import java.util.Scanner;

public class GetSum {
    public static void main(String [] args) {
        int n = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        while (n != -1) {
            sum += n;
            
            System.out.print("정수를 입력하시오: ");
            n = sc.nextInt();
        }

        System.out.println("입력된 정수의 합은: " + sum);
    }
}
