import java.util.*;

public class kata80 {
    public static boolean isAnagram(String a, String b) {
        String[] palabraA = a.toLowerCase().split("");
        String[] palabraB = b.toLowerCase().split("");
        Arrays.sort(palabraA);
        Arrays.sort(palabraB);
        return String.join("", palabraA).equals(String.join("", palabraB));
    }
}
