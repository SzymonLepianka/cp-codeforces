import java.util.Scanner;

public class _791A_BearAndBigBrother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int k = 0;
        do {
            k++;
            a *= 3;
            b *= 2;
        } while (a <= b);
        System.out.println(k);
    }
}
