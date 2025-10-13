
public class kata11 {

    public static int[] digitize(long n) {
        String s = Long.toString(n);
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(s.length() - 1 - i) - '0';
        }
        return result;
    }

}
