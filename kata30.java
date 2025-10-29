
public class kata30 {

    public boolean check(String sentence) {
        sentence = sentence.toLowerCase().replaceAll(" ", "");
        String[] s = sentence.split("");
        String[] az = "abcdefghijklmnopqrstuvwxyz".split("");
        int v = 0;
        for (int i = 0; i < 26; i++) {
            for (String c : s) {
                if (c.equals(az[i])) {
                    v++;
                    break;
                }
            }
        }
        return v == 26;
    }

    public static void main(String[] args) {
        kata30 p = new kata30();
        String sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println(p.check(sentence));
    }

}
