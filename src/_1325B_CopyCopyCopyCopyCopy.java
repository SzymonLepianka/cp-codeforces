//time excedded
import java.util.*;

public class _1325B_CopyCopyCopyCopyCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            Map<Integer, Integer> mapa = new TreeMap<>();
            int dist=0;
            for (int j = 0; j < m; j++) {
                int x = input.nextInt();
                if (!mapa.containsValue(x)) {
                    dist++;
                    mapa.put(mapa.size(),x);
                }
            }
            System.out.println(Math.min(m,dist));
        }
    }
}
