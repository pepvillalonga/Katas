public class kata49 {

    public static String sumStr(String a, String b) {
        if (a.equals("") && b.equals("")) {
            return "0";
        }
        if (a.equals("")) {
            return b;
        }
        if (b.equals("")) {
            return a;
        }
        return String.valueOf(Integer.valueOf(a) + Integer.valueOf(b));
    }
}
