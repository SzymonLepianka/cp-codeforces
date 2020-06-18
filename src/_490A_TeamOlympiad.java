import java.util.Scanner;

public class _490A_TeamOlympiad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0, b = 0, c = 0;
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            int t = input.nextInt();
            tab[i] = t;
            if (t == 1) a++;
            else if (t == 2) b++;
            else c++;
        }
        int ile = Math.min(Math.min(a, b), c);
        System.out.println(ile);
        for (int i = 0; i < ile; i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 0; k < n; k++) {
                    if (tab[k] == j) {
                        System.out.print(k + 1 + " ");
                        tab[k] = 0;
                        break;
                    }
                }
            }
            System.out.println();
        }

    }

}
