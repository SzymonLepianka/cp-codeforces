import java.util.Scanner;

public class _110A_NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] n = input.nextLine().split("");
        int k = 0;
        for (String i: n) if (i.equals("4") || i.equals("7")) k++;

        if (k == 4 || k == 7) System.out.println("YES");
        else System.out.println("NO");
    }
}
