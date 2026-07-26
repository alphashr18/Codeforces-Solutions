import java.util.Scanner;

public class popcount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            long n = sc.nextLong();
            long k = sc.nextLong();

            long answer = 0;
            long cost = 1;

            while (cost <= n) {

                long take = Math.min(k, n / cost);

                answer += take;
                n -= take * cost;

                if (take < k) {
                    break;
                }

                cost *= 2;
            }

            System.out.println(answer);
        }

        sc.close();
    }
}