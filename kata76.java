public class kata76 {
    public static int[] sortByValueAndIndex(int[] array) {
        int n = array.length;
        int[] products = new int[array.length];
        int[] result = new int[array.length];
        boolean[] used = new boolean[n];
        for (int i = 0; i < n; i++) {
            products[i] = array[i] * (i + 1);
        }
        for (int i = 0; i < n; i++) {
            int minIndex = -1;
            for (int j = 0; j < n; j++) {
                if (!used[j] && (minIndex == -1 || products[j] < products[minIndex])) {
                    minIndex = j;
                }
            }
            result[i] = array[minIndex];
            used[minIndex] = true;
        }
        return result;
    }
}
