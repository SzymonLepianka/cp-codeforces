import java.util.Scanner;

public class _935A_FafaAndHisCompany {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 1;
        for (int i = 2; i <= n / 2; i++) {
            if ((n - i) % i == 0) k++;
        }
        System.out.println(k);
    }
}
