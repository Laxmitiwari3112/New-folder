package Function;

import java.util.*;

//decimal to binary conversion
public class DecimalToBinary {
    public static void decToBin(int n) {
        int pow = 0;
        int binNum = 0;
        int myNum = n;

        while (n > 0) {
            int rem = n % 2;// remainder 
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            //binNum = binNum + rem* 10^n (R to L)

            pow++;
            n = n / 2;// n=decimal number
        }
        System.out.println("Binary form of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number = ");
        int n = sc.nextInt();

        decToBin(n);

    }

}
