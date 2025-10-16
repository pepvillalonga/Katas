
public class kata25 {

    public static void main() {
        int n = 123456789;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        String reverse = new StringBuilder(String.valueOf(n)).reverse().toString();
        return Integer.parseInt(reverse);
    }

}
