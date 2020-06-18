import java.util.Scanner;

public class _144A_ArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] x = input.nextLine().split(" ");
        int min = Integer.parseInt(x[0]), max = Integer.parseInt(x[0]), index_min = 0, index_max = 0;
        for (int i = 1; i < n; i++) {
            if (min >= Integer.parseInt(x[i])) {
                min = Integer.parseInt(x[i]);
                index_min = i;
            }
            if (max < Integer.parseInt(x[i])) {
                max = Integer.parseInt(x[i]);
                index_max = i;
            }
        }
        if (index_max > index_min) System.out.println(-index_min + n - 2 + index_max);
        else System.out.println(-index_min + n - 1 + index_max);

    }
}
