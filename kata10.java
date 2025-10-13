
public class kata10 {

    public static String printerError(String s) {
        int errors = 0;
        int length = s.length();
        for (char c : s.toCharArray()) {
            if (c < 'a' || c > 'm') {
                errors++;
            }
        }
        return errors + "/" + length;
    }
}
