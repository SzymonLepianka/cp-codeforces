import java.util.Scanner;

public class _116A_Tram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int k = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            k -= input.nextInt();
            if (k<0) k=0;
            k += input.nextInt();
            if (max < k) max = k;
        }
        System.out.println(max);
    }
}
