import java.util.Scanner;

public class _432A_ChoosingTeams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (5 - input.nextInt() >= k) x++;
        }
        System.out.println(x / 3);
    }
}
