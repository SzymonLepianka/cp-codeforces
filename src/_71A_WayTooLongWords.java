import java.util.Scanner;

public class _71A_WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n+1; i++) {
            String word = input.nextLine();
            int len = word.length();
            if (len > 10) System.out.println(word.substring(0, 1) + (len - 2) + word.substring(len - 1, len));
            else System.out.println(word);

        }
    }
}
