public class kata44 {

    public static String high(String s) {
        String[] palabras = s.split(" ");
        int maxPuntuacion = 0;
        String palabraAlta = "";

        for (String palabra : palabras) {
            int puntuacion = 0;
            for (char c : palabra.toCharArray()) {
                puntuacion += c - 'a' + 1;
            }
            if (puntuacion > maxPuntuacion) {
                maxPuntuacion = puntuacion;
                palabraAlta = palabra;
            }
        }
        return palabraAlta;
    }

}
