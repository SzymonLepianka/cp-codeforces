import java.util.Scanner;

public class _200B_Drinks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }
        System.out.println(sum / n);
    }
}
