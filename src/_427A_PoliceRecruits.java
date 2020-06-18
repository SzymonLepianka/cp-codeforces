import java.util.Scanner;

public class _427A_PoliceRecruits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 0, x = 0;
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            if (a == -1 && x == 0) k++;
            else if (a > 0) x += a;
            else if (a == -1 && x > 0) x--;
        }
        System.out.println(k);
    }
}
