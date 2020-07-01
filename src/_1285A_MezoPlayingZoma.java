import java.util.Scanner;

public class _1285A_MezoPlayingZoma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        input.useDelimiter("");
        int r = 0, l = 0;
        for (int i = 0; i < n; i++) {
            if (input.next().equals("R")) r++;
            else l++;
        }
        System.out.println(l + r + 1);
    }
}
