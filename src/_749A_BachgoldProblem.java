import java.util.Scanner;

public class _749A_BachgoldProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(n / 2);
        while (n > 3 || n == 2) {
            System.out.print(2 + " ");
            n -= 2;
        }
        if (n == 3) System.out.println(3);
    }
}
