import java.util.Scanner;

public class _711A_BusToUdayland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        input.useDelimiter("");
        int[] tab = new int[t * 5];
        for (int i = 0; i < t * 5; i++) {
            if (input.next().equals("O")) tab[i] = 1;
            else tab[i] = 0;
            if (i % 5 == 4) input.nextLine();
        }
        boolean q = false;
        for (int k = 0; k < t; k++) {
            if (tab[k * 5] == 1 && tab[k * 5 + 1] == 1) {
                tab[k * 5] = 2;
                tab[k * 5 + 1] = 2;
                System.out.println("YES");
                q = true;
                break;
            } else if (tab[k * 5 + 3] == 1 && tab[k * 5 + 4] == 1) {
                tab[k * 5 + 3] = 2;
                tab[k * 5 + 4] = 2;
                System.out.println("YES");
                q = true;
                break;
            }
        }
        if (!q) {
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < t * 5; i++) {
            if (i % 5 == 2) System.out.print("|");
            else if (tab[i] == 1) System.out.print("O");
            else if (tab[i] == 2) System.out.print("+");
            else System.out.print("X");
            if (i % 5 == 4) System.out.println();
        }
    }
}
