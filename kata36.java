
public class kata36 {

    public int min(int[] list) {
        int minim = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] < minim) {
                minim = list[i];
            }
        }
        return minim;
    }

    public int max(int[] list) {
        int maxim = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > maxim) {
                maxim = list[i];
            }
        }
        return maxim;
    }
}
