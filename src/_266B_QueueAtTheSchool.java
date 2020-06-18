import java.util.Scanner;

public class _266B_QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sec = input.nextInt();
        input.nextLine();
        String[] que = input.nextLine().split("");
        for (int i = 0; i < sec; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (que[j].equals("B") && que[j + 1].equals("G")) {
                    que[j] = "G";
                    que[j + 1] = "B";
                    j++;
                }
            }
        }
        for (String q : que) {
            System.out.print(q);
        }
    }
}
