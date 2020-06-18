import java.util.Scanner;

public class _344A_Magnets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 1;
        if (n == 1) {
            System.out.println("1");
            return;
        }
        int m1 = input.nextInt();
        for (int i = 1; i < n; i++) {
            int m2 = input.nextInt();
            if (m1 % 10 == m2 / 10) {
                k++;
            }
            m1 = m2;
        }
        System.out.println(k);
    }
}

