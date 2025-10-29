
public class kata32 {

    public static int greedy(int[] dice) {
        int[] count = new int[7]; 
        int score = 0;

        // Contar repeticiones
        for (int d : dice) {
            count[d]++;
        }

        // Tripletas
        if (count[1] >= 3) {
            score += 1000;
            count[1] -= 3;
        }
        for (int i = 2; i <= 6; i++) {
            if (count[i] >= 3) {
                score += i * 100;
                count[i] -= 3;
            }
        }

        // Individuales
        score += count[1] * 100;
        score += count[5] * 50;

        return score;

    }

}
