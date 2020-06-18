import java.util.Scanner;

public class _496A_IWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] x = input.nextLine().split(" ");
        String[] y = input.nextLine().split(" ");
        boolean con = true;
        for (int i = 1; i <= n + 1; i++) {
            if (!con) {
                System.out.println("Oh, my keyboard!");
                return;
            }
            if (i == n + 1) break;
            con = false;
            for (int j = 1; j < x.length; j++) {
                if (Integer.parseInt(x[j]) == i) {
                    con = true;
                    break;
                }
            }
            for (int j = 1; j < y.length; j++) {
                if (Integer.parseInt(y[j]) == i) {
                    con = true;
                    break;
                }
            }
        }
        System.out.println("I become the guy.");
    }
}
