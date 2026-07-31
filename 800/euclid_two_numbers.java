import java.util.Arrays;
import java.util.Scanner;

public class euclid_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            
            Arrays.sort(b);

            
            for (int i = 0; i < n / 2; i++) {
                int temp = b[i];
                b[i] = b[n - 1 - i];
                b[n - 1 - i] = temp;
            }

            
            boolean possible = true;
            for (int i = 0; i < n - 2; i++) {
                // If the modulo condition fails, it's not a valid sequence
                if (b[i] % b[i + 1] != b[i + 2]) {
                    possible = false;
                    break;
                }
            }

            
            if (possible) {
                System.out.println(b[0] + " " + b[1]);
            } else {
                System.out.println("-1");
            }
        }
        scanner.close();
    }
}