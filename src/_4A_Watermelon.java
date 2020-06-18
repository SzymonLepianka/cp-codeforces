import java.util.Scanner;

public class _4A_Watermelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        if (w >=4 && w%2==0) System.out.println("YES");
        else System.out.println("NO");
    }
}
