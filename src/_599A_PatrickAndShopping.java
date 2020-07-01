import java.util.Scanner;

public class _599A_PatrickAndShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp;
        if (c > a + b) {
            System.out.println(2 * a + 2 * b);
            return;
        }
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c + a) System.out.println(2 * a + 2 * c);
        else System.out.println(a + b + c);
    }
}
