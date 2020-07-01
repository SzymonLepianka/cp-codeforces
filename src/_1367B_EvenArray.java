import java.util.Scanner;

public class _1367B_EvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            int a = 0, b = 0, c = 0, d = 0;
            for (int j = 0; j < m; j++) {
                int x = input.nextInt();
                if (j % 2 != x % 2)
                    if (j % 2 == 0) a++;
                    else b++;
                if (x % 2 == 0) c++;
                else d++;
            }
            if (c == d && m % 2 == 0 || c - 1 == d && m % 2 != 0) System.out.println(Math.max(a, b));
            else System.out.println(-1);
        }
    }
}

