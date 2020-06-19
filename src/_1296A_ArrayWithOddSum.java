import java.util.Scanner;

public class _1296A_ArrayWithOddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            int k = 0, x = 0;
            for (int j = 0; j < m; j++) {
                if (input.nextInt() % 2 != 0) k++;
                else x++;
            }
            if (k != 0 && x != 0 || x == 0 && m % 2 != 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
