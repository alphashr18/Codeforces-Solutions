import java.util.Scanner;

public class wonderful {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            boolean has100 = false;
            
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (a == 100) {
                    has100 = true;
                }
            }
            
            if (has100) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        
        scanner.close();
    }
}