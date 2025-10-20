
public class kata43 {

    public static long findNextSquare(long sq) {
        double raiz = Math.sqrt(sq);
        if (raiz % 1 != 0) {
            return -1;
        }
        long siguiente = (long) raiz + 1;
        return siguiente * siguiente;
    }
}
