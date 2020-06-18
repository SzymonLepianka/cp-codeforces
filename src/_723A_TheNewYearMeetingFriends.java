import java.util.Scanner;

public class _723A_TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        if (x1 >= x2 && x2 >= x3 || x1 <= x2 && x2 <= x3) System.out.println(Math.abs(x2 - x1) + Math.abs(x2 - x3));
        else if (x2 >= x1 && x1 >= x3 || x2 <= x1 && x1 <= x3)
            System.out.println(Math.abs(x1 - x2) + Math.abs(x1 - x3));
        else System.out.println(Math.abs(x3 - x1) + Math.abs(x3 - x2));
    }
}
