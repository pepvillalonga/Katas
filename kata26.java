
public class kata26 {

    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                positivos++;
            }
            if (input[i] < 0) {
                negativos = negativos + input[i];
            }
        }

        return new int[]{positivos, negativos};
    }
}
