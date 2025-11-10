public class kata79 {
    public static int[] dataReverse(int[] data) {
        int[] resultado = new int[data.length];

        for (int i = 0; i < data.length; i += 8) {
            System.arraycopy(data, i, resultado, data.length - i - 8, 8);
        }

        return resultado;
    }
}
