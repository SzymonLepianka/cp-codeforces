import java.util.Scanner;

public class _231A_Team {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        for (int i = 0; i < n; i++) {
                if (input.nextInt() + input.nextInt() + input.nextInt() > 1) a++;
        }
        System.out.println(a);
    }
}
