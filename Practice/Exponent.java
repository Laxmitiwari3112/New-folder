import java.util.*;

//Enter number x for base and n for power
public class Exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  exponent=");
        int n = sc.nextInt();// n=power

        System.out.print("Enter base=");
        int x = sc.nextInt();// x=base
        int result = 1;

        for (int i = 1; i <= n; i++) {

            // result*=x;
            result = result * x;
        }
        System.out.print("VALUE=" + result);

    }
}
