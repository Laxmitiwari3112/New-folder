import java.util.*;

// check n given by user prime or not
public class PrimeORnot {
    public static void main(String[] args) {

        // input
        System.out.print("Enter number n=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // check prime or not
        for(int i=1;i<=n;i++){
        if (n % n== 1||n%i==i) {
            System.out.println("Prime number");
        } else {
            System.out.println(" NOT prime number");
        }System.out.println();
    }

        System.out.println();

    }
}
