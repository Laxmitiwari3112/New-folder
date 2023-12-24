package Recursion;

import java.util.*;

// print x^n where x =base and n=power
public class Exponent {
    public static int calulatePower(int x, int n) {

        // BASE CASE
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }
        int xPowernm1 = calulatePower(x, n - 1);
        int xPowerN = x * xPowernm1;
        return xPowerN;
    }

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x=");
        int x = sc.nextInt();// base
        System.out.print("Enter n=");
        int n = sc.nextInt();// power

        int answer = calulatePower(x, n);
        System.out.print("Obtained result=");
        System.out.println(answer);

    }

}
