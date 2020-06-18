import java.util.Scanner;

public class _236A_BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] m = input.nextLine().split("");
        int res = 0;
        for (int i = 0; i < m.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (m[i].equals(m[j])) break;
            }
            if (i == j) res++;
        }
        if (res % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}
