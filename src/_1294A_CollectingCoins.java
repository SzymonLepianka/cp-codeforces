import java.util.Scanner;

public class _1294A_CollectingCoins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int n = input.nextInt();
            int x = Math.max(Math.max(a, b), c);
            int y = n - (3 * x - a - b - c);
            if (y % 3 == 0 && y >= 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
