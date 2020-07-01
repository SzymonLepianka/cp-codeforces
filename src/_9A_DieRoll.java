import java.util.Scanner;

public class _9A_DieRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Math.max(input.nextInt(), input.nextInt());
        if (n == 6) System.out.println("1/6");
        else if (n == 5) System.out.println("1/3");
        else if (n == 4) System.out.println("1/2");
        else if (n == 3) System.out.println("2/3");
        else if (n == 2) System.out.println("5/6");
        else System.out.println("1/1");
    }
}
