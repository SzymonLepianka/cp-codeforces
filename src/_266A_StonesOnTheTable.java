import java.util.Scanner;

public class _266A_StonesOnTheTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("");
        int n = Integer.parseInt(input.nextLine());
        int k = 0;
        String s1 = input.next();
        for (int i = 0; i < n; i++) {
            String s2 = input.next();
            if (s1.equals(s2)) k++;
            s1 = s2;
        }
        System.out.println(k);
    }
}
