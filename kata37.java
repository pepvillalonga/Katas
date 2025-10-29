
import java.util.List;

public class kata37 {

    public int sum(List<?> mixed) {
        int result = 0;
        for (Object item : mixed) {
            if (item instanceof Integer integer) {
                result += integer;
            } else if (item instanceof String string) {
                result += Integer.parseInt(string);
            }
        }
        return result;
    }
}
