import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();

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
    }
}