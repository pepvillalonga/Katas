
public class kata02 {

    public static int sortDesc(final int num) {

        char[] digits = Integer.toString(num).toCharArray();

        java.util.Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse();

        return Integer.parseInt(sb.toString());
    }
}
