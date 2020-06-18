import java.util.Scanner;

public class _1348A_PhoenixAndBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = (int) Math.pow(2, x);
            for (int j = 1; j < x / 2; j++) {
                y += (int) Math.pow(2, j);
            }
            int z = 0;
            for (int j = x / 2; j < x; j++) {
                z += (int) Math.pow(2, j);
            }
            System.out.println(Math.abs(z - y));
        }
    }
}
