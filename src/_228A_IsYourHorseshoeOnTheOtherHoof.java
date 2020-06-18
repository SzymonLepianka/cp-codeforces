import java.util.Scanner;

public class _228A_IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int cnt = 0;
        if (n1 == n2) cnt++;
        if (n1 == n3) cnt++;
        if (n1 == n4) cnt++;
        if (n2 == n3) cnt++;
        if (n2 == n4) cnt++;
        if (n3 == n4) cnt++;
        if (cnt == 6) System.out.println(3);
        else if (cnt == 3) System.out.println(2);
        else System.out.println(cnt);
    }
}
