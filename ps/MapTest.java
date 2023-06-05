import java.util.Map;
import java.util.HashMap;

public class MapTest {
    public static void main(String [] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee"));

        for (String key: map.keySet()) {
            String value = map.get(key);
            System.out.println("key=" + key + ", value=" + value);
        }

        map.remove(3);
        map.put("chot", "password");
        System.out.println(map);
    }
}
