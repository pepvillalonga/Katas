
import java.util.ArrayList;

public class kata52 {

    public static int countPassengers(ArrayList<int[]> stops) {
        int total = 0;
        for (int[] parada : stops) {
            total += parada[0];
            total -= parada[1];
        }
        return total;
    }
}
