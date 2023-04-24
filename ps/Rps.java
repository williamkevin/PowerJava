import java.util.*;

public class Rps {
    final int ROCK = 0;
    final int PAPER = 1;
    final int SICCOR = 2;

    public static void main(String [] args) {
        int userRps, computerRps;
        String result;

        Scanner sc = new Scanner(System.in);
        System.out.print("바위(0), 보(1), 가위(2): ");
        userRps = sc.nextInt();

        computerRps = (int) (Math.random() * 3);

        if (userRps == computerRps) result = "비김";
        else if (userRps == (computerRps + 1) % 3) result = "인간 승리";
        else result = "컴퓨터 승리";

        System.out.println("인간: " + userRps + " 컴퓨터: " + computerRps + " " + result);
    }
}
