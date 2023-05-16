import java.util.*;

public class ExceptionTest {
    public static void main(String[] args) {
        int num;
        String input, upperCase;
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        upperCase = input.toUpperCase();
        System.out.println(upperCase);

        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            try {
                count[ch - 'A']++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundException 발생!");
                System.exit(0);
            }
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char)(i + 'A') + ": " + count[i] + "번");
            }
        }

        // try {
        //     int num = Integer.parseInt("ABC");
        //     System.out.println(num);
        // } catch (NumberFormatException e) {
        //     System.out.println("NumberFormat 예외 발생");
        // }
    }
}

// 입력과 출력이 다음과 같은 코드를 짜
// A B A
// A: 2번
// B: 1번
// ArrayIndexOutOfBoundException 발생!

// try 구문을 반드시 사용해