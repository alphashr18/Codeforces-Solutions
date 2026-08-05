import java.util.Scanner;

public class construct_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                
                for (int i = 1; i <= n; i++) {
                    System.out.print((2 * i - 1) + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}