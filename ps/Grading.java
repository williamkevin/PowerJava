import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        int score;
        char grade;

        Scanner sc = new Scanner(System.in);

        System.out.print("점수를 입력하시오: ");
        score = sc.nextInt();

        switch (score / 10) {
            case 9: grade = 'A'; break;
            case 8: grade = 'B'; break;
            case 7: grade = 'C'; break;
            case 6: grade = 'D'; break;
            case 5: grade = 'E'; break;
            default: grade = 'F'; break;
        }

        System.out.println("학점: " + grade);
    }
}
