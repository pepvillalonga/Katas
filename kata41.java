
public class kata41 {

    public static String rot13(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                result += (char) ((c - 'a' + 13) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                result += (char) ((c - 'A' + 13) % 26 + 'A');
            } else {
                result += c;
            }
        }
        return result;
    }

}
