import java.util.Scanner;

public class _472A_DesignTutorialLearnFromMath {
    public static boolean prime(int n) {
        for (int i = 2; i < n / 2 + 1; i++) {
            if (n % i == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 4; i < n / 2 + 1; i++) {
            if (prime(i) && prime(n - i)) {
                System.out.println(i + " " + (n - i));
                return;
            }
        }
    }
}
