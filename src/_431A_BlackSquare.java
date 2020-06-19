import java.util.Scanner;

public class _431A_BlackSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        input.nextLine();
        String[] s = input.nextLine().split("");
        int k = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("1")) k += a;
            else if (s[i].equals("2")) k += b;
            else if (s[i].equals("3")) k += c;
            else k += d;
        }
        System.out.println(k);
    }
}
