
import java.util.List;

public class kata35 {

    public static String disemvowel(String str) {
        List<String> vocales = List.of("a", "e", "i", "o", "u");
        String[] separadas = str.split("");
        String resultado = "";
        for (String letra : separadas) {
            if (!vocales.contains(letra.toLowerCase())) {
                resultado += letra;
            }
        }
        return resultado;
    }
}
