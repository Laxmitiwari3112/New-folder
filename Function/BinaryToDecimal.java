package Function;

import java.util.*;

//CODE : Binary To Decimal
public class BinaryToDecimal {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;// remainder=lastdigit
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            // (base,pow) Math.pow(base,pow) return double value so we type cast into int

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number = ");
        int n = sc.nextInt();

        binToDec(n);
    }
}
