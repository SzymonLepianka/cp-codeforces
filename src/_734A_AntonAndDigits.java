import java.util.Scanner;

public class _734A_AntonAndDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = Math.min(a, Math.min(c, d));
        int f = Math.min(a - e, b);
        System.out.println(e * 256 + f * 32);
    }
}
