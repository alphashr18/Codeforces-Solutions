import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class party_monster {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String line = reader.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            line = reader.readLine();
            while (line != null && line.trim().isEmpty()) {
                line = reader.readLine();
            }
            if (line == null) break;
            
            int n = Integer.parseInt(line.trim());
            String s = reader.readLine().trim();

            int balance = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '(') {
                    balance++;
                } else if (ch == ')') {
                    balance--;
                }
            }

            if (balance == 0) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }
        
        System.out.print(out);
    }
}