import java.util.Scanner;

public class _1352A_SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int counter = 0;
            int y = x;
            while (y > 0) {
                if (y % 10 == 0) counter++;
                y /= 10;

            }
            System.out.println(String.valueOf(x).length() - counter);
            int k = 10;
            while (x > 0) {
                if (x % k != 0) {
                    System.out.print(x % k + " ");
                    x -= x % k;
                }
                k *= 10;
            }
            System.out.println();
        }
    }
}
