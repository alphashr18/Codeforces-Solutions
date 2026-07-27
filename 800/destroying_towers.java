import java.util.Scanner;

public class destroying_towers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Check if there is input to read
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int t = scanner.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of towers
            long totalSum = 0;
            int currentMin = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                int height = scanner.nextInt();
                
                // The tower is reduced to the smallest height seen so far
                currentMin = Math.min(currentMin, height);
                
                // Add the resulting height to the total sum
                totalSum += currentMin;
            }
            
            // Output the minimum possible final sum for the test case
            System.out.println(totalSum);
        }
        
        scanner.close();
    }
}