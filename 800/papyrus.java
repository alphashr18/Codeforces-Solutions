import java.util.*;

public class papyrus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int c = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            long sumA = 0;
            long sumB = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sumA += a[i];
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                sumB += b[i];
            }

            if (sumA < sumB) {
                System.out.println(-1);
                continue;
            }

            long subtractCost = sumA - sumB;
            long answer = Long.MAX_VALUE;

            // Case 1 : No Reordering
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                if (a[i] < b[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                answer = subtractCost;
            }

            // Case 2 : One Reordering
            int[] sa = a.clone();
            int[] sb = b.clone();

            Arrays.sort(sa);
            Arrays.sort(sb);

            possible = true;

            for (int i = 0; i < n; i++) {
                if (sa[i] < sb[i]) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                answer = Math.min(answer, subtractCost + c);
            }

            if (answer == Long.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(answer);
            }
        }

        sc.close();
    }
}