import java.util.Scanner;

public class tatar_tv_show {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) {
            return;
        }
        
        int t = scanner.nextInt(); // Number of test cases
        
        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the string
            int k = scanner.nextInt(); // The gap k
            String s = scanner.next(); // The binary string
            
            boolean possible = true;
            
            // Check each of the k independent chains
            for (int i = 0; i < k; i++) {
                int countOnes = 0;
                
                // Count the number of '1's in the current chain
                for (int j = i; j < n; j += k) {
                    if (s.charAt(j) == '1') {
                        countOnes++;
                    }
                }
                
                // If the count of '1's is odd, we can never make them all '0'
                if (countOnes % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            
            // Print the result for the current test case
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}