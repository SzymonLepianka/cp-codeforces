import java.util.Scanner;

public class _1369A_FashionabLee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            if (x < 4) {
                System.out.println("NO");
                continue;
            }
            if (x % 4 == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

