import java.util.Scanner;

public class _510A_FoxAndSnake {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 != 0) {
                    if (j == 0 && (i + 1) % 4 == 0 || j == m - 1 && i % 4 == 1) {
                        System.out.print("#");
                    } else System.out.print(".");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
