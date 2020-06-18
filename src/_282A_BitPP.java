import java.util.Scanner;

public class _282A_BitPP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int k = 0;
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            if (s.contains("-")) --k;
            else ++k;
        }
        System.out.println(k);
    }
}