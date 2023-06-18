import java.util.Scanner;

public class DiviedbyZeroOK {
    public static void main(String [] args) {
        try {
            int a = 10 / 0;
            int b = 10 / 2;
        } catch (ArithmeticException e) {
            System.out.println("예외 발생");
        }
        finally {
            System.out.println("계속 진행");
        }
    }
}
