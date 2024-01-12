//package Function;

import java.util.*;

//print all prime till n 
public class AllprimeUptoN {

    public static void PrimesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (n%i==0) {
                System.out.print("");// true
            }
            else{System.out.println(i+" ");// true
        }
        }
        System.out.println();
    }

    // private static boolean isPrime(int i) {
    //     // return false;
    //     int n;
    //     if (n <= 1) {
    //         return false;
    //     }
    //     for (int i = 2; i <= (int) Math.sqrt(n); i++) {
    //         if (n % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term n=");
        int n = sc.nextInt();

        System.out.println("All Prime numbers till nth term");
        PrimesInRange(n);
    }
}
