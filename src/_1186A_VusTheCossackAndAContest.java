import java.util.Scanner;

public class _1186A_VusTheCossackAndAContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();
        if (m>=n && k>=n) System.out.println("YES");
        else System.out.println("NO");
    }
}
