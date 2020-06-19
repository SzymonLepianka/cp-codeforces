import java.util.Scanner;

public class _540A_CombinationLock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] tab1 = new int[n];
        int[] tab2 = new int[n];
        input.nextLine();
        input.useDelimiter("");
        for (int i = 0; i < n; i++) {
            tab1[i] = Integer.parseInt(input.next());
        }
        input.nextLine();
        for (int i = 0; i < n; i++) {
            tab2[i] = Integer.parseInt(input.next());
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(tab1[i] - tab2[i]);
            if (x > 5) k += 10 - x;
            else k += x;
        }
        System.out.println(k);
    }
}
