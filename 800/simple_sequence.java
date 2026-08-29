import java.util.*;

public class simple_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            System.out.print("2 ");

            for (int i = n; i >= 3; i--) {
                System.out.print(i + " ");
            }

            System.out.println("1");
        }

        sc.close();
    }
}