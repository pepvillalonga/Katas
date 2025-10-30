import java.util.Arrays;

public class kata59 {
    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(x -> Arrays.stream(b).noneMatch(y -> y == x))
                .toArray();
    }
}
