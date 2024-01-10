package Function;

//prime or not using while loop
import java.util.Scanner;

public class PrimeNotPrime {

    public static void PrimesInRange(int n) {
        int i = 2;
        while (i < n) {
            if (n % i== 0) {
                System.out.println("Not Prime");
                return;
            } else {
                i++;
            }
        }
        System.out.println("Prime");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term n = ");
        int n = sc.nextInt();

        PrimesInRange(n);
    }
}
