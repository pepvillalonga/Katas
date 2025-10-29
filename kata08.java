
public class kata08 {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        double left = mpg * fuelLeft;
        return left >= distanceToPump;
    }
}
