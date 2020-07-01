import java.util.Scanner;

public class _1283A_MinutesBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println((23 - input.nextInt()) * 60 + 60 - input.nextInt());
        }
    }
}
