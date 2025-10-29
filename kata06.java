
public class kata06 {

    public static void main() {
        System.out.println(isSquare(25));
    }

    public static boolean isSquare(int n) {
        if (n < 0) {
            return false;
        }
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }
}
