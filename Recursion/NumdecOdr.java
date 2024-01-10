package Recursion;

//print numbers from 5 to 1 DECREASING ORDER
public class NumdecOdr {
    public static void printNum(int n) {

        // BASE CASE
        if (n == 0) {
            return;
        }

        // print
        System.out.println(n);

        // RECURSION
        //output
        printNum(n - 1);

    }

    public static void main(String[] args) {

        // numbers
        int n = 5;

        //function call
        printNum(n); // n=5
    }
}
