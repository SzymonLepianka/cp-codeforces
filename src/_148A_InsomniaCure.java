import java.util.Scanner;

public class _148A_InsomniaCure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int l = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int d = input.nextInt();
        int x=0;
        for (int i = 1; i <=d ; i++) {
            if (i%k==0 ||i%l==0 ||i%m==0 ||i%n==0) x++;
        }
        System.out.println(x);
    }
}
