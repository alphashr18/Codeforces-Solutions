import java.util.Scanner;

public class koshary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            
            for (int i = 0; i < t; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                if (x % 2 != 0 && y % 2 != 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        
        scanner.close();
    }
}