public class kata75 {
    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 1; i < args.length; i++) {
            min = Math.min(min, args[i]);
        }
        return min;
    }

    public static String doubleChar(String s) {
        String[] separado = s.split("");
        StringBuilder sb = new StringBuilder();
        for (String letra : separado) {
            sb.append(letra);
            sb.append(letra);
        }
        return sb.toString();
    }
}
