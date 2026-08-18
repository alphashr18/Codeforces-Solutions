import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class snowfall {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = null;

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());

            ArrayList<Long> div6 = new ArrayList<>();
            ArrayList<Long> div2 = new ArrayList<>();
            ArrayList<Long> div3 = new ArrayList<>();
            ArrayList<Long> others = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                long x = Long.parseLong(st.nextToken());
                if (x % 6 == 0) {
                    div6.add(x);
                } else if (x % 2 == 0) {
                    div2.add(x);
                } else if (x % 3 == 0) {
                    div3.add(x);
                } else {
                    others.add(x);
                }
            }

            ArrayList<Long> result = new ArrayList<>();
            result.addAll(div6);
            result.addAll(div2);
            result.addAll(others);
            result.addAll(div3);

            for (int i = 0; i < n; i++) {
                out.print(result.get(i) + (i == n - 1 ? "" : " "));
            }
            out.println();
        }
        out.flush();
    }
}