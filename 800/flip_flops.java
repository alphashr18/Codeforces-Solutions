import java.io.*;
import java.util.*;

public class flip_flops {
    static class FastScanner {
        private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            long c = fs.nextLong();
            long k = fs.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = fs.nextLong();
            }

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                if (a[i] > c) {
                    break; 
                }

                long use = Math.min(k, c - a[i]);

                a[i] += use;
                k -= use;

                c += a[i];
            }

            out.append(c).append('\n');
        }

        System.out.print(out);
    }
}