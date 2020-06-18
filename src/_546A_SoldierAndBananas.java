import java.util.Scanner;

public class _546A_SoldierAndBananas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int w = input.nextInt();
        int cost=0;
        for (int i = 1; i <= w; i++) {
            cost += i*k;
        }
        if (cost > n) System.out.println(cost-n);
        else System.out.println("0");
    }
}
