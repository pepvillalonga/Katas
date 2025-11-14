public class kata84 {
    public static double findUniq(double arr[]) {
        double igual = arr[0];
        double desigual = arr[1];
        if (igual != desigual) {
            if (igual != arr[2]) {
                return igual;
            } else {
                return desigual;
            }
        }

        for (int i = 2; i < arr.length; i++) {
            if (igual != arr[i]) {
                return arr[i];
            }
        }
        return arr[0];
    }
}
