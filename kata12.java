
public class kata12 {

    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 2) {
            return 0;
        }

        int mayor = numbers[0];
        int menor = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (mayor < numbers[i]) {
                mayor = numbers[i];
            }
            if (menor > numbers[i]) {
                menor = numbers[i];
            }
        }

        int suma = 0;
        for (int number : numbers) {
            suma += number;
        }

        return suma - mayor - menor;
    }
}
