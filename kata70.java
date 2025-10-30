import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class kata70 {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : elements) {
            counts.put(n, counts.getOrDefault(n, 0) + 1);
            if (counts.get(n) <= maxOccurrences)
                result.add(n);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
