import java.util.Scanner;

public class Averager {
    public static void main(String [] args) {
        int score, count = 0, sum = 0;
        float average;

        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("정수를 입력하시오: ");
            score = sc.nextInt();

            if (score < 0) break;

            sum += score;
            count++;
        }
        
        average = (float)sum/count;

        System.out.println("평균: " + average);
    }
}
