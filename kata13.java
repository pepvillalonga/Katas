
public class kata13 {

    public static String abbrevName(String name) {
        String[] partes = name.split(" ");
        String iniciales = partes[0].substring(0, 1) + "." + partes[1].substring(0, 1);
        return iniciales.toUpperCase();
    }

}
