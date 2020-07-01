import java.util.Scanner;

public class _1367A_ShortSubstrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            if (s.length() > 2) {
                System.out.print(s.substring(0, 2));
                for (int j = 3; j < s.length(); j += 2) {
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            } else System.out.println(s);
        }
    }
}
