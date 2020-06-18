import java.util.Scanner;

public class _1097A_GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        input.useDelimiter("");
        for (int i = 0; i < 14; i++) {
            if (s.contains(input.next())) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
