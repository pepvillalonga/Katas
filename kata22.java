
public class kata22 {

    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        for (int i = 0; i < nFloors; i++) {
            int nStars = 2 * i + 1;
            int nSpaces = nFloors - i - 1;
            tower[i] = " ".repeat(nSpaces) + "*".repeat(nStars) + " ".repeat(nSpaces);
        }
        return tower;
    }
}
