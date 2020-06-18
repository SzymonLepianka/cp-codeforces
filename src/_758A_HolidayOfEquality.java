import java.util.Scanner;

public class _758A_HolidayOfEquality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] x = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            x[i] = input.nextInt();
            if (x[i] > max) max = x[i];
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += max - x[i];
        }
        System.out.println(sum);
    }
}
