package Bits;

import java.util.*;

//UPDATE BIT : here we decide for 0 or 1
// for 0 : (1) BITMASK=1<<i. (2)operation= AND with NOT
// for 1 : (1) BITMASK=1<<i. (2)operation= OR
public class UpdateBit {
    public static void main(String[] args) {

        // input operation
        System.out.print("ENTER OPERATION=");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        // operation=1 : set and if operation=0 : clear
        int n = 5;// number 5=0101 in decimal
        int pos = 1;// position
        int BitMask = 1 << pos;

        // SET OPERATION
        System.out.print("RESULT=");
        if (operation == 1) {
            int newNumber = BitMask | n;
            System.out.println(newNumber);

        } else {
            // clear
            int newBitMask = ~(BitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }

    }

}
