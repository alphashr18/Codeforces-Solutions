import java.util.Scanner;

public class ai_development {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            
            long speedWithoutAI = x + y;
            long timeWithoutAI = (n + speedWithoutAI - 1) / speedWithoutAI;
            
            long timeWithAI;
            long maximProgressDuringSetup = z * x;
            
            if (maximProgressDuringSetup >= n) {
                timeWithAI = (n + x - 1) / x;
            } else {
                long remainingLines = n - maximProgressDuringSetup;
                long speedWithAI = x + 10 * y;
                long timeForRemaining = (remainingLines + speedWithAI - 1) / speedWithAI;
                
                timeWithAI = z + timeForRemaining;
            }
            
            System.out.println(Math.min(timeWithoutAI, timeWithAI));
        }
        
        sc.close();
    }
}