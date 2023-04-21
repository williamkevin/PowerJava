import java.util.Scanner;

public class CalTime {
    public static void main(String[] args) {
        int second, min, sec;
        Scanner sc = new Scanner(System.in);

        System.out.print("초를 입력하시오: ");
        second = sc.nextInt();

        min = second / 60;
        sec = second % 60;

        System.out.println(second + "는 " + min + "분 " + sec + "초입니다.");
    }
}
