
public class kata20 {

    public static int findIt(int[] a) {
        for (int letSelec : a) {
            boolean bool = false;
            for (int num : a) {
                if (num == letSelec) {
                    bool = !bool;
                }
            }
            if (bool) {
                return letSelec;
            }
        }
        return 0;
    }

}
