import java.util.Scanner;

public class _734A_AntonAndDanik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        input.useDelimiter("");
        int d = 0, a =0;
        for (int i = 0; i < n; i++) {
            String x = input.next();
            if (x.equals("A")) a++;
            else if (x.equals("D")) d++;
        }
        if (d>a) System.out.println("Danik");
        else if (a==d) System.out.println("Friendship");
        else System.out.println("Anton");
    }
}
