import java.util.Scanner;

public class _1337A_IchihimeAndTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            input.nextInt();
            System.out.println(b + " " + c + " " + c);
        }
    }
}
