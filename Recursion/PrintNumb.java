package Recursion;

//print numbers from 5 to 1
public class PrintNumb {
    public static void printNum(int n) {

        // BASE CASE
        if (n == 0) {
            return;
        }

        // output
        System.out.println(n);

        // RECURSION
        printNum(n - 1);

    }

    public static void main(String[] args) {

        // numbers
        int n = 5;
        printNum(n); // n=5
    }
}
