import java.util.Scanner;

public class _271A_BeautifulYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int l1, l2, l3, l4;
        do {
            n++;
            l1 = n % 10;
            l2 = (n / 10) % 10;
            l3 = (n / 100) % 10;
            l4 = (n / 1000);
        } while (l1 == l2 || l1 == l3 || l1 == l4 || l2 == l3 || l2 == l4 || l3 == l4);
        System.out.println(l4 + "" + l3 + "" + l2 + "" + l1);
    }
}
