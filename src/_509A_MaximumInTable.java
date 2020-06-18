import java.util.Scanner;

public class _509A_MaximumInTable {
    public static int table (int row, int col){
        if (row==1 || col==1){
            return 1;
        }else{
            return table(row-1,col) + table(row,col-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(table(n,n));
    }
}
