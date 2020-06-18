import java.util.Scanner;

public class _750A_NewYearAndHurry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int time = 240 - k;
        int i;
        for (i = 1; i <= n; i++) {
            if (5 * i > time) break;
            time -= 5 * i;
        }
        System.out.println(i - 1);
    }
}
