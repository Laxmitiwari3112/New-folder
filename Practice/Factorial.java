import java.util.*;

public class Factorial {
    public static void calculateFactorial(int n) {

        // loop for factorial
        if(n<0){
            System.out.println("Invalid number");
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
        // rerturn; does'nt require for void
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n=");
        int n = sc.nextInt();

        System.out.print("Factorial of n=");
        calculateFactorial(n);
    }
}
