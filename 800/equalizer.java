import java.util.Scanner;

public class equalizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextInt();
            }
            
            if (sum % 2 != 0 || (n * k) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}