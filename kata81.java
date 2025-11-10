public class kata81 {
    public static void main(String[] args) {
        System.out.println(sumaImpares(1, 5));
    }

    public static int sumaImpares(int a, int b) {
        if (b < a) {
            return 0;
        }
        int suma = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                suma += i;
            }
        }
        return suma;
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] buscaPrimosEntre(int num1, int num2) {

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int contadorPrimos = 0;
        for (int i = min; i <= max; i++) {
            if (esPrimo(i)) {
                contadorPrimos++;
            }
        }

        int[] primosEncontrados = new int[contadorPrimos];

        int indiceArray = 0;
        for (int i = min; i <= max; i++) {
            if (esPrimo(i)) {
                primosEncontrados[indiceArray] = i;
                indiceArray++;
            }
        }

        return primosEncontrados;
    }
}
