import java.util.Scanner;

public class _1196A_ThreePilesOfCandies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            long sum = input.nextLong() + input.nextLong() + input.nextLong();
            System.out.println(sum / 2);
        }
    }
}
