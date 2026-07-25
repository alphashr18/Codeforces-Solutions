import java.util.Scanner;

public class divide_and_conquer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            // Process each test case
            while (t-- > 0) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                // If y is a divisor of x, we can make x exactly equal to y
                if (x % y == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        
        scanner.close();
    }
}