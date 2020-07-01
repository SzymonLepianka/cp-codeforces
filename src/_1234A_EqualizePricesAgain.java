import java.util.Scanner;

public class _1234A_EqualizePricesAgain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            int sum=0;
            for (int j = 0; j < m; j++) {
                sum+=input.nextInt();
            }
            if (sum%m==0) System.out.println(sum/m);
            else System.out.println(sum/m+1);
        }
    }
}
