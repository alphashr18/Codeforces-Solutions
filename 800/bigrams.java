import java.util.Scanner;

public class bigrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            boolean hasThree = false;
            int countTwo = 0;

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();

                if (x >= 3)
                    hasThree = true;

                if (x >= 2)
                    countTwo++;
            }

            if (hasThree || countTwo >= 2)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}