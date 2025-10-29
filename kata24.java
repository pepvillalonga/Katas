
import java.util.stream.IntStream;

public class kata24 {

    public static IntStream stream() {
        return IntStream.iterate(2, n -> n + 1)
                .filter(kata24::isPrime);
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
