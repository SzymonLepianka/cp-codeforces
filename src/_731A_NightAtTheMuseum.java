import java.util.Scanner;

public class _731A_NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int a = 0, b = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            x -= 97;
            if (Math.abs(x - a) > 12) b += (26 - Math.abs(x - a));
            else b += Math.abs(x - a);
            a = x;
        }
        System.out.println(b);
    }
}
