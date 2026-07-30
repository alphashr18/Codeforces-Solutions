import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class palindrome_and_two_terms {
    public static void main(String[] args) throws IOException {
        // Fast I/O for competitive programming
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        if (!st.hasMoreTokens()) return;
        int t = Integer.parseInt(st.nextToken());
        
        // Precomputed smallest palindromes for modulo 0 through 11
        long[] smallPalindromes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 11};
        
        StringBuilder output = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            
            // Find the required modulo for `a`
            int mod = (int) (n % 12);
            long a = smallPalindromes[mod];
            
            // Check if we can validly form `b`
            if (a <= n) {
                long b = n - a;
                output.append(a).append(" ").append(b).append("\n");
            } else {
                output.append("-1\n");
            }
        }
        
        // Print all output at once
        System.out.print(output);
    }
}