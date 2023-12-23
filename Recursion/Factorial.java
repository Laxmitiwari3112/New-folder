package Recursion;

import java.util.*;

//print factorial of n
public class Factorial {
    public static int calculateFact(int n) {
        // BASE CASE
        if (n == 1 || n == 0) {
            return 1;
        }

        // recusion
        int fact_num = calculateFact(n - 1);
        int fact_n = n * fact_num;
        return fact_n;
    }

    public static void main(String[] args) {
        // INPUT
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n=");
        int n = sc.nextInt();

        // functioncall
        int Factorial = calculateFact(n);
        //output
        System.out.print("FACTORIAL of n=" + Factorial);
    }
}
