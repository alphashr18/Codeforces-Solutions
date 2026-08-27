import java.util.Scanner;

public class antimedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }
            
            if (n == 1) {
                System.out.println(1);
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i++) {
                    sb.append(2).append(i == n - 1 ? "" : " ");
                }
                System.out.println(sb.toString());
            }
        }
        
        sc.close();
    }
}