
public class kata09 {

    public static long digPow(int n, int p) {
        String numStr = Integer.toString(n);
        long sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, p + i);
        }
        if (sum % n == 0) {
            return sum / n;
        } else {
            return -1;
        }
    }
}
