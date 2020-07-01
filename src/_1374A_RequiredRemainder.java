import java.util.Scanner;

public class _1374A_RequiredRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int x = c % a;
            if (x >= b) System.out.println(c - (x - b));
            else System.out.println(c - (a + x - b));
        }
    }
}
