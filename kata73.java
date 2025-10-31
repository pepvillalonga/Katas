public class kata73 {
    public static String longestConsec(String[] strarr, int k) {
        if (k <= 0 || strarr.length == 0 || k > strarr.length) {
            return "";
        }
        String palabra = "";
        int posi = 0;
        int maxLen = 0;

        for (int i = 0; i <= strarr.length - k; i++) {
            int len = 0;
            for (int j = 0; j < k; j++) {
                len += strarr[i + j].length();
            }
            if (len > maxLen) {
                maxLen = len;
                posi = i;
            }
        }
        for (int u = 0; u < k; u++) {
            palabra += strarr[posi + u];
        }
        return palabra;
    }

    public static String longestConsecS(String[] strarr, int k) {
        if (k <= 0 || strarr.length == 0 || k > strarr.length) {
            return "";
        }
        String longest = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < k; j++) {
                sb.append(strarr[i + j]);
            }
            if (sb.length() > longest.length()) {
                longest = sb.toString();
            }
        }
        return longest;
    }

}
