//nieskończony
import java.util.Scanner;

public class _1362A_JohnnyAndAncientComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            int k=0;
            if (a==b){
                System.out.println("0");
                continue;
            }
            if ((a%b!=0 && b%a!=0 || a==1 && b%2!=0 || b==1 && a%2!=0 ) || (b/a%2!=0 || a/b%2!=0)){
                System.out.println("-1");
                continue;
            }
            while (a!=b){
                if (a<b){
                    if (b/8>=a){
                        b/=8;
                        k++;
                    }
                    else if (b/4>=a) {
                        b/=4;
                        k++;
                    }
                    else if (b/2>=a) {
                        b/=2;
                        k++;
                    }
                }
                else{
                    if (a/8>=b) {
                        a/=8;
                        k++;
                    }
                    else if (a/4>=b) {
                        a/=4;
                        k++;
                    }
                    else if (a/2>=b) {
                        a/=2;
                        k++;
                    }
                }
            }
            System.out.println(k);
            k=0;
        }
    }
}
