import java.util.Scanner;

public class _61A_UltraFastMathematician {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        for (int i = 0; i < a.length(); i++) {

            if (a.substring(i, i + 1).equals(b.substring(i, i + 1))) System.out.print("0");
            else System.out.print("1");
        }
    }
}
