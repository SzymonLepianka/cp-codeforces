import java.util.Scanner;

public class _1220A_Cards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        input.useDelimiter("");
        int z = 0, e = 0, r = 0, o = 0, n = 0;
        for (int i = 0; i < t; i++) {
            String ch = input.next();
            if (ch.equals("z")) z++;
            else if (ch.equals("e")) e++;
            else if (ch.equals("r")) r++;
            else if (ch.equals("o")) o++;
            else n++;
        }
        int x = Math.min(Math.min(o, n), e);
        o -= x;
        e -= x;
        int y = Math.min(Math.min(Math.min(z, e), r), o);
        for (int i = 0; i < x; i++) System.out.print(1 + " ");
        for (int i = 0; i < y; i++) System.out.print(0 + " ");
    }
}
