
public class kata53 {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0) {
            return 0;
        }
        int[] tills = new int[n];
        for (int time : customers) {
            int next = 0;

            for (int i = 1; i < n; i++) {
                if (tills[i] < tills[next]) {
                    next = i;
                }
            }
            tills[next] += time;
        }
        int max = tills[0];
        for (int t : tills) {
            if (t > max) {
                max = t;
            }
        }
        return max;
    }
}
