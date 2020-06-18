import java.util.Scanner;

public class _1328A_DivisibilityProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            long a = input.nextInt();
            long b = input.nextInt();
            if (a%b==0) System.out.println(0);
            else System.out.println(b-a%b);
        }
    }
}
