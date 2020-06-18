import java.util.Scanner;

public class _707A_BrainsPhotos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        for (int i = 0; i < n*m; i++) {
            String s = input.next("[A-Z]");
            if (!s.equals("B") && !s.equals("W") && !s.equals("G")){
                System.out.println("#Color");
                return;
            }
        }
        System.out.println("#Black&White");
    }
}
