import java.util.Scanner;

public class _41A_Translation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().split("");
        String[] t = input.nextLine().split("");
        if (s.length != t.length) {
            System.out.println("NO");
            return;
        }
        for (int i = 0, j = s.length - 1; i < s.length; i++, j--) {
            if (!s[i].equals(t[j])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
