
import java.util.Map;
import java.util.HashMap;

public class kata40 {

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> conteo = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (conteo.containsKey(c)) {
                conteo.put(c, conteo.get(c) + 1);
            } else {
                conteo.put(c, 1);
            }
        }
        return conteo;
    }
}
