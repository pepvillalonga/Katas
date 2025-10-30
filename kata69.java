import java.util.*;

public class kata69 {
    public static int[] sortArray(int[] array) {
        List<Integer> odds = new ArrayList<>();
        for (int n : array)
            if (n % 2 != 0)
                odds.add(n);
        Collections.sort(odds);
        int idx = 0;
        int[] res = array.clone();
        for (int i = 0; i < res.length; i++) {
            if (res[i] % 2 != 0)
                res[i] = odds.get(idx++);
        }
        return res;
    }
}
