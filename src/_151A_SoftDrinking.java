import java.util.Scanner;

public class _151A_SoftDrinking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt() * input.nextInt();
        int b = input.nextInt() * input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        System.out.println(Math.min(Math.min(a / d, b), c / e) / n);
    }
}
