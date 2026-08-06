import java.util.Scanner;

public class optimal_purchase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long n = scanner.nextLong();
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            
            if (3 * a <= b) {
                System.out.println(n * a);
            } else {
                long groupKeys = n / 3;
                long remainder = n % 3;
                
                long totalCost = groupKeys * b;
                

                totalCost += Math.min(remainder * a, b);
                
                System.out.println(totalCost);
            }
        }
        
        scanner.close();
    }
}