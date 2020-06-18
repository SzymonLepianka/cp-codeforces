import java.util.Scanner;

public class _732A_BuyAShovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int r = input.nextInt();
        int k2 = k % 10;
        int x = 1;
        while (k2 % 10 != r && k2 % 10 != 0) {
            x++;
            k2 += k % 10;
        }
        System.out.println(x);
    }
}
