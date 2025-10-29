
public class kata34 {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int suma = 0;
        int media = 0;
        for (int i = 0; i < classPoints.length; i++) {
            suma += classPoints[i];
        }
        media = suma / classPoints.length;
        return media < yourPoints;
    }
}
