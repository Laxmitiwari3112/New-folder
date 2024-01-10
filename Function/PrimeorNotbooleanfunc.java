package Function;

import java.util.*;

//print prime or not using boolean function
public class PrimeorNotbooleanfunc {
    //only for n>=2
    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {// complelety dividing
                isPrime = false;
                break;
            }
        }
        return isPrime;

        // for(int i=2;i<=n-1;i++){
        //     if(n%i==0){
        //         return false;
        //     }
        //     return true;
        // } same as above
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter term n = ");
        int n = sc.nextInt();

        System.out.println( isPrime(n));
        
    }
}
