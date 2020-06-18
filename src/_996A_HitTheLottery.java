import java.util.Scanner;

public class _996A_HitTheLottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 0;
        while (n > 0) {
            if (n >= 100) {
                k++;
                n -= 100;
            } else if (n >= 20) {
                k++;
                n -= 20;
            } else if (n >= 10) {
                k++;
                n -= 10;
            } else if (n >= 5) {
                k++;
                n -= 5;
            } else {
                k++;
                n -= 1;
            }
        }
        System.out.println(k);
    }
}
