public class kata63 {
    public static int find(int[] integers) {
        int even = 0, odd = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        boolean majorityEven = even > odd;
        for (int n : integers) {
            if (majorityEven && n % 2 != 0)
                return n;
            if (!majorityEven && n % 2 == 0)
                return n;
        }
        return 0;
    }
}
