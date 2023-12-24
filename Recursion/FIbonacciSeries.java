package Recursion;

import java.util.*;

//print fibbonacci series of n terms
public class FIbonacciSeries {
    public static void printFib(int a, int b, int n) {
        // base case
        if (n == 0) {
            return;
        }
        // sum of pre two term = third term
        int c = a + b;
        System.out.println(c);

        // RECURSION
        printFib(b, c, n - 1);
    }

    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number n=");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        // function call
        printFib(a, b, n - 2);
        System.out.println("fibonacci series ");
    }

}
