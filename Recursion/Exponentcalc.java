package Recursion;

import java.util.*;

//print exponent x^n (STACK HEIGHT = LOGn)
public class Exponentcalc {
    public static int calculatePower(int x, int n) {
        // BASE CASE
        if (n == 0) {
            return 1;
        }
        if (x == 1) {
            return 0;
        }

        // if n is even
        if (n % 2 == 0) {
            return calculatePower(x, n / 2) * calculatePower(x, n / 2);
        } else {
            // nis odd
            return calculatePower(x, n / 2) * calculatePower(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base x=");
        int x = sc.nextInt();// base
        System.out.print("Enter power n=");
        int n = sc.nextInt();// power

        int answer = calculatePower(x, n);
        System.out.print("Obtained result=");
        System.out.println(answer);

    }

}
