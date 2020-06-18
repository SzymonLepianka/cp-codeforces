import java.util.Scanner;

public class _50A_DominoPiling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int square = m*n;
        if (square%2==0) System.out.println(square/2);
        else System.out.println((square-1)/2);
    }
}
