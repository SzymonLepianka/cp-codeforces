import java.util.Scanner;

public class _141A_AmusingJoke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] a = input.nextLine().split("");
        String[] b = input.nextLine().split("");
        String[] c = input.nextLine().split("");
        if (a.length + b.length != c.length) {
            System.out.println("NO");
            return;
        }
        for (String x : c) {
            boolean f = false;
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(x)) {
                    f = true;
                    a[i] = "";
                    break;
                }
            }
            if (!f)
                for (int i = 0; i < b.length; i++) {
                    if (b[i].equals(x)) {
                        f = true;
                        b[i] = "";
                        break;
                    }
                }
            if (!f) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
