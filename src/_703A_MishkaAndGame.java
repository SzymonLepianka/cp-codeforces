import java.util.Scanner;

public class _703A_MishkaAndGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a > b) x++;
            else if (b > a) x--;
        }
        if (x > 0) System.out.println("Mishka");
        else if (x < 0) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
