import java.util.Arrays;
import java.util.Scanner;

public class blocked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean hasDuplicate = false;
            boolean[] seen = new boolean[101];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (seen[a[i]]) {
                    hasDuplicate = true;
                }
                seen[a[i]] = true;
            }

            if (hasDuplicate) {
                System.out.println("-1");
            } else {
                Arrays.sort(a);

                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(a[i] + (i == 0 ? "" : " "));
                }
                System.out.println();
            }
        }

        sc.close();
    }
}