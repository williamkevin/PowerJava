import java.util.Scanner;

public class StringSwitch {
    public static void main(String[] args) {
        String pizzaName;
        int pizzaPrice = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("피자 종류를 입력하시오: ");
        pizzaName = sc.next();

        switch (pizzaName) {
            case "콤비네이션": pizzaPrice = 20000; break;
            case "치즈": pizzaPrice = 25000; break;
            case "포테이토": pizzaPrice = 30000; break;
            case "슈림프": pizzaPrice = 40000; break;
        }

        System.out.println("피자 " + pizzaName + "의 가격은 " + pizzaPrice + "원입니다.");
    }
}
