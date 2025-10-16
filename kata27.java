
public class kata27 {

    public static String repeatStr(final int repeat, final String string) {
        int i = 0;
        String palabra = "";
        while (repeat > i) {
            palabra += string;
            i++;
        }
        return palabra;
    }
}
