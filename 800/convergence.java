import java.util.Scanner;

public class convergence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            return;
        }
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int minCalls = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                int targetPosition = a[i];
                int left = 0;
                int right = 0;
                
                for (int j = 0; j < n; j++) {
                    if (a[j] < targetPosition) {
                        left++;
                    } else if (a[j] > targetPosition) {
                        right++;
                    }
                }
                
                int calls = Math.max(left, right);
                
                if (calls < minCalls) {
                    minCalls = calls;
                }
            }
            
            System.out.println(minCalls);
        }
        
        sc.close();
    }
}