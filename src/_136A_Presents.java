import java.util.Scanner;

public class _136A_Presents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] tab = new int[n];
        for (int i = 1; i <= n; i++) {
            tab[input.nextInt() - 1] = i;
        }
        for (int i : tab) {
            System.out.print(i + " ");
        }
    }
}
