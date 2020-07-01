import java.util.Scanner;

public class _1345A_PuzzlePieces {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a == 1 || b == 1 || (a == 2 && b == 2)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
