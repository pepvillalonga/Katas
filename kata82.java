
public class kata82 {

    public static int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (sqrt == (int) sqrt) {
                result[i] = (int) sqrt;
            } else {
                result[i] = array[i] * array[i];
            }
        }
        return result;
    }

    public static int repeats(int[] arr) {
        int suma = 0;
        for (int num1 : arr) {
            boolean comp = false;
            for (int num2 : arr) {
                if (num1 == num2) {
                    comp = !comp;
                }
            }
            if (comp) {
                suma += num1;
            }
        }

        return suma;
    }

    public static String getMiddle(String word) {
        String res = "";
        int largo = word.length();
        if (largo % 2 == 0) {
            res = word.substring(largo / 2 - 1, largo / 2 + 1);
        }
        if (largo % 2 != 0) {
            res = word.substring(largo / 2, largo / 2 + 1);
        }
        return res;
    }
}
