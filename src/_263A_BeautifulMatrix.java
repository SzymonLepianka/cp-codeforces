import java.util.Scanner;

public class _263A_BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (input.nextInt() == 1)
                    //System.out.println(((i < 3) ? (3 - i) : (i % 3)) + ((j < 3) ? (3 - j) : (j % 3)));
                    System.out.println(Math.abs(3-i) + Math.abs(3-j));
            }
        }
    }
}
