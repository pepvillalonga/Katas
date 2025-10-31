
import java.util.*;

public class kata74 {
    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> palabras = new ArrayList<>();
        for (String s1 : array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    palabras.add(s1);
                    break;
                }
            }
        }
        String[] resultado = palabras.toArray(String[]::new);
        Arrays.sort(resultado);
        return resultado;

    }
}