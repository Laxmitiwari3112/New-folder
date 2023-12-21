package Bits;
//import java.util.*;

//check these are one or zero bit after shifting them (binary numbers)
public class CheckzeroORone {
    public static void main(String[] args) {
        int n = 5;// number
        int pos = 2;// position
        int bitMask = 1 << pos;// shifting

        // CONDITION
        if ((bitMask & n) == 0) {
            System.out.println("Bits was zero");
        }

        System.out.println("Bits was one");

    }
}
