import java.util.Scanner;

public class _155A_I_love_Username {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = input.nextInt();
        int min = max;
        int k = 0;
        for (int i = 1; i < n; i++) {
            int x = input.nextInt();
            if (x > max) {
                max = x;
                k++;
            } else if (x < min) {
                min = x;
                k++;
            }
        }
        System.out.println(k);
    }
}
