import java.util.Scanner;

public class _443A_AntonAndLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("");
        StringBuilder s = new StringBuilder();
        String x = input.next();
        int k = 0;
        while (!x.equals("}")) {
            if (x.compareTo("a") >= 0 && x.compareTo("z") <= 0) {
                if (!s.toString().contains(x)) {
                    s.append(x);
                    k++;
                }
            }
            x = input.next();
        }
        System.out.println(k);
    }
}
