
import java.util.Map;
import java.util.HashMap;

public class kata40 {

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> conteo = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (conteo.containsKey(c)) {
                conteo.put(c, conteo.get(c) + 1); // suma al contador actual
            } else {
                conteo.put(c, 1); // primera aparición
            }
        }
        return conteo;
    }
}
