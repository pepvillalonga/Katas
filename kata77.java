public class kata77 {
    public static int[] foldArray(int[] array, int runs) {
        int[] resultat = array;

        for (int i = 0; i < runs; i++) {
            int largo = resultat.length;
            int largoPlegado = (largo + 1) / 2;
            int[] temporal = new int[largoPlegado];

            for (int j = 0; j < largo / 2; j++) {
                temporal[j] = resultat[j] + resultat[largo - 1 - j];
            }

            if (largo % 2 != 0) {
                temporal[largoPlegado - 1] = resultat[largo / 2];
            }

            resultat = temporal;
        }
        return resultat;
    }
}
