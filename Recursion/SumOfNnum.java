package Recursion;

import java.util.*;

//sum of first natural numbers
public class SumOfNnum {
    public static void printSum(int i, int n, int sum) {
        // BASE CASE
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }

        // recursion
        sum = sum + i;
        printSum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n=");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        // output
        System.out.print("Sum of n natural numbers are=");
        printSum(i, n, sum);
    }
}
