
public class kata20 {

    public static int findIt(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int numActual = a[i];
            boolean bool = false;
            for (int num : a) {
                if (num == numActual) {
                    bool = !bool;
                }
            }
            if (bool) {
                return numActual;
            }
        }
        return 0;
    }
}
