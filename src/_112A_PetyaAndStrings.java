import java.util.Scanner;

public class _112A_PetyaAndStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String w1 = input.nextLine().toLowerCase();
        String w2 = input.nextLine().toLowerCase();
        if (w1.compareTo(w2) > 0) System.out.println("1");
        else if (w1.compareTo(w2) < 0) System.out.println("-1");
        else System.out.println("0");
    }
}
