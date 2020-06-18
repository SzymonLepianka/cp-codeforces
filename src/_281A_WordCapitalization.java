import java.util.Scanner;

public class _281A_WordCapitalization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String m = input.nextLine();
        System.out.print(m.substring(0,1).toUpperCase());
        System.out.println(m.substring(1));
    }
}
