import java.util.Scanner;

public class _1335A_CandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x < 3) {
                System.out.println(0);
                continue;
            }
            if (x % 2 != 0) System.out.println((x - 1) / 2);
            else System.out.println((x - 2) / 2);
        }
    }
}
