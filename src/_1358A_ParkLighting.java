import java.util.Scanner;

public class _1358A_ParkLighting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            if ((a*b)%2==0) System.out.println(a*b/2);
            else System.out.println(a*b/2+1);
        }
    }
}
