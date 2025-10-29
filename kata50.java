
class kata50 {

    public static void main(String[] args) {
        boolean resultado = mataDragones(28, 4);
        System.out.println(resultado);
    }

    public static boolean mataDragones(int bolas, int dragones) {
        if (bolas < 7) {
            return false;
        }
        while (dragones > 0 && bolas >= 7) {
            bolas -= 7;
            dragones--;
        }
        return dragones == 0;
    }
}
