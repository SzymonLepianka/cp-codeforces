import java.util.Scanner;

public class _59A_Word {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int u = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 64 && s.charAt(i) < 91) u++;
            else l++;
        }
        if (u > l) System.out.println(s.toUpperCase());
        else System.out.println(s.toLowerCase());
    }
}

