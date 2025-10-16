
public class kata31 {

    public String dnaToRna(String dna) {
        String[] letras = dna.split("");
        int cantidad = letras.length;
        for (int i = 0; i < cantidad; i++) {
            if (letras[i].equals("T")) {
                letras[i] = "U";
            }
        }
        String palabra = String.join("", letras);
        return palabra;
    }
}
