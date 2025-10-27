public class kata54 {
    public static String reverseWords(final String original) {
        String[] sep = original.split(" ");
        for (int i = 0; i < sep.length; i++) {
            sep[i] = new StringBuilder(sep[i]).reverse().toString();
        }

        return String.join(" ", sep);
    }
}
