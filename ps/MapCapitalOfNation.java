// Chapter 13 제너릴과 컬렉션
// 2022440025 김세원
// Map 자료구조와 Iterator Class를 사용하는 방법을 익힌다.

import java.util.Scanner; // 사용자로부터 국가 이름을 입력받기 위한 Scanner 클래스 
import java.util.HashMap; // 각 나라에 대응하는 수도를 저장하기 위한 자료구조
import java.util.Map; // 각 나라에 대응하는 수도를 저장하기 위한 자료구조
import java.util.Iterator; // Map의 모든 요소를 방문하기 위한 Iterator 클래스

public class MapCapitalOfNation {
    public static void main(String [] args) {
        Map<String, String> map = new HashMap<String, String>(); // HashMap을 참조하는 Map 타입의 객체 생성
        map.put("USA", "Washington");
        map.put("Japen", "Tokyo");
        map.put("China", "Beijing");
        map.put("UK", "London");
        map.put("Korea", "Seoul"); // 각 나라와 수도를 Map 자료구조에 추가

        System.out.println("2022440025 김세원");

        Iterator<String> it = map.keySet().iterator(); // Map의 모든 요소를 방문하기 위한 Iterator 객체 생성
        while(it.hasNext()) { // it 객체의 다음 값이 존재한다면 반복문을 순회한다.
            String key = it.next(); // 다음 key 값을 String type의 변수에 할당한다.
            System.out.println("key: " + key + ", value: " + map.get(key)); // key와 그에 대응하는 value를 출력한다.
        }

        Scanner sc = new Scanner(System.in); // 사용자로부터 나라 이름을 입력받기 위해 Scanner 객체를 생성한다.

        System.out.print("국가 이름을 입력하시오: "); // 사용자가 국가 이름을 올바르게 입력하도록 안내 문구를 출력한다.
        String nation = sc.next(); // 사용자의 입력을 String type의 nation 변수에 할당한다.

        System.out.print(nation + "의 수도: " + map.get(nation)); // Map 자료구조에서 사용자가 입력한 나라에 해당하는 수도를 출력한다.
        
    }
}
