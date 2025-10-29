
public class kata23 {

    public static int countChange(int money, int[] coins) {
        int[] ways = new int[money + 1];
        ways[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= money; i++) {
                ways[i] += ways[i - coin];
            }
        }
        return ways[money];
    }
}
