
public class kata33 {

    private static final String[] ONES = {
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
    };

    private static final String[] TEENS = {
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
        "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    private static int wordToNumber(String word) {
        for (int i = 0; i < ONES.length; i++) {
            if (word.equals(ONES[i])) {
                return i;
            }
        }
        for (int i = 0; i < TEENS.length; i++) {
            if (word.equals(TEENS[i])) {
                return 10 + i;
            }
        }
        for (int i = 0; i < TENS.length; i++) {
            if (word.equals(TENS[i])) {
                return 20 + i * 10;
            }
        }
        if (word.equals("hundred")) {
            return 100;
        }
        if (word.equals("thousand")) {
            return 1000;
        }
        if (word.equals("million")) {
            return 1000000;
        }
        return -1;
    }

    public static int parseInt(String numStr) {
        String[] words = numStr.replaceAll(" and ", " ").replaceAll("-", " ").split(" ");
        int total = 0, current = 0;
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            int n = wordToNumber(word);
            if (n == -1) {
                continue;
            }
            if (n == 100) {
                current *= n;
            } else if (n == 1000 || n == 1000000) {
                current *= n;
                total += current;
                current = 0;
            } else {
                current += n;
            }
        }
        return total + current;
    }

}
