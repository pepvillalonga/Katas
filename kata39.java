
public class kata39 {

    public static int points(String[] games) {
        int score = 0;
        int[] partido;
        for (String game : games) {
            partido = toInt(game);
            if (partido[0] > partido[1]) {
                score += 3;
            } else if (partido[0] == partido[1]) {
                score += 1;
            }
        }
        return score;
    }

    private static int[] toInt(String game) {
        String[] partes = game.split(":");
        int[] numeros = new int[partes.length];
        for (int i = 0; i < partes.length; i++) {
            numeros[i] = Integer.parseInt(partes[i]);
        }
        return numeros;
    }

}
