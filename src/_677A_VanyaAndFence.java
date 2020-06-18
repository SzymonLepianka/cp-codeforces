import java.util.Scanner;

public class _677A_VanyaAndFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int h = input.nextInt();
        int width = 0;
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int times = 1;
            while (x > h) {
                x -= h;
                times++;
            }
            width += times;
        }
        System.out.println(width);
    }
}
