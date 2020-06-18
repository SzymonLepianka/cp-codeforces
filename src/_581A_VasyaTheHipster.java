import java.util.Scanner;

public class _581A_VasyaTheHipster {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (a==b) System.out.println(a+" "+0);
        else if (a>b) System.out.println(b+" "+(a-b)/2);
        else System.out.println(a+" "+(b-a)/2);
    }
}
