import java.util.Arrays;
import java.util.Scanner;

public class _339A_HelpfulMaths {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] m = input.nextLine().split("\\+");
        Arrays.sort(m);
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
            if (i!=m.length-1) System.out.print("+");
        }
    }
}
