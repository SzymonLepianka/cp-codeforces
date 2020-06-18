import java.util.Scanner;

public class _1360A_MinimalSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a < b) a *= 2;
            else b *= 2;
            System.out.println((int) Math.pow(Math.max(a, b), 2));
        }
    }
}
