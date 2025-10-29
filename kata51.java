
public class kata51 {

    public static String smash(String... words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static String smashS(String... words) {
        return String.join(" ", words);
    }
}
