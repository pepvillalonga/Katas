
public class kata04 {

    public static void main() {
        System.out.println(michaelPays(50));
    }

    public static double michaelPays(double cost) {
        if (cost < 5) {
            return roundDecimals(cost);
        } else if (cost < 30) {
            double result = (cost / 3) * 2;
            return roundDecimals(result);
        } else {
            return roundDecimals(cost - 10);
        }
    }

    private static double roundDecimals(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}
