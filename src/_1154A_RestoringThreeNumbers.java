import java.util.Scanner;

public class _1154A_RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int e = Math.max(Math.max(a[0], a[1]), Math.max(a[2], a[3]));
        for (int i = 0; i < 4; i++) {
            if (a[i] == e) continue;
            System.out.print(e - a[i] + " ");
        }
    }
}
