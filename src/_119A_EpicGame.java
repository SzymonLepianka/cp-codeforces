import java.util.Scanner;

public class _119A_EpicGame {
    public static int gcd(int a, int b) {
        if (a == b) return a;
        int c;
        if (a == 0) return b;
        if (b == 0) return a;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        for (c = a; c > 0; c--) {
            if (b % c == 0 && a % c == 0) break;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int h = input.nextInt();
        while (h > 0) {
            h -= gcd(a, h);
            if (h == 0) {
                System.out.println(0);
                return;
            }
            h -= gcd(b, h);
        }
        System.out.println(1);
    }
}

