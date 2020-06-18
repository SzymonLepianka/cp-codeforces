import java.util.Scanner;

public class _467A_GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if ( - input.nextInt() + input.nextInt() >= 2) k++;
        }
        System.out.println(k);
    }
}
