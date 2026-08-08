import java.util.Scanner;

public class slimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                
                for (int i = 0; i < n; i++) {
                    int pos = scanner.nextInt();
                    if (pos > max) max = pos;
                    if (pos < min) min = pos;
                }
                
                System.out.println((max - min + 1) / 2);
            }
        }
        scanner.close();
    }
}