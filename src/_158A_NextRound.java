import java.util.Arrays;
import java.util.Scanner;

public class _158A_NextRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int i;
        for (i = 0; i < n; i++) {
            if (a[i] <= 0) break;
            if (i>=k && a[i-1] != a[i]) break;
        }
        System.out.println(i);
    }
}
