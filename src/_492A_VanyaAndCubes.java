import java.util.Scanner;

public class _492A_VanyaAndCubes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 2;
        if (n <= 1) {
            System.out.println(n);
            return;
        }
        int sum = 1;
        int x = 3;
        while (sum + x <= n) {
            sum += x;
            i++;
            x += i;
        }
        System.out.println(i - 1);
    }
}
