// Chapter 13 제너릴과 컬렉션
// 2022440025 김세원
// 사용자로부터 입력받은 자료를 ArrayList에 추가하고 일부 데이터를 삭제하며 자료구조의 모든 요소를 순회하는 방법을 익힌다.

import java.util.Scanner; // 사용자로부터 입력을 받기 위한 클래스
import java.util.ArrayList; // 사용자로부터 입력받은 자료를 저장하기 위한 ArrayList 자료구조
import java.util.Collections; // ArrayList의 요소를 정렬하는 sort() 메소드를 사용하기 위한 Collections Class

public class Scoring {
    public static void main(String [] args) {
        ArrayList<Double> list = new ArrayList<Double>(); // 자료를 저장하고 가공하기 위한 double 형의 ArrayList 객체를 생성한다.
        Scanner sc = new Scanner(System.in); // 사용자로부터 입력을 받기 위한 Scanner 객체를 생성한다.

        System.out.println("2022440025 김세원");

        for (int i = 0; i < 10; i++) { 
            System.out.print("심사위원의 점수: "); // 사용자로부터 심사위원의 점수를 입력받기 위한 안내 문구를 출력한다.
            double score = sc.nextDouble(); // 사용자로부터 심사위원의 점수를 입력받는다.
            list.add(score); // 입력받은 점수를 ArrayList의 객체에 추가한다.
        }

        Collections.sort(list); // ArrayList의 요소를 오름차순으로 정렬한다.
        
        list.remove(0); // 심사위원들의 점수 중에서 최저 점수를 제거한다.
        list.remove(8); // 심사위원들의 점수 중에서 최고 점수를 제거한다.

        double sum = 0;
        for (double s : list) {
            sum += s; // 남아 있는 모든 심사위원들의 점수를 더한다.
        }

        System.out.println("점수의 합: " + sum); // 총점을 출력한다.
    }
}