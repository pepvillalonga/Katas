public class kata57 {

    public static boolean esPrimo(int n) {
        if (n < 2)
            return false;
        int raiz = (int) Math.sqrt(n);
        for (int i = 2; i <= raiz; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int minimumNumber(int[] numbers) {
        int suma = 0;
        for (int num : numbers)
            suma += num;

        int añadir = 0;
        while (!esPrimo(suma + añadir)) {
            añadir++;
        }
        return añadir;
    }
}
