import java.io.*;
import java.util.*;

public class zhilly_array {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
    }

    static long[] P = new long[200005];
    static long[] sortedP = new long[200005];
    static int[] tree = new int[800025];
    static int[] lazy = new int[800025];
    static int INF = (int)1e9;

    static void build(int node, int L, int R) {
        tree[node] = -INF;
        lazy[node] = 0;
        if (L == R) return;
        int mid = (L + R) / 2;
        build(2 * node, L, mid);
        build(2 * node + 1, mid + 1, R);
    }

    static void pushDown(int node) {
        if (lazy[node] != 0) {
            tree[2 * node] += lazy[node];
            lazy[2 * node] += lazy[node];
            tree[2 * node + 1] += lazy[node];
            lazy[2 * node + 1] += lazy[node];
            lazy[node] = 0;
        }
    }

    static void pushUp(int node) {
        tree[node] = Math.max(tree[2 * node], tree[2 * node + 1]);
    }

    static void updateMax(int node, int L, int R, int idx, int val) {
        if (L == R) {
            tree[node] = Math.max(tree[node], val);
            return;
        }
        pushDown(node);
        int mid = (L + R) / 2;
        if (idx <= mid) {
            updateMax(2 * node, L, mid, idx, val);
        } else {
            updateMax(2 * node + 1, mid + 1, R, idx, val);
        }
        pushUp(node);
    }

    static void addRange(int node, int L, int R, int l, int r, int val) {
        if (l > R || r < L) return;
        if (l <= L && R <= r) {
            tree[node] += val;
            lazy[node] += val;
            return;
        }
        pushDown(node);
        int mid = (L + R) / 2;
        addRange(2 * node, L, mid, l, r, val);
        addRange(2 * node + 1, mid + 1, R, l, r, val);
        pushUp(node);
    }

    static int getIdx(long val, int K) {
        int low = 0, high = K - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedP[mid] == val) return mid + 1;
            else if (sortedP[mid] < val) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String tStr = sc.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
        PrintWriter out = new PrintWriter(System.out);

        while (t-- > 0) {
            int n = sc.nextInt();
            P[0] = 0;
            for (int i = 1; i <= n; i++) {
                P[i] = P[i - 1] + sc.nextLong();
            }

            int pCount = 0;
            for (int i = 0; i <= n; i++) {
                sortedP[pCount++] = P[i];
            }
            Arrays.sort(sortedP, 0, pCount);
            
            int K = 0;
            for (int i = 0; i < pCount; i++) {
                if (i == 0 || sortedP[i] != sortedP[i - 1]) {
                    sortedP[K++] = sortedP[i];
                }
            }

            build(1, 1, K);

            int p_n_idx = getIdx(P[n], K);
            int valInit = (P[n] > P[n - 1]) ? 1 : 0;
            updateMax(1, 1, K, p_n_idx, valInit);

            for (int i = n - 1; i >= 1; i--) {
                int M = tree[1];
                int pPrevIdx = getIdx(P[i - 1], K);
                
                if (pPrevIdx + 1 <= K) {
                    addRange(1, 1, K, pPrevIdx + 1, K, 1);
                }

                int pIdx = getIdx(P[i], K);
                int val_i = M + (P[i] > P[i - 1] ? 1 : 0);
                updateMax(1, 1, K, pIdx, val_i);

                int pNextIdx = getIdx(P[i + 1], K);
                int valNext = M + (P[i + 1] > P[i - 1] ? 1 : 0);
                updateMax(1, 1, K, pNextIdx, valNext);
            }
            out.println(tree[1]);
        }
        out.flush();
    }
}