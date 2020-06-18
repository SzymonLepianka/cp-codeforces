import java.util.Scanner;

public class _1030A_InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (input.nextInt() != 0) {
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}
