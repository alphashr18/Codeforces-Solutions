import java.util.Scanner;

public class games_on_the_train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                
                for (int i = 0; i < n; i++) {
                    int h = scanner.nextInt();
                    if (h > max) {
                        max = h;
                    }
                    if (h < min) {
                        min = h;
                    }
                }
                
                int k = max - min + 1;
                System.out.println(k);
            }
        }
        scanner.close();
    }
}