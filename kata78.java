
public class kata78 {
    public static String vaporcode(String s) {
        StringBuilder sb = new StringBuilder();
        String[] separado = s.replace(" ", "").toUpperCase().split("");

        sb.append(separado[0]);

        for (int i = 1; i < separado.length; i++) {
            if (i != separado.length) {
                sb.append("  ");
                sb.append(separado[i]);
            }
        }
        return sb.toString();
    }
}
