public class DivideByAero {
    public static void main(String [] args) {
        int a = 10 / 0;
        int b = 10;
        System.out.println(a);

        System.out.println(b);
    }
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DivideByAero.main(DivideByAero.java:3)
 */