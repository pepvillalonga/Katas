
import java.util.Arrays;

public class kata16 {

    public static String findNeedle(Object[] haystack) {
        int posi = Arrays.asList(haystack).indexOf("needle") + 1;
        return "found the needle at position " + posi;
    }
}
