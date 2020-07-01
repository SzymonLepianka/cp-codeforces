import java.util.Scanner;

public class _381A_SerejaAndDima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) s[i] = input.nextInt();
        n--;
        int a = 0, ser = 0, d = 0, b = 0, c;
        while (a <= n) {
            if (s[a] > s[n]) {
                c = s[a];
                a++;
            } else {
                c = s[n];
                n--;
            }
            if (b % 2 == 0) ser += c;
            else d += c;
            b++;
        }
        System.out.println(ser + " " + d);
    }
}
