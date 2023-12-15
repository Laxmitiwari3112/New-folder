import java.util.*;

// check n given by user prime or not
public class PrimeORnot {
    public static void main(String[] args) {
        int m = 0, flag = 0;

        // input
        System.out.print("Enter number n=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is NOT A PRIME NUMBER");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is NOT A PRIME NUMBER");
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                System.out.println(n + " is PRIME NUMBER");
            }
        }
    }
}
