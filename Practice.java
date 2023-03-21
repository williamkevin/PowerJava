import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.print("요일을 입력하세요(Mon, Tue, Wed, Thu, Fri, Sat, Sun: ");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        var output = ' ';

        switch (day) {
            case "Mon", "Tue", "Wed", "Thu", "Fri" -> output = "주중"; break;
            case "Sat", "Sun" -> output = "주말"; break;
            default -> System.out.println("error");
        }

        System.out.println(day + "은 " + output + "입니다.");
    }
}