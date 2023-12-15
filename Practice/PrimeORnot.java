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
            for (int i = 2; i <= m; i++) {// 2 se 3 tk
                if (n % i == 0) { // 6 % 2 == 0
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is PRIME NUMBER");
            } else {
                System.out.println(n + " IS NOT A PRIME");
            }
        }
    }
}
