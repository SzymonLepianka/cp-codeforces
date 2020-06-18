import java.util.Scanner;

public class _1343B_BalancedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int y = 0;
                for (int j = 1; j <= x; j++) {
                    if (j == x) System.out.print((j + y) + " ");
                    else if (j <= x / 2) System.out.print(j * 2 + " ");
                    else if (j > x / 2) {
                        System.out.print((j - x / 2 + y) + " ");
                        y++;
                    }
                }
                System.out.println();
            }

        }
    }
}
