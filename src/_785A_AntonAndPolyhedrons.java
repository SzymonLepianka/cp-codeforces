import java.util.Scanner;

public class _785A_AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int k = 0;
        for (int i = 0; i < n; i++) {
            String s = input.nextLine();
            switch (s) {
                case "Tetrahedron":
                    k += 4;
                    break;
                case "Cube":
                    k += 6;
                    break;
                case "Octahedron":
                    k += 8;
                    break;
                case "Dodecahedron":
                    k += 12;
                    break;
                case "Icosahedron":
                    k += 20;
                    break;
            }
        }
        System.out.println(k);
    }
}
