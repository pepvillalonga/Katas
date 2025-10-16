
public class kata28 {

    public static String countingSheep(int num) {
        String palabra = " sheep...";
        String resultado = "";
        for (int i = 1; i <= num; i++) {
            resultado += String.valueOf(i) + palabra;
        }
        return resultado;
    }
}
