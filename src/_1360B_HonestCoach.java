import java.util.Scanner;

public class _1360B_HonestCoach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            if (m == 0) {
                System.out.println(0);
                continue;
            } else if (m == 1) {
                System.out.println(input.nextInt());
                continue;
            }
            int[] tab = new int[m];
            for (int j = 0; j < m; j++) {
                tab[j] = input.nextInt();
            }
            int x = 2147483647;
            for (int j = 0; j < m; j++) {
                for (int k = j + 1; k < m; k++) {
                    if (x == 0) break;
                    int abs = Math.abs(tab[j] - tab[k]);
                    if (x > abs) x = abs;
                }
            }
            System.out.println(x);
        }
    }
}
