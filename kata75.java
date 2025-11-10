public class kata75 {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            min = Math.min(min, args[i]);
        }
        return min;
    }
}
