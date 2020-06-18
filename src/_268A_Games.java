import java.util.Scanner;

public class _268A_Games {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] h = new int[n];
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = input.nextInt();
            a[i] = input.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && a[i] == h[j]) k++;
            }
        }
        System.out.println(k);
    }
}
