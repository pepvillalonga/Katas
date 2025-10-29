
import java.util.Arrays;

public class kata21 {

    public static void main(String[] args) {
        double[] a = {1, 1, 1};
        int n = 10;
        System.out.println(Arrays.toString(tribonacci(a, n)));
    }

    public static double[] tribonacci(double[] s, int n) {
        double[] rFinal = new double[n];
        for (int i = 0; i < Math.min(n, 3); i++) {
            rFinal[i] = s[i];
        }
        for (int i = 3; i < n; i++) {
            rFinal[i] = rFinal[i - 1] + rFinal[i - 2] + rFinal[i - 3];
        }
        return rFinal;
    }

}
