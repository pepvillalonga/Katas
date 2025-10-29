
public class kata05 {

    public static String areYouPlayingBanjo(String name) {
        if (name.toLowerCase().startsWith("r")) {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
