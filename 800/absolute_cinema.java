import java.util.Scanner;

public class absolute_cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }

            long sumOfMaxes = 0;
            int maxOfMins = 0;

            for (int i = 0; i < n; i++) {
                int min = Math.min(a[i], b[i]);
                int max = Math.max(a[i], b[i]);
                
                if (min > maxOfMins) {
                    maxOfMins = min;
                }
                sumOfMaxes += max;
            }

            System.out.println(sumOfMaxes + maxOfMins);
        }
        
        scanner.close();
    }
}