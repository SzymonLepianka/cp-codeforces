import java.util.Scanner;

public class _617A_Elephant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int k = 0;
        while (x > 5) {
            k++;
            x -= 5;
        }
        System.out.println(k + 1);
    }
}
