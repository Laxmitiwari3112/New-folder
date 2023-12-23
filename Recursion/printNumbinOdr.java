package Recursion;

//print number from 1 to 5
public class printNumbinOdr {
    public static void printNum(int n) {
        // BASE CASE
        if (n == 6) {
            return;
        }

        // print
        System.out.println(n);

        // RECUSRION
        printNum(n + 1);
    }

    public static void main(String[] args) {
        // numbers
        int n = 1;

        // OUTPUT
        printNum(n);
    }
}
