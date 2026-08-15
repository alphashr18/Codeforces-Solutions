import java.util.Scanner;

public class reimu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c0 = 0, c1 = 0, c2 = 0;
            
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == 0) c0++;
                else if (val == 1) c1++;
                else if (val == 2) c2++;
            }
            
            int pairs = Math.min(c1, c2);
            int rem1 = c1 - pairs;
            int rem2 = c2 - pairs;
            
            int totalOps = c0 + pairs + (rem1 / 3) + (rem2 / 3);
            
            System.out.println(totalOps);
        }
        sc.close();
    }
}