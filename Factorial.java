import java.util.*;

public class Factorial {
    public static void calculateFactorial(int n) {

        // loop for factorial
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        //return;
        // rerturn; does'nt require for void
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);
    }
}
