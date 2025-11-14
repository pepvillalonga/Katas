public class kata83 {

    public static boolean tieneFormatoNIF(char[] digitos) {
        if (digitos == null || digitos.length != 9) {
            return false;
        }

        for (int i = 0; i < 8; i++) {
            if (!('0' <= digitos[i] && digitos[i] <= '9')) {
                return false;
            }
        }

        char letra = digitos[8];
        return ('A' <= letra && letra <= 'Z' && letra != 'Ñ');
    }

    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

}
