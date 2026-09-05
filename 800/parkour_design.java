import java.io.*;
import java.util.*;

public class parkour_design {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder ans = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long value = x - 2 * y;

            if (value % 3 == 0 && value >= Math.max(0, -6 * y)) {
                ans.append("YES\n");
            } else {
                ans.append("NO\n");
            }
        }

        System.out.print(ans);
    }
}