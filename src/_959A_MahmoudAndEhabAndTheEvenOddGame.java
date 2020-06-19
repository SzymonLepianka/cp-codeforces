import java.util.Scanner;

public class _959A_MahmoudAndEhabAndTheEvenOddGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        if (t % 2 == 0) System.out.println("Mahmoud");
        else System.out.println("Ehab");
    }
}

