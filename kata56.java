public class kata56 {
    public static String[] towerBuilder(int nFloors) {
        String[] tower = new String[nFloors];
        String ast = "*";
        String esp = " ";
        for (int i = 0; i < nFloors; i++) {
            int numStars = 2 * i + 1;
            int numSpaces = nFloors - i - 1;
            String floor = esp.repeat(numSpaces) + ast.repeat(numStars) + esp.repeat(numSpaces);
            tower[i] = floor;
        }
        return tower;
    }
}
