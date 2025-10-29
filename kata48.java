public class kata48 {
    public static void main(String[] args) {
        multiplicacion(6);

    }

    public static void multiplicacion(int n) {
        int resultado;
        for (int i = 0; i <= 10; i++) {
            resultado = i * n;
            System.out.print(i + " x " + n + " = " + resultado + "\n");
        }

    }

    public static boolean esPrimo(int n) {
        if (n == 1)
            return false;
        if (n == 2)
            return true;
        boolean comprobar = false;
        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                comprobar = true;
            }
        }
        return comprobar;
    }

    public static void mostrar(boolean n) {
        System.out.println(n);
    }
}
