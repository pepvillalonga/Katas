import java.util.HashMap;
import java.util.Map;

public class kata72 {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int rem = target - numbers[i];
            if (map.containsKey(rem)) {
                return new int[] { map.get(rem), i };
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
